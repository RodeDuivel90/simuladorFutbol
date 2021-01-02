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
public class mundial1994 {
    
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
    
    static void wc1994(){
        mundial1994 m = new mundial1994();
        m.m1994();
    }
    
     public void m1994(){
         Torneo.isr.conf="uefa";
         Torneo.tpe.conf="afc";
         Torneo.rus.nombre="RUSIA         ";
         Torneo.yem.nombre="YEMEN         ";
         Torneo.selecciones.remove(Torneo.nye);
         Torneo.fro.nivel=5;  Torneo.cyp.nivel=4;
         Torneo.sui.nivel=2;  Torneo.isr.nivel=4;
         Torneo.por.nivel=2;  Torneo.alb.nivel=4;
         Torneo.nor.nivel=2;  Torneo.ltu.nivel=4;
         Torneo.bol.nivel=3;  Torneo.per.nivel=4;
         Torneo.atg.nivel=5;  Torneo.crc.nivel=2;
         Torneo.dom.nivel=5;  Torneo.pur.nivel=5;
         Torneo.brb.nivel=5;  Torneo.cub.nivel=4;
         Torneo.ber.nivel=4;  Torneo.can.nivel=2;
         Torneo.gua.nivel=3;  Torneo.hon.nivel=2;
         Torneo.mex.nivel=1;  Torneo.slv.nivel=3;
         Torneo.usa.nivel=2;  Torneo.zim.nivel=3; 
         Torneo.moz.nivel=6;  Torneo.alg.nivel=3;
         Torneo.tog.nivel=5;  Torneo.gui.nivel=3;
         Torneo.mad.nivel=4;  Torneo.nig.nivel=4;
         Torneo.sen.nivel=3;  Torneo.nga.nivel=1;
         Torneo.ken.nivel=4;  Torneo.ban.nivel=6;
         Torneo.ksa.nivel=1;  Torneo.omn.nivel=3;
         Torneo.tha.nivel=4;  Torneo.chn.nivel=2;
         Torneo.jor.nivel=4;  Torneo.mac.nivel=6;
         Torneo.ina.nivel=5;  Torneo.jpn.nivel=1;
         Torneo.ind.nivel=6;  Torneo.mas.nivel=3;
         Torneo.prk.nivel=2;  Torneo.hkg.nivel=5;
         Torneo.yem.nivel=4;  Torneo.irn.nivel=2;
         Torneo.fij.nivel=4;  Torneo.cmr.nivel=2;
         Torneo.sco.nivel=3;
         
         Torneo.selecciones.add(Torneo.est);  Torneo.selecciones.add(Torneo.ltu);
         Torneo.selecciones.add(Torneo.lca);  Torneo.selecciones.add(Torneo.lva);
         Torneo.selecciones.add(Torneo.vin);  Torneo.selecciones.add(Torneo.nca);
         Torneo.selecciones.add(Torneo.rsa);  Torneo.selecciones.add(Torneo.bot);
         Torneo.selecciones.add(Torneo.nam);  Torneo.selecciones.add(Torneo.bdi);
         Torneo.selecciones.add(Torneo.swz);  Torneo.selecciones.add(Torneo.lib);
         Torneo.selecciones.add(Torneo.sri);  Torneo.selecciones.add(Torneo.sol);
         Torneo.selecciones.add(Torneo.tah);  Torneo.selecciones.add(Torneo.van);
         
         t.Resetear(Torneo.selecciones);
         Collections.sort(Torneo.selecciones, Torneo.rankingElo());
         for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
      }
         t.Eliminar(elim, Torneo.usa.nombre); t.Eliminar(elim, Torneo.srb.nombre);
         t.Eliminar(elim, Torneo.grn.nombre); t.Eliminar(elim, Torneo.bfa.nombre);
         t.Eliminar(elim, Torneo.gam.nombre); t.Eliminar(elim, Torneo.les.nombre);
         t.Eliminar(elim, Torneo.lbr.nombre); t.Eliminar(elim, Torneo.lby.nombre);
         t.Eliminar(elim, Torneo.mwi.nombre); t.Eliminar(elim, Torneo.mri.nombre);
         t.Eliminar(elim, Torneo.mtn.nombre); t.Eliminar(elim, Torneo.cta.nombre);
         t.Eliminar(elim, Torneo.rwa.nombre); t.Eliminar(elim, Torneo.sle.nombre);
         t.Eliminar(elim, Torneo.som.nombre); t.Eliminar(elim, Torneo.sud.nombre);
         t.Eliminar(elim, Torneo.tan.nombre); t.Eliminar(elim, Torneo.uga.nombre);
         t.Eliminar(elim, Torneo.nep.nombre); t.Eliminar(elim, Torneo.bru.nombre);
         
         uefa=Torneo.confed("uefa", elim);  
         conm=Torneo.confed("conmebol", elim);
         conc=Torneo.confed("concacaf", elim);
         caf=Torneo.confed("caf", elim);
         afc=Torneo.confed("afc", elim);
         ofc=Torneo.confed("ofc", elim);
         mundial= m1994elim();
         mundial.add(Torneo.usa);
         Torneo.cze.nombre="RCS           ";
         if(elim.contains(Torneo.campeones.get(13))&&!Torneo.campeones.get(13).equals(Torneo.usa)){
             mundial.add(Torneo.campeones.get(13));
         }
         t.Resetear(Torneo.selecciones);
         Funciones.ordenarMundial(mundial, Torneo.usa, Torneo.campeones.get(13));
         grilla=Torneo.chopped(mundial, 6, 4);
         grupos=t.Mezclar(grilla);
         while((t.Validacion(grupos,1,3,1)==false)||
         !grupos.get(0).contains(Torneo.usa)){
                 grupos=t.Mezclar(grilla);     
         }
         Funciones.mundial_24_94(grupos, Torneo.usa.nombre, 60);
         Grupos.clasificacion(Torneo.usa.nombre, Torneo.campeones.get(14));
         t.imprimirElo(Torneo.selecciones);
         for(int i=0;i<Torneo.campeones.size();i++)
         System.out.println(Torneo.campeones.get(i).nombre); 
     }
    
     
     public ArrayList<Equipos> m1994elim(){
         
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
        ArrayList<Equipos> repechajeOfc = new ArrayList<>();
        ArrayList<Equipos> repechajeConm = new ArrayList<>();
        ArrayList<Equipos> repechajeMundial = new ArrayList<>();
        
        if(elim.contains(Torneo.campeones.get(13))&&Torneo.campeones.get(13).conf.equals("uefa")){
            t.Eliminar(uefa, Torneo.campeones.get(13).nombre);
            grilla=Torneo.chopped(uefa, 6, 6);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 2, mundial);
        }else{
            grilla=Funciones.chopped6(uefa, 7, 7, 7, 7, 2, 7);
            gruposUefa=t.Mezclar(grilla);
            Grupos.descPartidos(gruposUefa, 40, 1, 2, 5, repechajeUefa, mundial);
            
            Funciones.pasarEquiposPts(repechajeUefa, mundial, 5);
            t.Serie(repechajeUefa.get(0), repechajeUefa.get(1), 40, mundial);
            
        }
        if(elim.contains(Torneo.campeones.get(13))&&Torneo.campeones.get(13).conf.equals("conmebol")){
            t.Eliminar(conm, Torneo.campeones.get(13).nombre);
            grilla=Funciones.chopped5(conm, 2, 2, 2, 1, 2);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
            t.Serie(gruposConm.get(0).get(1), gruposConm.get(1).get(1), 40, repechajeMundial);
        }else if(elim.contains(Torneo.campeones.get(13))&&(Torneo.campeones.get(13).conf.equals("concacaf"))||
                  Torneo.campeones.get(13).conf.equals("ofc")){
            grilla=Torneo.chopped(conm, 2, 5);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
            t.Serie(gruposConm.get(0).get(1), gruposConm.get(1).get(1), 40, repechajeMundial);
        }else{
            grilla=Torneo.chopped(conm, 2, 5);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
            repechajeConm.add(gruposConm.get(0).get(1));
            repechajeConm.add(gruposConm.get(1).get(1));
            Collections.sort(repechajeConm);
            mundial.add(repechajeConm.get(0));   repechajeMundial.add(repechajeConm.get(1));
        }
        if(elim.contains(Torneo.campeones.get(13))&&Torneo.campeones.get(13).conf.equals("concacaf")){
            t.Eliminar(conc, Torneo.campeones.get(13).nombre);
            Funciones.pasarEquipos(conc, segundaFase, 19);
            t.Serie(conc.get(0), conc.get(1), 40, segundaFase);
            Funciones.pasarEquipos(segundaFase, terceraFase, 8);
            Funciones.Ronda(segundaFase, 40, 6, terceraFase);
            Funciones.pasarEquipos(terceraFase, cuartaFase, 2);
            Funciones.Ronda(terceraFase, 40, 6, cuartaFase);
            t.Resetear(elim);
            Collections.sort(elim, Torneo.rankingElo());
            grilla=Torneo.chopped(cuartaFase, 2, 4);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 2, quintaFase);
            t.Resetear(elim);
            t.grupo4vuelta(quintaFase, 40, 1, mundial);
        }else{
            Funciones.pasarEquipos(conc, segundaFase, 18);
            Funciones.Ronda(conc, 40, 2, segundaFase);
            Funciones.pasarEquipos(segundaFase, terceraFase, 8);
            Funciones.Ronda(segundaFase, 40, 6, terceraFase);
            Funciones.pasarEquipos(terceraFase, cuartaFase, 2);
            Funciones.Ronda(terceraFase, 40, 6, cuartaFase);
            t.Resetear(elim);
            Collections.sort(elim, Torneo.rankingElo());
            grilla=Torneo.chopped(cuartaFase, 2, 4);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 2, quintaFase);
            t.Resetear(elim);
            t.grupo4vuelta(quintaFase, 40, 1, mundial);
            repechajeOfc.add(quintaFase.get(1));
        }segundaFase.clear(); terceraFase.clear(); cuartaFase.clear(); quintaFase.clear();
        if(elim.contains(Torneo.campeones.get(13))&&Torneo.campeones.get(13).conf.equals("caf")){
            t.Eliminar(caf, Torneo.campeones.get(13).nombre);
            grilla=Torneo.chopped(caf, 8,8, 3,8);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, segundaFase);
            t.Resetear(elim); Collections.sort(segundaFase, Torneo.rankingElo());
            Collections.sort(caf, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 2, 4);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, mundial);
        }else{
            grilla=Torneo.chopped(caf, 9, 9,1,9);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, segundaFase);
            t.Resetear(elim); Collections.sort(segundaFase, Torneo.rankingElo());
            Collections.sort(caf, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 3, 3);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, mundial);
        }segundaFase.clear();
        if(elim.contains(Torneo.campeones.get(13))&&Torneo.campeones.get(13).conf.equals("afc")){
            t.Eliminar(afc, Torneo.campeones.get(13).nombre);
            grilla=Funciones.chopped5(afc, 6, 6, 6, 3, 6);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(afc);
            Grupos.grupo6neu(segundaFase, "neutral", 40, 1, mundial);
        }else{
            grilla=Funciones.chopped5(afc, 6, 6, 6, 4, 6);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(afc);
            Grupos.grupo6neu(segundaFase, "neutral", 40, 2, mundial);
        }segundaFase.clear();
        if(elim.contains(Torneo.campeones.get(13))&&Torneo.campeones.get(13).conf.equals("ofc")){
            t.Eliminar(ofc, Torneo.campeones.get(13).nombre);
            grilla=Torneo.chopped(ofc, 2, 1, 2);
            gruposOfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposOfc, 40, 1, segundaFase);
            t.Serie(segundaFase.get(0), segundaFase.get(1), 40, repechajeOfc);
            t.Serie(repechajeOfc.get(0), repechajeOfc.get(1), 40, repechajeMundial);
            
        }else if(elim.contains(Torneo.campeones.get(13))&&Torneo.campeones.get(13).conf.equals("concacaf")){
            grilla=Torneo.chopped(ofc, 2, 3);
            gruposOfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposOfc, 40, 1, segundaFase);
            t.Serie(segundaFase.get(0), segundaFase.get(1), 40, repechajeMundial);
        }else{
            grilla=Torneo.chopped(ofc, 2, 3);
            gruposOfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposOfc, 40, 1, segundaFase);
            t.Serie(segundaFase.get(0), segundaFase.get(1), 40, repechajeOfc); 
            t.Serie(repechajeOfc.get(0), repechajeOfc.get(1), 40, repechajeMundial);
        }segundaFase.clear();
        t.Serie(repechajeMundial.get(0), repechajeMundial.get(1), 40, mundial);
               
         
         return mundial;
     }
}
