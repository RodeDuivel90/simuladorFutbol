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
public class cont1996 {
    
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
    
    static void copas1996(){
        cont1996 c = new cont1996();
        c.c1996();
    }
    
    public void c1996(){
        
        Torneo.cze.nombre="REP. CHECA    ";
        Torneo.selecciones.add(Torneo.aze); Torneo.selecciones.add(Torneo.mkd);
        Torneo.selecciones.add(Torneo.blr); Torneo.selecciones.add(Torneo.mda);
        Torneo.selecciones.add(Torneo.arm); Torneo.selecciones.add(Torneo.svk);
        Torneo.selecciones.add(Torneo.svn); Torneo.selecciones.add(Torneo.ukr);
        Torneo.selecciones.add(Torneo.cro); Torneo.selecciones.add(Torneo.geo);
        Torneo.selecciones.add(Torneo.lie);
        System.out.println("EUROCOPA 1996");
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        t.Eliminar(uefa, Torneo.eng.nombre); t.Eliminar(uefa, Torneo.srb.nombre);
        Torneo.sco.nivel=2;
        Torneo.tur.nivel=3;
        Torneo.esp.nivel=1;
        Torneo.mlt.nivel=5;
        Torneo.lux.nivel=5;
        Torneo.ukr.nivel=3;
        Torneo.fin.nivel=3;
        Torneo.fra.nivel=1;
        Torneo.per.nivel=3;
        Torneo.bol.nivel=4;
        Torneo.ecu.nivel=3;
        euro=c1996elim();
        euro.add(Torneo.eng);
        Funciones.ordenarMundial(euro, Torneo.eng, Torneo.euroCampeones.get(8));
        grilla=Torneo.chopped(euro, 4, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,4,1)==false)||
         !grupos.get(0).contains(Torneo.eng)){
                 grupos=t.Mezclar(grilla);     
        }
        Funciones.Euro_16(grupos, Torneo.eng.nombre, 50);
        System.out.println("COPA AMERICA 1996 PERU");
        conm.add(conc.get(0));
        conm.add(conc.get(1));
        Funciones.ordenarMundial(conm, Torneo.per, Torneo.americaCampeones.get(8));
        grilla=Torneo.chopped(conm, 3, 4);
        grupos = t.Mezclar(grilla);
        while((t.Validacion(grupos,4,1,1)==false)||
        !grupos.get(0).contains(Torneo.per)){
                grupos=t.Mezclar(grilla);                
        }
        mundial32.copaAmerica(grupos, Torneo.per.nombre, 50);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c1996elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        grilla=Funciones.chopped6(uefa, 8, 8, 8, 8, 7, 8);
        grupos=t.Mezclar(grilla);
        Grupos.descPartidos(grupos, 40, 1, 2, 5, r2, euro);
        Funciones.pasarEquiposPts(r2, euro, 6);
        t.pElimDirecta(r2.get(0), r2.get(1), Torneo.eng.nombre, 40, true, euro);
        t.Resetear(uefa);
        return euro;
    }
}
