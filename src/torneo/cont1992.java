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
public class cont1992 {
    
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
    
    static void copas1992(){
        cont1992 c = new cont1992();
        c.c1992();
    }
    
    public void c1992(){
        Torneo.ger.nombre="ALEMANIA      ";
        Torneo.selecciones.remove(Torneo.gdr);
        Torneo.selecciones.add(Torneo.smr);
        Torneo.selecciones.add(Torneo.fro);
        System.out.println("EUROCOPA 1992");
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        t.Eliminar(uefa, Torneo.swe.nombre);
        Torneo.aut.nivel=3;
        Torneo.alb.nivel=4;
        Torneo.fro.nivel=6;
        Torneo.por.nivel=2;
        Torneo.bol.nivel=3;
        euro=c1992elim();
        Torneo.rus.nombre = "CEI           ";
        euro.add(Torneo.swe);
        Funciones.ordenarMundial(euro, Torneo.swe, Torneo.euroCampeones.get(7));
        grilla=Torneo.chopped(euro, 2, 4);
        grupos=t.Mezclar(grilla);
        Torneo.grupo4neu(grupos.get(0), Torneo.swe.nombre, 50, 2, semi);
        Torneo.grupo4neu(grupos.get(1), Torneo.swe.nombre, 50, 2, semi);
        t.pElimDirecta(semi.get(0), semi.get(3), Torneo.swe.nombre, 50, true, fin);
        t.pElimDirecta(semi.get(1), semi.get(2), Torneo.swe.nombre, 50, true, fin);
        t.pElimDirecta(fin.get(0), fin.get(1), Torneo.swe.nombre, 50, true, Torneo.euroCampeones);
        System.out.println("COPA AMERICA 1992 ECUADOR");
        conm.add(conc.get(0));
        conm.add(conc.get(1));
        Funciones.ordenarMundial(conm, Torneo.ecu, Torneo.americaCampeones.get(7));
        grilla=Torneo.chopped(conm, 3, 4);
        grupos = t.Mezclar(grilla);
        while((t.Validacion(grupos,4,1,1)==false)||
        !grupos.get(0).contains(Torneo.ecu)){
                grupos=t.Mezclar(grilla);                
        }
        mundial32.copaAmerica(grupos, Torneo.ecu.nombre, 50);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c1992elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        grilla=Funciones.chopped5(uefa, 7, 7, 7, 5, 7);
        grupos=t.Mezclar(grilla);
        Funciones.Qualifier(grupos, 40, 1, euro);
        t.Resetear(uefa);
        return euro;
    }
}
