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
public class cont2000 {
    
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
    
    static void copas2000(){
        cont2000 c = new cont2000();
        c.c2000();
    }
    
    public void c2000(){
        
        Torneo.selecciones.add(Torneo.and);
        System.out.println("EUROCOPA 2000");
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        t.Eliminar(uefa, Torneo.bel.nombre); t.Eliminar(uefa, Torneo.ned.nombre);
        Torneo.aze.nivel=4;
        Torneo.aut.nivel=3;
        Torneo.tur.nivel=2;
        Torneo.bul.nivel=3;
        Torneo.svn.nivel=3;
        Torneo.nir.nivel=4;
        Torneo.per.nivel=4;
        Torneo.chi.nivel=3;
        Torneo.ven.nivel=4;
        
        euro = c2000elim();
        euro.add(Torneo.bel); euro.add(Torneo.ned);
        Funciones.ordenarMundial(euro, Torneo.ned,Torneo.bel, Torneo.euroCampeones.get(9));
        grilla=Torneo.chopped(euro, 4, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,4,1)==false)||
         !grupos.get(0).contains(Torneo.bel)||!grupos.get(3).contains(Torneo.ned)){
                 grupos=t.Mezclar(grilla);     
        }
        Funciones.Euro2000_16(grupos, Torneo.bel.nombre, Torneo.ned.nombre, 50);
        System.out.println("COPA AMERICA 2000 COLOMBIA");
        conm.add(conc.get(0));
        conm.add(conc.get(1));
        Funciones.ordenarMundial(conm, Torneo.col, Torneo.americaCampeones.get(9));
        grilla=Torneo.chopped(conm, 3, 4);
        grupos = t.Mezclar(grilla);
        while((t.Validacion(grupos,4,1,1)==false)||
        !grupos.get(0).contains(Torneo.col)){
                grupos=t.Mezclar(grilla);                
        }
        mundial32.copaAmerica(grupos, Torneo.col.nombre, 50);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c2000elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        grilla=Funciones.chopped6(uefa, 9, 9, 9, 9, 4, 9);
        grupos=t.Mezclar(grilla);
        Grupos.descPartidos(grupos, 40, 1, 2, 5, r2, euro);
        Funciones.pasarEquiposPts(r2, euro, 1);
        Funciones.Ronda(r2, 40, 4, euro);
        t.Resetear(uefa);
        return euro;
    }
}
