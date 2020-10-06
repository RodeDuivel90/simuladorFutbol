
package torneo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class mundial2010 {
    
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
    
    static void wc2010(){
        mundial2010 m = new mundial2010();
        m.m2010();
    }
    
    public void m2010(){
        
        Torneo.aus.conf="afc";
        
        
        Torneo.per.nivel=3;  Torneo.nir.nivel=3;
        Torneo.pol.nivel=3;  Torneo.mda.nivel=5;
        Torneo.tur.nivel=3;  Torneo.lie.nivel=6;
        Torneo.bih.nivel=2;  Torneo.rou.nivel=3;
        Torneo.pur.nivel=5;  Torneo.guy.nivel=4;
        Torneo.lca.nivel=6;  Torneo.skn.nivel=5;
        Torneo.blz.nivel=5;  Torneo.nca.nivel=5;
        Torneo.brb.nivel=6;  Torneo.ber.nivel=4;
        Torneo.tca.nivel=6;  Torneo.vin.nivel=5;
        Torneo.rsa.nivel=3;  Torneo.nig.nivel=5;
        Torneo.sle.nivel=5;  Torneo.bdi.nivel=5;
        Torneo.lbr.nivel=5;  Torneo.zim.nivel=4;
        Torneo.cha.nivel=5;  Torneo.ken.nivel=4;
        Torneo.cmr.nivel=2;  Torneo.uga.nivel=3;
        Torneo.alg.nivel=2;  Torneo.zam.nivel=3;
        Torneo.mri.nivel=6;  Torneo.ben.nivel=3;
        Torneo.tan.nivel=4;  Torneo.egy.nivel=2;
        Torneo.tog.nivel=3;  Torneo.civ.nivel=1;
        Torneo.nam.nivel=4;  Torneo.moz.nivel=3;
        Torneo.mli.nivel=2;  Torneo.cta.nivel=5;
        Torneo.ple.nivel=5;  Torneo.yem.nivel=5;
        Torneo.kgz.nivel=4;  Torneo.ind.nivel=5;
        Torneo.uzb.nivel=3;  Torneo.tha.nivel=4;
        Torneo.ina.nivel=5;  Torneo.syr.nivel=4;
        Torneo.jor.nivel=3;  Torneo.sin.nivel=5;
        Torneo.irn.nivel=2;  Torneo.sam.nivel=5;
        Torneo.fij.nivel=4;  Torneo.nzl.nivel=2;
        Torneo.gha.nivel=1;  Torneo.nor.nivel=3;
        Torneo.hun.nivel=3;
        
        Torneo.selecciones.add(Torneo.com); Torneo.selecciones.add(Torneo.mya);
        Torneo.selecciones.add(Torneo.bhu); Torneo.selecciones.add(Torneo.tle);
        Torneo.selecciones.add(Torneo.mne);
        
        t.Resetear(Torneo.selecciones);
        Collections.sort(Torneo.selecciones, Torneo.rankingElo());
        for(int i=0;i<Torneo.selecciones.size();i++){
         elim.add(Torneo.selecciones.get(i));
        }
        
        t.Eliminar(elim, Torneo.rsa.nombre);  t.Eliminar(elim, Torneo.lao.nombre);
        t.Eliminar(elim, Torneo.bru.nombre);  t.Eliminar(elim, Torneo.phi.nombre);
         
        uefa=Torneo.confed("uefa", elim);  
        conm=Torneo.confed("conmebol", elim);
        conc=Torneo.confed("concacaf", elim);
        caf=Torneo.confed("caf", elim);
        afc=Torneo.confed("afc", elim);
        ofc=Torneo.confed("ofc", elim);
        
        mundial=m2010elim();
        t.Resetear(mundial);
        mundial.add(Torneo.rsa);
        Funciones.ordenarMundial(mundial, Torneo.rsa, Torneo.campeones.get(17));
        grilla=Torneo.chopped(mundial, 8, 4);
        grupos=t.Mezclar(grilla);
        while((t.Validacion(grupos,1,2,1)==false)||
         !grupos.get(0).contains(Torneo.rsa)){
                 grupos=t.Mezclar(grilla);     
         }
        mundial32.Mundial32_06(grupos, Torneo.rsa.nombre, 60);
        Grupos.clasificacion(Torneo.rsa.nombre, Torneo.campeones.get(18));
        t.imprimirElo(Torneo.selecciones);
         for(int i=0;i<Torneo.campeones.size();i++)
         System.out.println(Torneo.campeones.get(i).nombre);
        
        
        
    }
    
    
    
    public ArrayList<Equipos> m2010elim(){
        
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
        ArrayList<Equipos> repechajeInterC = new ArrayList<>();
        ArrayList<Equipos> segundosCaf = new ArrayList<>();
        ArrayList<Equipos> semisOfc = new ArrayList<>();
        ArrayList<Equipos> terceroOfc = new ArrayList<>();
        
        grilla=Torneo.chopped(conm, 1, 10);
        gruposConm=t.Mezclar(grilla);
        Funciones.Qualifier(gruposConm, 40, 4, mundial);
        repechajeInterC.add(gruposConm.get(0).get(4));
        
        grilla=Funciones.chopped6(uefa, 9, 9, 9, 9, 8, 9);
        gruposUefa=t.Mezclar(grilla);
        Grupos.descPartidos(gruposUefa, 40, 1, 2, 5, repechajeUefa, mundial);
        Collections.sort(repechajeUefa);
        t.Eliminar(repechajeUefa, repechajeUefa.get(8).nombre);
        Funciones.Ronda(repechajeUefa, 40, 4, mundial);
        
        Funciones.pasarEquipos(conc, segundaFase, 13);
        Funciones.Ronda(conc, 40, 11, segundaFase);
        Funciones.Ronda(segundaFase, 40, 12, terceraFase);
        t.Resetear(terceraFase);  Collections.sort(terceraFase, Torneo.rankingElo());
        grilla=Torneo.chopped(terceraFase, 3, 4);
        gruposConc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposConc, 40, 2, cuartaFase);
        t.Resetear(cuartaFase);
        Grupos.grupo6vuelta(cuartaFase, 40, 3, mundial);
        repechajeInterC.add(cuartaFase.get(3));
        segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
        
        Funciones.pasarEquipos(caf, segundaFase, 44);
        Funciones.Ronda(caf, 40, 4, segundaFase);
        t.Resetear(segundaFase); Collections.sort(segundaFase, Torneo.rankingElo());
        grilla=Torneo.chopped(segundaFase, 12, 4);
        gruposCaf=t.Mezclar(grilla);
        Grupos.descPartidos(gruposCaf, 40, 1, 2, 5, segundosCaf, terceraFase);
        Funciones.pasarEquiposPts(segundosCaf, terceraFase, 8);
        t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
        grilla=Torneo.chopped(terceraFase, 5, 4);
        gruposCaf=t.Mezclar(grilla);
        Funciones.Qualifier(gruposCaf, 40, 1, mundial);
        segundaFase.clear(); terceraFase.clear();
        
        Funciones.pasarEquipos(afc, terceraFase, 5);
        for(int i=0;i<afc.size();i++){
            afc.get(i).posicion=i;
        }
        Funciones.Ronda(afc, 40, 19, segundaFase);
        Funciones.pasarEquiposPos(segundaFase, terceraFase, 11);
        Funciones.Ronda(segundaFase, 40, 4, terceraFase);
        t.Resetear(terceraFase); Collections.sort(terceraFase, Torneo.rankingElo());
        grilla=Torneo.chopped(terceraFase, 5, 4);
        gruposAfc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposAfc, 40, 2, cuartaFase);
        t.Resetear(cuartaFase); Collections.sort(cuartaFase, Torneo.rankingElo());
        grilla=Torneo.chopped(cuartaFase, 2, 5);
        gruposAfc=t.Mezclar(grilla);
        Funciones.Qualifier(gruposAfc, 40, 2, mundial);
        t.Serie(gruposAfc.get(0).get(2), gruposAfc.get(1).get(2), 40, repechajeInterC);
        segundaFase.clear(); terceraFase.clear(); cuartaFase.clear();
        
        Funciones.pasarEquipos(ofc, segundaFase, 1);
        grilla=Torneo.chopped(ofc, 2, 5);
        gruposOfc=t.Mezclar(grilla);
        Grupos.grupo5neu(gruposOfc.get(0), Torneo.sol.nombre, 40, 2, semisOfc);
        Grupos.grupo5neu(gruposOfc.get(1), Torneo.sol.nombre, 40, 2, semisOfc);
        t.pElimDirecta(semisOfc.get(0), semisOfc.get(3), Torneo.sol.nombre, 40, true, segundaFase);
        t.pElimDirecta(semisOfc.get(1), semisOfc.get(2), Torneo.sol.nombre, 40, true, segundaFase);
        if(segundaFase.contains(semisOfc.get(0))){
            terceroOfc.add(semisOfc.get(3));
        }else{
            terceroOfc.add(semisOfc.get(0));
        }
        if(segundaFase.contains(semisOfc.get(1))){
            terceroOfc.add(semisOfc.get(2));
        }else{
            terceroOfc.add(semisOfc.get(1));
        }
        t.pElimDirecta(terceroOfc.get(0), terceroOfc.get(1), Torneo.sol.nombre, 40, true, segundaFase);
        t.Resetear(segundaFase);
        t.grupo4vuelta(segundaFase, 40, 1, repechajeInterC);
        Random rndm= new Random();
        Collections.shuffle(repechajeInterC, rndm);
        t.Serie(repechajeInterC.get(0), repechajeInterC.get(1), 40, mundial);
        t.Serie(repechajeInterC.get(2), repechajeInterC.get(3), 40, mundial);
       
        
        
        
        
        
        
        return mundial;
    }
}


