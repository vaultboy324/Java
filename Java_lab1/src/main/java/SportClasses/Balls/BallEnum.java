package SportClasses.Balls;

import Interfaces.ISport;
import SportClasses.Exceptions.NotHaveElementException;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BallEnum {
    SIMPLE(1,"Просто мяч"),
    BASKETBALL(2, "Баскетбольный мяч"),
    TENNIS(3,"Теннисный мяч");

    private int id;
    private String name;

    public static BallEnum from(int source)throws NotHaveElementException {
        for(BallEnum ballEnum:BallEnum.values()){
            if(source ==ballEnum.getId()){
                return ballEnum;
            }
        }
        throw new RuntimeException("Данного элемента нет в списке!");
    }

    public static String showAllTypes() {
        StringBuilder result = new StringBuilder();
        for (BallEnum BallEnum : BallEnum.values()) {
            result.append(BallEnum.getId()).append(") ").append(BallEnum.getName()).append("\n");
        }
        return result.toString();
    }
}