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
public class cont1972 {
    
    Torneo t = new Torneo();
    ArrayList<Equipos> euro = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> r2 = new ArrayList<>();
    ArrayList<Equipos> fin = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<ArrayList<Equipos>> grilla;
    ArrayList<ArrayList<Equipos>> grupos; 
    
    static void copas1972(){
        cont1972 c = new cont1972();
        c.c1972();
    }
    
    public void c1972(){
        t.Eliminar(Torneo.hosts, Torneo.ita.nombre);
        System.out.println("EUROCOPA 1972");
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        t.Eliminar(uefa, Torneo.isl.nombre);
        Torneo.gre.nivel=4;
        Torneo.aut.nivel=2;
        Torneo.eng.nivel=2;
        Torneo.por.nivel=3;
        Torneo.pol.nivel=2;
        euro=c1972elim();
        String local = Funciones.localEuro(euro);
        System.out.println("Sede: "+local);
        t.pElimDirecta(euro.get(0), euro.get(1), local, 50, false, fin);
        t.pElimDirecta(euro.get(2), euro.get(3), local, 50, false, fin);
        t.pElimDirecta(fin.get(0), fin.get(1), local, 50, false, Torneo.euroCampeones);
        System.out.println("COPA AMERICA 1972 PERÚ");
        grilla=Torneo.chopped(conm, 2, 5);
        grupos = t.Mezclar(grilla);
        Grupos.grupo5neu(grupos.get(0), Torneo.per.nombre, 50, 3, r2);
        Grupos.grupo5neu(grupos.get(1), Torneo.per.nombre, 50, 3, r2);
        t.Resetear(r2);
        Grupos.grupo6neu(r2, Torneo.per.nombre, 50, 1, Torneo.americaCampeones);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c1972elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        grilla=Torneo.chopped(uefa, 8, 4);
        grupos=t.Mezclar(grilla);
        Funciones.Qualifier(grupos, 40, 1, r2);
        Collections.sort(r2, Torneo.rankingElo());
        Funciones.Ronda(r2, 40, 4, euro);
        r2.clear();
        return euro;
    }
}
