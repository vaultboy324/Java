package SportClasses.Trainings;

import SportClasses.Training;

import java.util.Scanner;

public class Dumbbell extends Training {
    private Integer countPancakes;
    private Integer weightOfPancake;
    private Integer weightOfRod;

    public Dumbbell() {
        super();

        countPancakes = 0;
        weightOfPancake = 0;
        weightOfRod = 0;
    }

    public void setWeightOfRod(Integer weightOfRod) {
        this.weightOfRod = weightOfRod;
    }

    public void setCountPancakes(Integer count_pancakes) {
        this.countPancakes = count_pancakes;
    }

    public void setWeightOfPancake(Integer weightOfPancake) {
        this.weightOfPancake = weightOfPancake;
    }

    public void init(Scanner scanner){
        System.out.println("Введите количество блинов:");
        setCountPancakes(scanner.nextInt());

        System.out.println("Введите массу блина:");
        setWeightOfPancake(scanner.nextInt());

        System.out.println("Введите массу стержня:");
        setWeightOfRod(scanner.nextInt());

        setWeight(countPancakes * weightOfPancake + weightOfRod);

        setName("Штанга");

        setSportType(4);
    }

    public String toString(){
        return super.toString() + "Количество блинов: " + countPancakes + ", масса каждого блина: " + weightOfPancake + ", масса стержня: " + weightOfRod + ". Общая масса: " + getWeight();
    }
}
