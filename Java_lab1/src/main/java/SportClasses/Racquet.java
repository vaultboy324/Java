package SportClasses;

import SportClasses.Exceptions.IncorrectParametersException;
import lombok.Setter;

import java.util.Scanner;

@Setter
public class Racquet extends SportsEquipment{
    private int width;
    private int length;

    public Racquet(){
        setName("Ракетка");
        setSportType("Ракетка");

    }

    @Override
    public void init(Scanner scanner){
        String name = inputName(scanner);
        setName(name);

        boolean goodInput = false;
        while (!goodInput) {
            try {
                int length = Facade.inputValue("Введите длину ракетки: ", scanner);
                int width = Facade.inputValue("Введите ширину ракетки: ", scanner);

                if(width > length){
                    throw new IncorrectParametersException("Ширина не может быть больше длины!");
                }

                goodInput = true;

                setLength(length);
                setWidth(width);

            } catch (IncorrectParametersException iPE){
                System.out.println(iPE.getMessage());
            }
        }
    }

    @Override
    public String toString(){
        return super.toString() + "Размеры: " + length + "X" + width + ". ";
    }

}
