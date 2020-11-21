/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Miguel
 */
public class Grupos {
    
    
   static public void grupo6neu(ArrayList<Equipos> grupo,String local,int catElo,int clasificados,ArrayList<Equipos> siguiente){
        
        Torneo t = new Torneo();
        t.partido(grupo.get(0), grupo.get(1), local,catElo, false, false);
        t.partido(grupo.get(2), grupo.get(3), local,catElo, false, false);
        t.partido(grupo.get(4), grupo.get(5), local,catElo, false, false);
        t.partido(grupo.get(5), grupo.get(0), local,catElo, false, false);
        t.partido(grupo.get(1), grupo.get(2), local,catElo, false, false);
        t.partido(grupo.get(3), grupo.get(4), local,catElo, false, false);
        t.partido(grupo.get(0), grupo.get(2), local,catElo, false, false);
        t.partido(grupo.get(4), grupo.get(1), local,catElo, false, false);
        t.partido(grupo.get(3), grupo.get(5), local,catElo, false, false);
        t.partido(grupo.get(5), grupo.get(2), local,catElo, false, false);
        t.partido(grupo.get(1), grupo.get(3), local,catElo, false, false);
        t.partido(grupo.get(4), grupo.get(0), local,catElo, false, false);
        t.partido(grupo.get(0), grupo.get(3), local,catElo, false, false);
        t.partido(grupo.get(2), grupo.get(4), local,catElo, false, false);
        t.partido(grupo.get(1), grupo.get(5), local,catElo, false, false);
        Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
        }
        System.out.println("");
        for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
        } 
        
    }
   
   
   static public void grupo5neu(ArrayList<Equipos> grupo,String local,int catElo,int clasificados,ArrayList<Equipos> siguiente){
        
        Torneo t = new Torneo();
        
       t.partido(grupo.get(0), grupo.get(1), grupo.get(0).nombre,catElo, false, false);
       t.partido(grupo.get(2), grupo.get(3), grupo.get(2).nombre,catElo, false, false);
       t.partido(grupo.get(1), grupo.get(2), grupo.get(1).nombre,catElo, false, false);
       t.partido(grupo.get(3), grupo.get(4), grupo.get(3).nombre,catElo, false, false);
       t.partido(grupo.get(0), grupo.get(2), grupo.get(0).nombre,catElo, false, false);
       t.partido(grupo.get(4), grupo.get(1), grupo.get(4).nombre,catElo, false, false);
       t.partido(grupo.get(1), grupo.get(3), grupo.get(1).nombre,catElo, false, false);
       t.partido(grupo.get(4), grupo.get(0), grupo.get(4).nombre,catElo, false, false);
       t.partido(grupo.get(0), grupo.get(3), grupo.get(0).nombre,catElo, false, false);
       t.partido(grupo.get(2), grupo.get(4), grupo.get(2).nombre,catElo, false, false);
        
        
        Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
        }
        System.out.println("");
        for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
        } 
        
    }
   
   
   
   
   
   
   static public ArrayList<Partidos> grupo5vuelta(ArrayList<Equipos> grupo,int catElo,int clasificados,ArrayList<Equipos> siguiente){
       ArrayList<Partidos> p = new ArrayList<> ();
       Torneo t = new Torneo();
       p.add(t.partido(grupo.get(0), grupo.get(1), grupo.get(0).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(2), grupo.get(3), grupo.get(2).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(1), grupo.get(2), grupo.get(1).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(3), grupo.get(4), grupo.get(3).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(0), grupo.get(2), grupo.get(0).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(4), grupo.get(1), grupo.get(4).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(1), grupo.get(3), grupo.get(1).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(4), grupo.get(0), grupo.get(4).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(0), grupo.get(3), grupo.get(0).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(2), grupo.get(4), grupo.get(2).nombre,catElo, false, false));
       
       p.add(t.partido(grupo.get(1), grupo.get(0), grupo.get(1).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(3), grupo.get(2), grupo.get(3).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(2), grupo.get(1), grupo.get(2).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(4), grupo.get(3), grupo.get(4).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(2), grupo.get(0), grupo.get(2).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(1), grupo.get(4), grupo.get(1).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(3), grupo.get(1), grupo.get(3).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(0), grupo.get(4), grupo.get(0).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(3), grupo.get(0), grupo.get(3).nombre,catElo, false, false));
       p.add(t.partido(grupo.get(4), grupo.get(2), grupo.get(4).nombre,catElo, false, false));
       
       Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
        }
        System.out.println("");
        for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
        }
        
       return p;
   }
      
   
   
   static public ArrayList<Partidos> grupo6vuelta(ArrayList<Equipos> grupo,int catElo,int clasificados,ArrayList<Equipos> siguiente){
       
        ArrayList<Partidos> p = new ArrayList<> ();
        Torneo t = new Torneo();
        p.add(t.partido(grupo.get(0), grupo.get(1), grupo.get(0).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(2), grupo.get(3), grupo.get(2).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(4), grupo.get(5), grupo.get(4).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(5), grupo.get(0), grupo.get(5).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(1), grupo.get(2), grupo.get(1).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(3), grupo.get(4), grupo.get(3).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(0), grupo.get(2), grupo.get(0).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(4), grupo.get(1), grupo.get(4).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(3), grupo.get(5), grupo.get(3).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(5), grupo.get(2), grupo.get(5).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(1), grupo.get(3), grupo.get(1).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(4), grupo.get(0), grupo.get(4).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(0), grupo.get(3), grupo.get(0).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(2), grupo.get(4), grupo.get(2).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(1), grupo.get(5), grupo.get(1).nombre,catElo, false, false));
        
        p.add(t.partido(grupo.get(1), grupo.get(0), grupo.get(1).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(3), grupo.get(2), grupo.get(3).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(5), grupo.get(4), grupo.get(5).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(0), grupo.get(5), grupo.get(0).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(2), grupo.get(1), grupo.get(2).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(4), grupo.get(3), grupo.get(4).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(2), grupo.get(0), grupo.get(2).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(1), grupo.get(4), grupo.get(1).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(5), grupo.get(3), grupo.get(5).nombre,catElo, false, false));
        p.add( t.partido(grupo.get(2), grupo.get(5), grupo.get(2).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(3), grupo.get(1), grupo.get(3).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(0), grupo.get(4), grupo.get(0).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(3), grupo.get(0), grupo.get(3).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(4), grupo.get(2), grupo.get(4).nombre,catElo, false, false));
        p.add(t.partido(grupo.get(5), grupo.get(1), grupo.get(5).nombre,catElo, false, false));
        
        
        
        
        Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
        }
        System.out.println("");
        for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
        } 
       
       return p;
   }
    
   static void descPartidos(ArrayList<ArrayList<Equipos>> grupos,int catElo,int clasificados,int posicion, int equiposElim, ArrayList<Equipos> repechaje, ArrayList<Equipos> siguiente){
       
       ArrayList<Partidos> array = new  ArrayList<> ();
       Torneo t = new Torneo();
       posicion=posicion-1;
       for(int i=0;i<grupos.size();i++){
           if(grupos.get(i).size()==4){
               array=t.grupo4vuelta(grupos.get(i), catElo, clasificados, siguiente);
               depurarArray(grupos.get(i),array,equiposElim,repechaje);
               repechaje.add(grupos.get(i).get(posicion));
           }else if(grupos.get(i).size()==5){
               array=grupo5vuelta(grupos.get(i), catElo, clasificados, siguiente);
               depurarArray(grupos.get(i),array,equiposElim,repechaje);
               repechaje.add(grupos.get(i).get(posicion));
           }else if(grupos.get(i).size()==6){
               array=grupo6vuelta(grupos.get(i), catElo, clasificados, siguiente);
               depurarArray(grupos.get(i),array,equiposElim,repechaje);
               repechaje.add(grupos.get(i).get(posicion));
           }else if(grupos.get(i).size()==7){
               array=grupo7vuelta(grupos.get(i), catElo, clasificados, siguiente);
               depurarArray(grupos.get(i),array,equiposElim,repechaje);
               repechaje.add(grupos.get(i).get(posicion));
           }
           
       }
       Collections.sort(repechaje);
      
   }
   
  static public void depurarArray(ArrayList<Equipos> grupo,ArrayList<Partidos> fixture,int posicionAEliminar,ArrayList<Equipos> repechaje){
       Torneo t = new Torneo();
       t.Resetear(grupo);
       int indice=(posicionAEliminar-1);
       for(int i=indice;i<grupo.size();i++){
           final Equipos eliminar= grupo.get(i);
           fixture.removeIf( n -> (n.equipo1.equals(eliminar))||(n.equipo2.equals(eliminar)));
           }
       
      
       for(int i=0;i<fixture.size();i++){
           
           fixture.get(i).equipo1.gf+=fixture.get(i).golesA;
           fixture.get(i).equipo2.gf+=fixture.get(i).golesB;
           fixture.get(i).equipo1.gc+=fixture.get(i).golesB;
           fixture.get(i).equipo2.gc+=fixture.get(i).golesA;
           
           if(fixture.get(i).golesA>fixture.get(i).golesB){
               fixture.get(i).equipo1.pts+=3;
           }
           else if(fixture.get(i).golesA<fixture.get(i).golesB){
               fixture.get(i).equipo2.pts+=3;
           }else{
               fixture.get(i).equipo1.pts+=1;
               fixture.get(i).equipo2.pts+=1;
           }
       }
      
       
   }
  
  
  static void grupo10vuelta(ArrayList<Equipos> grupo,int catElo,int clasificados,ArrayList<Equipos> siguiente){
      
      Torneo t = new Torneo();
      t.partido(grupo.get(0), grupo.get(1), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(3), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(5), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(7), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(9), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(9), grupo.get(0), grupo.get(9).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(2), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(4), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(6), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(8), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(2), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(1), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(3), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(5), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(9), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(9), grupo.get(2), grupo.get(9).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(6), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(8), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(7), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(0), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(6), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(4), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(1), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(3), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(9), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(9), grupo.get(4), grupo.get(9).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(7), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(5), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(0), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(2), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(7), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(8), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(6), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(1), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(9), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(9), grupo.get(6), grupo.get(9).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(3), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(0), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(2), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(4), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(3), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(5), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(7), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(8), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(9), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(0), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(2), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(4), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(6), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(9), grupo.get(8), grupo.get(9).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(9), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(1), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(3), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(5), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(7), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(0), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(4), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(6), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(8), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(9), grupo.get(7), grupo.get(9).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(9), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(1), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(3), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(5), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(4), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(0), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(2), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(8), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(7), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(9), grupo.get(5), grupo.get(9).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(9), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(1), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(3), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(8), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(6), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(0), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(2), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(4), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(5), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(9), grupo.get(3), grupo.get(9).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(9), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(1), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(5), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(7), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(8), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(0), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(2), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(4), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(6), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(9), grupo.get(1), grupo.get(9).nombre,catElo, false, false);
      
      Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
        }
        System.out.println("");
        for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
        }    
  }
  
  static void grupo9vuelta(ArrayList<Equipos> grupo,int catElo,int clasificados,ArrayList<Equipos> siguiente){
      
      Torneo t = new Torneo();
      t.partido(grupo.get(0), grupo.get(1), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(3), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(5), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(7), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(2), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(4), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(6), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(8), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(2), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(1), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(3), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(5), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(6), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(8), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(7), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(0), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(6), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(4), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(1), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(3), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(7), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(5), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(0), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(2), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(7), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(8), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(6), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(1), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(3), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(0), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(2), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(4), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(3), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(5), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(7), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(8), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(0), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(2), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(4), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(6), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(1), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(3), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(5), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(7), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(0), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(4), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(6), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(8), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(1), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(3), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(5), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(4), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(0), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(2), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(8), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(7), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(1), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(3), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(8), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(6), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(0), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(2), grupo.get(8).nombre,catElo, false, false);
      t.partido(grupo.get(6), grupo.get(4), grupo.get(6).nombre,catElo, false, false);
      t.partido(grupo.get(1), grupo.get(5), grupo.get(1).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(1), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(0), grupo.get(5), grupo.get(0).nombre,catElo, false, false);
      t.partido(grupo.get(2), grupo.get(7), grupo.get(2).nombre,catElo, false, false);
      t.partido(grupo.get(4), grupo.get(8), grupo.get(4).nombre,catElo, false, false);
      t.partido(grupo.get(3), grupo.get(0), grupo.get(3).nombre,catElo, false, false);
      t.partido(grupo.get(5), grupo.get(2), grupo.get(5).nombre,catElo, false, false);
      t.partido(grupo.get(7), grupo.get(4), grupo.get(7).nombre,catElo, false, false);
      t.partido(grupo.get(8), grupo.get(6), grupo.get(8).nombre,catElo, false, false);
      
      Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
        }
       System.out.println("");
       for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
        }  
      
  }
 
  static ArrayList<Partidos> grupo7vuelta(ArrayList<Equipos> grupo,int catElo,int clasificados,ArrayList<Equipos> siguiente){
      
      
      ArrayList<Partidos> p = new ArrayList<> ();
      Torneo t = new Torneo();
      p.add(t.partido(grupo.get(0), grupo.get(1), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(2), grupo.get(3), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(5), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(2), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(4), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(6), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(0), grupo.get(2), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(1), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(3), grupo.get(6).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(6), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(5), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(0), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(0), grupo.get(6), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(2), grupo.get(4), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(1), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(3), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(0), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(2), grupo.get(6).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(0), grupo.get(3), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(2), grupo.get(5), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(6), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(0), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(2), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(4), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(2), grupo.get(1), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(3), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(5), grupo.get(6).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(2), grupo.get(0), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(4), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(6), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(1), grupo.get(6).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(3), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(0), grupo.get(4), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(0), grupo.get(6).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(2), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(5), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(1), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(0), grupo.get(5), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(2), grupo.get(6), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(0), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(2), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(4), grupo.get(6).nombre,catElo, false, false));
      
      Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
        }
       System.out.println("");
       for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
        } 
      
       
       return p;
  }
  
  
  static ArrayList<Partidos> grupo8vuelta(ArrayList<Equipos> grupo,int catElo,int clasificados,ArrayList<Equipos> siguiente){
      
      
      ArrayList<Partidos> p = new ArrayList<> ();
      Torneo t = new Torneo();
      p.add(t.partido(grupo.get(0), grupo.get(1), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(2), grupo.get(3), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(5), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(7), grupo.get(6).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(7), grupo.get(0), grupo.get(7).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(2), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(4), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(6), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(0), grupo.get(2), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(1), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(3), grupo.get(6).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(7), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(7), grupo.get(2), grupo.get(7).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(6), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(5), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(0), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(0), grupo.get(6), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(2), grupo.get(4), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(1), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(7), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(7), grupo.get(4), grupo.get(7).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(3), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(0), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(2), grupo.get(6).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(0), grupo.get(3), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(2), grupo.get(5), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(6), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(7), grupo.get(1).nombre,catElo, false, false));
      
      
      p.add(t.partido(grupo.get(1), grupo.get(0), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(2), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(4), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(7), grupo.get(6), grupo.get(7).nombre,catElo, false, false));
      
      p.add(t.partido(grupo.get(0), grupo.get(7), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(2), grupo.get(1), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(3), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(5), grupo.get(6).nombre,catElo, false, false));
      
      p.add(t.partido(grupo.get(2), grupo.get(0), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(4), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(6), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(7), grupo.get(5), grupo.get(7).nombre,catElo, false, false));
      
      p.add(t.partido(grupo.get(2), grupo.get(7), grupo.get(2).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(1), grupo.get(6).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(3), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(0), grupo.get(4), grupo.get(0).nombre,catElo, false, false));
      
      p.add(t.partido(grupo.get(6), grupo.get(0), grupo.get(6).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(4), grupo.get(2), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(1), grupo.get(5), grupo.get(1).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(7), grupo.get(3), grupo.get(7).nombre,catElo, false, false));
      
      p.add(t.partido(grupo.get(4), grupo.get(7), grupo.get(4).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(3), grupo.get(1), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(0), grupo.get(5), grupo.get(0).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(2), grupo.get(6), grupo.get(2).nombre,catElo, false, false));
      
      p.add(t.partido(grupo.get(3), grupo.get(0), grupo.get(3).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(5), grupo.get(2), grupo.get(5).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(6), grupo.get(4), grupo.get(6).nombre,catElo, false, false));
      p.add(t.partido(grupo.get(7), grupo.get(1), grupo.get(7).nombre,catElo, false, false));
      
      
      Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++){
           System.out.println(i+1+". "+grupo.get(i).nombre+" "+grupo.get(i).pts+" "+grupo.get(i).gf+" "
                   +grupo.get(i).gc+" "+(grupo.get(i).gf-grupo.get(i).gc));
        }
       System.out.println("");
       for(int i=0;i<clasificados;i++){
           siguiente.add(grupo.get(i));
        } 
      
       
       return p;
  }
  
  
  static ArrayList<Partidos> partidosEquipo(ArrayList<Partidos> lista,Equipos a){
      
      ArrayList<Partidos> fixture = new ArrayList<>();
      
      for(int i=0; i<lista.size();i++){
          if(lista.get(i).equipo1.equals(a)){
              fixture.add(lista.get(i));
          }else if(lista.get(i).equipo2.equals(a)){
              fixture.add(lista.get(i));
          }
      }
      return fixture;
  }
  
  static void resultadosEquipo(Equipos a){
      
      
      
      int pg,pe,pp,gf,gc;
      pg=0; pe=0; pp=0; gf=0; gc=0;
      ArrayList<Partidos> fixture = new ArrayList<>();
      fixture=partidosEquipo(Torneo.todosPartidos, a);
      
      for(int i=0;i<fixture.size();i++){
          if(fixture.get(i).equipo1.equals(a)){
              if(fixture.get(i).golesA>fixture.get(i).golesB){
                  pg+=1;
              }else if(fixture.get(i).golesA==fixture.get(i).golesB){
                  pe+=1;
              }else{
                  pp+=1;
              }
              gf+=fixture.get(i).golesA;
              gc+=fixture.get(i).golesB;
          }else{
              if(fixture.get(i).golesA<fixture.get(i).golesB){
                  pg+=1;
              }else if(fixture.get(i).golesA==fixture.get(i).golesB){
                  pe+=1;
              }else{
                  pp+=1;
              }
              gf+=fixture.get(i).golesB;
              gc+=fixture.get(i).golesA;
          }
      }
      
      a.pts=pg*3+pe;
      a.gf=gf;
      a.gc=gc;
      
      System.out.println(a.nombre+" PG:"+pg+" PE:"+pe+" PP:"+pp+" GF:"+gf+" GC:"+gc);
      
  }
  
  static void tablaGlobal(ArrayList<Equipos> lista){
      
      for(int i=0; i<lista.size();i++){
          resultadosEquipo(lista.get(i));
      }
      Collections.sort(lista);
      
      for(int i=0;i<lista.size();i++){
          System.out.println(i+1+" "+lista.get(i).nombre+" "+lista.get(i).pts+" "+lista.get(i).gf+
                  " "+lista.get(i).gc);
      }
      
  }
  
  static void tablaMundial(ArrayList<Partidos> lista){
      
      ArrayList<Equipos> equiposMundial = new ArrayList<>();
      Torneo t = new Torneo();
      t.Resetear(Torneo.selecciones);
      for(int i=0;i<lista.size();i++){
          if(lista.get(i).catElo==60){
              
              
              if(!equiposMundial.contains(lista.get(i).equipo1)){
                  equiposMundial.add(lista.get(i).equipo1);
              }
              if(!equiposMundial.contains(lista.get(i).equipo2)){
                  equiposMundial.add(lista.get(i).equipo2);
              }
              lista.get(i).equipo1.gf+=lista.get(i).golesA;
              lista.get(i).equipo1.gc+=lista.get(i).golesB;
              lista.get(i).equipo2.gf+=lista.get(i).golesB;
              lista.get(i).equipo2.gc+=lista.get(i).golesA;
              if(lista.get(i).golesA>lista.get(i).golesB){
                  lista.get(i).equipo1.pts+=3;
              }else if(lista.get(i).golesB>lista.get(i).golesA){
                  lista.get(i).equipo2.pts+=3;
              }else{
                  lista.get(i).equipo1.pts+=1;
                  lista.get(i).equipo2.pts+=1;
              }
          }
        }
        
        
      
        Collections.sort(equiposMundial);
        for(int i=0;i<equiposMundial.size();i++){
           
           int cantPartidos=0;
           for(int j=0; j<lista.size();j++){
               if((equiposMundial.get(i).equals(lista.get(j).equipo1)||equiposMundial.get(i).equals(lista.get(j).equipo2))
                       &&lista.get(j).catElo==60){
                   cantPartidos+=1;
               }
           }
           System.out.println(i+1+". "+equiposMundial.get(i).nombre+" "+equiposMundial.get(i).pts+" "+cantPartidos+" "+equiposMundial.get(i).gf+" "
                   +equiposMundial.get(i).gc+" "+(equiposMundial.get(i).gf-equiposMundial.get(i).gc));
        }
      
  }
  
  static void clasificacion(String local, Equipos campeon){
      
      Torneo t = new Torneo();
      t.Resetear(Torneo.selecciones);
      ArrayList<Partidos> partidos = new ArrayList<>();
      for(int i=0; i<Torneo.todosPartidos.size(); i++){
          if(Torneo.todosPartidos.get(i).local == local && Torneo.todosPartidos.get(i).catElo == 60){
              partidos.add(Torneo.todosPartidos.get(i));
          }
      }
      
      ArrayList<Equipos> equiposMundial = new ArrayList<>();
      for(int i=0; i<partidos.size(); i++){
          if(!equiposMundial.contains(partidos.get(i).equipo1)){
              equiposMundial.add(partidos.get(i).equipo1);
          }
          if(!equiposMundial.contains(partidos.get(i).equipo2)){
              equiposMundial.add(partidos.get(i).equipo2);
          }
          partidos.get(i).equipo1.gf+=partidos.get(i).golesA;
          partidos.get(i).equipo1.gc+=partidos.get(i).golesB;
          partidos.get(i).equipo2.gf+=partidos.get(i).golesB;
          partidos.get(i).equipo2.gc+=partidos.get(i).golesA;
          partidos.get(i).equipo1.posicion+=1;
          partidos.get(i).equipo2.posicion+=1;
          if(partidos.get(i).golesA>partidos.get(i).golesB){
              partidos.get(i).equipo1.pts+=3;
          }else if(partidos.get(i).golesB>partidos.get(i).golesA){
              partidos.get(i).equipo2.pts+=3;
          }else{
              partidos.get(i).equipo1.pts+=1;
              partidos.get(i).equipo2.pts+=1;
          }
      }
      campeon.posicion += 1;
      Collections.sort(equiposMundial, rankingMundial());
      for(int i=0; i<equiposMundial.size(); i++){
          System.out.println(i+1+". "+equiposMundial.get(i).nombre);
      }
      
      Torneo.tablaClasif.add(equiposMundial);
      
  }
  
  static void clasificacion(String local, String local2, Equipos campeon){
      
      Torneo t = new Torneo();
      t.Resetear(Torneo.selecciones);
      ArrayList<Partidos> partidos = new ArrayList<>();
      for(int i=0; i<Torneo.todosPartidos.size(); i++){
          if((Torneo.todosPartidos.get(i).local == local||Torneo.todosPartidos.get(i).local == local2)
                  && Torneo.todosPartidos.get(i).catElo == 60){
              partidos.add(Torneo.todosPartidos.get(i));
          }
      }
      
      ArrayList<Equipos> equiposMundial = new ArrayList<>();
      for(int i=0; i<partidos.size(); i++){
          if(!equiposMundial.contains(partidos.get(i).equipo1)){
              equiposMundial.add(partidos.get(i).equipo1);
          }
          if(!equiposMundial.contains(partidos.get(i).equipo2)){
              equiposMundial.add(partidos.get(i).equipo2);
          }
          partidos.get(i).equipo1.gf+=partidos.get(i).golesA;
          partidos.get(i).equipo1.gc+=partidos.get(i).golesB;
          partidos.get(i).equipo2.gf+=partidos.get(i).golesB;
          partidos.get(i).equipo2.gc+=partidos.get(i).golesA;
          partidos.get(i).equipo1.posicion+=1;
          partidos.get(i).equipo2.posicion+=1;
          if(partidos.get(i).golesA>partidos.get(i).golesB){
              partidos.get(i).equipo1.pts+=3;
          }else if(partidos.get(i).golesB>partidos.get(i).golesA){
              partidos.get(i).equipo2.pts+=3;
          }else{
              partidos.get(i).equipo1.pts+=1;
              partidos.get(i).equipo2.pts+=1;
          }
      }
      campeon.posicion += 1;
      Collections.sort(equiposMundial, rankingMundial());
      for(int i=0; i<equiposMundial.size(); i++){
          System.out.println(i+1+". "+equiposMundial.get(i).nombre);
      }
      
      Torneo.tablaClasif.add(equiposMundial);
      
  }
  
  
  static void clasificacion(String local, Equipos campeon, int segundaRonda){
      
      Torneo t = new Torneo();
      t.Resetear(Torneo.selecciones);
      ArrayList<Partidos> partidos = new ArrayList<>();
      for(int i=0; i<Torneo.todosPartidos.size(); i++){
          if(Torneo.todosPartidos.get(i).local == local && Torneo.todosPartidos.get(i).catElo == 60){
              partidos.add(Torneo.todosPartidos.get(i));
          }
      }
      
      
      ArrayList<Equipos> equiposMundial = new ArrayList<>();
      for(int i=0; i<partidos.size(); i++){
          if(!equiposMundial.contains(partidos.get(i).equipo1)){
              equiposMundial.add(partidos.get(i).equipo1);
          }
          if(!equiposMundial.contains(partidos.get(i).equipo2)){
              equiposMundial.add(partidos.get(i).equipo2);
          }
          partidos.get(i).equipo1.gf+=partidos.get(i).golesA;
          partidos.get(i).equipo1.gc+=partidos.get(i).golesB;
          partidos.get(i).equipo2.gf+=partidos.get(i).golesB;
          partidos.get(i).equipo2.gc+=partidos.get(i).golesA;
          
          if(partidos.get(i).golesA>partidos.get(i).golesB){
              partidos.get(i).equipo1.pts+=3;
          }else if(partidos.get(i).golesB>partidos.get(i).golesA){
              partidos.get(i).equipo2.pts+=3;
          }else{
              partidos.get(i).equipo1.pts+=1;
              partidos.get(i).equipo2.pts+=1;
          }
      }
      
      ArrayList<Equipos> equiposSegundaRonda = new ArrayList<>();
      for (int i=segundaRonda; i<partidos.size(); i++){
          if(!equiposSegundaRonda.contains(partidos.get(i).equipo1)){
              equiposSegundaRonda.add(partidos.get(i).equipo1);
          }
          if(!equiposSegundaRonda.contains(partidos.get(i).equipo2)){
              equiposSegundaRonda.add(partidos.get(i).equipo2);
          }
          partidos.get(i).equipo1.posicion+=1;
          partidos.get(i).equipo2.posicion+=1;
      }
      
      campeon.posicion += 1;
      Collections.sort(equiposMundial, rankingMundial());
      for(int i=0; i<equiposMundial.size(); i++){
          System.out.println(i+1+". "+equiposMundial.get(i).nombre+" "+equiposMundial.get(i).posicion);
      }
      
      Torneo.tablaClasif.add(equiposMundial);
      
  }
  
  static void clasificacionRepe(String local, Equipos campeon, int primerPart, int partidosCant){
      
      Torneo t = new Torneo();
      t.Resetear(Torneo.selecciones);
      ArrayList<Partidos> partidos = new ArrayList<>();
      for(int i=0; i<Torneo.todosPartidos.size(); i++){
          if(Torneo.todosPartidos.get(i).local == local && Torneo.todosPartidos.get(i).catElo == 60){
              partidos.add(Torneo.todosPartidos.get(i));
          }
      }
      
      ArrayList<Equipos> equiposMundial = new ArrayList<>();
      for(int i=primerPart; i<primerPart+partidosCant; i++){
          if(!equiposMundial.contains(partidos.get(i).equipo1)){
              equiposMundial.add(partidos.get(i).equipo1);
          }
          if(!equiposMundial.contains(partidos.get(i).equipo2)){
              equiposMundial.add(partidos.get(i).equipo2);
          }
          partidos.get(i).equipo1.gf+=partidos.get(i).golesA;
          partidos.get(i).equipo1.gc+=partidos.get(i).golesB;
          partidos.get(i).equipo2.gf+=partidos.get(i).golesB;
          partidos.get(i).equipo2.gc+=partidos.get(i).golesA;
          partidos.get(i).equipo1.posicion+=1;
          partidos.get(i).equipo2.posicion+=1;
          if(partidos.get(i).golesA>partidos.get(i).golesB){
              partidos.get(i).equipo1.pts+=3;
          }else if(partidos.get(i).golesB>partidos.get(i).golesA){
              partidos.get(i).equipo2.pts+=3;
          }else{
              partidos.get(i).equipo1.pts+=1;
              partidos.get(i).equipo2.pts+=1;
          }
      }
      campeon.posicion += 1;
      Collections.sort(equiposMundial, rankingMundial());
      for(int i=0; i<equiposMundial.size(); i++){
          System.out.println(i+1+". "+equiposMundial.get(i).nombre);
      }
      
      Torneo.tablaClasif.add(equiposMundial);
      
  }
  
  
  public static Comparator<Equipos> rankingMundial(){
       Comparator comp = new Comparator<Equipos>(){
       @Override
     public int compare(Equipos s1, Equipos s2)
     {
         if(s2.posicion != s1.posicion){
             return Double.compare(s2.posicion, s1.posicion);
         }else if(s2.pts != s1.pts){
             return Integer.compare(s2.pts, s1.pts);
         }else if((s2.gf-s2.gc)!=(s1.gf-s1.gc)){
             return Integer.compare((s2.gf-s2.gc), (s1.gf-s1.gc));
         }else{
             return Integer.compare(s2.gf, s1.gf);
         }
     }  
        };
         return comp;
    } 
  
  
  public static void Tablas(ArrayList<ArrayList<Equipos>> tablas){
      
      ArrayList<Equipos> mundialistas = new ArrayList<>();
      for(int i=0; i<tablas.size(); i++){
          for(int j=0; j<tablas.get(i).size(); j++){
              if(!mundialistas.contains(tablas.get(i).get(j))){
                  mundialistas.add(tablas.get(i).get(j));
              }
          }
      }
      for(int i=0; i<mundialistas.size(); i++){
          System.out.println("");
          System.out.println(mundialistas.get(i).nombre);
          for(int j=0; j<tablas.size(); j++){
              
              if(tablas.get(j).contains(mundialistas.get(i))){
                  int pos = tablas.get(j).indexOf(mundialistas.get(i))+1;
                  System.out.println(Torneo.anyos[j]+" "+pos+"°");
              }else{
                  System.out.println(Torneo.anyos[j]+" -");
              }
              
          }
          
      }
      
  }
  
  
  
  
  
}
