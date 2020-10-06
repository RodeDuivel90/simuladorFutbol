
package torneo;

import java.util.ArrayList;
import java.util.Collections;


public class mundial1990 {
    
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
    
    
    static void wc1990(){
        mundial1990 m = new mundial1990();
        m.m1990();
    }
    
    public void m1990(){
        Torneo.fij.conf="ofc";
        Torneo.por.nivel=3; Torneo.cze.nivel=2; 
        Torneo.ned.nivel=1; Torneo.nor.nivel=3;
        Torneo.pol.nivel=3; Torneo.fra.nivel=2;
        Torneo.irl.nivel=2; Torneo.per.nivel=3;
        Torneo.col.nivel=2; Torneo.cub.nivel=5;
        Torneo.slv.nivel=4; Torneo.gui.nivel=6;
        Torneo.hon.nivel=3; Torneo.can.nivel=4;
        Torneo.crc.nivel=3; Torneo.cmr.nivel=1;
        Torneo.gui.nivel=5; Torneo.tog.nivel=4;
        Torneo.bfa.nivel=4; Torneo.sud.nivel=4;
        Torneo.lbr.nivel=3; Torneo.ang.nivel=3;
        Torneo.mwi.nivel=3; Torneo.lby.nivel=3;
        Torneo.gab.nivel=4; Torneo.ken.nivel=3;
        Torneo.tun.nivel=2; Torneo.egy.nivel=2;
        Torneo.cod.nivel=3; Torneo.nga.nivel=2;
        Torneo.jor.nivel=3; Torneo.irq.nivel=2;
        Torneo.nye.nivel=5; Torneo.kuw.nivel=2;
        Torneo.mas.nivel=4; Torneo.sin.nivel=4;
        Torneo.tha.nivel=5; Torneo.irn.nivel=3;
        Torneo.hkg.nivel=4; Torneo.jpn.nivel=2;
        Torneo.fij.nivel=5; Torneo.bol.nivel=4;
        Torneo.selecciones.add(Torneo.omn);
        Torneo.selecciones.add(Torneo.rwa);
        Torneo.selecciones.add(Torneo.pak);
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
      }
        t.Eliminar(elim, Torneo.ita.nombre);   t.Eliminar(elim, Torneo.brb.nombre);
        t.Eliminar(elim, Torneo.ber.nombre);   t.Eliminar(elim, Torneo.grn.nombre);
        t.Eliminar(elim, Torneo.hai.nombre);   t.Eliminar(elim, Torneo.dom.nombre);
        t.Eliminar(elim, Torneo.sur.nombre);   t.Eliminar(elim, Torneo.ben.nombre);
        t.Eliminar(elim, Torneo.cgo.nombre);   t.Eliminar(elim, Torneo.eth.nombre);
        t.Eliminar(elim, Torneo.gam.nombre);   t.Eliminar(elim, Torneo.mad.nombre);
        t.Eliminar(elim, Torneo.mri.nombre);   t.Eliminar(elim, Torneo.mtn.nombre);
        t.Eliminar(elim, Torneo.moz.nombre);   t.Eliminar(elim, Torneo.nig.nombre);
        t.Eliminar(elim, Torneo.cta.nombre);   t.Eliminar(elim, Torneo.sen.nombre);
        t.Eliminar(elim, Torneo.sle.nombre);   t.Eliminar(elim, Torneo.som.nombre);
        t.Eliminar(elim, Torneo.tan.nombre);   t.Eliminar(elim, Torneo.bhr.nombre);  
        t.Eliminar(elim, Torneo.bru.nombre);   t.Eliminar(elim, Torneo.ind.nombre);
        t.Eliminar(elim, Torneo.mac.nombre);   t.Eliminar(elim, Torneo.yem.nombre);
        t.Eliminar(elim, Torneo.vie.nombre);
        uefa=Torneo.confed("uefa", elim);    
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);
        afc=Torneo.confed("afc", elim);
        ofc=Torneo.confed("ofc", elim);
        mundial=m1990elim();
        mundial.add(Torneo.ita);
        if(elim.contains(Torneo.campeones.get(12))&&!Torneo.campeones.get(12).equals(Torneo.ita)){
          mundial.add(Torneo.campeones.get(12));
        }
        t.Resetear(Torneo.selecciones);
        Funciones.ordenarMundial(mundial, Torneo.ita, Torneo.campeones.get(12));
        grilla=Torneo.chopped(mundial, 6, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,3,1)==false)||
        !grupos.get(0).contains(Torneo.ita)){
                grupos=t.Mezclar(grilla);                
        }
        Funciones.mundial_24_86(grupos, Torneo.ita.nombre, 60);
        Grupos.clasificacionRepe(Torneo.ita.nombre, Torneo.campeones.get(13),15,51);
        t.imprimirElo(Torneo.selecciones);
        for(int i=0;i<Torneo.campeones.size();i++)
        System.out.println(Torneo.campeones.get(i).nombre); 
        
    }
    
    public ArrayList<Equipos> m1990elim(){
        
        ArrayList<ArrayList<Equipos>> gruposUefa;
        ArrayList<ArrayList<Equipos>> gruposConm;
        ArrayList<ArrayList<Equipos>> gruposCaf;
        ArrayList<ArrayList<Equipos>> gruposAfc;
        ArrayList<Equipos> segundaFase = new ArrayList<>();
        ArrayList<Equipos> terceraFase = new ArrayList<>();
        ArrayList<Equipos> cuartaFase = new ArrayList<>();
        ArrayList<Equipos> repechaje = new ArrayList<>();
        ArrayList<Equipos> repechajeOfc = new ArrayList<>();
        
        if(elim.contains(Torneo.campeones.get(12))&&Torneo.campeones.get(12).conf.equals("uefa")){
            t.Eliminar(uefa, Torneo.campeones.get(12).nombre);
            grilla=Funciones.chopped6(uefa, 6, 6, 6, 6, 1, 6);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 2, mundial);
        }else{
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
            mundial.add(repechaje.get(0));
            t.Serie(repechaje.get(1), repechaje.get(2), 40, mundial);
        }
        repechaje.clear();
        if(elim.contains(Torneo.campeones.get(12))&&Torneo.campeones.get(12).conf.equals("conmebol")){
            t.Eliminar(conm, Torneo.campeones.get(12).nombre);
            grilla=Torneo.chopped(conm, 3, 3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, repechaje);
            Collections.sort(repechaje);
            mundial.add(repechaje.get(0));
            mundial.add(repechaje.get(1));
            repechajeOfc.add(repechaje.get(2));
        }else if(elim.contains(Torneo.campeones.get(12))&&Torneo.campeones.get(12).conf.equals("ofc")){
            grilla=Torneo.chopped(conm, 3,3,1,3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, repechaje);
            t.Resetear(conm);
            t.grupo3neu(repechaje, "neutral", 40, 2, mundial);
            repechajeOfc.add(repechaje.get(2));
        }else{
            grilla=Torneo.chopped(conm, 3,1,3,3);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 1, mundial);
            repechajeOfc.add(gruposConm.get(0).get(1));
        }repechaje.clear();
        if(elim.contains(Torneo.campeones.get(12))&&Torneo.campeones.get(12).conf.equals("concacaf")){
            t.Eliminar(conc, Torneo.campeones.get(12).nombre);
            Funciones.pasarEquipos(conc, segundaFase, 6);
            Funciones.Ronda(conc, 40, 4, segundaFase);
            Funciones.Ronda(segundaFase, 40, 5, terceraFase);
            t.Resetear(conc);
            Grupos.grupo5vuelta(terceraFase, 40, 1, mundial);
        }else{
            Funciones.pasarEquipos(conc, segundaFase, 5);
            Funciones.Ronda(conc, 40, 5, segundaFase);
            Funciones.Ronda(segundaFase, 40, 5, terceraFase);
            t.Resetear(conc);
            Grupos.grupo5vuelta(terceraFase, 40, 2, mundial);
        }segundaFase.clear(); terceraFase.clear();
        if(elim.contains(Torneo.campeones.get(12))&&Torneo.campeones.get(12).conf.equals("caf")){
            t.Eliminar(caf, Torneo.campeones.get(12).nombre);
            Funciones.pasarEquipos(caf, segundaFase, 9);
            Funciones.Ronda(caf, 40, 7, segundaFase);
            t.Resetear(caf);
            grilla=Torneo.chopped(segundaFase, 4, 4);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, terceraFase);
            Funciones.Ronda(terceraFase, 40, 2, cuartaFase);
            t.Serie(cuartaFase.get(0), cuartaFase.get(1), 40, mundial);
        }else{
            Funciones.pasarEquipos(caf, segundaFase, 8);
            Funciones.Ronda(caf, 40, 8, segundaFase);
            t.Resetear(caf);
            grilla=Torneo.chopped(segundaFase, 4, 4);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, terceraFase);
            Funciones.Ronda(terceraFase, 40, 2, mundial);
        }segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
        if(elim.contains(Torneo.campeones.get(12))&&Torneo.campeones.get(12).conf.equals("afc")){
            t.Eliminar(afc, Torneo.campeones.get(12).nombre);
            grilla=Torneo.chopped(afc, 6, 6, 3, 6);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(afc);
            Grupos.grupo6neu(segundaFase, "neutral", 40, 1, mundial);
        }else{
            grilla=Torneo.chopped(afc, 6, 6, 4, 6);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(afc);
            Grupos.grupo6neu(segundaFase, "neutral", 40, 2, mundial);
        }segundaFase.clear();
        if(elim.contains(Torneo.campeones.get(12))&&Torneo.campeones.get(12).conf.equals("ofc")){
            t.Eliminar(ofc, Torneo.campeones.get(12).nombre);
            Funciones.pasarEquipos(ofc, segundaFase, 2);
            t.Serie(ofc.get(0), ofc.get(1), 40, segundaFase);
            t.Resetear(ofc);
            t.grupo3vuelta(segundaFase, 40, 1, repechajeOfc);
        }else{
            Funciones.pasarEquipos(ofc, segundaFase, 1);
            Funciones.Ronda(ofc, 40, 2, segundaFase);
            t.Resetear(ofc);
            t.grupo3vuelta(segundaFase, 40, 1, repechajeOfc);
        }segundaFase.clear();
        t.Serie(repechajeOfc.get(0), repechajeOfc.get(1), 40, mundial);
        
        return mundial;
    }
    
}
