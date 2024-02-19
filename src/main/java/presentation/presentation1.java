package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class presentation1 {
    public static void main(String[] args) {
            MetierImpl metier=new MetierImpl(new DaoImpl());//instanciation statique=couplage fort
        System.out.println(metier.calcul());
    }
}
