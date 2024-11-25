package hu.petrik.szuperhosprojekt;

import java.io.Serializable;
import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Bosszuallo) {
            Bosszuallo bosszuallo = (Bosszuallo) szuperhos;
            if(bosszuallo.vanEGyengesege && this.szuperero > bosszuallo.szuperero){
                return true;
            }
        }
        if (szuperhos instanceof Batman) {
            Batman batman = (Batman) szuperhos;
            if(this.szuperero > (batman.mekkoraAzEreje()*2)){
                return true;
            }
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Szupererő: {0,number,#.##}; {1}",
                szuperero, vanEGyengesege ? "van gyengesége" : "nincs gyengesége");
    }
}
