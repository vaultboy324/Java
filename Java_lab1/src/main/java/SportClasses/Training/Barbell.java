package SportClasses.Training;

import SportClasses.Facade;
import lombok.Setter;

import java.util.Scanner;

@Setter
public class Barbell extends Training {
    private int beamWeight;
    private int pancakeWeight;
    private int pancakeCount;

    public Barbell(){
        super();
        setBeamWeight(0);
        setPancakeWeight(0);
        setPancakeCount(0);
    }

    public void init(Scanner scanner) {
        String name = inputName(scanner);
        setName(name);

        int beamWeight = Facade.inputValue("Введите массу балки: ", scanner);
        setBeamWeight(beamWeight);

        int pancakeWeight = Facade.inputValue("Введите массу одного блина: ", scanner);
        setPancakeWeight(pancakeWeight);

        int pancakeCount = Facade.inputValue("Введите количество блинов: ", scanner);
        setPancakeCount(pancakeCount);

        setWeight(beamWeight + pancakeWeight*pancakeCount);

        setName("Штанга");
    }

    @Override
    public String toString(){
        return super.toString() + "Масса балки: " + beamWeight + ". Масса блина: " + pancakeWeight + ". Количество блинов: " + pancakeCount;
    }


}
