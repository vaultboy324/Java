package SportClasses;

import SportClasses.Balls.BallFactory;
import SportClasses.Trainings.TrainingFabric;

import java.util.Scanner;

public class SportFabric {
    public static SportsEquipment getElement(){
        System.out.println("Введите тип спортивного оборудования:\n" +
                            "1)Мяч\n" +
                            "2)Ракетка\n" +
                            "3)Ядро\n" +
                            "4)Тренировочное\n");

        Scanner scanner = new Scanner(System.in);

        Integer number = scanner.nextInt();

        switch (number){
            case 1:
                return BallFactory.getElement();
            case 2:
                Racket racket = new Racket();
                racket.init(scanner);
                return racket;
            case 3:
                Core core = new Core();
                core.init(scanner);
                return core;
            case 4:
                return TrainingFabric.getElement();
        }
        return new Core();
    }
}
