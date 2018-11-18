package SportClasses;

import Interfaces.ISport;
import lombok.Setter;

import java.util.Scanner;


@Setter
public abstract class SportsEquipment implements ISport {
    private String name;
    private String sportType;

    public SportsEquipment(){
        setName("");
        setSportType("");

    }

    public abstract void init (Scanner scanner);

    @Override
    public String toString(){
        return "Название: " + name + ". " + "Тип: " + sportType + ". ";
    }

    public String getSportType(){
        return sportType;
    }

    public String inputName(Scanner scanner){
        System.out.print("Введите название: ");
        String name = scanner.nextLine();
        setName(name);

        return name;
    }

}