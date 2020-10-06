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
public class mundial2002 {
    
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
    
    static void wc2002(){
        mundial2002 m = new mundial2002();
        m.m2002();
    }
    
    public void m2002(){
        
        Torneo.chi.nivel=3; Torneo.per.nivel=4;
        Torneo.ven.nivel=4; Torneo.bul.nivel=3;
        Torneo.svn.nivel=3; Torneo.nir.nivel=4;
        Torneo.sco.nivel=3; Torneo.nor.nivel=3;
        Torneo.aut.nivel=3; Torneo.aze.nivel=4;
        Torneo.pol.nivel=2; Torneo.tur.nivel=2;
        Torneo.ltu.nivel=5; Torneo.grn.nivel=5;
        Torneo.guy.nivel=5; Torneo.dma.nivel=6;
        Torneo.sur.nivel=5; Torneo.lca.nivel=5;
        Torneo.skn.nivel=5; Torneo.pur.nivel=5;
        Torneo.blz.nivel=5; Torneo.usa.nivel=1;
        Torneo.cta.nivel=5; Torneo.lby.nivel=4;
        Torneo.civ.nivel=2; Torneo.mwi.nivel=5;
        Torneo.zam.nivel=3; Torneo.tan.nivel=5;
        Torneo.bot.nivel=6; Torneo.mar.nivel=2;
        Torneo.sen.nivel=2; Torneo.ken.nivel=4;
        Torneo.lbr.nivel=3; Torneo.moz.nivel=5;
        Torneo.mad.nivel=4; Torneo.eth.nivel=4;
        Torneo.tog.nivel=3; Torneo.cgo.nivel=4;
        Torneo.ben.nivel=6; Torneo.cmr.nivel=1;
        Torneo.rwa.nivel=4; Torneo.sle.nivel=4;
        Torneo.nam.nivel=5; Torneo.mas.nivel=4;
        Torneo.irn.nivel=1; Torneo.hkg.nivel=4;
        Torneo.sri.nivel=6; Torneo.vie.nivel=4;
        Torneo.sin.nivel=5; Torneo.tha.nivel=4;
        Torneo.kuw.nivel=3; Torneo.tpe.nivel=6;
        Torneo.uae.nivel=2; Torneo.bhr.nivel=2;
        Torneo.mdv.nivel=5; Torneo.kgz.nivel=5;
        Torneo.ind.nivel=5; Torneo.tkm.nivel=5;
        Torneo.qat.nivel=2; Torneo.fij.nivel=4;
        Torneo.van.nivel=6; Torneo.tah.nivel=5;
        Torneo.cok.nivel=5; Torneo.tah.nivel=5;        
        
        Torneo.selecciones.add(Torneo.tca);
        Torneo.selecciones.add(Torneo.vgb); Torneo.selecciones.add(Torneo.aia);
        Torneo.selecciones.add(Torneo.vir); Torneo.selecciones.add(Torneo.msr);
        Torneo.selecciones.add(Torneo.cha); Torneo.selecciones.add(Torneo.mli);
        Torneo.selecciones.add(Torneo.sey); Torneo.selecciones.add(Torneo.stp);
        Torneo.selecciones.add(Torneo.dji); Torneo.selecciones.add(Torneo.cpv);
        Torneo.selecciones.add(Torneo.eri); Torneo.selecciones.add(Torneo.eqg);
        Torneo.selecciones.add(Torneo.lao); Torneo.selecciones.add(Torneo.gum);
        Torneo.selecciones.add(Torneo.ple); Torneo.selecciones.add(Torneo.mgl);
        Torneo.selecciones.add(Torneo.asa);
        
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        
        t.Eliminar(elim, Torneo.kor.nombre); t.Eliminar(elim, Torneo.jpn.nombre);  
        t.Eliminar(elim, Torneo.bdi.nombre); t.Eliminar(elim, Torneo.nig.nombre);
        t.Eliminar(elim, Torneo.prk.nombre); t.Eliminar(elim, Torneo.png.nombre);
         
        uefa=Torneo.confed("uefa", elim);  
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);
        afc=Torneo.confed("afc", elim);
        ofc=Torneo.confed("ofc", elim);
        
        mundial=m2002elim();
        t.Resetear(mundial);
        mundial.add(Torneo.kor); mundial.add(Torneo.jpn);
        if(elim.contains(Torneo.campeones.get(15))){
            mundial.add(Torneo.campeones.get(15));
        }
        Funciones.ordenarMundial(mundial, Torneo.kor,Torneo.jpn, Torneo.campeones.get(15));
        grilla=Torneo.chopped(mundial, 8, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,2,1)==false)||
         !grupos.get(3).contains(Torneo.kor)||!grupos.get(7).contains(Torneo.jpn)){
                 grupos=t.Mezclar(grilla);     
         }
        mundial32.Mundial32_02(grupos, Torneo.kor.nombre, Torneo.jpn.nombre, 60);
        Grupos.clasificacion(Torneo.jpn.nombre,Torneo.kor.nombre, Torneo.campeones.get(16));
        t.imprimirElo(Torneo.selecciones);
         for(int i=0;i<Torneo.campeones.size();i++)
         System.out.println(Torneo.campeones.get(i).nombre);
        
        
        
        
        
        
    }
    
    
    public ArrayList<Equipos> m2002elim(){
        
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
        
        if(elim.contains(Torneo.campeones.get(15))&&Torneo.campeones.get(15).conf.equals("conmebol")){
            t.Eliminar(conm, Torneo.campeones.get(15).nombre);
            grilla=Torneo.chopped(conm, 1, 9);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 4, mundial);
        }else{
            grilla=Torneo.chopped(conm, 1, 10);
            gruposConm=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConm, 40, 4, mundial);
            repechajeOfc.add(gruposConm.get(0).get(4));
        }
        if(elim.contains(Torneo.campeones.get(15))&&Torneo.campeones.get(15).conf.equals("uefa")){
            t.Eliminar(uefa, Torneo.campeones.get(15).nombre);
            grilla=Funciones.chopped6(uefa, 9, 9, 9, 9, 5, 9);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 1, mundial);
            gruposUefa.stream().forEach((gruposUefa1) -> {
                repechajeUefa.add(gruposUefa1.get(1));
            });
        }else if((elim.contains(Torneo.campeones.get(15))&&Torneo.campeones.get(15).conf.equals("conmebol"))
                ||!elim.contains(Torneo.campeones.get(15))){
            grilla=Funciones.chopped6(uefa, 9, 9, 9, 9, 6, 9);
            gruposUefa=t.Mezclar(grilla);
            Grupos.descPartidos(gruposUefa, 40, 1, 2, 5, repechajeUefa, mundial);
            Funciones.pasarEquiposPts(repechajeUefa, mundial, 1);
            Funciones.Ronda(repechajeUefa, 40, 4, mundial);
        }else{
            grilla=Funciones.chopped6(uefa, 9, 9, 9, 9, 6, 9);
            gruposUefa=t.Mezclar(grilla);
            Funciones.Qualifier(gruposUefa, 40, 1, mundial);
            gruposUefa.stream().forEach((gruposUefa1) -> {
                repechajeUefa.add(gruposUefa1.get(1));
            });
        }
        if(elim.contains(Torneo.campeones.get(15))&&Torneo.campeones.get(15).conf.equals("concacaf")){
            t.Eliminar(conc, Torneo.campeones.get(15).nombre);
            Funciones.pasarEquipos(conc, segundaFase, 8);
            Funciones.Ronda(conc, 40, 13, segundaFase);
            Funciones.pasarEquipos(segundaFase, terceraFase, 3);
            Funciones.Ronda(segundaFase, 40, 9, terceraFase);
            t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
            grilla=Torneo.chopped(terceraFase, 3, 4);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 2, cuartaFase);
            t.Resetear(cuartaFase);
            Grupos.grupo6vuelta(cuartaFase, 40, 3, mundial);
        }else{
            Funciones.pasarEquipos(conc, segundaFase, 7);
            Funciones.Ronda(conc, 40, 14, segundaFase);
            Funciones.pasarEquipos(segundaFase, terceraFase, 3);
            Funciones.Ronda(segundaFase, 40, 9, terceraFase);
            t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
            grilla=Torneo.chopped(terceraFase, 3, 4);
            gruposConc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposConc, 40, 2, cuartaFase);
            t.Resetear(cuartaFase);
            Grupos.grupo6vuelta(cuartaFase, 40, 3, mundial);
        }segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
        if(elim.contains(Torneo.campeones.get(15))&&Torneo.campeones.get(15).conf.equals("caf")){
            t.Eliminar(caf, Torneo.campeones.get(15).nombre);
            Funciones.pasarEquipos(caf, segundaFase, 1);
            Funciones.Ronda(caf, 40, 24, segundaFase);
            t.Resetear(caf); Collections.sort(segundaFase, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 5, 5);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, mundial);
        }else{
            Funciones.Ronda(caf, 40, 25, segundaFase);
            t.Resetear(caf); Collections.sort(segundaFase, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 5, 5);
            gruposCaf=t.Mezclar(grilla);
            Funciones.Qualifier(gruposCaf, 40, 1, mundial);
        }segundaFase.clear();
        if(elim.contains(Torneo.campeones.get(15))&&Torneo.campeones.get(15).conf.equals("afc")){
            t.Eliminar(afc, Torneo.campeones.get(15).nombre);
            grilla=Torneo.chopped(afc, 10, 10, 8, 10);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(segundaFase); Collections.sort(segundaFase, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 2, 5);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, mundial);
            t.Serie(gruposAfc.get(0).get(1), gruposAfc.get(1).get(1), 40, repechajeUefa);
            Funciones.Ronda(repechajeUefa, 40, 5, mundial);
        }else if(!elim.contains(Torneo.campeones.get(15))){
            grilla=Torneo.chopped(afc, 10, 10, 9, 10);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(segundaFase); Collections.sort(segundaFase, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 2, 5);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, mundial);
            t.Serie(gruposAfc.get(0).get(1), gruposAfc.get(1).get(1), 40, mundial);
        }else if(elim.contains(Torneo.campeones.get(15))&&Torneo.campeones.get(15).conf.equals("conmebol")){
            grilla=Torneo.chopped(afc, 10, 10, 9, 10);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(segundaFase); Collections.sort(segundaFase, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 2, 5);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, mundial);
            t.Serie(gruposAfc.get(0).get(1), gruposAfc.get(1).get(1), 40, repechajeOfc);
        }else{
            grilla=Torneo.chopped(afc, 10, 10, 9, 10);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, segundaFase);
            t.Resetear(segundaFase); Collections.sort(segundaFase, Torneo.rankingElo());
            grilla=Torneo.chopped(segundaFase, 2, 5);
            gruposAfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposAfc, 40, 1, mundial);
            t.Serie(gruposAfc.get(0).get(1), gruposAfc.get(1).get(1), 40, repechajeUefa);
            Funciones.Ronda(repechajeUefa, 40, 5, mundial);
        }segundaFase.clear();
        if(elim.contains(Torneo.campeones.get(15))&&Torneo.campeones.get(15).conf.equals("ofc")){
            t.Eliminar(ofc, Torneo.campeones.get(15).nombre);
            grilla=Funciones.chopped5(ofc, 2, 2, 2, 1, 2);
            gruposOfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposOfc, 40, 1, segundaFase);
            t.Serie(segundaFase.get(0), segundaFase.get(1), 40, repechajeOfc);
            t.Serie(repechajeOfc.get(0), repechajeOfc.get(1), 40, mundial);
        }else{
            grilla=Torneo.chopped(ofc, 2, 5);
            gruposOfc=t.Mezclar(grilla);
            Funciones.Qualifier(gruposOfc, 40, 1, segundaFase);
            t.Serie(segundaFase.get(0), segundaFase.get(1), 40, repechajeOfc);
            t.Serie(repechajeOfc.get(0), repechajeOfc.get(1), 40, mundial);
        }segundaFase.clear();
        
        
        
        
        return mundial;
    }
    
}
