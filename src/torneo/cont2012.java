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
public class cont2012 {
    
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
    
    static void copas2012(){
        cont2012 c = new cont2012();
        c.c2012();
    }
    
    public void c2012(){
        
        System.out.println("EUROCOPA 2012");
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        t.Eliminar(uefa, Torneo.pol.nombre); t.Eliminar(uefa, Torneo.ukr.nombre); 
        Torneo.mne.nivel=3;
        Torneo.mda.nivel=4;
        Torneo.est.nivel=4;
        Torneo.aze.nivel=4;
        Torneo.bel.nivel=2;
        Torneo.tur.nivel=2;
        Torneo.nir.nivel=4;
        Torneo.par.nivel=3;
        
        euro = c2012elim();
        euro.add(Torneo.pol); euro.add(Torneo.ukr); 
        Funciones.ordenarMundial(euro, Torneo.pol,Torneo.ukr,Torneo.euroCampeones.get(12));
        grilla=Torneo.chopped(euro, 4, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,4,1)==false)||
         !grupos.get(0).contains(Torneo.pol)||!grupos.get(3).contains(Torneo.ukr)){
                 grupos=t.Mezclar(grilla);     
        }
        Funciones.Euro2000_16(grupos, Torneo.pol.nombre, Torneo.ukr.nombre, 50);
        System.out.println("COPA AMERICA 2012 VENEZUELA");
        
        conm.add(conc.get(0));conm.add(conc.get(3));
        conm.add(conc.get(1));conm.add(conc.get(4));
        conm.add(conc.get(2));conm.add(conc.get(5));
        
        Funciones.ordenarMundial(conm, Torneo.ven, Torneo.americaCampeones.get(12));
        grilla=Torneo.chopped(conm, 4, 4);
        grupos = t.Mezclar(grilla);
        while((t.Validacion(grupos,3,1,2)==false)||
        !grupos.get(0).contains(Torneo.ven)){
                grupos=t.Mezclar(grilla);                
        }
        Funciones.CopaAmerica_16(grupos, Torneo.ven.nombre, 50);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c2012elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        grilla=Funciones.chopped6(uefa, 9, 9, 9, 9, 6, 9);
        grupos=t.Mezclar(grilla);
        Grupos.descPartidos(grupos, 40, 1, 2, 5, r2, euro);
        Collections.sort(r2);
        Funciones.pasarEquiposPts(r2, euro, 1);
        Funciones.Ronda(r2, 40, 4, euro);
        t.Resetear(uefa);
        return euro;
    }
}
