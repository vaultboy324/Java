package SportClasses.Balls;

import SportClasses.Ball;

import java.util.Scanner;

public class Tennis extends Ball {
    private String color;

    public Tennis() {
        super();

        color = "";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void init(Scanner scanner){
        super.init(scanner);

        System.out.println("Введите цвет мяча:");
        scanner.nextLine();
        setColor(scanner.nextLine());

        setName("Теннисный мяч");
    }

    public String toString(){
        return super.toString() + "Цвет мяча: " + color;
    }
}
