package SportClasses.Balls;

import SportClasses.Exceptions.NotHaveElementException;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TennisEnum {
    BIG(1,"Для игры в большой теннис"),
    TABLE(2, "Для игры в настольный теннис");

    private int id;
    private String name;

    public static TennisEnum from(int source) throws  NotHaveElementException{
        for(TennisEnum tennisEnum:TennisEnum.values()){
            if(source ==tennisEnum.getId()){
                return tennisEnum;
            }
        }
        throw new NotHaveElementException("Данного элемента нет в списке!");
    }

    public static String showAllTypes() {
        StringBuilder result = new StringBuilder();
        for (TennisEnum tennisEnum : TennisEnum.values()) {
            result.append(tennisEnum.getId()).append(")  ").append(tennisEnum.getName()).append("\n");
        }
        return result.toString();
    }

}
