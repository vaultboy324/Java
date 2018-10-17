package SportClasses.Trainings;

import SportClasses.Training;

import java.util.Scanner;

public class Poise extends Training {

    public Poise() {
        super();
    }

    public void init(Scanner scanner){
        System.out.println("Введите вес гири:");
        setWeight(scanner.nextInt());

        setName("Гиря");

        setSportType(4);
    }

    public String toString(){
        return super.toString() + "Вес гири: " + getWeight();
    }
}
