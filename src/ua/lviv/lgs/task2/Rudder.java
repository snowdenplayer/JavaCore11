package ua.lviv.lgs.task2;

import java.util.Random;

public class Rudder {
    private int diametr;
    private Material material;


    public Rudder(int diametr) {
        this.diametr = diametr;
        material = Material.values()[new Random().nextInt(Material.values().length)];

    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }


    @Override
    public String toString() {
        return "Rudder{" +
                "diametr=" + diametr +
                ", material='" + material + '\'' +
                '}';
    }
}
