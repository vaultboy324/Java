package SportClasses;

import Interface.ISport;

import java.util.Scanner;

public abstract class SportsEquipment implements ISport {
    private String name;
    private Integer sportType;

    public abstract void init(Scanner scanner);

    public SportsEquipment() {
        name = "";
        sportType = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSportType() {
        return sportType;
    }

    public void setSportType(Integer sportType) {
        this.sportType = sportType;
    }

    public String toString(){
        return "Название: " + name +". ";
    }
}
