package SportClasses;

import java.util.Scanner;

public class Core extends SportsEquipment{
    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void init(Scanner scanner){
        System.out.println("Введите вес ядра");
        setWeight(scanner.nextInt());

        setName("Ядро");

        setSportType(3);
    }

    public String toString(){
        return super.toString() + "Вес ядра: " + weight;
    }
}
