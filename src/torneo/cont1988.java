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
public class cont1988 {
    
    Torneo t = new Torneo();
    ArrayList<Equipos> euro = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> r2 = new ArrayList<>();
    ArrayList<Equipos> semi = new ArrayList<>();
    ArrayList<Equipos> fin = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<Equipos> conc = new ArrayList<>();
    ArrayList<ArrayList<Equipos>> grilla;
    ArrayList<ArrayList<Equipos>> grupos; 
    
    static void copas1988(){
        cont1988 c = new cont1988();
        c.c1988();
    }
    
    public void c1988(){
        System.out.println("EUROCOPA 1988");
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        t.Eliminar(uefa, Torneo.ger.nombre);
        Torneo.por.nivel=3;
        Torneo.ned.nivel=1;
        Torneo.hun.nivel=3;
        Torneo.cze.nivel=3;
        Torneo.fra.nivel=2;
        Torneo.per.nivel=3;
        Torneo.bol.nivel=3;
        Torneo.col.nivel=2;
        euro=c1988elim();
        euro.add(Torneo.ger);
        Funciones.ordenarMundial(euro, Torneo.ger, Torneo.euroCampeones.get(6));
        grilla=Torneo.chopped(euro, 2, 4);
        grupos=t.Mezclar(grilla);
        Torneo.grupo4neu(grupos.get(0), Torneo.ger.nombre, 50, 2, semi);
        Torneo.grupo4neu(grupos.get(1), Torneo.ger.nombre, 50, 2, semi);
        t.pElimDirecta(semi.get(0), semi.get(3), Torneo.ger.nombre, 50, true, fin);
        t.pElimDirecta(semi.get(1), semi.get(2), Torneo.ger.nombre, 50, true, fin);
        t.pElimDirecta(fin.get(0), fin.get(1), Torneo.ger.nombre, 50, true, Torneo.euroCampeones);
        System.out.println("COPA AMERICA 1988 PARAGUAY");
        conm.add(conc.get(0));
        conm.add(conc.get(1));
        Funciones.ordenarMundial(conm, Torneo.par, Torneo.americaCampeones.get(6));
        grilla=Torneo.chopped(conm, 3, 4);
        grupos = t.Mezclar(grilla);
        while((t.Validacion(grupos,4,1,1)==false)||
        !grupos.get(0).contains(Torneo.par)){
                grupos=t.Mezclar(grilla);                
        }
        mundial32.copaAmerica(grupos, Torneo.par.nombre, 50);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c1988elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        grilla=Funciones.chopped5(uefa, 7, 7, 7, 4, 7);
        grupos=t.Mezclar(grilla);
        Funciones.Qualifier(grupos, 40, 1, euro);
        t.Resetear(uefa);
        return euro;
    }
}
