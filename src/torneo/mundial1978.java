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
public class mundial1978 {   
    
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
    
    static void wc1978(){
        mundial1978 m = new mundial1978();
        m.m1978();
    }
    
    public void m1978(){
        Torneo.vie.nombre="VIETNAM       ";
        Torneo.gdr.nivel=3;     Torneo.ina.nivel=5;
        Torneo.den.nivel=3;     Torneo.mas.nivel=5;
        Torneo.bol.nivel=3;     Torneo.kor.nivel=1;
        Torneo.slv.nivel=3;     Torneo.jpn.nivel=2;
        Torneo.alg.nivel=3;     Torneo.syr.nivel=4;
        Torneo.lby.nivel=4;     Torneo.cmr.nivel=4;
        Torneo.tog.nivel=4;     Torneo.eth.nivel=5;
        Torneo.cod.nivel=3;     Torneo.sud.nivel=5;       
        Torneo.tha.nivel=5;     Torneo.hkg.nivel=5;
        Torneo.selecciones.add(Torneo.pan);
        Torneo.selecciones.add(Torneo.brb);
        Torneo.selecciones.add(Torneo.guy);
        Torneo.selecciones.add(Torneo.dom);
        Torneo.selecciones.add(Torneo.nig);
        Torneo.selecciones.add(Torneo.bfa);
        Torneo.selecciones.add(Torneo.mtn);
        Torneo.selecciones.add(Torneo.cta);
        Torneo.selecciones.add(Torneo.mwi);
        Torneo.selecciones.add(Torneo.uga);
        Torneo.selecciones.add(Torneo.sin);
        Torneo.selecciones.add(Torneo.ksa);
        Torneo.selecciones.add(Torneo.bhr);
        Torneo.selecciones.add(Torneo.qat);
        Torneo.selecciones.add(Torneo.tpe);
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
      }
        t.Eliminar(elim, Torneo.Arg.nombre);   t.Eliminar(elim, Torneo.ben.nombre);
        t.Eliminar(elim, Torneo.alb.nombre);   t.Eliminar(elim, Torneo.gab.nombre);
        t.Eliminar(elim, Torneo.hon.nombre);   t.Eliminar(elim, Torneo.les.nombre);
        t.Eliminar(elim, Torneo.pur.nombre);   t.Eliminar(elim, Torneo.mad.nombre);
        t.Eliminar(elim, Torneo.atg.nombre);   t.Eliminar(elim, Torneo.mri.nombre);
        t.Eliminar(elim, Torneo.ber.nombre);   t.Eliminar(elim, Torneo.zim.nombre);
        t.Eliminar(elim, Torneo.irq.nombre);   t.Eliminar(elim, Torneo.prk.nombre);
        t.Eliminar(elim, Torneo.vie.nombre);       
        uefa=Torneo.confed("uefa", elim);
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);
        afc=Torneo.confed("afc", elim);
        mundial=m1978elim();
        mundial.add(Torneo.Arg);
        if(!Torneo.campeones.get(9).equals(Torneo.Arg))
            mundial.add(Torneo.campeones.get(9));
        t.Resetear(Torneo.selecciones);
        Funciones.ordenarMundial(mundial, Torneo.Arg, Torneo.campeones.get(9));
        grilla=Torneo.chopped(mundial, 4, 4);
        grupos=t.Mezclar(grilla);
        while(t.Validacion(grupos,1,3,1)==false){
                grupos=t.Mezclar(grilla);                
        }
        Funciones.mundial_16_7478(grupos, Torneo.Arg.nombre, 60);
        Grupos.clasificacion(Torneo.Arg.nombre, Torneo.campeones.get(10));
        t.imprimirElo(Torneo.selecciones);
        for(int i=0;i<Torneo.campeones.size();i++)
        System.out.println(Torneo.campeones.get(i).nombre);
        
    }
    
    public ArrayList<Equipos> m1978elim(){
        
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
        
        if(!elim.contains(Torneo.campeones.get(9))||Torneo.campeones.get(9).conf.equals("conmebol")){
            grilla=Torneo.chopped(uefa, 9, 9, 5, 9);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 1, mundial);
        }else if(Torneo.campeones.get(9).conf.equals("uefa")){
            t.Eliminar(uefa, Torneo.campeones.get(9).nombre);
            especial.add(uefa.get(8));
            t.Eliminar(uefa, uefa.get(8).nombre);
            grilla=Torneo.chopped(uefa, 8, 9, 4, 9);
            gruposUefa=t.Mezclar(grilla);
            gruposUefa.get(8).add(especial.get(0));     especial.clear();
            Funciones.Qualifier(gruposUefa, 40, 1, mundial);
            t.Eliminar(mundial, gruposUefa.get(8).get(0).nombre);
            repechaje.add(gruposUefa.get(8).get(0));
        }else{
            especial.add(uefa.get(8));
            t.Eliminar(uefa, uefa.get(8).nombre);
            grilla=Torneo.chopped(uefa, 8, 9, 5, 9);
            gruposUefa=t.Mezclar(grilla);
            gruposUefa.get(8).add(especial.get(0));     especial.clear();
            Funciones.Qualifier(gruposUefa, 40, 1, mundial);
            t.Eliminar(mundial, gruposUefa.get(8).get(0).nombre);
            repechaje.add(gruposUefa.get(8).get(0));
        }
        if(!elim.contains(Torneo.campeones.get(9))||Torneo.campeones.get(9).equals(Torneo.Arg)){
            grilla=Torneo.chopped(conm, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
        }else if(Torneo.campeones.get(9).conf.equals("conmebol")){
            t.Eliminar(conm, Torneo.campeones.get(9).nombre);
            grilla=Torneo.chopped(conm, 2, 4);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
        }else{
            grilla=Torneo.chopped(conm, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, segundaFase);
            t.Resetear(conm);
            t.grupo3neu(segundaFase, "neutral", 40, 2, mundial);
            repechaje.add(segundaFase.get(2));   segundaFase.clear();
            t.Serie(repechaje.get(0), repechaje.get(1), 40, mundial);
        }
        if(elim.contains(Torneo.campeones.get(9))&&Torneo.campeones.get(9).conf.equals("concacaf")){
            t.Eliminar(conc, Torneo.campeones.get(9).nombre);
            grilla=Torneo.chopped(conc, 6, 3, 6);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 1, segundaFase); 
            t.Resetear(conc);
            Grupos.grupo6neu(segundaFase, Torneo.mex.nombre, 40, 1, mundial);   
            segundaFase.clear();
        }else{
            grilla=Torneo.chopped(conc, 6, 4, 6);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 1, segundaFase); 
            t.Resetear(conc);
            Grupos.grupo6neu(segundaFase, Torneo.mex.nombre, 40, 1, mundial);   
            segundaFase.clear();
        }
        if(elim.contains(Torneo.campeones.get(9))&&Torneo.campeones.get(9).conf.equals("caf")){
            t.Eliminar(caf, Torneo.campeones.get(9).nombre);
            Funciones.pasarEquipos(caf, segundaFase, 23);
            t.Serie(caf.get(0), caf.get(1), 40, segundaFase);
            Collections.sort(caf,Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 12, 2);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, terceraFase);
            Collections.sort(caf,Torneo.rankingElo());
            grilla=Torneo.chopped(terceraFase, 6, 2);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, cuartaFase);
            Collections.sort(caf,Torneo.rankingElo());
            grilla=Torneo.chopped(cuartaFase, 3, 2);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, quintaFase);
            t.Resetear(caf);
            t.grupo3vuelta(quintaFase, 40, 1, mundial);
            segundaFase.clear(); terceraFase.clear(); cuartaFase.clear(); quintaFase.clear();
        }else{
            Funciones.pasarEquipos(caf, segundaFase, 22);
            grilla=Torneo.chopped(caf, 2, 2);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, segundaFase);
            Collections.sort(caf,Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 12, 2);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, terceraFase);
            Collections.sort(caf,Torneo.rankingElo());
            grilla=Torneo.chopped(terceraFase, 6, 2);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, cuartaFase);
            Collections.sort(caf,Torneo.rankingElo());
            grilla=Torneo.chopped(cuartaFase, 3, 2);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, quintaFase);
            t.Resetear(caf);
            t.grupo3vuelta(quintaFase, 40, 1, mundial);
            segundaFase.clear(); terceraFase.clear(); cuartaFase.clear(); quintaFase.clear();            
        }
        if(elim.contains(Torneo.campeones.get(9))&&Torneo.campeones.get(9).conf.equals("afc")){
            t.Eliminar(afc, Torneo.campeones.get(9).nombre);
            grilla=Torneo.chopped(afc, 5, 5, 1, 5);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(afc);
            Grupos.grupo5vuelta(segundaFase, 40, 1, mundial);
        }else{
            grilla=Torneo.chopped(afc, 5, 5, 2, 5);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(afc);
            Grupos.grupo5vuelta(segundaFase, 40, 1, mundial);
        }
                
        
        
        
        
               
        
        return mundial;
    }
    
    
}
