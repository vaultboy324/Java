package SportClasses.Balls;

import SportClasses.Ball;

import java.util.Scanner;

public class Basketball extends Ball {
    private String type;

    public Basketball() {
        super();

        type ="";
    }

    public void setType(String type) {
        this.type = type;
    }

    public void init(Scanner scanner){
        super.init(scanner);

        System.out.println("Введите тип мяча:\n" +
                            "1)Для игры на улице\n" +
                            "2)Для игры в зале\n" +
                            "Иначе универсальный\n");

        Integer number = scanner.nextInt();
        switch (number){
            case 1:
                setType("для игры на улице");
            case 2:
                setType("для игры в зале");
            default:
                setType("универсальный");

        }

        setName("Баскетбольный мяч");
    }

    public String toString(){
        return super.toString() + "Предназначен: " + type;
    }
}
