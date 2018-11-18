package SportClasses;

import lombok.Setter;

import java.util.Scanner;

@Setter
public class Core extends SportsEquipment {
    private int weight;

    public Core(){
        setName("Ядро");
        setSportType("Ядро");
        setWeight(0);
    }


    @Override
    public void init(Scanner scanner){
        String name = inputName(scanner);
        setName(name);

       int weight = Facade.inputValue("Введите массу ядра: ", scanner);
       setWeight(weight);
    }

    @Override
    public String toString() {
        return super.toString() + "Масса: " + weight + ". ";
    }

}
