/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Miguel
 */
public class cont1964 {
    
        
    Torneo t = new Torneo();
    ArrayList<Equipos> euro = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> r2 = new ArrayList<>();
    ArrayList<Equipos> r3 = new ArrayList<>();
    ArrayList<Equipos> fin = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<ArrayList<Equipos>> grilla;
    ArrayList<ArrayList<Equipos>> grupos; 
    
    static void copas1964(){
        cont1964 c = new cont1964();
        c.c1964();
    }
    
    public void c1964(){
        t.Resetear(Torneo.selecciones);
        Torneo.selecciones.add(Torneo.alb);
        Torneo.selecciones.add(Torneo.mlt);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        t.Eliminar(uefa, Torneo.ger.nombre); t.Eliminar(uefa, Torneo.sco.nombre);
        t.Eliminar(uefa, Torneo.cyp.nombre); t.Eliminar(uefa, Torneo.fin.nombre);
        Torneo.aut.nivel=3;
        Torneo.tur.nivel=5;
        Torneo.bel.nivel=3;
        Torneo.nor.nivel=4;
        Torneo.por.nivel=2;
        Torneo.sui.nivel=2;
        Torneo.den.nivel=3;
        Torneo.lux.nivel=6;
        Torneo.ned.nivel=2;
        Torneo.rou.nivel=3;
        euro=c1964elim();
        String local = Funciones.localEuro(euro);
        System.out.println("Sede: "+local);
        t.pElimDirecta(euro.get(0), euro.get(1), local, 50, false, fin);
        t.pElimDirecta(euro.get(2), euro.get(3), local, 50, false, fin);
        t.pElimDirecta(fin.get(0), fin.get(1), local, 50, false, Torneo.euroCampeones);
        System.out.println("COPA AMERICA 1964 BRASIL");
        grilla=Funciones.chopped5(conm, 2, 2, 2 ,1,2);
        grupos = t.Mezclar(grilla);
        Grupos.grupo5neu(grupos.get(0), Torneo.bra.nombre, 50, 2, r2);
        Torneo.grupo4neu(grupos.get(1), Torneo.bra.nombre, 50, 2, r2);
        t.Resetear(r2);
        Torneo.grupo4neu(r2, Torneo.bra.nombre, 50, 1, Torneo.americaCampeones);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c1964elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        Funciones.pasarEquipos(uefa, r2,3);
        System.out.println("");
        System.out.println("PRIMERA RONDA");
        System.out.println("");
        Funciones.Ronda(uefa, 40, 13, r2);
        System.out.println("");
        System.out.println("SEGUNDA RONDA");
        System.out.println("");
        Funciones.Ronda(r2, 40, 8, r3);
        System.out.println("");
        System.out.println("TERCERA RONDA");
        System.out.println("");
        Funciones.Ronda(r3, 40, 4, euro);
        r2.clear();
        return euro;
    }
    
}
