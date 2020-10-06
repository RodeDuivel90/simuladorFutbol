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
public class cont1980 {
    
    Torneo t = new Torneo();
    ArrayList<Equipos> euro = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> r2 = new ArrayList<>();
    ArrayList<Equipos> fin = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<ArrayList<Equipos>> grilla;
    ArrayList<ArrayList<Equipos>> grupos; 
    
    static void copas1980(){
        cont1980 c = new cont1980();
        c.c1980();
    }
    
    public void c1980(){
        System.out.println("EUROCOPA 1980");
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        t.Eliminar(uefa, Torneo.alb.nombre); t.Eliminar(uefa, Torneo.ita.nombre);
        Torneo.rou.nivel=2;
        Torneo.gre.nivel=3;
        Torneo.eng.nivel=1;
        Torneo.nir.nivel=2;
        Torneo.fra.nivel=1;
        Torneo.col.nivel=3;
        Torneo.bol.nivel=4;
        Torneo.par.nivel=2;
        euro=c1980elim();
        euro.add(Torneo.ita);
        Funciones.ordenarMundial(euro, Torneo.ita, Torneo.euroCampeones.get(4));
        grilla=Torneo.chopped(euro, 2, 4);
        grupos=t.Mezclar(grilla);
        Torneo.grupo4neu(grupos.get(0), Torneo.ita.nombre, 50, 1, fin);
        Torneo.grupo4neu(grupos.get(1), Torneo.ita.nombre, 50, 1, fin);
        t.pElimDirecta(fin.get(0), fin.get(1), Torneo.ita.nombre, 50, true, Torneo.euroCampeones);
        System.out.println("COPA AMERICA 1980 BOLIVIA");
        grilla=Torneo.chopped(conm, 2, 5);
        grupos = t.Mezclar(grilla);
        Grupos.grupo5neu(grupos.get(0), Torneo.bol.nombre, 50, 3, r2);
        Grupos.grupo5neu(grupos.get(1), Torneo.bol.nombre, 50, 3, r2);
        t.Resetear(r2);
        Grupos.grupo6neu(r2, Torneo.bol.nombre, 50, 1, Torneo.americaCampeones);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c1980elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        grilla=Funciones.chopped5(uefa, 7, 7, 7, 3, 7);
        grupos=t.Mezclar(grilla);
        Funciones.Qualifier(grupos, 40, 1, euro);
        t.Resetear(uefa);
        return euro;
    }
}
