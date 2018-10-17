package SportClasses;

import java.util.Scanner;

public class Racket extends SportsEquipment {
    private Integer length;
    private Integer width;

    public Racket() {
        length = 0;
        width = 0;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void init(Scanner scan){
        System.out.println("Введите длину ракетки:");
        setLength(scan.nextInt());

        System.out.println("Введите ширину ракетки:");
        setWidth(scan.nextInt());

        setName("Ракетка");

        setSportType(2);


    }

    public String toString(){
        return super.toString() + "Длина: " + length + ", ширина:" + width;
    }
}
