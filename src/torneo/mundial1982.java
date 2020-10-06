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
public class mundial1982 {
    
    Torneo t = new Torneo();
    ArrayList<Equipos> mundial = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<Equipos> conc = new ArrayList<>();
    ArrayList<Equipos> caf = new ArrayList<>();
    ArrayList<Equipos> afc = new ArrayList<>();
    ArrayList<ArrayList<Equipos>> grupos;   
    ArrayList<ArrayList<Equipos>> grilla;
    
    
    static void wc1982(){
        mundial1982 m = new mundial1982();
        m.m1982();
        
    }
    
    public void m1982(){
        Torneo.zim.nombre="ZIMBABWE      ";  Torneo.zim.conf="caf";
        Torneo.isr.conf="uefa";   
        Torneo.isr.nivel=4;      Torneo.gui.nivel=4;
        Torneo.isl.nivel=4;      Torneo.les.nivel=5;
        Torneo.rou.nivel=2;      Torneo.sle.nivel=6;
        Torneo.gre.nivel=3;      Torneo.alg.nivel=2;
        Torneo.nir.nivel=2;      Torneo.nig.nivel=5;
        Torneo.eng.nivel=1;      Torneo.egy.nivel=2;
        Torneo.fra.nivel=1;      Torneo.cmr.nivel=2;
        Torneo.ned.nivel=2;      Torneo.cod.nivel=4;
        Torneo.col.nivel=3;      Torneo.sud.nivel=6;
        Torneo.tog.nivel=5;      Torneo.par.nivel=2;
        Torneo.can.nivel=3;      Torneo.zim.nivel=5;
        Torneo.hon.nivel=2;      Torneo.tpe.nivel=4;
        Torneo.slv.nivel=2;      Torneo.ina.nivel=4;
        Torneo.cub.nivel=4;      Torneo.qat.nivel=3;
        Torneo.hai.nivel=4;      Torneo.bhr.nivel=4;
        Torneo.tun.nivel=3;      Torneo.syr.nivel=5;
        Torneo.ken.nivel=5;      Torneo.ksa.nivel=2;
        Torneo.nzl.nivel=1;      Torneo.kuw.nivel=1;        
        Torneo.tha.nivel=6;      Torneo.sin.nivel=4;
        Torneo.hkg.nivel=3;      Torneo.bol.nivel=4;
        
        Torneo.selecciones.add(Torneo.grn);
        Torneo.selecciones.add(Torneo.som);
        Torneo.selecciones.add(Torneo.gam);
        Torneo.selecciones.add(Torneo.moz);
        Torneo.selecciones.add(Torneo.lbr);
        Torneo.selecciones.add(Torneo.fij);
        Torneo.selecciones.add(Torneo.mac);
        Torneo.selecciones.add(Torneo.chn);
        
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
      }
        t.Eliminar(elim, Torneo.esp.nombre);  t.Eliminar(elim, Torneo.atg.nombre);
        t.Eliminar(elim, Torneo.brb.nombre);  t.Eliminar(elim, Torneo.jam.nombre);
        t.Eliminar(elim, Torneo.ber.nombre);  t.Eliminar(elim, Torneo.ben.nombre);
        t.Eliminar(elim, Torneo.pur.nombre);  t.Eliminar(elim, Torneo.gab.nombre);
        t.Eliminar(elim, Torneo.dom.nombre);  t.Eliminar(elim, Torneo.mri.nombre);
        t.Eliminar(elim, Torneo.civ.nombre);  t.Eliminar(elim, Torneo.cta.nombre);
        t.Eliminar(elim, Torneo.mtn.nombre);  t.Eliminar(elim, Torneo.bfa.nombre);
        t.Eliminar(elim, Torneo.cgo.nombre);  t.Eliminar(elim, Torneo.irn.nombre);
        t.Eliminar(elim, Torneo.vie.nombre);
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);
        afc=Torneo.confed("afc", elim);
        mundial=m1982elim();
        mundial.add(Torneo.esp);
        if(!Torneo.campeones.get(10).equals(Torneo.esp)&&elim.contains(Torneo.campeones.get(10))){
            mundial.add(Torneo.campeones.get(10));
        }
        t.Resetear(Torneo.selecciones);
        Funciones.ordenarMundial(mundial, Torneo.esp, Torneo.campeones.get(10));
        grilla=Torneo.chopped(mundial, 6, 4);
        grupos=t.Mezclar(grilla);
        while(t.Validacion(grupos,1,3,1)==false){
                grupos=t.Mezclar(grilla);                
        }
        Funciones.mundial24_82(grupos, Torneo.esp.nombre, 60);
        Grupos.clasificacion(Torneo.esp.nombre, Torneo.campeones.get(11));
        t.imprimirElo(Torneo.selecciones);
        for(int i=0;i<Torneo.campeones.size();i++)
        System.out.println(Torneo.campeones.get(i).nombre);        
        
    }
    
    public ArrayList<Equipos> m1982elim(){
        
        ArrayList<ArrayList<Equipos>> gruposUefa;
        ArrayList<ArrayList<Equipos>> gruposConm;
        ArrayList<ArrayList<Equipos>> gruposConc;
        ArrayList<ArrayList<Equipos>> gruposCaf;
        ArrayList<ArrayList<Equipos>> gruposAfc;
        ArrayList<Equipos> segundaFase = new ArrayList<>();
        ArrayList<Equipos> terceraFase = new ArrayList<>();
        ArrayList<Equipos> cuartaFase = new ArrayList<>();
        ArrayList<Equipos> quintaFase = new ArrayList<>();
        ArrayList<Equipos> repechaje = new ArrayList<>();
        ArrayList<Equipos> especial = new ArrayList<>();
        
        if(elim.contains(Torneo.campeones.get(10))&&Torneo.campeones.get(10).conf.equals("uefa")){
            t.Eliminar(uefa, Torneo.campeones.get(10).nombre);
            grilla=Funciones.chopped6(uefa, 6, 6, 6, 6, 2, 6);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 2, mundial);          
        }else{
            grilla=Funciones.chopped5(uefa, 7, 6, 7, 6, 7);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 2, mundial);
            t.Eliminar(mundial, gruposUefa.get(6).get(1).nombre);
        }
        if(!elim.contains(Torneo.campeones.get(10))||Torneo.campeones.get(10).conf.equals("uefa")){
            grilla=Torneo.chopped(conm, 3, 1, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
            mundial.add(gruposConm.get(0).get(1));
        }else if(Torneo.campeones.get(10).conf.equals("conmebol")){
            t.Eliminar(conm, Torneo.campeones.get(10).nombre);
            grilla=Torneo.chopped(conm, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
        }else{
            grilla=Torneo.chopped(conm, 3, 1, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
            repechaje.add(gruposConm.get(0).get(1));
        }
        if(elim.contains(Torneo.campeones.get(10))&&Torneo.campeones.get(10).conf.equals("concacaf")){
            t.Eliminar(conc, Torneo.campeones.get(10).nombre);
            grilla=Funciones.chopped5(conc, 3, 3, 3, 2, 3);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 2, segundaFase);
            t.Resetear(conc);
            Grupos.grupo6neu(segundaFase, Torneo.hon.nombre, 40, 1, mundial);  
            repechaje.add(segundaFase.get(1));
            t.Serie(repechaje.get(0), repechaje.get(1), 40, mundial);
            segundaFase.clear();
        }else{
            grilla=Torneo.chopped(conc, 3, 5);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 2, segundaFase);
            t.Resetear(conc);
            Grupos.grupo6neu(segundaFase, Torneo.hon.nombre, 40, 2, mundial);
            segundaFase.clear();
        }
         if(elim.contains(Torneo.campeones.get(10))&&Torneo.campeones.get(10).conf.equals("caf")){
             t.Eliminar(caf, Torneo.campeones.get(10).nombre);
             Funciones.pasarEquipos(caf, segundaFase, 5);
             Funciones.Ronda(caf, 40, 11, segundaFase);
             Funciones.Ronda(segundaFase, 40, 8, terceraFase);
             Funciones.Ronda(terceraFase, 40, 4, cuartaFase);
             Funciones.Ronda(cuartaFase, 40, 2, quintaFase);
             t.Serie(quintaFase.get(0), quintaFase.get(1), 40, mundial);             
             if(mundial.contains(quintaFase.get(0))){
                 repechaje.add(quintaFase.get(1));
             }else{
                 repechaje.add(quintaFase.get(0));
             }      
             t.Serie(repechaje.get(0), repechaje.get(1), 40, mundial);
             segundaFase.clear(); terceraFase.clear(); cuartaFase.clear(); quintaFase.clear();
         }else{
             Funciones.pasarEquipos(caf, segundaFase, 4);
             Funciones.Ronda(caf, 40, 12, segundaFase);
             Funciones.Ronda(segundaFase, 40, 8, terceraFase);
             Funciones.Ronda(terceraFase, 40, 4, cuartaFase);
             Funciones.Ronda(cuartaFase, 40, 2, mundial);
             segundaFase.clear(); terceraFase.clear(); cuartaFase.clear(); quintaFase.clear();
         }
         if(elim.contains(Torneo.campeones.get(10))&&Torneo.campeones.get(10).conf.equals("afc")){
             
             t.Eliminar(afc, Torneo.campeones.get(10).nombre);
             grilla=Funciones.chopped5(afc, 4, 4, 4, 3, 4);
             gruposAfc=t.Mezclar(grilla);
             Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
             t.Resetear(afc);
             t.grupo4vuelta(segundaFase, 40, 1, mundial);  
             repechaje.add(segundaFase.get(1));
             t.Serie(repechaje.get(0), repechaje.get(1), 40, mundial);
         }else{
             grilla=Torneo.chopped(afc, 4, 5);
             gruposAfc=t.Mezclar(grilla);
             Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
             t.Resetear(afc);
             t.grupo4vuelta(segundaFase, 40, 2, mundial);
             segundaFase.clear();
         }        
        
        return mundial;
    }
    
}
