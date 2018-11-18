package SportClasses.Balls;


import lombok.Setter;

import java.util.Scanner;

@Setter
public class Basketball extends Ball {
    private String areaType;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        boolean goodInput = false;
    }

    @Override
    public String toString(){
        return super.toString() + "Предназначен: " + areaType + ". ";
    }
}
