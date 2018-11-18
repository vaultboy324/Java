package SportClasses.Balls;

import SportClasses.Exceptions.NegativeNumbersException;
import SportClasses.SportsEquipment;
import lombok.Setter;

import java.util.Scanner;

@Setter
public class Ball extends SportsEquipment {
    private float rad;

    public Ball(){
        setName("Мяч");
        setSportType("Мяч");
        setRad(0.f);
    }

    @Override
    public void init(Scanner scanner) {
        String name = inputName(scanner);
        setName(name);

        boolean goodInput = false;
        while (!goodInput){
            try{
                System.out.print("Введите радиус мяча: ");
                float rad = scanner.nextFloat();
                if(rad < 0){
                    throw new NegativeNumbersException("Радиус не может быть отрицательньным!");
                }
                setRad(rad);

                goodInput = true;
            } catch (RuntimeException rE){
                System.out.println("Радиус должен быть числом!");
                scanner.nextLine();
            } catch (NegativeNumbersException nNE){
                System.out.println(nNE.getMessage());
            }
        }
    }

    @Override
    public String toString(){
        return super.toString() + "Радиус: " + rad + ". ";
    }
}
