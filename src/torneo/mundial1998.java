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
public class mundial1998 {
    
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
    
    
    static void wc1998(){
        mundial1998 m = new mundial1998();
        m.m1998();
    }
    
    public void m1998(){
        
        Torneo.cod.nombre="RD CONGO      ";
        Torneo.fin.nivel=3; Torneo.ukr.nivel=2;
        Torneo.est.nivel=4; Torneo.lux.nivel=5;
        Torneo.sui.nivel=3; Torneo.isr.nivel=3;
        Torneo.sco.nivel=2; Torneo.mlt.nivel=5;
        Torneo.aut.nivel=2; Torneo.brb.nivel=4;
        Torneo.guy.nivel=6; Torneo.nca.nivel=5;
        Torneo.ant.nivel=5; Torneo.tri.nivel=3;
        Torneo.jam.nivel=3; Torneo.pur.nivel=6;
        Torneo.sur.nivel=4; Torneo.vin.nivel=4;
        Torneo.pan.nivel=3; Torneo.lca.nivel=6;
        Torneo.can.nivel=3; Torneo.gam.nivel=4;
        Torneo.mwi.nivel=4; Torneo.cgo.nivel=3;
        Torneo.tan.nivel=4; Torneo.mri.nivel=5;
        Torneo.sle.nivel=3; Torneo.mtn.nivel=5;
        Torneo.tog.nivel=4; Torneo.moz.nivel=4;
        Torneo.nam.nivel=4; Torneo.ken.nivel=3;
        Torneo.swz.nivel=5; Torneo.mad.nivel=3;
        Torneo.mar.nivel=1; Torneo.gab.nivel=3;
        Torneo.lbr.nivel=4; Torneo.rsa.nivel=2;
        Torneo.sri.nivel=5; Torneo.ina.nivel=4;
        Torneo.jor.nivel=3; Torneo.vie.nivel=6;
        Torneo.bhr.nivel=4; Torneo.uae.nivel=3;
        Torneo.qat.nivel=3; Torneo.tha.nivel=3;
        Torneo.tpe.nivel=5; Torneo.irq.nivel=3;
        Torneo.ban.nivel=5; Torneo.van.nivel=5;
        Torneo.tah.nivel=6; Torneo.fij.nivel=5;
        Torneo.bol.nivel=4; Torneo.per.nivel=3;
        Torneo.ecu.nivel=3; Torneo.esp.nivel=1;
        Torneo.fra.nivel=1;
        
        Torneo.selecciones.add(Torneo.cay); Torneo.selecciones.add(Torneo.aru);
        Torneo.selecciones.add(Torneo.skn); Torneo.selecciones.add(Torneo.bih);
        Torneo.selecciones.add(Torneo.bah); Torneo.selecciones.add(Torneo.kgz);
        Torneo.selecciones.add(Torneo.dma); Torneo.selecciones.add(Torneo.tjk);
        Torneo.selecciones.add(Torneo.blz); Torneo.selecciones.add(Torneo.phi);
        Torneo.selecciones.add(Torneo.gbi); Torneo.selecciones.add(Torneo.tkm);
        Torneo.selecciones.add(Torneo.uzb); Torneo.selecciones.add(Torneo.kaz);
        Torneo.selecciones.add(Torneo.mdv); Torneo.selecciones.add(Torneo.cam);
        Torneo.selecciones.add(Torneo.cok); Torneo.selecciones.add(Torneo.sam);
        Torneo.selecciones.add(Torneo.png); Torneo.selecciones.add(Torneo.tga);
        
        
        t.Resetear(Torneo.selecciones);
         Collections.sort(Torneo.selecciones, Torneo.rankingElo());
         for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
      }
         t.Eliminar(elim, Torneo.fra.nombre); t.Eliminar(elim, Torneo.lby.nombre);
         t.Eliminar(elim, Torneo.som.nombre); t.Eliminar(elim, Torneo.ben.nombre);
         t.Eliminar(elim, Torneo.bot.nombre); t.Eliminar(elim, Torneo.eth.nombre);
         t.Eliminar(elim, Torneo.les.nombre); t.Eliminar(elim, Torneo.nig.nombre);
         t.Eliminar(elim, Torneo.cta.nombre); t.Eliminar(elim, Torneo.prk.nombre);
         t.Eliminar(elim, Torneo.bru.nombre);
         
        uefa=Torneo.confed("uefa", elim);  
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);
        afc=Torneo.confed("afc", elim);
        ofc=Torneo.confed("ofc", elim);
        mundial= m1998elim();
        mundial.add(Torneo.fra);
        t.Resetear(Torneo.selecciones);
         if(elim.contains(Torneo.campeones.get(14))&&!Torneo.campeones.get(14).equals(Torneo.fra)){
             mundial.add(Torneo.campeones.get(14));
         }
        Funciones.ordenarMundial(mundial, Torneo.fra, Torneo.campeones.get(14));
        grilla=Torneo.chopped(mundial, 8, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,2,1)==false)||
         !grupos.get(0).contains(Torneo.fra)){
                 grupos=t.Mezclar(grilla);     
         }
        mundial32.Mundial32_98(grupos, Torneo.fra.nombre, 60);
        Grupos.clasificacionRepe(Torneo.fra.nombre, Torneo.campeones.get(15),15,63);
        t.imprimirElo(Torneo.selecciones);
         for(int i=0;i<Torneo.campeones.size();i++)
         System.out.println(Torneo.campeones.get(i).nombre);
         
        
        
    }
    
    
    public ArrayList<Equipos> m1998elim(){
        
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
        ArrayList<Equipos> repechajeConc = new ArrayList<>();
        
        if(elim.contains(Torneo.campeones.get(14))&&Torneo.campeones.get(14).conf.equals("conmebol")){
            t.Eliminar(conm, Torneo.campeones.get(14).nombre);
            grilla=Torneo.chopped(conm, 1, 9);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 4, mundial);
        }else if(elim.contains(Torneo.campeones.get(14))&&Torneo.campeones.get(14).conf.equals("uefa")){
            grilla=Torneo.chopped(conm, 1, 10);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 4, mundial);
            repechajeOfc.add(gruposConm.get(0).get(4));
        }else if(!elim.contains(Torneo.campeones.get(14))){
            grilla=Torneo.chopped(conm, 1, 10);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 4, mundial);
            repechajeConc.add(gruposConm.get(0).get(4));
        }else{
            grilla=Torneo.chopped(conm, 1, 10);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 4, mundial);
        }
        if(elim.contains(Torneo.campeones.get(14))&&Torneo.campeones.get(14).conf.equals("uefa")){
            t.Eliminar(uefa, Torneo.campeones.get(14).nombre);
            grilla=Funciones.chopped6(uefa, 9, 9, 9, 9, 3, 9);
            gruposUefa=t.Mezclar(grilla);
            Grupos.descPartidos(gruposUefa, 40, 1, 2, 5, repechajeUefa, mundial);
            Collections.sort(repechajeUefa);
            t.Eliminar(repechajeUefa, repechajeUefa.get(8).nombre);
            Funciones.Ronda(repechajeUefa, 40, 4, mundial);
        }else{
            grilla=Funciones.chopped6(uefa, 9, 9, 9, 9, 4, 9);
            gruposUefa=t.Mezclar(grilla);
            Grupos.descPartidos(gruposUefa, 40, 1, 2, 5, repechajeUefa, mundial);
            Funciones.pasarEquiposPts(repechajeUefa, mundial, 1);
            Funciones.Ronda(repechajeUefa, 40, 4, mundial);
        }
        if(elim.contains(Torneo.campeones.get(14))&&Torneo.campeones.get(14).conf.equals("concacaf")){
            t.Eliminar(conc, Torneo.campeones.get(14).nombre);
            Funciones.pasarEquipos(conc, segundaFase, 7);
            Funciones.pasarEquipos(segundaFase, terceraFase, 6);
            Funciones.Ronda(conc, 40, 11, segundaFase);
            Funciones.Ronda(segundaFase, 40, 6, terceraFase);
            t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
            grilla=Torneo.chopped(terceraFase, 3, 4);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 2, cuartaFase);
            t.Resetear(cuartaFase);
            Grupos.grupo6vuelta(cuartaFase, 40, 3, mundial);
        }else if(!elim.contains(Torneo.campeones.get(14))){
            Funciones.pasarEquipos(conc, terceraFase, 6);
            Funciones.Ronda(conc, 40, 12, segundaFase);
            Funciones.Ronda(segundaFase, 40, 6, terceraFase);
            t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
            grilla=Torneo.chopped(terceraFase, 3, 4);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 2, cuartaFase);
            t.Resetear(cuartaFase);
            Grupos.grupo6vuelta(cuartaFase, 40, 3, mundial);
            repechajeConc.add(cuartaFase.get(3));
            t.Serie(repechajeConc.get(0), repechajeConc.get(1), 40, mundial);
        }else{
            Funciones.pasarEquipos(conc, terceraFase, 6);
            Funciones.Ronda(conc, 40, 12, segundaFase);
            Funciones.Ronda(segundaFase, 40, 6, terceraFase);
            t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
            grilla=Torneo.chopped(terceraFase, 3, 4);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 2, cuartaFase);
            t.Resetear(cuartaFase);
            Grupos.grupo6vuelta(cuartaFase, 40, 3, mundial);
        }segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
        if(elim.contains(Torneo.campeones.get(14))&&Torneo.campeones.get(14).conf.equals("caf")){
            t.Eliminar(caf, Torneo.campeones.get(14).nombre);
            Funciones.pasarEquipos(caf, segundaFase, 5);
            Funciones.Ronda(caf, 40, 15, segundaFase);
            t.Resetear(segundaFase);  Collections.sort(segundaFase, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 5, 4);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, mundial);
        }else{
            Funciones.pasarEquipos(caf, segundaFase, 4);
            Funciones.Ronda(caf, 40, 16, segundaFase);
            t.Resetear(segundaFase);  Collections.sort(segundaFase, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 5, 4);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, mundial);
        }segundaFase.clear();
        if(elim.contains(Torneo.campeones.get(14))&&Torneo.campeones.get(14).conf.equals("afc")){
            t.Eliminar(afc, Torneo.campeones.get(14).nombre);
            grilla=Torneo.chopped(afc, 10, 10, 5, 10);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(segundaFase);  Collections.sort(segundaFase,Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 2, 5);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, mundial);
            t.Serie(gruposAfc.get(0).get(1), gruposAfc.get(1).get(1), 40, mundial);
            if(mundial.contains(gruposAfc.get(0).get(1))){
                repechajeOfc.add(gruposAfc.get(1).get(1));
            }else{
                repechajeOfc.add(gruposAfc.get(0).get(1));
            }
        }else if(elim.contains(Torneo.campeones.get(14))&&Torneo.campeones.get(14).conf.equals("uefa")){
            grilla=Torneo.chopped(afc, 10, 10, 6, 10);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(segundaFase);  Collections.sort(segundaFase,Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 2, 5);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 2, mundial);          
        }else{
            grilla=Torneo.chopped(afc, 10, 10, 6, 10);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(segundaFase);  Collections.sort(segundaFase,Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 2, 5);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, mundial);
             t.Serie(gruposAfc.get(0).get(1), gruposAfc.get(1).get(1), 40, mundial);
            if(mundial.contains(gruposAfc.get(0).get(1))){
                repechajeOfc.add(gruposAfc.get(1).get(1));
            }else{
                repechajeOfc.add(gruposAfc.get(0).get(1));
            }
        }segundaFase.clear();
        if(elim.contains(Torneo.campeones.get(14))&&Torneo.campeones.get(14).conf.equals("ofc")){
            t.Eliminar(ofc, Torneo.campeones.get(14).nombre);
            Funciones.pasarEquipos(ofc, segundaFase, 3);
            grilla=Torneo.chopped(ofc, 2, 3);
            gruposOfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposOfc, 40, 1, segundaFase);
            t.Serie(gruposOfc.get(0).get(1), gruposOfc.get(1).get(1), 40, segundaFase);
            t.Resetear(segundaFase);  Collections.sort(segundaFase, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 2, 3);
            gruposOfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposOfc, 40, 1, terceraFase);
            t.Serie(terceraFase.get(0), terceraFase.get(1), 40, repechajeOfc);
        }else{
            Funciones.pasarEquipos(ofc, segundaFase, 4);
            grilla=Torneo.chopped(ofc, 2, 3);
            gruposOfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposOfc, 40, 1, segundaFase);
            t.Resetear(segundaFase);  Collections.sort(segundaFase, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 2, 3);
            gruposOfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposOfc, 40, 1, terceraFase);
            t.Serie(terceraFase.get(0), terceraFase.get(1), 40, repechajeOfc);
        }
        t.Serie(repechajeOfc.get(0), repechajeOfc.get(1), 40, mundial);
        
        
        
        
        return mundial;
    }
    
}
