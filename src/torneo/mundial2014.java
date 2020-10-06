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
public class mundial2014 {
    
    Torneo t = new Torneo();
    ArrayList<Equipos> mundial = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<Equipos> conc = new ArrayList<>();
    ArrayList<Equipos> caf = new ArrayList<>();
    ArrayList<Equipos> afc = new ArrayList<>();
    ArrayList<Equipos> ofc = new ArrayList<>();
    ArrayList<ArrayList<Equipos>> grupos;   
    ArrayList<ArrayList<Equipos>> grilla;
    
    static void wc2014(){
        mundial2014 m = new mundial2014();
        m.m2014();
    }
    
    public void m2014(){
        
        Torneo.ant.nombre="CURAZAO       ";
        
        Torneo.par.nivel=3; Torneo.tur.nivel=3;  
        Torneo.arm.nivel=3; Torneo.rou.nivel=2;
        Torneo.lie.nivel=5; Torneo.mne.nivel=3;
        Torneo.fin.nivel=4; Torneo.mda.nivel=4;
        Torneo.nir.nivel=4; Torneo.aut.nivel=2;
        Torneo.isl.nivel=3; Torneo.aze.nivel=4;
        Torneo.bel.nivel=1; Torneo.dma.nivel=5;
        Torneo.brb.nivel=5; Torneo.skn.nivel=4;
        Torneo.atg.nivel=4; Torneo.vin.nivel=4;
        Torneo.mad.nivel=5; Torneo.bot.nivel=5;
        Torneo.moz.nivel=4; Torneo.swz.nivel=6;
        Torneo.lbr.nivel=4; Torneo.eri.nivel=6;
        Torneo.bdi.nivel=4; Torneo.cpv.nivel=3;
        Torneo.nam.nivel=5; Torneo.sle.nivel=4;
        Torneo.gha.nivel=2; Torneo.ben.nivel=4;
        Torneo.phi.nivel=5; Torneo.qat.nivel=2;
        Torneo.kgz.nivel=5; Torneo.chn.nivel=3;
        Torneo.hkg.nivel=6; Torneo.yem.nivel=4;
        Torneo.jor.nivel=2; Torneo.sam.nivel=6;
        Torneo.van.nivel=6; Torneo.ncl.nivel=4;
        
        
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        
        t.Eliminar(elim, Torneo.bra.nombre); t.Eliminar(elim, Torneo.mtn.nombre);
        t.Eliminar(elim, Torneo.bru.nombre); t.Eliminar(elim, Torneo.bhu.nombre);
        t.Eliminar(elim, Torneo.gum.nombre);
         
        uefa=Torneo.confed("uefa", elim);  
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);
        afc=Torneo.confed("afc", elim);
        ofc=Torneo.confed("ofc", elim);
        
        mundial=m2014elim();
        mundial.add(Torneo.bra);
        t.Resetear(mundial);
        Funciones.ordenarMundial(mundial, Torneo.bra, Torneo.campeones.get(18));
        grilla=Torneo.chopped(mundial, 8, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,2,1)==false)||
         !grupos.get(0).contains(Torneo.bra)){
                 grupos=t.Mezclar(grilla);     
         }
        mundial32.Mundial32_06(grupos, Torneo.bra.nombre, 60);
        Grupos.clasificacionRepe(Torneo.bra.nombre, Torneo.campeones.get(19),21,63);
        t.imprimirElo(Torneo.selecciones);
         for(int i=0;i<Torneo.campeones.size();i++)
         System.out.println(Torneo.campeones.get(i).nombre);
        
        
    }
    
    
    public ArrayList<Equipos> m2014elim(){
        
        ArrayList<ArrayList<Equipos>> gruposUefa;
        ArrayList<ArrayList<Equipos>> gruposConm;
        ArrayList<ArrayList<Equipos>> gruposConc;
        ArrayList<ArrayList<Equipos>> gruposCaf;
        ArrayList<ArrayList<Equipos>> gruposAfc;
        ArrayList<ArrayList<Equipos>> gruposOfc;
        ArrayList<Equipos> segundaFase = new ArrayList<>();
        ArrayList<Equipos> terceraFase = new ArrayList<>();
        ArrayList<Equipos> cuartaFase = new ArrayList<>();
        ArrayList<Equipos> repechajeUefa = new ArrayList<>();
        ArrayList<Equipos> repechajeInterC = new ArrayList<>();
        
        grilla=Torneo.chopped(conm, 1, 9);
        gruposConm=t.Mezclar(grilla);
        Funciones.Qualifier(gruposConm, 40, 4, mundial);
        repechajeInterC.add(gruposConm.get(0).get(4));
        
        grilla=Funciones.chopped6(uefa, 9, 9, 9, 9, 8, 9);
        gruposUefa=t.Mezclar(grilla);
        Grupos.descPartidos(gruposUefa, 40, 1, 2, 5, repechajeUefa, mundial);
        Collections.sort(repechajeUefa);
        t.Eliminar(repechajeUefa, repechajeUefa.get(8).nombre);
        Funciones.Ronda(repechajeUefa, 40, 4, mundial);        
        
        Funciones.pasarEquipos(conc, terceraFase, 6);
        Funciones.pasarEquipos(conc, segundaFase, 19);
        Funciones.Ronda(conc, 40, 5, segundaFase);
        t.Resetear(segundaFase); Collections.sort(segundaFase, Torneo.rankingElo());
        grilla=Torneo.chopped(segundaFase, 6, 4);
        gruposConc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposConc, 40, 1, terceraFase);
        t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
        grilla=Torneo.chopped(terceraFase, 3, 4);
        gruposConc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposConc, 40, 2, cuartaFase);
        t.Resetear(cuartaFase);
        Grupos.grupo6vuelta(cuartaFase, 40, 3, mundial);
        repechajeInterC.add(cuartaFase.get(3));
        segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
        
        Funciones.pasarEquipos(caf, segundaFase, 28);
        Funciones.Ronda(caf, 40, 12, segundaFase);
        t.Resetear(segundaFase); Collections.sort(segundaFase, Torneo.rankingElo());
        grilla=Torneo.chopped(segundaFase, 10, 4);
        gruposCaf=t.Mezclar(grilla);
        Funciones.Qualifier(gruposCaf, 40, 1, terceraFase);
        Funciones.Ronda(terceraFase, 40, 5, mundial);
        segundaFase.clear(); terceraFase.clear();
        
        Funciones.pasarEquipos(afc, terceraFase, 5);
        Funciones.pasarEquipos(afc, segundaFase, 22);
        Funciones.Ronda(afc, 40, 8, segundaFase);
        Funciones.Ronda(segundaFase, 40, 15, terceraFase);
        t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
        grilla=Torneo.chopped(terceraFase, 5, 4);
        gruposAfc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposAfc, 40, 2, cuartaFase);
        t.Resetear(cuartaFase); Collections.sort(cuartaFase, Torneo.rankingElo());
        grilla=Torneo.chopped(cuartaFase, 2, 5);
        gruposAfc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposAfc, 40, 2, mundial);
        t.Serie(gruposAfc.get(0).get(2), gruposAfc.get(1).get(2), 40, repechajeInterC);
        segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
        
        Funciones.pasarEquipos(ofc, segundaFase, 7);
        Torneo.grupo4neu(ofc, Torneo.sam.nombre, 40, 1, segundaFase);
        t.Resetear(segundaFase); Collections.sort(segundaFase,Torneo.rankingElo());
        grilla=Torneo.chopped(segundaFase, 2, 4);
        gruposOfc=t.Mezclar(grilla);
        Torneo.grupo4neu(gruposOfc.get(0), Torneo.sol.nombre, 40, 2, terceraFase);
        Torneo.grupo4neu(gruposOfc.get(1), Torneo.sol.nombre, 40, 2, terceraFase);
        t.Resetear(terceraFase); 
        t.grupo4vuelta(terceraFase, 40, 1, repechajeInterC);
        segundaFase.clear(); terceraFase.clear();
        
        Random rndm= new Random();
        Collections.shuffle(repechajeInterC, rndm);
        t.Serie(repechajeInterC.get(0), repechajeInterC.get(1), 40, mundial);
        t.Serie(repechajeInterC.get(2), repechajeInterC.get(3), 40, mundial);
        
        
        return mundial;
    }
    
}
