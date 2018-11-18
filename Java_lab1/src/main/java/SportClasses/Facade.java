package SportClasses;

import Interfaces.ISport;
import SportClasses.Exceptions.NegativeNumbersException;
import SportClasses.Training.Training;
import java.util.ArrayList;
import java.util.Scanner;

public class Facade {
    public static int inputValue(String msgForUser, Scanner scanner){
        boolean goodInput = false;
        int value = 0;

        while (!goodInput){
            try {
                System.out.print(msgForUser);
                value = scanner.nextInt();
                scanner.nextLine();

                if(value < 0){
                    throw new NegativeNumbersException("Введённое значение не может быть отрицательным");
                }

                goodInput = true;

            } catch (RuntimeException rE){
                System.out.println("Тип введённого значения не соответвует параметру");
            } catch (NegativeNumbersException nNE){
                System.out.println(nNE.getMessage());
            }
        }

        return value;
    }

    public static ArrayList<ISport> createList(int count){
        ArrayList<ISport> list= new ArrayList<ISport>();

        for (int i = 0; i < count; i++){
            ISport element = SportSelector.selectSport();
            list.add(element);
        }

        return list;
    }

    public static void filterByWeight(ArrayList<ISport> list){
        ArrayList<ISport> trash = new ArrayList<ISport>();

        for (ISport element: list){
            if(!(element instanceof Core) && !(element instanceof Training)){
                trash.add(element);
            }
        }

        list.removeAll(trash);

    }

    public static void displayCollection(ArrayList<ISport> list){
        for (ISport element:list){
            System.out.println(element);
        }
    }
}
