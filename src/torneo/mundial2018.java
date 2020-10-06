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
public class mundial2018 {
    
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
    
    
    static void wc2018(){
        mundial2018 m = new mundial2018();
        m.m2018();
    }
    
    public void m2018(){
        
        
        Torneo.ecu.nivel=3; Torneo.per.nivel=2;
        Torneo.isr.nivel=4; Torneo.mda.nivel=5;
        Torneo.nor.nivel=4; Torneo.rus.nivel=3;
        Torneo.nir.nivel=3; Torneo.aut.nivel=3;
        Torneo.gre.nivel=3; Torneo.lva.nivel=5;
        Torneo.arm.nivel=4; Torneo.wal.nivel=2;
        Torneo.pol.nivel=2; Torneo.ned.nivel=2;
        Torneo.bih.nivel=3; Torneo.rou.nivel=3;
        Torneo.aru.nivel=5; Torneo.ant.nivel=4;
        Torneo.lca.nivel=5; Torneo.dom.nivel=4;
        Torneo.sur.nivel=4; Torneo.nca.nivel=4;
        Torneo.guy.nivel=5; Torneo.vin.nivel=5;
        Torneo.usa.nivel=2; Torneo.swz.nivel=5;
        Torneo.rwa.nivel=5; Torneo.mtn.nivel=4;
        Torneo.mad.nivel=4; Torneo.eqg.nivel=4;
        Torneo.nam.nivel=4; Torneo.sud.nivel=5;
        Torneo.mli.nivel=3; Torneo.ang.nivel=4;
        Torneo.ben.nivel=3; Torneo.mar.nivel=1;
        Torneo.civ.nivel=2; Torneo.eth.nivel=5;
        Torneo.cod.nivel=2; Torneo.sen.nivel=1;
        Torneo.bfa.nivel=2; Torneo.gum.nivel=5;
        Torneo.phi.nivel=4; Torneo.jor.nivel=3;
        Torneo.hkg.nivel=5; Torneo.lib.nivel=3;
        Torneo.bhr.nivel=4; Torneo.vie.nivel=4;
        Torneo.qat.nivel=3; Torneo.mya.nivel=5;
        Torneo.afg.nivel=5; Torneo.uzb.nivel=2;
        Torneo.tha.nivel=3; Torneo.irn.nivel=1;
        Torneo.ple.nivel=4; Torneo.syr.nivel=2;
        Torneo.chn.nivel=2; Torneo.tjk.nivel=4;
        Torneo.ina.nivel=4; Torneo.tkm.nivel=4;
        Torneo.png.nivel=4; Torneo.fij.nivel=5;
        Torneo.van.nivel=5; Torneo.alb.nivel=4;
        Torneo.est.nivel=4;
        
        
        Torneo.selecciones.add(Torneo.kos);
        Torneo.selecciones.add(Torneo.ssd);
        
        
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        
        t.Eliminar(elim, Torneo.rus.nombre); t.Eliminar(elim, Torneo.zim.nombre);
        
        uefa=Torneo.confed("uefa", elim);  
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);
        afc=Torneo.confed("afc", elim);
        ofc=Torneo.confed("ofc", elim);
        
        mundial=m2018elim();
        mundial.add(Torneo.rus);
        
        t.Resetear(mundial);
        Funciones.ordenarMundial(mundial, Torneo.rus, Torneo.campeones.get(19));
        grilla=Torneo.chopped(mundial, 8, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,2,1)==false)||
         !grupos.get(0).contains(Torneo.rus)){
                 grupos=t.Mezclar(grilla);     
         }
        mundial32.Mundial32_06(grupos, Torneo.rus.nombre, 60);
        Grupos.clasificacion(Torneo.rus.nombre, Torneo.campeones.get(20));
        t.imprimirElo(Torneo.selecciones);
        for(int i=0;i<Torneo.campeones.size();i++)
         System.out.println(Torneo.anyos[i]+" "+Torneo.campeones.get(i).nombre);
        
        
    }
    
    public ArrayList<Equipos> m2018elim(){
        
        ArrayList<ArrayList<Equipos>> gruposUefa;
        ArrayList<ArrayList<Equipos>> gruposConm;
        ArrayList<ArrayList<Equipos>> gruposConc;
        ArrayList<ArrayList<Equipos>> gruposCaf;
        ArrayList<ArrayList<Equipos>> gruposAfc;
        ArrayList<ArrayList<Equipos>> gruposOfc;
        ArrayList<Equipos> segundaFase = new ArrayList<>();
        ArrayList<Equipos> terceraFase = new ArrayList<>();
        ArrayList<Equipos> cuartaFase = new ArrayList<>();
        ArrayList<Equipos> quintaFase = new ArrayList<>();
        ArrayList<Equipos> repechajeUefa = new ArrayList<>();
        ArrayList<Equipos> segundosAfc = new ArrayList<>();
        ArrayList<Equipos> repechajeInterC = new ArrayList<>();
        
        grilla=Torneo.chopped(conm, 1, 10);
        gruposConm=t.Mezclar(grilla);
        Funciones.Qualifier(gruposConm, 40, 4, mundial);
        repechajeInterC.add(gruposConm.get(0).get(4));
        
        grilla=Torneo.chopped(uefa, 9, 6);
        gruposUefa=t.Mezclar(grilla);
        Grupos.descPartidos(gruposUefa, 40, 1, 2, 6, repechajeUefa, mundial);
        Collections.sort(repechajeUefa);
        t.Eliminar(repechajeUefa, repechajeUefa.get(8).nombre);
        Funciones.Ronda(repechajeUefa, 40, 4, mundial);
        
        Funciones.pasarEquipos(conc, cuartaFase, 6);
        Funciones.pasarEquipos(conc, terceraFase, 2);
        Funciones.pasarEquipos(conc, segundaFase, 13);
        Funciones.Ronda(conc, 40, 7, segundaFase);
        Funciones.Ronda(segundaFase, 40, 10, terceraFase);
        Funciones.Ronda(terceraFase, 40, 6, cuartaFase);
        t.Resetear(cuartaFase); Collections.sort(cuartaFase, Torneo.rankingElo());
        grilla=Torneo.chopped(cuartaFase, 3, 4);
        gruposConc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposConc, 40, 2, quintaFase);
        t.Resetear(quintaFase);
        Grupos.grupo6vuelta(quintaFase, 40, 3, mundial);
        repechajeInterC.add(quintaFase.get(3));
        segundaFase.clear(); terceraFase.clear(); cuartaFase.clear(); quintaFase.clear();
        
        Funciones.pasarEquipos(caf, segundaFase, 27);
        Funciones.Ronda(caf, 40, 13, segundaFase);
        Funciones.Ronda(segundaFase, 40, 20, terceraFase);
        t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
        grilla=Torneo.chopped(terceraFase, 5, 4);
        gruposCaf=t.Mezclar(grilla);
        Funciones.Qualifier(gruposCaf, 40, 1, mundial);
        segundaFase.clear(); terceraFase.clear();
        
        Funciones.pasarEquipos(afc, segundaFase, 34);
        Funciones.Ronda(afc, 40, 6, segundaFase);
        t.Resetear(segundaFase); Collections.sort(segundaFase, Torneo.rankingElo());
        grilla=Torneo.chopped(segundaFase, 8, 5);
        gruposAfc=t.Mezclar(grilla);
        Grupos.descPartidos(gruposAfc, 40, 1, 2, 6, segundosAfc, terceraFase);
        Funciones.pasarEquiposPts(segundosAfc, terceraFase, 4);
        t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
        grilla=Torneo.chopped(terceraFase, 2, 6);
        gruposAfc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposAfc, 40, 2, mundial);
        t.Serie(gruposAfc.get(0).get(2), gruposAfc.get(1).get(2), 40, repechajeInterC);
        segundaFase.clear();  terceraFase.clear();
        

        Funciones.pasarEquipos(ofc, segundaFase, 7);
        Torneo.grupo4neu(ofc, Torneo.tga.nombre, 40, 1, segundaFase);
        t.Resetear(segundaFase); Collections.sort(segundaFase, Torneo.rankingElo());
        grilla=Torneo.chopped(segundaFase, 2, 4);
        gruposOfc=t.Mezclar(grilla);
        Torneo.grupo4neu(gruposOfc.get(0), Torneo.png.nombre, 40, 3, terceraFase);
        Torneo.grupo4neu(gruposOfc.get(1), Torneo.png.nombre, 40, 3, terceraFase);
        t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
        grilla=Torneo.chopped(terceraFase, 2, 3);
        gruposOfc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposOfc, 40, 1, cuartaFase);
        t.Serie(cuartaFase.get(0), cuartaFase.get(1), 40, repechajeInterC);
        segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
        
        Random rndm= new Random();
        Collections.shuffle(repechajeInterC, rndm);
        t.Serie(repechajeInterC.get(0), repechajeInterC.get(1), 40, mundial);
        t.Serie(repechajeInterC.get(2), repechajeInterC.get(3), 40, mundial);
        
        
        return mundial;
    }
    
    
}
