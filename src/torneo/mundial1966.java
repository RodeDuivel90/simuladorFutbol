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
public class mundial1966 {
    
    Torneo t = new Torneo();
    ArrayList<Equipos> mundial = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<Equipos> conc = new ArrayList<>();
    ArrayList<ArrayList<Equipos>> grupos;   
    ArrayList<ArrayList<Equipos>> grilla;
    
    static void wc1966(){
        mundial1966 m = new mundial1966();
        m.m1966();
    }
    
    
    public void m1966(){
        
        Torneo.tur.nivel=4;
        Torneo.gre.nivel=5;
        Torneo.nor.nivel=3;
        Torneo.hon.nivel=3;
        Torneo.ant.nivel=6;
        Torneo.col.nivel=4;
        Torneo.bel.nivel=2;
        Torneo.sui.nivel=3;
        Torneo.den.nivel=4;
        Torneo.selecciones.add(Torneo.tri);
        Torneo.selecciones.add(Torneo.prk);
        Torneo.selecciones.add(Torneo.ven); 
        Torneo.selecciones.add(Torneo.aus);
        Torneo.selecciones.add(Torneo.jam);
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
     }
        for(int i=0;i<elim.size();i++){
            if(elim.get(i).conf.equals("caf")||elim.get(i).conf.equals("afc")){
                t.Eliminar(elim, elim.get(i).nombre);
            }
        }
        elim.add(Torneo.isr);
        t.Eliminar(elim, Torneo.eng.nombre);  t.Eliminar(elim, Torneo.gua.nombre);
        t.Eliminar(elim, Torneo.can.nombre);  t.Eliminar(elim, Torneo.hai.nombre);
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        uefa.add(Torneo.isr);        
        mundial=m1966elim();
        mundial.add(Torneo.eng);
        if(!Torneo.campeones.get(6).equals(Torneo.eng)&&elim.contains(Torneo.campeones.get(6))){
            mundial.add(Torneo.campeones.get(6));
        }
        t.Resetear(Torneo.selecciones);
        Funciones.ordenarMundial(mundial, Torneo.eng, Torneo.campeones.get(6));
        grilla=Torneo.chopped(mundial, 4, 4, 4, 4);
        grupos=t.Mezclar(grilla);
        while(t.Validacion(grupos,1,3,1)==false){
                grupos=t.Mezclar(grilla); 
                if(t.Validacion(grupos,1,3,1)==true)
                     break;
        }
        Funciones.Mundial_16(grupos, Torneo.eng.nombre, 60);
        Grupos.clasificacion(Torneo.eng.nombre, Torneo.campeones.get(7));
        t.imprimirElo(Torneo.selecciones);
        for(int i=0;i<Torneo.campeones.size();i++)
        System.out.println(Torneo.campeones.get(i).nombre);
    }
    
    public ArrayList<Equipos> m1966elim(){
        ArrayList<ArrayList<Equipos>> gruposUefa;
        ArrayList<ArrayList<Equipos>> gruposConm;
        ArrayList<ArrayList<Equipos>> gruposConc;
        ArrayList<Equipos> segundaFase = new ArrayList<>();
        
        
        if(Torneo.campeones.get(6).conf.equals("uefa")&&!Torneo.campeones.get(6).equals(Torneo.eng)){
            t.Eliminar(uefa, Torneo.campeones.get(6).nombre);
            grilla=Torneo.chopped(uefa, 8,4);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 1, mundial);
            grilla.clear();
        }else if(Torneo.campeones.get(6).equals(Torneo.isr)){
            t.Eliminar(uefa, Torneo.campeones.get(6).nombre);
            grilla=Torneo.chopped(uefa, 9,9,5,9);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 1, mundial);
            grilla.clear();            
        }else{
            grilla=Torneo.chopped(uefa, 9, 9, 6, 9);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 1, mundial);
            grilla.clear();
        }
        
        if(!elim.contains(Torneo.campeones.get(6))||Torneo.campeones.get(6).conf.equals("uefa")){
            grilla=Torneo.chopped(conm, 3, 1, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
            mundial.add(gruposConm.get(0).get(1));
            grilla.clear();
        }else if(Torneo.campeones.get(6).conf.equals("conmebol")){
            t.Eliminar(conm, Torneo.campeones.get(6).nombre);
            grilla=Torneo.chopped(conm, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
            grilla.clear();
        }else{
            grilla=Torneo.chopped(conm, 3, 1, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
            grilla.clear();
        }
        if(elim.contains(Torneo.campeones.get(6))&&Torneo.campeones.get(6).conf.equals("concacaf")){
            t.Eliminar(conc, Torneo.campeones.get(6).nombre);
            grilla=Torneo.chopped(conc, 3, 2, 3);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 1, segundaFase);
            t.Resetear(conc);
            t.grupo3vuelta(segundaFase, 40, 1, mundial);
            grilla.clear();  segundaFase.clear();
        }else{
            grilla=Torneo.chopped(conc, 3, 3);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 1, segundaFase);
            t.Resetear(conc);
            t.grupo3vuelta(segundaFase, 40, 1, mundial);
            grilla.clear();  segundaFase.clear();
        }
        t.Serie(Torneo.aus, Torneo.prk, 40, mundial);        
        
        return mundial;
    }
    
}
