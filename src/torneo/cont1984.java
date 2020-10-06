/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Miguel
 */
public class cont1984 {
    
    Torneo t = new Torneo();
    ArrayList<Equipos> euro = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> r2 = new ArrayList<>();
    ArrayList<Equipos> semi = new ArrayList<>();
    ArrayList<Equipos> fin = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<ArrayList<Equipos>> grilla;
    ArrayList<ArrayList<Equipos>> grupos; 
    
    static void copas1984(){
        cont1984 c = new cont1984();
        c.c1984();
    }
    
    public void c1984(){
        System.out.println("EUROCOPA 1984");
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        t.Eliminar(uefa, Torneo.fra.nombre); t.Eliminar(uefa, Torneo.isr.nombre); 
        Torneo.den.nivel=2;
        Torneo.por.nivel=2;
        Torneo.nir.nivel=3;
        Torneo.chi.nivel=2;
        euro=c1984elim();
        euro.add(Torneo.fra);
        Funciones.ordenarMundial(euro, Torneo.fra, Torneo.euroCampeones.get(5));
        grilla=Torneo.chopped(euro, 2, 4);
        grupos=t.Mezclar(grilla);
        Torneo.grupo4neu(grupos.get(0), Torneo.fra.nombre, 50, 2, semi);
        Torneo.grupo4neu(grupos.get(1), Torneo.fra.nombre, 50, 2, semi);
        t.pElimDirecta(semi.get(0), semi.get(3), Torneo.fra.nombre, 50, true, fin);
        t.pElimDirecta(semi.get(1), semi.get(2), Torneo.fra.nombre, 50, true, fin);
        t.pElimDirecta(fin.get(0), fin.get(1), Torneo.fra.nombre, 50, true, Torneo.euroCampeones);
        System.out.println("COPA AMERICA 1984 URUGUAY");
        grilla=Torneo.chopped(conm, 2, 5);
        grupos = t.Mezclar(grilla);
        Grupos.grupo5neu(grupos.get(0), Torneo.uru.nombre, 50, 3, r2);
        Grupos.grupo5neu(grupos.get(1), Torneo.uru.nombre, 50, 3, r2);
        t.Resetear(r2);
        Grupos.grupo6neu(r2, Torneo.uru.nombre, 50, 1, Torneo.americaCampeones);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c1984elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        grilla=Funciones.chopped5(uefa, 7, 7, 7, 4, 7);
        grupos=t.Mezclar(grilla);
        Funciones.Qualifier(grupos, 40, 1, euro);
        t.Resetear(uefa);
        return euro;
    }
}
