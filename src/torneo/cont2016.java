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
public class cont2016 {
    
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
    
    static void copas2016(){
        cont2016 c = new cont2016();
        c.c2016();
    }
    
    public void c2016(){
        
        Torneo.selecciones.add(Torneo.gib);
        System.out.println("EUROCOPA 2016");
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        t.Eliminar(uefa, Torneo.fra.nombre); 
        Torneo.nir.nivel=3;
        Torneo.mda.nivel=5;
        Torneo.ned.nivel=2;
        Torneo.bih.nivel=3;
        Torneo.alb.nivel=3;
        Torneo.gre.nivel=3;
        Torneo.est.nivel=5;
        Torneo.arm.nivel=4;
        Torneo.wal.nivel=3;
        Torneo.pol.nivel=2;
        Torneo.per.nivel=2;
        
        euro = c2016elim();
        euro.add(Torneo.fra);
        Funciones.ordenarMundial(euro, Torneo.fra,Torneo.euroCampeones.get(13));
        grilla=Torneo.chopped(euro, 6, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,4,1)==false)||
         !grupos.get(0).contains(Torneo.fra)){
                 grupos=t.Mezclar(grilla);     
        }
        Funciones.Euro2016(grupos, Torneo.fra.nombre, 50);
        System.out.println("COPA AMERICA 2016 CHILE");
        
        conm.add(conc.get(0));conm.add(conc.get(3));
        conm.add(conc.get(1));conm.add(conc.get(4));
        conm.add(conc.get(2));conm.add(conc.get(5));
        
        Funciones.ordenarMundial(conm, Torneo.chi, Torneo.americaCampeones.get(13));
        grilla=Torneo.chopped(conm, 4, 4);
        grupos = t.Mezclar(grilla);
        while((t.Validacion(grupos,3,1,2)==false)||
        !grupos.get(0).contains(Torneo.chi)){
                grupos=t.Mezclar(grilla);                
        }
        Funciones.CopaAmerica_16(grupos, Torneo.chi.nombre, 50);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c2016elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        grilla=Funciones.chopped6(uefa, 9, 9, 9, 9, 8, 9);
        grupos=t.Mezclar(grilla);
        Grupos.descPartidos(grupos, 40, 2, 3, 5, r2, euro);
        Collections.sort(r2);
        Funciones.pasarEquiposPts(r2, euro, 1);
        Funciones.Ronda(r2, 40, 4, euro);
        t.Resetear(uefa);
        return euro;
    }
}
