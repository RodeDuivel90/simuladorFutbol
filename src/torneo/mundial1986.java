package torneo;

import java.util.ArrayList;
import java.util.Collections;


public class mundial1986 {
    
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
    
    
    static void wc1986(){
        mundial1986 m = new mundial1986();
        m.m1986();
    }
    
    public void m1986(){
        Torneo.aus.conf="ofc";   Torneo.isr.conf="ofc";
        Torneo.nzl.conf="ofc";   Torneo.tpe.conf="ofc";
        Torneo.por.nivel=2;      Torneo.usa.nivel=3;
        Torneo.den.nivel=2;      Torneo.zam.nivel=2;
        Torneo.nir.nivel=3;      Torneo.uga.nivel=4;
        Torneo.civ.nivel=3;      Torneo.chi.nivel=2;
        Torneo.ant.nivel=6;      Torneo.gam.nivel=6;
        Torneo.tri.nivel=4;      Torneo.egy.nivel=3; 
        Torneo.zim.nivel=4;      Torneo.mri.nivel=6;
        Torneo.mwi.nivel=4;      Torneo.sle.nivel=5;
        Torneo.cmr.nivel=3;      Torneo.qat.nivel=2;
        Torneo.irq.nivel=1;      Torneo.syr.nivel=3;
        Torneo.kuw.nivel=3;      Torneo.bhr.nivel=3;
        Torneo.mas.nivel=3;      Torneo.tha.nivel=4;
        Torneo.mac.nivel=5;      Torneo.chn.nivel=3;
        Torneo.sin.nivel=5;      Torneo.jpn.nivel=1;
        Torneo.tpe.nivel=6;      Torneo.isr.nivel=2;
        Torneo.nzl.nivel=2;
        Torneo.selecciones.add(Torneo.ang);   Torneo.selecciones.add(Torneo.yem);
        Torneo.selecciones.add(Torneo.uae);   Torneo.selecciones.add(Torneo.nep);
        Torneo.selecciones.add(Torneo.jor);   Torneo.selecciones.add(Torneo.bru);
        Torneo.selecciones.add(Torneo.nye);   Torneo.selecciones.add(Torneo.ban);
        Torneo.selecciones.add(Torneo.ind);
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
      }
        t.Eliminar(elim, Torneo.mex.nombre);    t.Eliminar(elim, Torneo.cub.nombre);
        t.Eliminar(elim, Torneo.ber.nombre);    t.Eliminar(elim, Torneo.dom.nombre); 
        t.Eliminar(elim, Torneo.bfa.nombre);    t.Eliminar(elim, Torneo.cgo.nombre); 
        t.Eliminar(elim, Torneo.gab.nombre);    t.Eliminar(elim, Torneo.mtn.nombre);
        t.Eliminar(elim, Torneo.moz.nombre);    t.Eliminar(elim, Torneo.cta.nombre); 
        t.Eliminar(elim, Torneo.som.nombre);    t.Eliminar(elim, Torneo.cod.nombre); 
        t.Eliminar(elim, Torneo.fij.nombre);    t.Eliminar(elim, Torneo.irn.nombre); 
        t.Eliminar(elim, Torneo.vie.nombre);   
        
        uefa=Torneo.confed("uefa", elim);    
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);
        afc=Torneo.confed("afc", elim);
        ofc=Torneo.confed("ofc", elim);
        mundial=m1986elim();
        mundial.add(Torneo.mex);
        if(elim.contains(Torneo.campeones.get(11))&&!Torneo.campeones.get(11).equals(Torneo.mex)){
            mundial.add(Torneo.campeones.get(11));
        }
        t.Resetear(Torneo.selecciones);
        Funciones.ordenarMundial(mundial, Torneo.mex, Torneo.campeones.get(11));
        grilla=Torneo.chopped(mundial, 6, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,3,1)==false)||
                !grupos.get(1).contains(Torneo.mex)){
                grupos=t.Mezclar(grilla);                
        }
        Funciones.mundial_24_86(grupos, Torneo.mex.nombre, 60);
        Grupos.clasificacionRepe(Torneo.mex.nombre, Torneo.campeones.get(12),31,51);
        t.imprimirElo(Torneo.selecciones);
        for(int i=0;i<Torneo.campeones.size();i++)
        System.out.println(Torneo.campeones.get(i).nombre); 
    }
    
    public ArrayList<Equipos> m1986elim(){
        ArrayList<ArrayList<Equipos>> gruposUefa;
        ArrayList<ArrayList<Equipos>> gruposConm;
        ArrayList<ArrayList<Equipos>> gruposConc;
        ArrayList<ArrayList<Equipos>> gruposAfc;
        ArrayList<Equipos> segundaFase = new ArrayList<>();
        ArrayList<Equipos> terceraFase = new ArrayList<>();
        ArrayList<Equipos> cuartaFase = new ArrayList<>();
        ArrayList<Equipos> repechaje = new ArrayList<>();
        ArrayList<Equipos> repechajeOfc = new ArrayList<>();
        
        if(elim.contains(Torneo.campeones.get(11))&&Torneo.campeones.get(11).conf.equals("uefa")){
            t.Eliminar(uefa, Torneo.campeones.get(11).nombre);
            grilla=Funciones.chopped5(uefa, 7, 7, 7, 4, 7);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 2, mundial);
            t.Eliminar(mundial, gruposUefa.get(4).get(1).nombre);
            t.Eliminar(mundial, gruposUefa.get(5).get(1).nombre);
            t.Eliminar(mundial, gruposUefa.get(6).get(1).nombre);
            repechaje.add(gruposUefa.get(4).get(1));
            repechaje.add(gruposUefa.get(5).get(1));
            repechaje.add(gruposUefa.get(6).get(1));
            Collections.sort(repechaje);
            repechajeOfc.add(repechaje.get(0));
            t.Serie(repechaje.get(1), repechaje.get(2), 40, mundial);            
        }else if(!elim.contains(Torneo.campeones.get(11))||Torneo.campeones.get(11).conf.equals("conmebol")){
            grilla=Funciones.chopped5(uefa, 7, 7, 7, 5, 7);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 2, mundial);
            t.Eliminar(mundial, gruposUefa.get(5).get(1).nombre);
            t.Eliminar(mundial, gruposUefa.get(6).get(1).nombre);
            repechaje.add(gruposUefa.get(5).get(1));
            repechaje.add(gruposUefa.get(6).get(1));
            Collections.sort(repechaje);
            mundial.add(repechaje.get(0));
            repechajeOfc.add(repechaje.get(1));             
        }else{
            grilla=Funciones.chopped5(uefa, 7, 6, 7, 6, 7);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 2, mundial);
            t.Eliminar(mundial, gruposUefa.get(6).get(1).nombre);           
        }if(!elim.contains(Torneo.campeones.get(11))||Torneo.campeones.get(11).conf.equals("uefa")){
            grilla=Torneo.chopped(conm, 3, 1, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
            mundial.add(gruposConm.get(0).get(1));            
        }else if(Torneo.campeones.get(11).conf.equals("conmebol")){
            t.Eliminar(conm, Torneo.campeones.get(11).nombre);
            grilla=Torneo.chopped(conm, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
        }else{
            grilla=Torneo.chopped(conm, 3, 1, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
            repechajeOfc.add(gruposConm.get(0).get(1));
        }if(elim.contains(Torneo.campeones.get(11))&&Torneo.campeones.get(11).conf.equals("concacaf")){
            t.Eliminar(conc, Torneo.campeones.get(11).nombre);
            Funciones.Ronda(conc, 40, 8, segundaFase);
            t.Resetear(conc);
            Collections.sort(segundaFase,Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 2, 4);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 2, terceraFase);
            t.Resetear(conc);
            t.grupo4vuelta(terceraFase, 40, 1, mundial);
            segundaFase.clear();  terceraFase.clear();
        }else{
            Funciones.pasarEquipos(conc, segundaFase, 1);
            Funciones.Ronda(conc, 40, 8, segundaFase);
            Collections.sort(segundaFase,Torneo.rankingElo());
            t.Resetear(segundaFase);
            grilla=Torneo.chopped(segundaFase, 3, 3);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 1, terceraFase);
            t.Resetear(terceraFase);
            t.grupo3vuelta(terceraFase, 40, 1, mundial);
            segundaFase.clear();  terceraFase.clear();
        }
        if(elim.contains(Torneo.campeones.get(11))&&Torneo.campeones.get(11).conf.equals("caf")){
            t.Eliminar(caf, Torneo.campeones.get(11).nombre);
            Funciones.pasarEquipos(caf, segundaFase, 4);
            Funciones.Ronda(caf, 40, 12, segundaFase);
            Funciones.Ronda(segundaFase, 40, 8, terceraFase);
            Funciones.Ronda(terceraFase, 40, 4, cuartaFase);
            Funciones.Ronda(cuartaFase, 40, 2, mundial);    
            segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
        }else{
            Funciones.pasarEquipos(caf, segundaFase, 3);
            Funciones.Ronda(caf, 40, 13, segundaFase);
            Funciones.Ronda(segundaFase, 40, 8, terceraFase);
            Funciones.Ronda(terceraFase, 40, 4, cuartaFase);
            Funciones.Ronda(cuartaFase, 40, 2, mundial); 
            segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
        }
        if(elim.contains(Torneo.campeones.get(11))&&Torneo.campeones.get(11).conf.equals("afc")){
            t.Eliminar(afc, Torneo.campeones.get(11).nombre);
            grilla=Torneo.chopped(afc, 8, 7, 8);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            Funciones.Ronda(segundaFase, 40, 4, terceraFase);
            Funciones.Ronda(terceraFase, 40, 2, mundial);
        }else{
            grilla=Torneo.chopped(afc, 8, 3);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            Funciones.Ronda(segundaFase, 40, 4, terceraFase);
            Funciones.Ronda(terceraFase, 40, 2, mundial);
        }
        segundaFase.clear();  terceraFase.clear();
        if(elim.contains(Torneo.campeones.get(11))&&Torneo.campeones.get(11).conf.equals("ofc")){
            t.Eliminar(ofc, Torneo.campeones.get(11).nombre);
            t.grupo3vuelta(ofc, 40, 1, repechajeOfc);
        }else{
            t.grupo4vuelta(ofc, 40, 1, repechajeOfc);
        }
        t.Serie(repechajeOfc.get(0), repechajeOfc.get(1), 40, mundial);
                
        
        
        
        return mundial;
    }
    
}
