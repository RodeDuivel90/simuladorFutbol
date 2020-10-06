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
 *
 * @author Miguel
 */
public class mundial2006 {
    
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
    
    
    static void wc2006(){
        mundial2006 m = new mundial2006();
        m.m2006();
    }
    
    
    public void m2006(){
        
        Torneo.kaz.conf="uefa";
        
        
        Torneo.est.nivel=5; Torneo.ltu.nivel=4;
        Torneo.kaz.nivel=5; Torneo.sui.nivel=2;
        Torneo.bih.nivel=3; Torneo.aze.nivel=5;
        Torneo.lux.nivel=6; Torneo.nir.nivel=4;
        Torneo.lie.nivel=5; Torneo.bel.nivel=3;
        Torneo.mda.nivel=5; Torneo.wal.nivel=4;
        Torneo.lva.nivel=4; Torneo.ecu.nivel=2;
        Torneo.ven.nivel=3; Torneo.chi.nivel=2;
        Torneo.cay.nivel=5; Torneo.pur.nivel=6;
        Torneo.skn.nivel=4; Torneo.nca.nivel=4;
        Torneo.guy.nivel=6; Torneo.blz.nivel=6;
        Torneo.aru.nivel=6; Torneo.msr.nivel=6;
        Torneo.tca.nivel=5; Torneo.ber.nivel=5;
        Torneo.ben.nivel=4; Torneo.bfa.nivel=3;
        Torneo.eqg.nivel=5; Torneo.mwi.nivel=4;
        Torneo.cha.nivel=4; Torneo.lbr.nivel=4;
        Torneo.moz.nivel=4; Torneo.bot.nivel=4;
        Torneo.lby.nivel=3; Torneo.cta.nivel=6;
        Torneo.gha.nivel=2; Torneo.cgo.nivel=3;
        Torneo.tog.nivel=2; Torneo.ken.nivel=3;
        Torneo.mri.nivel=4; Torneo.egy.nivel=1;
        Torneo.zam.nivel=2; Torneo.cmr.nivel=1;
        Torneo.hkg.nivel=5; Torneo.ind.nivel=6;
        Torneo.ban.nivel=6; Torneo.prk.nivel=3;
        Torneo.mas.nivel=5; Torneo.jor.nivel=2;
        Torneo.tjk.nivel=5; Torneo.sin.nivel=4;
        Torneo.qat.nivel=3; Torneo.uzb.nivel=2;
        Torneo.ksa.nivel=2; Torneo.vie.nivel=5;
        Torneo.uae.nivel=3; Torneo.tha.nivel=5;
        Torneo.sol.nivel=4; Torneo.cok.nivel=6;
        Torneo.van.nivel=5; Torneo.fij.nivel=5;
        Torneo.nzl.nivel=3;
        
        
        Torneo.selecciones.add(Torneo.ncl); Torneo.selecciones.add(Torneo.afg);
        
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        
        t.Eliminar(elim, Torneo.ger.nombre); t.Eliminar(elim, Torneo.dji.nombre);
        t.Eliminar(elim, Torneo.phi.nombre); t.Eliminar(elim, Torneo.bru.nombre);
        t.Eliminar(elim, Torneo.cam.nombre);
         
        uefa=Torneo.confed("uefa", elim);  
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);
        afc=Torneo.confed("afc", elim);
        ofc=Torneo.confed("ofc", elim);
        
        mundial=m2006elim();
        t.Resetear(mundial);
        mundial.add(Torneo.ger);
        Funciones.ordenarMundial(mundial, Torneo.ger, Torneo.campeones.get(16));
        grilla=Torneo.chopped(mundial, 8, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,2,1)==false)||
         !grupos.get(0).contains(Torneo.ger)){
                 grupos=t.Mezclar(grilla);     
         }
        mundial32.Mundial32_06(grupos, Torneo.ger.nombre, 60);
        Grupos.clasificacion(Torneo.ger.nombre, Torneo.campeones.get(17));
        t.imprimirElo(Torneo.selecciones);
         for(int i=0;i<Torneo.campeones.size();i++)
         System.out.println(Torneo.campeones.get(i).nombre);
        
    }
    
    public ArrayList<Equipos> m2006elim(){
        
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
        ArrayList<Equipos> repechajeOfc = new ArrayList<>();
        ArrayList<Equipos> repechajeAfc = new ArrayList<>();
        
        grilla=Torneo.chopped(conm, 1, 10);
        gruposConm=t.Mezclar(grilla);
        Funciones.Qualifier(gruposConm, 40, 4, mundial);
        repechajeOfc.add(gruposConm.get(0).get(4));
        
        grilla=Funciones.chopped7(uefa, 8, 8, 8, 8, 8, 3, 8);
        gruposUefa=t.Mezclar(grilla);
        Grupos.descPartidos(gruposUefa, 40, 1, 2, 6, repechajeUefa, mundial);
        Funciones.pasarEquiposPts(repechajeUefa, mundial, 2);
        Funciones.Ronda(repechajeUefa, 40, 3, mundial);
        
        Funciones.pasarEquipos(conc, segundaFase, 13);
        Funciones.Ronda(conc, 40, 11, segundaFase);
        Funciones.Ronda(segundaFase, 40, 12, terceraFase);
        t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
        grilla=Torneo.chopped(terceraFase, 3, 4);
        gruposConc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposConc, 40, 2, cuartaFase);
        t.Resetear(cuartaFase);
        Grupos.grupo6vuelta(cuartaFase, 40, 3, mundial);
        repechajeAfc.add(cuartaFase.get(3));
        segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
        
        Funciones.pasarEquipos(caf, segundaFase, 9);
        Funciones.Ronda(caf, 40, 21, segundaFase);
        t.Resetear(segundaFase); Collections.sort(segundaFase, Torneo.rankingElo());
        grilla=Torneo.chopped(segundaFase, 5, 6);
        gruposCaf=t.Mezclar(grilla);
        Funciones.Qualifier(gruposCaf, 40, 1, mundial);
        segundaFase.clear();
        
        Funciones.pasarEquipos(afc, segundaFase, 25);
        Funciones.Ronda(afc, 40, 7, segundaFase);
        t.Resetear(segundaFase); Collections.sort(segundaFase, Torneo.rankingElo());
        grilla=Torneo.chopped(segundaFase, 8, 4);
        gruposAfc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposAfc, 40, 1, terceraFase);
        t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
        grilla=Torneo.chopped(terceraFase, 2, 4);
        gruposAfc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposAfc, 40, 2, mundial);
        t.Serie(gruposAfc.get(0).get(2), gruposAfc.get(1).get(2), 40, repechajeAfc);
        segundaFase.clear();  terceraFase.clear();
        
        Funciones.pasarEquipos(ofc, segundaFase, 2);
        grilla=Torneo.chopped(ofc, 2, 5);
        gruposOfc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposOfc, 40, 2, segundaFase);
        t.Resetear(segundaFase);  Collections.sort(segundaFase,Torneo.rankingElo());
        Grupos.grupo6neu(segundaFase, Torneo.aus.nombre, 40, 2, terceraFase);
        t.Serie(terceraFase.get(0), terceraFase.get(1), 40, repechajeOfc);
        
        t.Serie(repechajeOfc.get(0), repechajeOfc.get(1), 40, mundial);
        t.Serie(repechajeAfc.get(0), repechajeAfc.get(1), 40, mundial);
        
        
        
        
        
        
        
        
        
        
        return mundial;
    }
    
}
