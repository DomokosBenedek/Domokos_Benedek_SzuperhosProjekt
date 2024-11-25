package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{
    private static final Random random = new Random();

    public Vasember() {
        super(150, true);
    }

    @Override
    public void kutyutKeszit() {
        double novekedes = random.nextFloat() * 10;
        setSzuperero(getSzuperero() + novekedes);
    }

    @Override
    public boolean megmentiAVilagot() {
        return getSzuperero() > 1000;
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}
