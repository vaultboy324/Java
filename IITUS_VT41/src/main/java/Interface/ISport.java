package Interface;

import java.util.Scanner;

public interface ISport {
    public abstract void init(Scanner scanner);
    public Integer getSportType();

    @Override
    public String toString();

}
