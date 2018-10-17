package SportClasses.Trainings;

import SportClasses.Training;

import java.util.Scanner;

public class TrainingFabric {
    public static Training getElement(){
        System.out.println("Введите тип тренировочного оборудования:\n" +
                            "1)Гиря\n" +
                            "2)Гантеля\n");

        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        switch (number){
            case 1:
                Poise poise = new Poise();
                poise.init(scanner);
                return poise;
            case 2:
                Dumbbell dumbbell = new Dumbbell();
                dumbbell.init(scanner);
                return dumbbell;
        }

        return new Poise();
    }
}
