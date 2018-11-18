package SportClasses.Training;

import SportClasses.Facade;

import java.util.Scanner;

public class Poise extends Training {
    public Poise(){
        super();
    }

    @Override
    public void init(Scanner scanner){
        String name = inputName(scanner);
        setName(name);

        int weight = Facade.inputValue("Введите массу ядра: ", scanner);
        setWeight(weight);

        setName("Гиря");
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
