package SportClasses;

import java.util.Scanner;

public abstract class Training extends SportsEquipment {
    private Integer weight;


    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Training() {
        weight = 0;
    }

    public abstract void init(Scanner scanner);

    public Integer getWeight() {
        return weight;
    }
}
