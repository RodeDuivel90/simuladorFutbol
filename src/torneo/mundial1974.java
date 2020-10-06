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
public class mundial1974 {
    
    
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
    
    
    
    static void wc1974(){
        mundial1974 m = new mundial1974();
        m.m1974();
    }
    
    public void m1974(){
        
        Torneo.pol.nivel=2;    Torneo.jpn.nivel=3;
        Torneo.aut.nivel=2;    Torneo.kor.nivel=2;
        Torneo.gdr.nivel=2;    Torneo.prk.nivel=3;
        Torneo.gre.nivel=4;    Torneo.nzl.nivel=3;
        Torneo.por.nivel=3;    Torneo.aus.nivel=1;
        Torneo.ned.nivel=1;    Torneo.cmr.nivel=3;
        Torneo.rou.nivel=3;    Torneo.gha.nivel=3;
        Torneo.gua.nivel=4;    Torneo.zam.nivel=3;
        Torneo.slv.nivel=4;    Torneo.alg.nivel=4;
        Torneo.hai.nivel=3;    Torneo.sen.nivel=4;
        Torneo.ant.nivel=5;    Torneo.eng.nivel=2;
        Torneo.selecciones.add(Torneo.pur);
        Torneo.selecciones.add(Torneo.atg);
        Torneo.selecciones.add(Torneo.gui);
        Torneo.selecciones.add(Torneo.sle);
        Torneo.selecciones.add(Torneo.civ);
        Torneo.selecciones.add(Torneo.ken);
        Torneo.selecciones.add(Torneo.mri);
        Torneo.selecciones.add(Torneo.mad);
        Torneo.selecciones.add(Torneo.les);
        Torneo.selecciones.add(Torneo.cgo);
        Torneo.selecciones.add(Torneo.ben);
        Torneo.selecciones.add(Torneo.tog);
        Torneo.selecciones.add(Torneo.cod);
        Torneo.selecciones.add(Torneo.gab);
        Torneo.selecciones.add(Torneo.vie);
        Torneo.selecciones.add(Torneo.hkg);
        Torneo.selecciones.add(Torneo.mas);
        Torneo.selecciones.add(Torneo.tha);
        Torneo.selecciones.add(Torneo.syr);
        Torneo.selecciones.add(Torneo.irn);
        Torneo.selecciones.add(Torneo.kuw);
        Torneo.selecciones.add(Torneo.irq);
        Torneo.selecciones.add(Torneo.tan);
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
      }
        t.Eliminar(elim, Torneo.ger.nombre);    t.Eliminar(elim, Torneo.lby.nombre);
        t.Eliminar(elim, Torneo.cub.nombre);    t.Eliminar(elim, Torneo.zim.nombre);
        t.Eliminar(elim, Torneo.ber.nombre);
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);
        afc=Torneo.confed("afc", elim);
        mundial=m1974elim();
        mundial.add(Torneo.ger);
        if(!Torneo.campeones.get(8).equals(Torneo.ger)&&elim.contains(Torneo.campeones.get(8))){
            mundial.add(Torneo.campeones.get(8));
        }
        t.Resetear(Torneo.selecciones);
        Funciones.ordenarMundial(mundial, Torneo.ger, Torneo.campeones.get(8));
        grilla=Torneo.chopped(mundial, 4, 4);
        grupos=t.Mezclar(grilla);
        while(t.Validacion(grupos,1,3,1)==false){
                grupos=t.Mezclar(grilla);                
        }
        Funciones.mundial_16_7478(grupos, Torneo.ger.nombre, 60);
        Grupos.clasificacion(Torneo.ger.nombre, Torneo.campeones.get(9));
        t.imprimirElo(Torneo.selecciones);
        for(int i=0;i<Torneo.campeones.size();i++)
        System.out.println(Torneo.campeones.get(i).nombre);
        
    }
    
    
    public ArrayList<Equipos> m1974elim(){
        
       ArrayList<ArrayList<Equipos>> gruposUefa;
       ArrayList<ArrayList<Equipos>> gruposConm;
       ArrayList<ArrayList<Equipos>> gruposConc;
       ArrayList<ArrayList<Equipos>> gruposCaf;
       ArrayList<ArrayList<Equipos>> gruposAfc;
       ArrayList<Equipos> segundaFase = new ArrayList<>();
       ArrayList<Equipos> terceraFase = new ArrayList<>();
       ArrayList<Equipos> cuartaFase = new ArrayList<>();
       ArrayList<Equipos> repechaje = new ArrayList<>();
       ArrayList<Equipos> especial = new ArrayList<>();
       if(!elim.contains(Torneo.campeones.get(8))||Torneo.campeones.get(8).equals(Torneo.ger)){
           grilla=Torneo.chopped(uefa, 9, 9 , 5, 9);
           gruposUefa=t.Mezclar(grilla);
           Funciones.Qualifier(gruposUefa, 40, 1, mundial);
       }else if(Torneo.campeones.get(8).conf.equals("conmebol")){
           especial.add(uefa.get(8));
           t.Eliminar(uefa, uefa.get(8).nombre);  
           grilla=Torneo.chopped(uefa, 8, 9, 5, 9);
           gruposUefa=t.Mezclar(grilla);
           gruposUefa.get(8).add(especial.get(0));   especial.clear();
           Funciones.Qualifier(gruposUefa, 40, 1, mundial);
           t.Eliminar(mundial, gruposUefa.get(8).get(0).nombre);
           repechaje.add(gruposUefa.get(8).get(0));
       }else{
           t.Eliminar(uefa, Torneo.campeones.get(8).nombre);
           grilla=Torneo.chopped(uefa, 8, 8, 7, 8);
           gruposUefa=t.Mezclar(grilla);
           Funciones.Qualifier(gruposUefa, 40, 1, mundial);
       }
       if(Torneo.campeones.get(8).conf.equals("conmebol")){
           t.Eliminar(conm, Torneo.campeones.get(8).nombre);
           especial.add(conm.get(2));
           t.Eliminar(conm, especial.get(0).nombre); 
           grilla=Torneo.chopped(conm, 2, 3, 3);
           gruposConm=t.Mezclar(grilla);
           gruposConm.get(2).add(especial.get(0));   especial.clear();
           Funciones.Qualifier(gruposConm, 40, 1, mundial);
           t.Eliminar(mundial, gruposConm.get(2).get(0).nombre);
           repechaje.add(gruposConm.get(2).get(0));
           t.Serie(repechaje.get(0), repechaje.get(1), 40, mundial);
       }else{
           grilla=Torneo.chopped(conm, 3, 3, 1, 3);
           gruposConm=t.Mezclar(grilla);
           Funciones.Qualifier(gruposConm, 40, 1, mundial);
       }
       if(elim.contains(Torneo.campeones.get(8))&&Torneo.campeones.get(8).conf.equals("concacaf")){
           t.Eliminar(conc, Torneo.campeones.get(8).nombre);
           grilla=Torneo.chopped(conc, 6, 1, 6);
           gruposConc=t.Mezclar(grilla);
           Funciones.Qualifier(gruposConc, 40, 1, segundaFase);
           t.Resetear(conc);
           Grupos.grupo6neu(segundaFase, Torneo.hai.nombre, 40, 1, mundial); 
           segundaFase.clear();
       }else{
           grilla=Torneo.chopped(conc, 6, 2, 6);
           gruposConc=t.Mezclar(grilla);
           Funciones.Qualifier(gruposConc, 40, 1, segundaFase);
           t.Resetear(conc);
           Grupos.grupo6neu(segundaFase, Torneo.hai.nombre, 40, 1, mundial);   
           segundaFase.clear(); 
       }
       if(elim.contains(Torneo.campeones.get(8))&&Torneo.campeones.get(8).conf.equals("caf")){
           t.Eliminar(caf, Torneo.campeones.get(8).nombre);
           Funciones.pasarEquipos(caf, segundaFase, 1);
           grilla=Torneo.chopped(caf, 11, 2);
           gruposCaf=t.Mezclar(grilla);
           Funciones.Qualifier(gruposCaf, 40, 1, segundaFase);
           Collections.sort(segundaFase, Torneo.rankingElo());
           grilla=Torneo.chopped(segundaFase, 6, 2);
           gruposCaf=t.Mezclar(grilla);
           Funciones.Qualifier(gruposCaf, 40, 1, terceraFase);
           Collections.sort(terceraFase, Torneo.rankingElo());
           grilla=Torneo.chopped(terceraFase, 3, 2);
           gruposCaf=t.Mezclar(grilla);
           Funciones.Qualifier(gruposCaf, 40, 1, cuartaFase);
           t.Resetear(caf);
           t.grupo3vuelta(cuartaFase, 40, 1, mundial);         
       }else{
           grilla=Torneo.chopped(caf, 12, 2);
           gruposCaf=t.Mezclar(grilla);
           Funciones.Qualifier(gruposCaf, 40, 1, segundaFase);
           Collections.sort(segundaFase, Torneo.rankingElo());
           grilla=Torneo.chopped(segundaFase, 6, 2);
           gruposCaf=t.Mezclar(grilla);
           Funciones.Qualifier(gruposCaf, 40, 1, terceraFase);
           Collections.sort(terceraFase, Torneo.rankingElo());
           grilla=Torneo.chopped(terceraFase, 3, 2);
           gruposCaf=t.Mezclar(grilla);
           Funciones.Qualifier(gruposCaf, 40, 1, cuartaFase);
           t.Resetear(caf);
           t.grupo3vuelta(cuartaFase, 40, 1, mundial);           
       }segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
       if(elim.contains(Torneo.campeones.get(8))&&Torneo.campeones.get(8).conf.equals("afc")){
           t.Eliminar(afc, Torneo.campeones.get(8).nombre);
           grilla=Torneo.chopped(afc, 4, 4, 2, 4);
           gruposAfc=t.Mezclar(grilla);
           Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
           t.Serie(segundaFase.get(0), segundaFase.get(1), 40, terceraFase);
           t.Serie(segundaFase.get(2), segundaFase.get(3), 40, terceraFase);
           t.Serie(terceraFase.get(0), terceraFase.get(1), 40, mundial);           
       }else{
           grilla=Torneo.chopped(afc, 4, 4, 3, 4);
           gruposAfc=t.Mezclar(grilla);
           Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
           t.Serie(segundaFase.get(0), segundaFase.get(1), 40, terceraFase);
           t.Serie(segundaFase.get(2), segundaFase.get(3), 40, terceraFase);
           t.Serie(terceraFase.get(0), terceraFase.get(1), 40, mundial);
       }segundaFase.clear();  terceraFase.clear();
        
        return mundial;
    }
    
}
