import Interfaces.ISport;
import SportClasses.*;
import SportClasses.Balls.Ball;
import SportClasses.Balls.Basketball;
import SportClasses.Training.Barbell;
import SportClasses.Training.Poise;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String argc[]){
        Scanner scanner = new Scanner(System.in);
        int count = Facade.inputValue("Введите количество элементов спортивного оборудования: ", scanner);
        ArrayList<ISport> list = Facade.createList(count);
        Facade.filterByWeight(list);
        Facade.displayCollection(list);
    }
}
