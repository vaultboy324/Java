package SportClasses.Training;

import SportClasses.SportsEquipment;
import lombok.Setter;

import java.util.Scanner;

@Setter
public abstract class Training extends SportsEquipment {
    private int weight;

    public Training(){
        setName("Тренажёр");
        setSportType("Тренажёр");
        setWeight(0);
    }

    public abstract void init(Scanner scanner);

    @Override
    public String toString(){
        return super.toString() + "Масса: " + weight + ". ";
    }
}
