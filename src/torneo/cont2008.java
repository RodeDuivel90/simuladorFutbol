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
public class cont2008 {
    
    Torneo t = new Torneo();
    ArrayList<Equipos> euro = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> semi = new ArrayList<>();
    ArrayList<Equipos> fin = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<Equipos> conc = new ArrayList<>();
    ArrayList<ArrayList<Equipos>> grilla;
    ArrayList<ArrayList<Equipos>> grupos; 
    
    static void copas2008(){
        cont2008 c = new cont2008();
        c.c2008();
    }
    
    public void c2008(){
        
        Torneo.srb.nombre="SERBIA        ";
        System.out.println("EUROCOPA 2008");
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        t.Eliminar(uefa, Torneo.sui.nombre); t.Eliminar(uefa, Torneo.aut.nombre); 
        Torneo.lux.nivel=5;
        Torneo.mda.nivel=4;
        Torneo.nor.nivel=2;
        Torneo.hun.nivel=4;
        Torneo.nir.nivel=3;
        Torneo.per.nivel=3;
        
        euro = c2008elim();
        euro.add(Torneo.aut); euro.add(Torneo.sui); 
        Funciones.ordenarMundial(euro, Torneo.aut,Torneo.sui,Torneo.euroCampeones.get(11));
        grilla=Torneo.chopped(euro, 4, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,4,1)==false)||
         !grupos.get(0).contains(Torneo.sui)||!grupos.get(1).contains(Torneo.aut)){
                 grupos=t.Mezclar(grilla);     
        }
        Funciones.Euro2008_16(grupos, Torneo.aut.nombre, Torneo.sui.nombre, 50);
        System.out.println("COPA AMERICA 2008 ARGENTINA");
        
        conm.add(conc.get(0));conm.add(conc.get(3));
        conm.add(conc.get(1));conm.add(conc.get(4));
        conm.add(conc.get(2));conm.add(conc.get(5));
        
        Funciones.ordenarMundial(conm, Torneo.Arg, Torneo.americaCampeones.get(11));
        grilla=Torneo.chopped(conm, 4, 4);
        grupos = t.Mezclar(grilla);
        while((t.Validacion(grupos,3,1,2)==false)||
        !grupos.get(0).contains(Torneo.Arg)){
                grupos=t.Mezclar(grilla);                
        }
        Funciones.CopaAmerica_16(grupos, Torneo.Arg.nombre, 50);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c2008elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        grilla=Funciones.chopped8(uefa, 7, 7, 7, 7, 7, 7, 1, 7);
        grupos=t.Mezclar(grilla);
        Funciones.Qualifier(grupos, 50, 2, euro);
        t.Resetear(uefa);
        return euro;
    }
}
