package com.mycompany.naomexersenaoforofelipe;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class Main {

    public static class Temperatura {
        private int fahrenheit;
        private double celsius;

        public Temperatura(int fahrenheit, double celsius) {
            this.fahrenheit = fahrenheit;
            this.celsius = celsius;
        }

        public int getFahrenheit() {
            return fahrenheit;
        }

        public double getCelsius() {
            return celsius;
        }
    }

    public List<Temperatura> getTabela() {
        List<Temperatura> tabela = new ArrayList<>();
        for (int f = 70; f <= 90; f++) {
            double c = (5.0 / 9.0) * (f - 32);
            tabela.add(new Temperatura(f, c));
        }
        return tabela;
    }
}