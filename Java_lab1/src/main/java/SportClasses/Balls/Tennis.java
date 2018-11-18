package SportClasses.Balls;

import lombok.Setter;

@Setter
public class Tennis extends Ball {
    private String areaType;

    public Tennis(){
        super();
    }

    @Override
    public String toString(){
        return super.toString() + "Предназначен: " + areaType + ". ";
    }
}
