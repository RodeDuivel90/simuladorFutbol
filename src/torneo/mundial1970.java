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
public class mundial1970 {
    
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
    
   static void wc1970(){
        mundial1970 m = new mundial1970();
        m.m1970();
        
    }
   
   public void m1970(){
       Torneo.nor.nivel=4;  Torneo.jam.nivel=5;
       Torneo.gre.nivel=3;  Torneo.mar.nivel=2;
       Torneo.bel.nivel=2;  Torneo.tun.nivel=2;
       Torneo.per.nivel=2;  Torneo.nga.nivel=3;
       Torneo.can.nivel=4;  Torneo.gha.nivel=4;
       Torneo.tri.nivel=5;  Torneo.aus.nivel=2;
       Torneo.hai.nivel=4;  
       Torneo.fin.nivel=4;  Torneo.col.nivel=4;
       Torneo.selecciones.add(Torneo.ber);  Torneo.selecciones.add(Torneo.alg);
       Torneo.selecciones.add(Torneo.slv);  Torneo.selecciones.add(Torneo.cmr);
       Torneo.selecciones.add(Torneo.zam);  Torneo.selecciones.add(Torneo.lby);
       Torneo.selecciones.add(Torneo.sud);  Torneo.selecciones.add(Torneo.zim);
       Torneo.selecciones.add(Torneo.sen);  Torneo.selecciones.add(Torneo.nzl);
       t.Resetear(Torneo.selecciones);
       Collections.sort(Torneo.selecciones, Torneo.rankingElo());
       for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
     }
       t.Eliminar(elim, Torneo.mex.nombre);  t.Eliminar(elim, Torneo.cub.nombre);
       t.Eliminar(elim, Torneo.alb.nombre);  t.Eliminar(elim, Torneo.egy.nombre);
       t.Eliminar(elim, Torneo.isl.nombre);  t.Eliminar(elim, Torneo.ina.nombre);
       t.Eliminar(elim, Torneo.mlt.nombre);  t.Eliminar(elim, Torneo.prk.nombre);
       uefa=Torneo.confed("uefa", elim);
       conm=Torneo.confed("conmebol", elim);
       conc=Torneo.confed("concacaf", elim);
       caf=Torneo.confed("caf", elim);       
       for(int i=0;i<elim.size();i++){
           if(elim.get(i).conf.equals("afc")||elim.get(i).conf.equals("ofc"))
               afc.add(elim.get(i));
       }        
       mundial=m1970elim();
       mundial.add(Torneo.mex);
       if(!Torneo.campeones.get(7).equals(Torneo.mex)){
           mundial.add(Torneo.campeones.get(7));
       }       
       t.Resetear(Torneo.selecciones);
        Funciones.ordenarMundial(mundial, Torneo.mex, Torneo.campeones.get(7));
        grilla=Torneo.chopped(mundial, 4, 4, 4, 4);
        grupos=t.Mezclar(grilla);
        while(t.Validacion(grupos,1,3,1)==false){
                grupos=t.Mezclar(grilla); 
                if(t.Validacion(grupos,1,3,1)==true)
                     break;
        }
        Funciones.Mundial_16(grupos, Torneo.mex.nombre, 60);
        Grupos.clasificacion(Torneo.mex.nombre, Torneo.campeones.get(8));
        t.imprimirElo(Torneo.selecciones);
        for(int i=0;i<Torneo.campeones.size();i++)
        System.out.println(Torneo.campeones.get(i).nombre);
       
       
   }
   
   
   public ArrayList<Equipos> m1970elim(){
       ArrayList<ArrayList<Equipos>> gruposUefa;
       ArrayList<ArrayList<Equipos>> gruposConm;
       ArrayList<ArrayList<Equipos>> gruposConc;
       ArrayList<ArrayList<Equipos>> gruposCaf;       
       ArrayList<Equipos> segundaFase = new ArrayList<>();
       ArrayList<Equipos> terceraFase = new ArrayList<>();
      
       if(!elim.contains(Torneo.campeones.get(7))){
           grilla=Torneo.chopped(uefa, 9, 9, 3, 9);
           gruposUefa=t.Mezclar(grilla);
           Funciones.Qualifier(gruposUefa, 40, 1, mundial);
       }else if(Torneo.campeones.get(7).conf.equals("uefa")){
           t.Eliminar(uefa, Torneo.campeones.get(7).nombre);
           grilla=Torneo.chopped(uefa, 8, 8, 5, 8);
           gruposUefa=t.Mezclar(grilla);
           Funciones.Qualifier(gruposUefa, 40, 1, mundial);
       }else{
           grilla=Torneo.chopped(uefa, 8, 8, 6, 8);
           gruposUefa=t.Mezclar(grilla);
           Funciones.Qualifier(gruposUefa, 40, 1, mundial);
       }
       if(Torneo.campeones.get(7).conf.equals("conmebol")){
           t.Eliminar(conm, Torneo.campeones.get(7).nombre);
           grilla=Torneo.chopped(conm, 3, 3);
           gruposConm=t.Mezclar(grilla);
           Funciones.Qualifier(gruposConm, 40, 1, mundial);
           grilla.clear();
       }else{
           grilla=Torneo.chopped(conm, 3, 3, 1, 3);
           gruposConm=t.Mezclar(grilla);
           Funciones.Qualifier(gruposConm, 40, 1, mundial);
           grilla.clear();
       }
       if(elim.contains(Torneo.campeones.get(7))&&Torneo.campeones.get(7).conf.equals("concacaf")){
           t.Eliminar(conc, Torneo.campeones.get(7).nombre);
           grilla=Torneo.chopped(conc, 4, 3, 4);
           gruposConc=t.Mezclar(grilla);
           Funciones.Qualifier(gruposConc, 40, 1, segundaFase);
           t.Serie(segundaFase.get(0), segundaFase.get(1), 40, terceraFase);
           t.Serie(segundaFase.get(2), segundaFase.get(3), 40, terceraFase);
           t.Serie(terceraFase.get(0), terceraFase.get(1), 40, mundial);
           grilla.clear();  segundaFase.clear();   terceraFase.clear();
       }else{
           grilla=Torneo.chopped(conc, 4, 3);
           gruposConc=t.Mezclar(grilla);
           Funciones.Qualifier(gruposConc, 40, 1, segundaFase);
           t.Serie(segundaFase.get(0), segundaFase.get(1), 40, terceraFase);
           t.Serie(segundaFase.get(2), segundaFase.get(3), 40, terceraFase);
           t.Serie(terceraFase.get(0), terceraFase.get(1), 40, mundial);
           grilla.clear();  segundaFase.clear();   terceraFase.clear();
       }
       
       segundaFase.add(caf.get(0)); 
       t.Eliminar(caf, caf.get(0).nombre);
       grilla=Torneo.chopped(caf, 5, 2);
       gruposCaf=t.Mezclar(grilla);   grilla.clear();
       Funciones.idaVueltaSeries(gruposCaf, 40, segundaFase);
       Collections.sort(segundaFase,Torneo.rankingElo());
       grilla=Torneo.chopped(segundaFase, 3, 2); gruposCaf.clear();
       gruposCaf=t.Mezclar(grilla);
       Funciones.idaVueltaSeries(gruposCaf, 40, terceraFase);
       t.grupo3vuelta(terceraFase, 40, 1, mundial);
       grilla.clear(); segundaFase.clear(); terceraFase.clear();
       
       if(elim.contains(Torneo.campeones.get(7))
               &&(Torneo.campeones.get(7).conf.equals("afc")||Torneo.campeones.get(7).conf.equals("ofc"))){
           t.Eliminar(afc, Torneo.campeones.get(7).nombre);
           segundaFase.add(afc.get(0)); segundaFase.add(afc.get(2));
           segundaFase.add(afc.get(1));
           t.Serie(afc.get(3), afc.get(4), 40, segundaFase);
           t.Serie(segundaFase.get(0), segundaFase.get(3), 40, terceraFase);
           t.Serie(segundaFase.get(1), segundaFase.get(2), 40, terceraFase);
           t.Serie(terceraFase.get(0), terceraFase.get(1), 40, mundial);
       }else{
           segundaFase.add(afc.get(0)); segundaFase.add(afc.get(2));
           segundaFase.add(afc.get(1));
           t.Eliminar(afc, afc.get(0).nombre);  t.Eliminar(afc, afc.get(0).nombre);
           t.Eliminar(afc, afc.get(0).nombre);
           t.grupo3neu(afc, afc.get(0).nombre, 40, 1, segundaFase);
           t.Serie(segundaFase.get(0), segundaFase.get(3), 40, terceraFase);
           t.Serie(segundaFase.get(1), segundaFase.get(2), 40, terceraFase);
           t.Serie(terceraFase.get(0), terceraFase.get(1), 40, mundial);           
       }
           
           
           
       
       
       
       
       return mundial;
   }
   
    
}
