package hu.petrik.szuperhosprojekt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String filePath) {
        try {
            Files.lines(Paths.get(filePath)).forEach(line -> {
                String[] parts = line.split(" ");
                String nev = parts[0];
                int kutyuSzam = Integer.parseInt(parts[1]);

                Szuperhos szuperhos;
                if ("Vasember".equals(nev)) {
                    szuperhos = (Szuperhos) new Vasember();
                } else if ("Batman".equals(nev)) {
                    szuperhos = new Batman();
                } else {
                    throw new IllegalArgumentException("Ismeretlen hős: " + nev);
                }

                for (int i = 0; i < kutyuSzam; i++) {
                    if (szuperhos instanceof Milliardos) {
                        ((Milliardos) szuperhos).kutyutKeszit();
                    }
                }

                szuperhosLista.add(szuperhos);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void szuperhosok() {
        szuperhosLista.forEach(System.out::println);
    }

}

