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
public class cont2004 {
    
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
    
    static void copas2004(){
        cont2004 c = new cont2004();
        c.c2004();
    }
    
    public void c2004(){
        
        Torneo.srb.nombre="SERBIA Y M.   ";
        System.out.println("EUROCOPA 2004");
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        t.Eliminar(uefa, Torneo.por.nombre); 
        Torneo.lva.nivel=3;
        Torneo.sui.nivel=2;
        Torneo.aze.nivel=5;
        Torneo.bih.nivel=3;
        Torneo.gre.nivel=2;
        Torneo.ltu.nivel=4;
        Torneo.est.nivel=5;
        Torneo.chi.nivel=2;
        Torneo.ven.nivel=3;
        Torneo.ecu.nivel=2;
        euro = c2004elim();
        euro.add(Torneo.por); 
        Funciones.ordenarMundial(euro, Torneo.por,Torneo.euroCampeones.get(10));
        grilla=Torneo.chopped(euro, 4, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,4,1)==false)||
         !grupos.get(0).contains(Torneo.por)){
                 grupos=t.Mezclar(grilla);     
        }
        Funciones.Euro_16(grupos, Torneo.por.nombre, 50);
        System.out.println("COPA AMERICA 2004 BRASIL");
        conm.add(conc.get(0));
        conm.add(conc.get(1));
        Funciones.ordenarMundial(conm, Torneo.bra, Torneo.americaCampeones.get(10));
        grilla=Torneo.chopped(conm, 3, 4);
        grupos = t.Mezclar(grilla);
        while((t.Validacion(grupos,4,1,1)==false)||
        !grupos.get(0).contains(Torneo.bra)){
                grupos=t.Mezclar(grilla);                
        }
        mundial32.copaAmerica(grupos, Torneo.bra.nombre, 50);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c2004elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        grilla=Torneo.chopped(uefa, 10, 5);
        grupos=t.Mezclar(grilla);
        Grupos.descPartidos(grupos, 40, 1, 2, 6, r2, euro);
        Funciones.Ronda(r2, 40, 5, euro);
        t.Resetear(uefa);
        return euro;
    }
}
