package SportClasses.Training;

import SportClasses.Exceptions.NotHaveElementException;
import SportClasses.Training.Training;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TrainingEnum {
    POISE(1,"Гиря"),
    BARBELL(2, "Штанга");

    private int id;
    private String name;

    public static TrainingEnum from(int source) throws NotHaveElementException {
        for(TrainingEnum trainingEnum:TrainingEnum.values()){
            if(source ==trainingEnum.getId()){
                return trainingEnum;
            }
        }
        throw new NotHaveElementException("Данного элемента нет в списке!");
    }

    public static String showAllTypes() {
        StringBuilder result = new StringBuilder();
        for (TrainingEnum trainingEnum : TrainingEnum.values()) {
            result.append(trainingEnum.getId()).append(") ").append(trainingEnum.getName()).append("\n");
        }
        return result.toString();
    }

}
