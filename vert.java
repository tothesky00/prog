import java.util.Scanner;

public class vert extends gorrr {
    private String nameCup;
    private int numDoors;
    private Boolean embedded;

    public vert() {
        super();
        nameCup = "noname";
        numDoors = 2;
        embedded = false;
    }

    public vert(String name, int w, int l, int h, String nameC, int n, Boolean f) {
        super(name, w, l, h);
        this.nameCup =  nameC;
        this.numDoors = n;
        this.embedded = f;
    }

    public void setNameCup(String name) {
        this.nameCup = name;
    }

    public String getNameCup() {
        return nameCup;
    }

    public void setNumDoors(int n) {
        numDoors = n;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setEmbedded(Boolean b) {
        this.embedded = b;
    }

    public Boolean isFullTime() {
        return embedded;
    }

    public String toString() {
        return getFirma() + " " + getWidth() + " " + getLength() + " " + nameCup + " " + numDoors + " " + embedded;
    }
}