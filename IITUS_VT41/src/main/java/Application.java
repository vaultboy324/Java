import Interface.ISport;
import SportClasses.*;

import java.util.Scanner;

public class Application {
    public static void main(String args[]){
        System.out.println("Введите количество элементов массива: ");
        Scanner scanner = new Scanner(System.in);
        Integer count = scanner.nextInt();

        ISport inventory[] = new ISport[count];
        for (int i = 0; i < count; i++){
            inventory[i] = SportFabric.getElement();
        }

        ISport resultMas[] = new ISport[count];
        Integer sizeResult = 0;
        for(int i = 0; i < count; i++){
            if(inventory[i] instanceof Training || inventory[i] instanceof Core){
                resultMas[sizeResult] = inventory[i];
                sizeResult++;
            }
        }

        for(int i = 0; i < sizeResult; i++){
            System.out.println(resultMas[i].toString());
        }

    }
}
