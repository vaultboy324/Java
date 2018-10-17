package SportClasses.Balls;

import SportClasses.Ball;

import java.util.Scanner;

public class BallFactory {

    public static Ball getElement(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип мяча:\n" +
                            "1)Баскетбольный\n" +
                            "2)Теннисный\n");

        Integer number = scanner.nextInt();

        switch (number){
            case 1:
                Basketball basketball = new Basketball();
                basketball.init(scanner);
                return basketball;
            case 2:
                Tennis tennis = new Tennis();
                tennis.init(scanner);
                return tennis;
            default:
                return new Ball();
        }
    }
}
