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
public class mundial32 {
 
    static public void Mundial32_98(ArrayList<ArrayList<Equipos>> array,String local,int catElo){
        
        Torneo t = new Torneo();      
        ArrayList<Equipos> octavos= new ArrayList<>();
        ArrayList<Equipos> cuartos= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();
        Torneo.grupo4neu(array.get(0), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(1), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(2), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(3), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(4), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(5), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(6), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(7), local, catElo, 2, octavos);
        octavos.get(0).posicion=0;
        octavos.get(1).posicion=9;
        octavos.get(2).posicion=8;
        octavos.get(3).posicion=1;
        octavos.get(4).posicion=10;
        octavos.get(5).posicion=3;
        octavos.get(6).posicion=2;
        octavos.get(7).posicion=11;
        octavos.get(8).posicion=4;
        octavos.get(9).posicion=13;
        octavos.get(10).posicion=12;
        octavos.get(11).posicion=5;
        octavos.get(12).posicion=14;
        octavos.get(13).posicion=7;
        octavos.get(14).posicion=6;
        octavos.get(15).posicion=15;
        Collections.sort(octavos, Torneo.Posiciones());
        t.octavosSinSorteo(octavos, local, catElo, true, cuartos);
        t.octavosSinSorteo(cuartos, local, catElo, true, semis);
        t.octavosSinSorteo(semis, local, catElo, true, fin);
        t.octavosSinSorteo(fin, local, catElo, true, Torneo.campeones);
        
    }
    
    
    static public void Mundial32_02(ArrayList<ArrayList<Equipos>> array,String local,String local2,int catElo){
        
        Torneo t = new Torneo();      
        ArrayList<Equipos> octavosJpn= new ArrayList<>();
        ArrayList<Equipos> octavosKor= new ArrayList<>();
        ArrayList<Equipos> cuartosJpn= new ArrayList<>();
        ArrayList<Equipos> cuartosKor= new ArrayList<>();
        ArrayList<Equipos> semisJpn= new ArrayList<>();
        ArrayList<Equipos> semisKor= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();
        Torneo.grupo4neu(array.get(0), local, catElo, 2, octavosJpn);
        Torneo.grupo4neu(array.get(1), local, catElo, 2, octavosKor);
        Torneo.grupo4neu(array.get(2), local, catElo, 2, octavosJpn);
        Torneo.grupo4neu(array.get(3), local, catElo, 2, octavosKor);
        Torneo.grupo4neu(array.get(4), local2, catElo, 2, octavosKor);
        Torneo.grupo4neu(array.get(5), local2, catElo, 2, octavosJpn);
        Torneo.grupo4neu(array.get(6), local2, catElo, 2, octavosKor);
        Torneo.grupo4neu(array.get(7), local2, catElo, 2, octavosJpn);
        octavosJpn.get(0).posicion=0;
        octavosJpn.get(1).posicion=5;
        octavosJpn.get(2).posicion=2;
        octavosJpn.get(3).posicion=7;
        octavosJpn.get(4).posicion=4;
        octavosJpn.get(5).posicion=1;
        octavosJpn.get(6).posicion=6;
        octavosJpn.get(7).posicion=3;
        octavosKor.get(0).posicion=4;
        octavosKor.get(1).posicion=1;
        octavosKor.get(2).posicion=6;
        octavosKor.get(3).posicion=3;
        octavosKor.get(4).posicion=0;
        octavosKor.get(5).posicion=5;
        octavosKor.get(6).posicion=2;
        octavosKor.get(7).posicion=7;
        Collections.sort(octavosJpn, Torneo.Posiciones());
        Collections.sort(octavosKor, Torneo.Posiciones());
        t.octavosSinSorteo(octavosKor, local, catElo, true, cuartosKor);
        t.octavosSinSorteo(octavosJpn, local2, catElo, true, cuartosJpn);
        t.octavosSinSorteo(cuartosKor, local, catElo, true, semisKor);
        t.octavosSinSorteo(cuartosJpn, local2, catElo, true, semisJpn);
        t.octavosSinSorteo(semisKor, local, catElo, true, fin);
        t.octavosSinSorteo(semisJpn, local2, catElo, true, fin);
        t.octavosSinSorteo(fin, local2, catElo, true, Torneo.campeones);
        
        
    }
    
    static public void Mundial32_06(ArrayList<ArrayList<Equipos>> array,String local,int catElo){
        
        Torneo t = new Torneo();      
        ArrayList<Equipos> octavos= new ArrayList<>();
        ArrayList<Equipos> cuartos= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();
        Torneo.grupo4neu(array.get(0), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(1), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(2), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(3), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(4), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(5), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(6), local, catElo, 2, octavos);
        Torneo.grupo4neu(array.get(7), local, catElo, 2, octavos);
        octavos.get(0).posicion=0;
        octavos.get(1).posicion=9;
        octavos.get(2).posicion=8;
        octavos.get(3).posicion=1;
        octavos.get(4).posicion=2;
        octavos.get(5).posicion=11;
        octavos.get(6).posicion=10;
        octavos.get(7).posicion=3;
        octavos.get(8).posicion=4;
        octavos.get(9).posicion=13;
        octavos.get(10).posicion=12;
        octavos.get(11).posicion=5;
        octavos.get(12).posicion=6;
        octavos.get(13).posicion=15;
        octavos.get(14).posicion=14;
        octavos.get(15).posicion=7;
        Collections.sort(octavos, Torneo.Posiciones());
        t.octavosSinSorteo(octavos, local, catElo, true, cuartos);
        t.octavosSinSorteo(cuartos, local, catElo, true, semis);
        t.octavosSinSorteo(semis, local, catElo, true, fin);
        t.octavosSinSorteo(fin, local, catElo, true, Torneo.campeones);
        
    }
    
    static public void copaAmerica(ArrayList<ArrayList<Equipos>> array,String local,int catElo){
        Torneo t = new Torneo();    
        ArrayList<Equipos> terceros= new ArrayList<>();
        ArrayList<Equipos> cuartos= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();
        Torneo.grupo4neu(array.get(0), local, catElo, 2, cuartos);
        Torneo.grupo4neu(array.get(1), local, catElo, 2, cuartos);
        Torneo.grupo4neu(array.get(2), local, catElo, 2, cuartos);
        array.get(0).get(0).posicion=0;
        array.get(0).get(1).posicion=5;
        array.get(1).get(0).posicion=4;
        array.get(1).get(1).posicion=6;
        array.get(2).get(0).posicion=2;
        array.get(2).get(1).posicion=7;
        for(int i=0;i<array.size();i++){
         terceros.add(array.get(i).get(2));
        }
        Collections.sort(terceros);
        cuartos.add(terceros.get(0)); cuartos.add(terceros.get(1));
        if(!cuartos.contains(array.get(0).get(2))){
            array.get(1).get(2).posicion=3;
            array.get(2).get(2).posicion=1;
        }else if(!cuartos.contains(array.get(1).get(2))){
            array.get(0).get(2).posicion=3;
            array.get(2).get(2).posicion=1;
        }else{
            array.get(0).get(2).posicion=3;
            array.get(1).get(2).posicion=1;
        }
        Collections.sort(cuartos, Torneo.Posiciones());
        t.octavosSinSorteo(cuartos, local, catElo, true, semis);
        t.octavosSinSorteo(semis, local, catElo, true, fin);
        t.octavosSinSorteo(fin, local, catElo, true, Torneo.americaCampeones);
    }
    
    
}
