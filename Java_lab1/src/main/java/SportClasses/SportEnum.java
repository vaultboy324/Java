package SportClasses;

import SportClasses.Exceptions.NotHaveElementException;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SportEnum {
    BALL(1, "Мяч"),
    RACQUET(2, "Ракетка"),
    CORE(3, "Ядро"),
    TRAINING(4, "Тренажёр");

    private int id;
    private String name;

    public static SportEnum from(int source) throws NotHaveElementException {
        for(SportEnum sportEnum:SportEnum.values()){
            if(source == sportEnum.getId()){
                return sportEnum;
            }
        }
        throw new NotHaveElementException("Данного элемента нет в списке! ");
    }

    public static String showAllTypes() {
        StringBuilder result = new StringBuilder();
        for (SportEnum sportEnum : SportEnum.values()) {
            result.append(sportEnum.getId()).append(") ").append(sportEnum.getName()).append("\n");
        }
        return result.toString();
    }

}
