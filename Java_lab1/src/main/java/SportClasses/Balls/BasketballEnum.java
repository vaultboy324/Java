package SportClasses.Balls;

import SportClasses.Exceptions.NotHaveElementException;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BasketballEnum {
    STREET(1,"для игры на улице"),
    HALL(2, "для игры в зале"),
    UNIVERSAL(3, "универсальный");

    private int id;
    private String name;

    public static BasketballEnum from(int source)throws NotHaveElementException {
        for(BasketballEnum basketballEnum:BasketballEnum.values()){
            if(source == basketballEnum.getId()){
                return basketballEnum;
            }
        }
        throw new RuntimeException("Данного элемента нет в списке!");
    }

    public static String showAllTypes() {
        StringBuilder result = new StringBuilder();
        for (BasketballEnum basketballEnum : BasketballEnum.values()) {
            result.append(basketballEnum.getId()).append(") ").append(basketballEnum.getName()).append("\n");
        }
        return result.toString();
    }

}