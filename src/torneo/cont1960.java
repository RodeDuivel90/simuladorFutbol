/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Miguel
 */
public class cont1960 {
    
    Torneo t = new Torneo();
    ArrayList<Equipos> euro = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> r2 = new ArrayList<>();
    ArrayList<Equipos> r3 = new ArrayList<>();
    ArrayList<Equipos> fin = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<ArrayList<Equipos>> grilla;
    ArrayList<ArrayList<Equipos>> grupos; 
    
    static void copas1960(){
        cont1960 c = new cont1960();
        c.c1960();
    }
    
    public void c1960(){
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        t.Eliminar(uefa, Torneo.ger.nombre); t.Eliminar(uefa, Torneo.isl.nombre);
        t.Eliminar(uefa, Torneo.ita.nombre); t.Eliminar(uefa, Torneo.eng.nombre);
        t.Eliminar(uefa, Torneo.sco.nombre); t.Eliminar(uefa, Torneo.wal.nombre);
        t.Eliminar(uefa, Torneo.nir.nombre); t.Eliminar(uefa, Torneo.ned.nombre);
        t.Eliminar(uefa, Torneo.swe.nombre); t.Eliminar(uefa, Torneo.fin.nombre);
        t.Eliminar(uefa, Torneo.bel.nombre); t.Eliminar(uefa, Torneo.sui.nombre);
        t.Eliminar(uefa, Torneo.lux.nombre);
        Torneo.Arg.nivel=1;
        Torneo.tur.nivel=4;
        Torneo.gre.nivel=4;
        Torneo.nor.nivel=3;
        Torneo.bul.nivel=3;
        euro=c1960elim();
        String local = Funciones.localEuro(euro);
        System.out.println("Sede: "+local);
        t.pElimDirecta(euro.get(0), euro.get(1), local, 50, false, fin);
        t.pElimDirecta(euro.get(2), euro.get(3), local, 50, false, fin);
        t.pElimDirecta(fin.get(0), fin.get(1), local, 50, false, Torneo.euroCampeones);
        System.out.println("COPA AMERICA 1960 ARGENTINA");
        grilla=Torneo.chopped(conm, 2, 4);
        grupos = t.Mezclar(grilla);
        Torneo.grupo4neu(grupos.get(0), Torneo.Arg.nombre, 50, 2, r2);
        Torneo.grupo4neu(grupos.get(1), Torneo.Arg.nombre, 50, 2, r2);
        t.Resetear(r2);
        Torneo.grupo4neu(r2, Torneo.Arg.nombre, 50, 1, Torneo.americaCampeones);
        t.imprimirElo(Torneo.selecciones);
        t.Resetear(Torneo.selecciones);
    }
    
    public ArrayList<Equipos> c1960elim(){
        
        Collections.sort(uefa,Torneo.rankingElo());
        Funciones.pasarEquipos(uefa, r2,15);
        t.Serie(uefa.get(0), uefa.get(1), 40, r2);
        System.out.println("");
        System.out.println("PRIMERA RONDA");
        System.out.println("");
        Funciones.Ronda(r2, 40, 8, r3);
        System.out.println("");
        System.out.println("SEGUNDA RONDA");
        System.out.println("");
        Funciones.Ronda(r3, 40, 4, euro);
        r2.clear();
        return euro;
    }
    
}
