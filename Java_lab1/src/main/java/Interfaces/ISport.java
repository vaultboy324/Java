package Interfaces;


import java.util.Scanner;

public interface ISport {
    public String getSportType();

    public abstract void init(Scanner scanner);

    @Override
    public abstract String toString();
}
