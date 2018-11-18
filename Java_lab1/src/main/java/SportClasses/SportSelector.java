package SportClasses;

import Interfaces.ISport;
import SportClasses.Balls.*;
import SportClasses.Exceptions.NotHaveElementException;
import SportClasses.Training.Barbell;
import SportClasses.Training.Poise;
import SportClasses.Training.Training;
import SportClasses.Training.TrainingEnum;

import java.util.Scanner;

public class SportSelector {
    private static ISport selectBall(){
        Scanner scanner = new Scanner(System.in);

        boolean goodInput = false;
        while (!goodInput){
            try {
                System.out.println("Доступны следующие виды мячей:");
                System.out.println(BallEnum.showAllTypes());

                int type = Facade.inputValue("Введите тип мяча: ", scanner);

                switch (BallEnum.from(type)){
                    case SIMPLE:
                        Ball ball = new Ball();
                        ball.init(scanner);
                        return ball;
                    case TENNIS:
                        Tennis tennis = new Tennis();
                        tennis.init(scanner);
                        String tennisArea = selectTennis();
                        tennis.setAreaType(tennisArea);
                        return tennis;
                    case BASKETBALL:
                        Basketball basketball = new Basketball();
                        basketball.init(scanner);
                        String basketballArea = selectBasketball();
                        basketball.setAreaType(basketballArea);
                        return basketball;
                }
            } catch (NotHaveElementException nEE) {
                System.out.println(nEE.getMessage());
            }
        }
        return null;
    }

    private static ISport selectTraining(){
        Scanner scanner = new Scanner(System.in);

        boolean goodInput = false;
        while (!goodInput){
            try {
                System.out.println("Доступны следующие виды тренажёров:");
                System.out.println(TrainingEnum.showAllTypes());

                int type = Facade.inputValue("Введите тип тренажёра: ", scanner);

                switch (TrainingEnum.from(type)){
                    case POISE:
                        Poise poise = new Poise();
                        poise.init(scanner);
                        return poise;
                    case BARBELL:
                        Barbell barbell = new Barbell();
                        barbell.init(scanner);
                        return barbell;
                }
            } catch (NotHaveElementException nEE) {
                System.out.println(nEE.getMessage());
            }
        }
        return null;
    }

    public static ISport selectSport(){
        Scanner scanner = new Scanner(System.in);

        boolean goodInput = false;
        while (!goodInput){
            try {
                System.out.println("Доступны следующие виды спортивного оборудования:");
                System.out.println(SportEnum.showAllTypes());

                int type = Facade.inputValue("Введитие вид спортивного оборудования: ",scanner);

                switch (SportEnum.from(type)){
                    case BALL:
                        return selectBall();
                    case RACQUET:
                        Racquet racquet = new Racquet();
                        racquet.init(scanner);
                        return racquet;
                    case CORE:
                        Core core = new Core();
                        core.init(scanner);
                        return core;
                    case TRAINING:
                        return selectTraining();
                }
            } catch (NotHaveElementException nEE) {
                System.out.println(nEE.getMessage());
            }
        }
        return null;
    }

    private static String selectBasketball(){

        Scanner scanner = new Scanner(System.in);

        boolean goodInput = false;
        while (!goodInput){
            try {
                System.out.println("Доступны следующие виды баскетбольных мячей:");
                System.out.println(BasketballEnum.showAllTypes());

                int type = Facade.inputValue("Введите тип баскетбольного мяча: ", scanner);
                return BasketballEnum.from(type).getName();
            } catch (NotHaveElementException nEE) {
                System.out.println(nEE.getMessage());
            }
        }
        return null;
    }

    private static String selectTennis(){
        Scanner scanner = new Scanner(System.in);

        boolean goodInput = false;
        while (!goodInput){
            try {
                System.out.println("Доступны следующие виды теннисных мячей: ");
                System.out.println(TennisEnum.showAllTypes());

                int type = Facade.inputValue("Введите тип теннисного мяча: ", scanner);
                return TennisEnum.from(type).getName();
            } catch (NotHaveElementException nEE) {
                System.out.println(nEE.getMessage());
            }
        }
        return null;
    }

}
