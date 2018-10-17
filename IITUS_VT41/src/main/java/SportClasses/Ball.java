package SportClasses;

import java.util.Scanner;

public class Ball extends SportsEquipment {
    private Float rad;

    public void setRad(Float rad) {
        this.rad = rad;
    }

    public void init(Scanner scanner){
        System.out.println("Введите радиус");
        setRad(scanner.nextFloat());

        setName("Мяч");

        setSportType(1);
    }

    public Ball() {
        super();
        this.rad = 0f;
    }

    public String toString(){
        return super.toString() + "Радиус: " + rad;
    }

}
