/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author Miguel
 */
public class Funciones {
    
    
   static public void Mundial_16(ArrayList<ArrayList<Equipos>> array,String local,int catElo){
        Torneo t = new Torneo();        
        ArrayList<Equipos> cuartos= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();        
        t.grupo4neu(array.get(0), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(1), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(2), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(3), local, catElo, 2, cuartos);
        cuartos.get(0).posicion=1;
        cuartos.get(1).posicion=5;
        cuartos.get(2).posicion=6;
        cuartos.get(3).posicion=2;
        cuartos.get(4).posicion=3;
        cuartos.get(5).posicion=7;
        cuartos.get(6).posicion=8;
        cuartos.get(7).posicion=4;
        Collections.sort(cuartos,Torneo.Posiciones());
        t.octavosSinSorteo(cuartos, local, catElo, false, semis);
        t.octavosSinSorteo(semis, local, catElo, false, fin);
        t.octavosSinSorteo(fin, local, catElo, false, Torneo.campeones);    
    }
   
   static public void Euro_16(ArrayList<ArrayList<Equipos>> array,String local,int catElo){
        Torneo t = new Torneo();        
        ArrayList<Equipos> cuartos= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();        
        t.grupo4neu(array.get(0), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(1), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(2), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(3), local, catElo, 2, cuartos);
        cuartos.get(0).posicion=1;
        cuartos.get(1).posicion=5;
        cuartos.get(2).posicion=6;
        cuartos.get(3).posicion=2;
        cuartos.get(4).posicion=3;
        cuartos.get(5).posicion=7;
        cuartos.get(6).posicion=8;
        cuartos.get(7).posicion=4;
        Collections.sort(cuartos,Torneo.Posiciones());
        t.octavosSinSorteo(cuartos, local, catElo, true, semis);
        t.octavosSinSorteo(semis, local, catElo, true, fin);
        t.octavosSinSorteo(fin, local, catElo, true, Torneo.euroCampeones);    
    }
   
   
   static public void CopaAmerica_16(ArrayList<ArrayList<Equipos>> array,String local,int catElo){
        Torneo t = new Torneo();        
        ArrayList<Equipos> cuartos= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();        
        t.grupo4neu(array.get(0), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(1), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(2), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(3), local, catElo, 2, cuartos);
        cuartos.get(0).posicion=1;
        cuartos.get(1).posicion=5;
        cuartos.get(2).posicion=6;
        cuartos.get(3).posicion=2;
        cuartos.get(4).posicion=3;
        cuartos.get(5).posicion=7;
        cuartos.get(6).posicion=8;
        cuartos.get(7).posicion=4;
        Collections.sort(cuartos,Torneo.Posiciones());
        t.octavosSinSorteo(cuartos, local, catElo, true, semis);
        t.octavosSinSorteo(semis, local, catElo, true, fin);
        t.octavosSinSorteo(fin, local, catElo, true, Torneo.americaCampeones);    
    }
   
   static public void Euro2000_16(ArrayList<ArrayList<Equipos>> array,String localA, String localB,int catElo){
        Torneo t = new Torneo();        
        ArrayList<Equipos> cuartos= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();        
        t.grupo4neu(array.get(0), localA, catElo, 2, cuartos);
        t.grupo4neu(array.get(1), localB, catElo, 2, cuartos);
        t.grupo4neu(array.get(2), localA, catElo, 2, cuartos);
        t.grupo4neu(array.get(3), localB, catElo, 2, cuartos);
        cuartos.get(0).posicion=1;
        cuartos.get(1).posicion=5;
        cuartos.get(2).posicion=6;
        cuartos.get(3).posicion=2;
        cuartos.get(4).posicion=3;
        cuartos.get(5).posicion=7;
        cuartos.get(6).posicion=8;
        cuartos.get(7).posicion=4;
        Collections.sort(cuartos,Torneo.Posiciones());
        t.pElimDirecta(cuartos.get(0), cuartos.get(1), localA, catElo, true, semis);
        t.pElimDirecta(cuartos.get(2), cuartos.get(3), localB, catElo, true, semis);
        t.pElimDirecta(cuartos.get(4), cuartos.get(5), localA, catElo, true, semis);
        t.pElimDirecta(cuartos.get(6), cuartos.get(7), localB, catElo, true, semis);
        t.pElimDirecta(semis.get(0), semis.get(1), localA, catElo, true, fin);
        t.pElimDirecta(semis.get(2), semis.get(3), localB, catElo, true, fin);
        t.octavosSinSorteo(fin, localB, catElo, true, Torneo.euroCampeones);    
    }
   
   static public void Euro2008_16(ArrayList<ArrayList<Equipos>> array,String localA, String localB,int catElo){
        Torneo t = new Torneo();        
        ArrayList<Equipos> cuartos= new ArrayList<>();
        ArrayList<Equipos> semis= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();        
        t.grupo4neu(array.get(0), localB, catElo, 2, cuartos);
        t.grupo4neu(array.get(1), localA, catElo, 2, cuartos);
        t.grupo4neu(array.get(2), localB, catElo, 2, cuartos);
        t.grupo4neu(array.get(3), localA, catElo, 2, cuartos);
        cuartos.get(0).posicion=1;
        cuartos.get(1).posicion=3;
        cuartos.get(2).posicion=4;
        cuartos.get(3).posicion=2;
        cuartos.get(4).posicion=5;
        cuartos.get(5).posicion=7;
        cuartos.get(6).posicion=8;
        cuartos.get(7).posicion=6;
        Collections.sort(cuartos,Torneo.Posiciones());
        t.pElimDirecta(cuartos.get(0), cuartos.get(1), localB, catElo, true, semis);
        t.pElimDirecta(cuartos.get(2), cuartos.get(3), localA, catElo, true, semis);
        t.pElimDirecta(cuartos.get(4), cuartos.get(5), localB, catElo, true, semis);
        t.pElimDirecta(cuartos.get(6), cuartos.get(7), localA, catElo, true, semis);
        t.pElimDirecta(semis.get(0), semis.get(1), localB, catElo, true, fin);
        t.pElimDirecta(semis.get(2), semis.get(3), localA, catElo, true, fin);
        t.octavosSinSorteo(fin, localA, catElo, true, Torneo.euroCampeones);    
    }
   
   
  static public ArrayList<ArrayList<Partidos>> Qualifier(ArrayList<ArrayList<Equipos>> array,int catElo,int clasif,ArrayList<Equipos> siguiente){
    Torneo t = new Torneo();
    ArrayList<ArrayList<Partidos>> resultados= new ArrayList<> ();
    ArrayList<Partidos> partidos= new ArrayList<>();
       for(int i=0;i<array.size();i++){
           if(array.get(i).size()==2){
              t.Serie(array.get(i).get(0), array.get(i).get(1), catElo, siguiente);
           }else if(array.get(i).size()==3){
               t.grupo3vuelta(array.get(i), catElo, clasif, siguiente);
           }else if(array.get(i).size()==4){
               partidos=t.grupo4vuelta(array.get(i), catElo, clasif, siguiente);
               resultados.add(partidos);
           }else if(array.get(i).size()==5){
               partidos=Grupos.grupo5vuelta(array.get(i), catElo, clasif, siguiente);
               resultados.add(partidos);
           }else if(array.get(i).size()==6){
               Grupos.grupo6vuelta(array.get(i), catElo, clasif, siguiente);
           }else if(array.get(i).size()==7){
               Grupos.grupo7vuelta(array.get(i), catElo, clasif, siguiente);
           }else if(array.get(i).size()==9){
               Grupos.grupo9vuelta(array.get(i), catElo, clasif, siguiente);
           }else if(array.get(i).size()==10){
               Grupos.grupo10vuelta(array.get(i), catElo, clasif, siguiente); 
           }else if(array.get(i).size()==8){
               Grupos.grupo8vuelta(array.get(i), catElo, clasif, siguiente); 
           }
       }
       
       return resultados;
   }
    
  static void printSelec(ArrayList<Equipos> array){
      
      Collections.sort(array,ordenarAlf());
      for(int i=0;i<array.size();i++){
          System.out.println(array.get(i).nombre+" "+array.get(i).nivel);
      }
  }
  
  
  static void idaVueltaSeries(ArrayList<ArrayList<Equipos>> array,int catElo,ArrayList<Equipos> siguiente){
      
      Torneo t= new Torneo();      
      for (int i=0;i<array.size();i++){
          t.Serie(array.get(i).get(0), array.get(i).get(1),catElo , siguiente);
      }
      
      
  }
  
  
  public static Comparator<Equipos> ordenarAlf(){
       Comparator comp = new Comparator<Equipos>(){
       @Override
     public int compare(Equipos s1, Equipos s2)
     {
         return s1.nombre.compareTo(s2.nombre);
     }  
        };
         return comp;
    }  
  
  static void mundial_16_7478(ArrayList<ArrayList<Equipos>> array,String local,int catElo){
        Torneo t = new Torneo();        
        ArrayList<Equipos> cuartos= new ArrayList<>();
        ArrayList<Equipos> grupoA= new ArrayList<>();
        ArrayList<Equipos> grupoB= new ArrayList<>();
        ArrayList<Equipos> fin= new ArrayList<>();        
        t.grupo4neu(array.get(0), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(1), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(2), local, catElo, 2, cuartos);
        t.grupo4neu(array.get(3), local, catElo, 2, cuartos);
        t.Resetear(Torneo.selecciones);
        grupoA.add(cuartos.get(0));
        grupoB.add(cuartos.get(1));
        grupoB.add(cuartos.get(2));
        grupoA.add(cuartos.get(3));
        grupoA.add(cuartos.get(4));
        grupoB.add(cuartos.get(5));
        grupoB.add(cuartos.get(6));
        grupoA.add(cuartos.get(7));
        t.grupo4neu(grupoA, local, catElo, 1, fin);
        t.grupo4neu(grupoB, local, catElo, 1, fin);
        t.pElimDirecta(fin.get(0), fin.get(1), local, catElo, false, Torneo.campeones); 
      
  }
  
  
  static void pasarEquipos(ArrayList<Equipos> origen, ArrayList<Equipos> destino, int numero){
      
      Collections.sort(origen, Torneo.rankingElo());
      for(int i=0;i<numero;i++){
          destino.add(origen.get(i));
      }
      
      for(int i=0;i<numero;i++){
          origen.remove(0);
      }
  }
  
  static void pasarEquiposPts(ArrayList<Equipos> origen, ArrayList<Equipos> destino, int numero){
      
      Collections.sort(origen);
      for(int i=0;i<numero;i++){
          destino.add(origen.get(i));
      }
      
      for(int i=0;i<numero;i++){
          origen.remove(0);
      }
  }
  
  static void pasarEquiposPos(ArrayList<Equipos> origen, ArrayList<Equipos> destino, int numero){
      
      Collections.sort(origen,Torneo.Posiciones());
      for(int i=0;i<numero;i++){
          destino.add(origen.get(i));
      }
      
      for(int i=0;i<numero;i++){
          origen.remove(0);
      }
  }
  
  
  
  static ArrayList<ArrayList<Equipos>> chopped5(ArrayList<Equipos> list, int cant1,int cant2,int cant3,int cant4,int cant5) {
    ArrayList<ArrayList<Equipos>> parts = new ArrayList<>();   
     
       parts.add(new ArrayList<> (list.subList(0, cant1)));
       parts.add(new ArrayList<> (list.subList(cant1, cant1+cant2)));
       parts.add(new ArrayList<> (list.subList(cant1+cant2, cant1+cant2+cant3)));
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3,cant1+cant2+cant3+cant4))); 
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3+cant4,cant1+cant2+cant3+cant4+cant5))); 
    
    return parts;
}
  
  static ArrayList<ArrayList<Equipos>> chopped6(ArrayList<Equipos> list, int cant1,int cant2,int cant3,int cant4,int cant5,int cant6) {
    ArrayList<ArrayList<Equipos>> parts = new ArrayList<>();
     
       parts.add(new ArrayList<> (list.subList(0, cant1)));
       parts.add(new ArrayList<> (list.subList(cant1, cant1+cant2)));
       parts.add(new ArrayList<> (list.subList(cant1+cant2, cant1+cant2+cant3)));
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3,cant1+cant2+cant3+cant4))); 
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3+cant4,cant1+cant2+cant3+cant4+cant5))); 
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3+cant4+cant5,cant1+cant2+cant3+cant4+cant5+cant6))); 
    
    return parts;
}
  
  static ArrayList<ArrayList<Equipos>> chopped7(ArrayList<Equipos> list, int cant1,int cant2,int cant3,int cant4,int cant5,int cant6,int cant7) {
    ArrayList<ArrayList<Equipos>> parts = new ArrayList<>();
     
       parts.add(new ArrayList<> (list.subList(0, cant1)));
       parts.add(new ArrayList<> (list.subList(cant1, cant1+cant2)));
       parts.add(new ArrayList<> (list.subList(cant1+cant2, cant1+cant2+cant3)));
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3,cant1+cant2+cant3+cant4))); 
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3+cant4,cant1+cant2+cant3+cant4+cant5))); 
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3+cant4+cant5,cant1+cant2+cant3+cant4+cant5+cant6))); 
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3+cant4+cant5+cant6,cant1+cant2+cant3+cant4+cant5+cant6+cant7))); 
    
    return parts;
}
  
  static ArrayList<ArrayList<Equipos>> chopped8(ArrayList<Equipos> list, int cant1,int cant2,int cant3,int cant4,int cant5,int cant6,int cant7,int cant8) {
    ArrayList<ArrayList<Equipos>> parts = new ArrayList<>();
     
       parts.add(new ArrayList<> (list.subList(0, cant1)));
       parts.add(new ArrayList<> (list.subList(cant1, cant1+cant2)));
       parts.add(new ArrayList<> (list.subList(cant1+cant2, cant1+cant2+cant3)));
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3,cant1+cant2+cant3+cant4))); 
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3+cant4,cant1+cant2+cant3+cant4+cant5))); 
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3+cant4+cant5,cant1+cant2+cant3+cant4+cant5+cant6))); 
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3+cant4+cant5+cant6,cant1+cant2+cant3+cant4+cant5+cant6+cant7))); 
       parts.add(new ArrayList<> (list.subList(cant1+cant2+cant3+cant4+cant5+cant6+cant7,cant1+cant2+cant3+cant4+cant5+cant6+cant7+cant8))); 
    
    return parts;
}
  
  
  static public void Ronda(ArrayList<Equipos> array,int catElo, int numeroPartidos, ArrayList<Equipos> siguiente){
      
      Collections.sort(array, Torneo.rankingElo());
      Torneo t = new Torneo();
      ArrayList<ArrayList<Equipos>> grilla= new ArrayList<> ();
      ArrayList<ArrayList<Equipos>> grupos = new ArrayList<> ();
      grilla=Torneo.chopped(array, numeroPartidos, 2);
      grupos=t.Mezclar(grilla);
      Funciones.Qualifier(grupos, catElo, 1, siguiente);     
  }
  
  static void mundial24_82(ArrayList<ArrayList<Equipos>> array, String local,int catElo){
      
      
      Torneo t = new Torneo();
      ArrayList<Equipos> segundaFase= new ArrayList<>();
      ArrayList<Equipos> grupoA= new ArrayList<>();
      ArrayList<Equipos> grupoB= new ArrayList<>();
      ArrayList<Equipos> grupoC= new ArrayList<>();
      ArrayList<Equipos> grupoD= new ArrayList<>();
      ArrayList<Equipos> semis= new ArrayList<>();
      ArrayList<Equipos> fin= new ArrayList<>();
      t.grupo4neu(array.get(0), local, catElo, 2, segundaFase);
      t.grupo4neu(array.get(1), local, catElo, 2, segundaFase);
      t.grupo4neu(array.get(2), local, catElo, 2, segundaFase);
      t.grupo4neu(array.get(3), local, catElo, 2, segundaFase);
      t.grupo4neu(array.get(4), local, catElo, 2, segundaFase);
      t.grupo4neu(array.get(5), local, catElo, 2, segundaFase);
      grupoA.add(segundaFase.get(0));
      grupoA.add(segundaFase.get(4));
      grupoA.add(segundaFase.get(11));
      grupoB.add(segundaFase.get(2));
      grupoB.add(segundaFase.get(6));
      grupoB.add(segundaFase.get(9));
      grupoC.add(segundaFase.get(1));
      grupoC.add(segundaFase.get(5));
      grupoC.add(segundaFase.get(10));
      grupoD.add(segundaFase.get(3));
      grupoD.add(segundaFase.get(7));
      grupoD.add(segundaFase.get(8));
      t.Resetear(Torneo.selecciones);
      t.grupo3neu(grupoA, local, catElo, 1, semis);
      t.grupo3neu(grupoB, local, catElo, 1, semis);
      t.grupo3neu(grupoC, local, catElo, 1, semis);
      t.grupo3neu(grupoD, local, catElo, 1, semis);
      t.pElimDirecta(semis.get(0), semis.get(2), local, catElo, true, fin);
      t.pElimDirecta(semis.get(1), semis.get(3), local, catElo, true, fin);
      t.pElimDirecta(fin.get(0), fin.get(1), local, catElo, true, Torneo.campeones);
      
      
  }
  
  
 static public void ordenarMundial(ArrayList<Equipos> array, Equipos a, Equipos b){
     a.elo+=3000;
     b.elo+=3000;
     Collections.sort(array,Torneo.rankingElo());
     a.elo-=3000;
     b.elo-=3000;
 }
 
 static public void ordenarMundial(ArrayList<Equipos> array, Equipos a, Equipos b,Equipos c){
     a.elo+=3000;
     b.elo+=3000;
     c.elo+=3000;
     Collections.sort(array,Torneo.rankingElo());
     a.elo-=3000;
     b.elo-=3000;
     c.elo-=3000;
 }
 
  
  
 static void mundial_24_86(ArrayList<ArrayList<Equipos>> array, String local,int catElo){
     
     Torneo t = new Torneo();
     ArrayList<Equipos> terceros= new ArrayList<>();
     ArrayList<Equipos> segundaFase= new ArrayList<>();
     ArrayList<Equipos> cuartos= new ArrayList<>();
     ArrayList<Equipos> semis= new ArrayList<>();
     ArrayList<Equipos> fin= new ArrayList<>();
     Torneo.grupo4neu(array.get(0), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(1), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(2), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(3), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(4), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(5), local, catElo, 2, segundaFase);
     array.get(0).get(0).posicion=0;
     array.get(0).get(1).posicion=10;
     array.get(1).get(0).posicion=14;
     array.get(1).get(1).posicion=2;
     array.get(2).get(0).posicion=6;
     array.get(2).get(1).posicion=11;
     array.get(3).get(0).posicion=8;
     array.get(3).get(1).posicion=5;
     array.get(4).get(0).posicion=4;
     array.get(4).get(1).posicion=13;
     array.get(5).get(0).posicion=12;
     array.get(5).get(1).posicion=3;
     for(int i=0;i<array.size();i++){
         terceros.add(array.get(i).get(2));
     }
     Collections.sort(terceros);
     segundaFase.add(terceros.get(0)); segundaFase.add(terceros.get(1));
     segundaFase.add(terceros.get(2)); segundaFase.add(terceros.get(3));
     if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(1).get(2))){
         array.get(2).get(2).posicion=1;  array.get(3).get(2).posicion=15;
         array.get(4).get(2).posicion=9;  array.get(5).get(2).posicion=7;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(2).get(2))){
         array.get(1).get(2).posicion=7;  array.get(3).get(2).posicion=15;
         array.get(4).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(3).get(2))){
         array.get(1).get(2).posicion=7;  array.get(2).get(2).posicion=15;
         array.get(4).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(1).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(1).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(4).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(2).get(2))){
         array.get(0).get(2).posicion=15;  array.get(3).get(2).posicion=1;
         array.get(4).get(2).posicion=9;  array.get(5).get(2).posicion=7;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(3).get(2))){
         array.get(0).get(2).posicion=15;  array.get(2).get(2).posicion=1;
         array.get(4).get(2).posicion=9;  array.get(5).get(2).posicion=7;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(0).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(0).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(4).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(2).get(2))&&!segundaFase.contains(array.get(3).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(4).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(2).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(3).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(2).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(3).get(2).posicion=1;  array.get(4).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(3).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(2).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(3).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(2).get(2).posicion=1;  array.get(4).get(2).posicion=9;
     }else{
         array.get(0).get(2).posicion=7;  array.get(1).get(2).posicion=9;
         array.get(2).get(2).posicion=1;  array.get(3).get(2).posicion=15;
     }
     Collections.sort(segundaFase, Torneo.Posiciones());
     t.octavosSinSorteo(segundaFase, local, catElo, true, cuartos);
     t.octavosSinSorteo(cuartos, local, catElo, true, semis);
     t.octavosSinSorteo(semis, local, catElo, true, fin);
     t.octavosSinSorteo(fin, local, catElo, true, Torneo.campeones);
 }
 
 static void Euro2016(ArrayList<ArrayList<Equipos>> array, String local,int catElo){
     
     Torneo t = new Torneo();
     ArrayList<Equipos> terceros= new ArrayList<>();
     ArrayList<Equipos> segundaFase= new ArrayList<>();
     ArrayList<Equipos> cuartos= new ArrayList<>();
     ArrayList<Equipos> semis= new ArrayList<>();
     ArrayList<Equipos> fin= new ArrayList<>();
     Torneo.grupo4neu(array.get(0), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(1), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(2), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(3), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(4), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(5), local, catElo, 2, segundaFase);
     array.get(0).get(0).posicion=0;
     array.get(0).get(1).posicion=10;
     array.get(1).get(0).posicion=14;
     array.get(1).get(1).posicion=2;
     array.get(2).get(0).posicion=6;
     array.get(2).get(1).posicion=11;
     array.get(3).get(0).posicion=8;
     array.get(3).get(1).posicion=5;
     array.get(4).get(0).posicion=4;
     array.get(4).get(1).posicion=13;
     array.get(5).get(0).posicion=12;
     array.get(5).get(1).posicion=3;
     for(int i=0;i<array.size();i++){
         terceros.add(array.get(i).get(2));
     }
     Collections.sort(terceros);
     segundaFase.add(terceros.get(0)); segundaFase.add(terceros.get(1));
     segundaFase.add(terceros.get(2)); segundaFase.add(terceros.get(3));
     if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(1).get(2))){
         array.get(2).get(2).posicion=1;  array.get(3).get(2).posicion=15;
         array.get(4).get(2).posicion=9;  array.get(5).get(2).posicion=7;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(2).get(2))){
         array.get(1).get(2).posicion=7;  array.get(3).get(2).posicion=15;
         array.get(4).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(3).get(2))){
         array.get(1).get(2).posicion=7;  array.get(2).get(2).posicion=15;
         array.get(4).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(1).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(1).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(4).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(2).get(2))){
         array.get(0).get(2).posicion=15;  array.get(3).get(2).posicion=1;
         array.get(4).get(2).posicion=9;  array.get(5).get(2).posicion=7;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(3).get(2))){
         array.get(0).get(2).posicion=15;  array.get(2).get(2).posicion=1;
         array.get(4).get(2).posicion=9;  array.get(5).get(2).posicion=7;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(0).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(0).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(4).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(2).get(2))&&!segundaFase.contains(array.get(3).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(4).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(2).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(3).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(2).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(3).get(2).posicion=1;  array.get(4).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(3).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(2).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(3).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(2).get(2).posicion=1;  array.get(4).get(2).posicion=9;
     }else{
         array.get(0).get(2).posicion=7;  array.get(1).get(2).posicion=9;
         array.get(2).get(2).posicion=1;  array.get(3).get(2).posicion=15;
     }
     Collections.sort(segundaFase, Torneo.Posiciones());
     t.octavosSinSorteo(segundaFase, local, catElo, true, cuartos);
     t.octavosSinSorteo(cuartos, local, catElo, true, semis);
     t.octavosSinSorteo(semis, local, catElo, true, fin);
     t.octavosSinSorteo(fin, local, catElo, true, Torneo.euroCampeones);
 }
 
 static void mundial_24_94(ArrayList<ArrayList<Equipos>> array, String local,int catElo){
     
     Torneo t = new Torneo();
     ArrayList<Equipos> terceros= new ArrayList<>();
     ArrayList<Equipos> segundaFase= new ArrayList<>();
     ArrayList<Equipos> cuartos= new ArrayList<>();
     ArrayList<Equipos> semis= new ArrayList<>();
     ArrayList<Equipos> fin= new ArrayList<>();
     Torneo.grupo4neu(array.get(0), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(1), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(2), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(3), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(4), local, catElo, 2, segundaFase);
     Torneo.grupo4neu(array.get(5), local, catElo, 2, segundaFase);
     array.get(0).get(0).posicion=0;
     array.get(0).get(1).posicion=10;
     array.get(1).get(0).posicion=14;
     array.get(1).get(1).posicion=2;
     array.get(2).get(0).posicion=6;
     array.get(2).get(1).posicion=11;
     array.get(3).get(0).posicion=8;
     array.get(3).get(1).posicion=5;
     array.get(4).get(0).posicion=4;
     array.get(4).get(1).posicion=13;
     array.get(5).get(0).posicion=12;
     array.get(5).get(1).posicion=3;
     for(int i=0;i<array.size();i++){
         terceros.add(array.get(i).get(2));
     }
     Collections.sort(terceros);
     segundaFase.add(terceros.get(0)); segundaFase.add(terceros.get(1));
     segundaFase.add(terceros.get(2)); segundaFase.add(terceros.get(3));
     if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(1).get(2))){
         array.get(2).get(2).posicion=1;  array.get(3).get(2).posicion=15;
         array.get(4).get(2).posicion=9;  array.get(5).get(2).posicion=7;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(2).get(2))){
         array.get(1).get(2).posicion=7;  array.get(3).get(2).posicion=15;
         array.get(4).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(3).get(2))){
         array.get(1).get(2).posicion=7;  array.get(2).get(2).posicion=15;
         array.get(4).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(1).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(0).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(1).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(4).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(2).get(2))){
         array.get(0).get(2).posicion=15;  array.get(3).get(2).posicion=1;
         array.get(4).get(2).posicion=9;  array.get(5).get(2).posicion=7;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(3).get(2))){
         array.get(0).get(2).posicion=15;  array.get(2).get(2).posicion=1;
         array.get(4).get(2).posicion=9;  array.get(5).get(2).posicion=7;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(0).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(1).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(0).get(2).posicion=7;  array.get(2).get(2).posicion=1;
         array.get(3).get(2).posicion=15;  array.get(4).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(2).get(2))&&!segundaFase.contains(array.get(3).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(4).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(2).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(3).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(2).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(3).get(2).posicion=1;  array.get(4).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(3).get(2))&&!segundaFase.contains(array.get(4).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(2).get(2).posicion=1;  array.get(5).get(2).posicion=9;
     }else if(!segundaFase.contains(array.get(3).get(2))&&!segundaFase.contains(array.get(5).get(2))){
         array.get(0).get(2).posicion=15;  array.get(1).get(2).posicion=7;
         array.get(2).get(2).posicion=1;  array.get(4).get(2).posicion=9;
     }else{
         array.get(0).get(2).posicion=7;  array.get(1).get(2).posicion=9;
         array.get(2).get(2).posicion=1;  array.get(3).get(2).posicion=15;
     }
     Collections.sort(segundaFase, Torneo.Posiciones());
     t.octavosSinSorteo(segundaFase, local, catElo, true, cuartos);
     cuartos.get(2).posicion=6;
     cuartos.get(3).posicion=7;
     cuartos.get(6).posicion=2;
     cuartos.get(7).posicion=3;
     cuartos.get(0).posicion=0;
     cuartos.get(1).posicion=1;
     cuartos.get(4).posicion=4;
     cuartos.get(5).posicion=5;
     Collections.sort(cuartos, Torneo.Posiciones());
     t.octavosSinSorteo(cuartos, local, catElo, true, semis);
     t.octavosSinSorteo(semis, local, catElo, true, fin);
     t.octavosSinSorteo(fin, local, catElo, true, Torneo.campeones);
 }
 
 static ArrayList<ArrayList<Partidos>> faseFinal(ArrayList<ArrayList<Equipos>> grupos,String local,int catElo,int clasificados,ArrayList<Equipos> siguiente){
     
     ArrayList<ArrayList<Partidos>> fixture = new ArrayList<>();
     ArrayList<Partidos> p = new ArrayList<>();
     
     for(int i=0; i<grupos.size();i++){
         
         if(grupos.get(i).size()==3){
             p=Torneo.grupo3neu(grupos.get(i),local,catElo,clasificados,siguiente);
             fixture.add(p);
         }
         else{
             p=Torneo.grupo4neu(grupos.get(i),local,catElo,clasificados,siguiente);
             fixture.add(p);
         }
     }
     
     
     
     
     return fixture;
 }
 
    static String localEuro(ArrayList<Equipos> equipos){
        Torneo t = new Torneo();
        String local="";
        Random rndm = new Random();
        Collections.shuffle(equipos, rndm);
        for(int i = equipos.size()-1;i>=0;i--){
            if(Torneo.hosts.contains(equipos.get(i))){
                local=equipos.get(i).nombre;
            }
        }
        if(local.equals("")){
            Collections.sort(equipos, Torneo.rankingElo());
            local = equipos.get(0).nombre;
        }
        t.Eliminar(Torneo.hosts, local);
        return local;
    }
 
    
}
