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
public class mundial1962{
    
    
    ArrayList<Equipos> mundial = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<Equipos> conc = new ArrayList<>();
    ArrayList<Equipos> caf = new ArrayList<>();
    ArrayList<Equipos> repechajeCaf = new ArrayList<>();
    ArrayList<Equipos> repechajeAfc = new ArrayList<>();
    ArrayList<Equipos> repechajeConc = new ArrayList<>();
    ArrayList<ArrayList<Equipos>> grilla;
    ArrayList<ArrayList<Equipos>> grupos;    
    
    
    static void wc1962(){
        mundial1962 m = new mundial1962();
        m.m1962();
    }
    
    
    public void m1962(){
        Torneo.bul.nivel=2;
        Torneo.tur.nivel=5;
        Torneo.fin.nivel=4;
        Torneo.sui.nivel=3;
        Torneo.lux.nivel=5;
        Torneo.isr.nivel=2;
        Torneo.nor.nivel=3;
        Torneo.Arg.nivel=1;
        Torneo.usa.nivel=4;
        Torneo.gua.nivel=5;
        Torneo.ant.nivel=5;
        Torneo.kor.nivel=3;
        Torneo.jpn.nivel=4;
        Torneo.tur.nivel=3;
        Torneo t = new Torneo();
        Torneo.selecciones.add(Torneo.eth);
        Torneo.selecciones.add(Torneo.cyp);
        Torneo.selecciones.add(Torneo.ecu);
        Torneo.selecciones.add(Torneo.hon);
        Torneo.selecciones.add(Torneo.sur);
        Torneo.selecciones.add(Torneo.mar);
        Torneo.selecciones.add(Torneo.tun);
        Torneo.selecciones.add(Torneo.gha);
        Torneo.selecciones.add(Torneo.nga);
        t.Resetear(Torneo.selecciones);
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
     }
        t.Eliminar(elim,Torneo.chi.nombre); t.Eliminar(elim, Torneo.cub.nombre);
        t.Eliminar(elim,Torneo.den.nombre); t.Eliminar(elim, Torneo.hai.nombre);  
        t.Eliminar(elim,Torneo.can.nombre); t.Eliminar(elim, Torneo.egy.nombre); 
        uefa=Torneo.confed("uefa", elim);
        Collections.sort(uefa, Torneo.rankingElo());
        uefa.add(Torneo.isr);
        uefa.add(Torneo.eth);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);        
        mundial=m1962elim();   
        t.Resetear(Torneo.selecciones);
        Funciones.ordenarMundial(mundial, Torneo.chi, Torneo.campeones.get(5));
        grilla=Torneo.chopped(mundial, 4, 4, 4, 4);
        grupos=t.Mezclar(grilla);
        int contUefa=0;
        for(int i=0;i<mundial.size();i++){
            if(mundial.get(i).conf.equals("uefa"))
                contUefa+=1;
        }
        if(contUefa>=8){
            while(t.Validacion(grupos,2,3,1)==false){
                grupos=t.Mezclar(grilla); 
                if(t.Validacion(grupos,2,3,1)==true)
                     break;
            }
        }else{
            while(t.Validacion(grupos,2,2,1)==false){
                grupos=t.Mezclar(grilla); 
                if(t.Validacion(grupos,2,2,1)==true)
                     break;
            }
        }
        Funciones.Mundial_16(grupos, Torneo.chi.nombre, 60);
        Grupos.clasificacion(Torneo.chi.nombre, Torneo.campeones.get(6));
        t.imprimirElo(Torneo.selecciones);
        for(int i=0;i<Torneo.campeones.size();i++)
        System.out.println(Torneo.campeones.get(i).nombre);
        
        
    }
    
    public ArrayList<Equipos> m1962elim(){
        Torneo t= new Torneo();
        ArrayList<ArrayList<Equipos>> gruposUefa;
        ArrayList<ArrayList<Equipos>> gruposConm;
        ArrayList<ArrayList<Equipos>> gruposConc;
        ArrayList<ArrayList<Equipos>> gruposCaf;
        ArrayList<Equipos> segundaFase = new ArrayList<>();        
        
        if((!elim.contains(Torneo.campeones.get(5))||((Torneo.campeones.get(5).conf.equals("conmebol"))||
                Torneo.campeones.get(5).conf.equals("concacaf")))||Torneo.campeones.get(5).equals(Torneo.chi)){
            grilla=Torneo.chopped(uefa, 10, 10, 2,10);
            gruposUefa=t.Mezclar(grilla);
            t.grupo4vuelta(gruposUefa.get(0), 40, 1, mundial);
            t.grupo4vuelta(gruposUefa.get(1), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(2), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(3), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(4), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(5), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(6), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(7), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(8), 40, 1, repechajeCaf);
            t.grupo3vuelta(gruposUefa.get(9), 40, 1, repechajeAfc);  
            grilla.clear();
            
        }else if(elim.contains(Torneo.campeones.get(5))&&Torneo.campeones.get(5).conf.equals("uefa")||
                Torneo.campeones.get(5).equals(Torneo.isr)){
            
            t.Eliminar(uefa, Torneo.campeones.get(5).nombre);
            grilla=Torneo.chopped(uefa, 9, 9, 4,9);
            gruposUefa=t.Mezclar(grilla);
            t.grupo4vuelta(gruposUefa.get(0), 40, 1, mundial);
            t.grupo4vuelta(gruposUefa.get(1), 40, 1, mundial);
            t.grupo4vuelta(gruposUefa.get(2), 40, 1, mundial);
            t.grupo4vuelta(gruposUefa.get(3), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(4), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(5), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(6), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(7), 40, 1, repechajeCaf);
            t.grupo3vuelta(gruposUefa.get(8), 40, 1, repechajeAfc);
            grilla.clear();
            
        }else{
            
            grilla=Torneo.chopped(uefa, 9, 9, 5,9);
            gruposUefa=t.Mezclar(grilla);
            t.grupo4vuelta(gruposUefa.get(0), 40, 1, mundial);
            t.grupo4vuelta(gruposUefa.get(1), 40, 1, mundial);
            t.grupo4vuelta(gruposUefa.get(2), 40, 1, mundial);
            t.grupo4vuelta(gruposUefa.get(3), 40, 1, mundial);
            t.grupo4vuelta(gruposUefa.get(4), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(5), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(6), 40, 1, mundial);
            t.grupo3vuelta(gruposUefa.get(7), 40, 1, repechajeCaf);
            t.grupo3vuelta(gruposUefa.get(8), 40, 1, repechajeAfc);   
            grilla.clear();
            
        }
        
        if(Torneo.campeones.get(5).conf.equals("conmebol")&&!Torneo.campeones.get(5).equals(Torneo.chi)){
            
            t.Eliminar(conm, Torneo.campeones.get(5).nombre);
            repechajeConc.add(conm.get(3));
            t.Eliminar(conm, conm.get(3).nombre);
            grilla=Torneo.chopped(conm, 3, 2);
            gruposConm=t.Mezclar(grilla);
            t.Serie(gruposConm.get(0).get(0), gruposConm.get(0).get(1), 40, mundial);
            t.Serie(gruposConm.get(1).get(0), gruposConm.get(1).get(1), 40, mundial);
            t.Serie(gruposConm.get(2).get(0), gruposConm.get(2).get(1), 40, mundial);
            grilla.clear();
            
        }else if(elim.contains(Torneo.campeones.get(5))&&Torneo.campeones.get(5).conf.equals("concacaf")){
            repechajeConc.add(conm.get(3));
            t.Eliminar(conm, conm.get(3).nombre);
            grilla=Torneo.chopped(conm, 3,1,3);
            gruposConm=t.Mezclar(grilla);
            t.grupo3vuelta(gruposConm.get(0), 40, 1, mundial);
            t.Serie(gruposConm.get(1).get(0), gruposConm.get(1).get(1), 40, mundial);
            t.Serie(gruposConm.get(2).get(0), gruposConm.get(2).get(1), 40, mundial);
            grilla.clear();
            
        }else{
            
            grilla=Torneo.chopped(conm, 2,4);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 2, mundial);
            grilla.clear();
        }
        
        if(elim.contains(Torneo.campeones.get(5))&&Torneo.campeones.get(5).conf.equals("concacaf")){
            
            t.Eliminar(conc, Torneo.campeones.get(5).nombre);
            grilla=Torneo.chopped(conc, 3,2);
            gruposConc=t.Mezclar(grilla);
            t.Serie(gruposConc.get(0).get(0), gruposConc.get(0).get(1), 40, segundaFase);
            t.Serie(gruposConc.get(1).get(0), gruposConc.get(1).get(1), 40, segundaFase);
            t.Serie(gruposConc.get(2).get(0), gruposConc.get(2).get(1), 40, segundaFase);
            t.Resetear(conc);
            t.grupo3vuelta(segundaFase, 40, 1, repechajeConc);
            t.Serie(repechajeConc.get(0), repechajeConc.get(1), 40, mundial);
            grilla.clear(); segundaFase.clear();
            
        }else if(elim.contains(Torneo.campeones.get(5))&&Torneo.campeones.get(5).conf.equals("conmebol")){
            
            grilla=Torneo.chopped(conc, 3,1,3);
            gruposConc=t.Mezclar(grilla);
            t.grupo3vuelta(gruposConc.get(0), 40, 1, segundaFase);
            t.Serie(gruposConc.get(1).get(0), gruposConc.get(1).get(1), 40, segundaFase);
            t.Serie(gruposConc.get(2).get(0), gruposConc.get(2).get(1), 40, segundaFase);
            t.Resetear(conc);
            t.grupo3vuelta(segundaFase, 40, 1, repechajeConc);
            t.Serie(repechajeConc.get(0), repechajeConc.get(1), 40, mundial);
            grilla.clear(); segundaFase.clear();
            
        }else{
            
            grilla=Torneo.chopped(conc, 3,1,3);
            gruposConc=t.Mezclar(grilla);
            t.grupo3vuelta(gruposConc.get(0), 40, 1, segundaFase);
            t.Serie(gruposConc.get(1).get(0), gruposConc.get(1).get(1), 40, segundaFase);
            t.Serie(gruposConc.get(2).get(0), gruposConc.get(2).get(1), 40, segundaFase);
            t.Resetear(conc);
            t.grupo3vuelta(segundaFase, 40, 1, mundial);
            grilla.clear(); segundaFase.clear();
        }
        
        t.Eliminar(caf, Torneo.eth.nombre);
        grilla=Torneo.chopped(caf, 2, 2);
        gruposCaf=t.Mezclar(grilla);
        Funciones.Qualifier(gruposCaf, 40, 1, segundaFase);
        t.Serie(segundaFase.get(0), segundaFase.get(1), 40, repechajeCaf);
        t.Serie(Torneo.jpn, Torneo.kor, 40, repechajeAfc);
        t.Serie(repechajeCaf.get(0), repechajeCaf.get(1), 40, mundial);
        t.Serie(repechajeAfc.get(0), repechajeAfc.get(1), 40, mundial);
        grilla.clear(); segundaFase.clear();
        mundial.add(Torneo.chi);
        if(!Torneo.campeones.get(5).equals(Torneo.chi)&&elim.contains(Torneo.campeones.get(5))){
            mundial.add(Torneo.campeones.get(5));
        }
        
        
        return mundial;
    }
    
    
}
