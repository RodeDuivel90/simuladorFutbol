


package torneo;

import java.util.*;

public class mundial1958{
  
    ArrayList<Equipos> mundial = new ArrayList<>();
    ArrayList<Equipos> elim = new ArrayList<>();
    ArrayList<Equipos> uefa = new ArrayList<>();
    ArrayList<Equipos> conm = new ArrayList<>();
    ArrayList<Equipos> conc = new ArrayList<>();
    ArrayList<Equipos> repechaje = new ArrayList<>();    
    
 static void wc1958(){
     mundial1958 m= new mundial1958();
     m.m1958();
  }  
    

    
  public void m1958(){
     ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();  
     ArrayList<ArrayList<Equipos>> grupos = new ArrayList<>();      
     ArrayList<Equipos> siguiente= new ArrayList<>();
     ArrayList<Equipos> semis= new ArrayList<>();
     ArrayList<Equipos> fin= new ArrayList<>();
     
     Torneo t = new Torneo();
     t.fin.nivel=5;
     t.por.nivel=3;
     Torneo.pol.nivel=3;
     Torneo.bul.nivel=2;
     t.hun.nivel=2;
     t.ned.nivel=3;
     t.lux.nivel=6;
     t.uru.nivel=2;
    
     t.mex.nivel=2;
     
     
     
     t.selecciones.add(t.rus);
     t.selecciones.add(t.den);
     t.selecciones.add(t.isl);
     t.selecciones.add(t.gdr);
     t.selecciones.add(t.col);
     t.selecciones.add(t.gua);
     t.selecciones.add(t.can);
     t.selecciones.add(t.crc);
     t.selecciones.add(t.ant);
     t.Resetear(t.selecciones);
     
     t.Eliminar(t.selecciones,t.saa.nombre);
     for(int i=0;i<t.selecciones.size();i++){
         elim.add(t.selecciones.get(i));
     }
     
     Collections.sort(elim,Torneo.rankingElo());
     t.Eliminar(elim,t.swe.nombre);
     t.Eliminar(elim,t.tur.nombre);
     t.Eliminar(elim,t.hai.nombre);
     t.Eliminar(elim,t.cub.nombre);

     for(int i=0;i<elim.size();i++){
         if(elim.get(i).conf.equals("uefa"))
         uefa.add(elim.get(i));
     }
     conm=Torneo.confed("conmebol", elim);
     conc=Torneo.confed("concacaf", elim);   
     
     mundial=m1958uefa();     
  
     t.Resetear(Torneo.selecciones);
     Funciones.ordenarMundial(mundial, Torneo.swe, Torneo.campeones.get(4));
     grilla=Torneo.chopped(mundial, 4,4,4,4);
     grupos=t.Mezclar(grilla);
     while(t.Validacion(grupos,1,3,1)==false){
            grupos=t.Mezclar(grilla); 
            if(t.Validacion(grupos,1,3,1)==true)
                break;
        }
     t.grupo4neu(grupos.get(0), Torneo.swe.nombre, 60, 2, siguiente);
     t.grupo4neu(grupos.get(1), Torneo.swe.nombre, 60, 2, siguiente);
     t.grupo4neu(grupos.get(2), Torneo.swe.nombre, 60, 2, siguiente);
     t.grupo4neu(grupos.get(3), Torneo.swe.nombre, 60, 2, siguiente);
     siguiente.get(0).posicion=1;
     siguiente.get(1).posicion=5;
     siguiente.get(2).posicion=6;
     siguiente.get(3).posicion=2;
     siguiente.get(4).posicion=3;
     siguiente.get(5).posicion=7;
     siguiente.get(6).posicion=8;
     siguiente.get(7).posicion=4;
     Collections.sort(siguiente, Torneo.Posiciones());
     t.octavosSinSorteo(siguiente, Torneo.swe.nombre, 60, false, semis);
     t.octavosSinSorteo(semis, Torneo.swe.nombre, 60, false, fin);
     t.pElimDirecta(fin.get(0),fin.get(1) , Torneo.swe.nombre, 60, false, Torneo.campeones);
     t.imprimirElo(Torneo.selecciones);
     Grupos.clasificacion(Torneo.swe.nombre, Torneo.campeones.get(5));
    
        for (Equipos campeone : Torneo.campeones) {
            System.out.println(campeone.nombre);
        }
  }
  
  public ArrayList<Equipos> m1958uefa(){
     
     Torneo t = new Torneo();
     ArrayList<ArrayList<Equipos>> grilla = new ArrayList<>();
     ArrayList<ArrayList<Equipos>> gruposUefa = new ArrayList<>();
     ArrayList<ArrayList<Equipos>> gruposConm = new ArrayList<>();
     ArrayList<ArrayList<Equipos>> gruposConc = new ArrayList<>();
     ArrayList<Equipos> segundaFase = new ArrayList<>();   
     
     if(Torneo.campeones.get(4).conf.equals("uefa")&&!Torneo.campeones.get(4).equals(Torneo.swe)){
     
     t.Eliminar(uefa,t.campeones.get(4).nombre);
     Collections.sort(uefa, t.rankingElo());
     grilla=t.chopped(uefa,9,9,9);
     gruposUefa=t.Mezclar(grilla);
     t.grupo3vuelta(gruposUefa.get(0),40,1,mundial);
     repechaje.add(gruposUefa.get(0).get(1));
     t.grupo3vuelta(gruposUefa.get(1),40,1,mundial);
     repechaje.add(gruposUefa.get(1).get(1));     
     t.grupo3vuelta(gruposUefa.get(2),40,1,mundial);
     repechaje.add(gruposUefa.get(2).get(1));
     t.grupo3vuelta(gruposUefa.get(3),40,1,mundial);
     repechaje.add(gruposUefa.get(3).get(1));
     t.grupo3vuelta(gruposUefa.get(4),40,1,mundial);
     repechaje.add(gruposUefa.get(4).get(1));
     t.grupo3vuelta(gruposUefa.get(5),40,1,mundial);
     repechaje.add(gruposUefa.get(5).get(1));
     t.grupo3vuelta(gruposUefa.get(6),40,1,mundial);
     repechaje.add(gruposUefa.get(6).get(1));
     t.grupo3vuelta(gruposUefa.get(7),40,1,mundial);
     repechaje.add(gruposUefa.get(7).get(1));
     t.grupo3vuelta(gruposUefa.get(8),40,1,mundial);
     repechaje.add(gruposUefa.get(8).get(1));     
     grilla.clear();
     
     }else{
         
          grilla=t.chopped(uefa,9,9,1,9);
          gruposUefa=t.Mezclar(grilla);
          t.grupo4vuelta(gruposUefa.get(0), 40, 1, mundial);
          repechaje.add(gruposUefa.get(0).get(1));
          t.grupo3vuelta(gruposUefa.get(1),40,1,mundial);
          repechaje.add(gruposUefa.get(1).get(1));     
          t.grupo3vuelta(gruposUefa.get(2),40,1,mundial);
          repechaje.add(gruposUefa.get(2).get(1));
          t.grupo3vuelta(gruposUefa.get(3),40,1,mundial);
          repechaje.add(gruposUefa.get(3).get(1));
          t.grupo3vuelta(gruposUefa.get(4),40,1,mundial);
          repechaje.add(gruposUefa.get(4).get(1));
          t.grupo3vuelta(gruposUefa.get(5),40,1,mundial);
          repechaje.add(gruposUefa.get(5).get(1));
          t.grupo3vuelta(gruposUefa.get(6),40,1,mundial);
          repechaje.add(gruposUefa.get(6).get(1));
          t.grupo3vuelta(gruposUefa.get(7),40,1,mundial);
          repechaje.add(gruposUefa.get(7).get(1));
          t.grupo3vuelta(gruposUefa.get(8),40,1,mundial);
          repechaje.add(gruposUefa.get(8).get(1));     
          grilla.clear();
         
     }
     
     if((Torneo.campeones.get(4).conf.equals("uefa")&&!Torneo.campeones.get(4).equals(Torneo.swe))||Torneo.campeones.get(4).conf.equals("concacaf")){             
     
     grilla=Torneo.chopped(conm,3,2,3);
     gruposConm=t.Mezclar(grilla);
     t.grupo3vuelta(gruposConm.get(0), 40, 1, mundial);
     t.grupo3vuelta(gruposConm.get(1), 40, 1, mundial);
     t.Serie(gruposConm.get(2).get(0), gruposConm.get(2).get(1), 40, mundial);
     grilla.clear();
     
     }else if(Torneo.campeones.get(4).equals(Torneo.swe)||Torneo.campeones.get(4).equals(Torneo.isr)){
         
         grilla=Torneo.chopped(conm,2,4);
         gruposConm=t.Mezclar(grilla);
         t.grupo4vuelta(gruposConm.get(0), 40, 2, mundial);
         t.grupo4vuelta(gruposConm.get(1), 40, 2, mundial);
         grilla.clear();
         
     }else{ 
         
         t.Eliminar(conm, Torneo.campeones.get(4).nombre);
         grilla=Torneo.chopped(conm,3,1,3);
         gruposConm=t.Mezclar(grilla);
         t.grupo3vuelta(gruposConm.get(0), 40, 1, mundial);
         t.Serie(gruposConm.get(1).get(0), gruposConm.get(1).get(1), 40, mundial);
         t.Serie(gruposConm.get(2).get(0), gruposConm.get(2).get(1), 40, mundial);
         grilla.clear();
         
     }
     
     if(!Torneo.campeones.get(4).conf.equals("concacaf")){   
     
     grilla=Torneo.chopped(conc, 2, 3);
     gruposConc=t.Mezclar(grilla);
     t.grupo3vuelta(gruposConc.get(0), 40, 1, segundaFase);
     t.grupo3vuelta(gruposConc.get(1), 40, 1, segundaFase);
     t.Serie(segundaFase.get(0), segundaFase.get(1), 40, mundial);
     grilla.clear();
     
     }else{
         
         t.Eliminar(conc, Torneo.campeones.get(4).nombre);
         grilla=Torneo.chopped(conc, 2, 2);
         gruposConc=t.Mezclar(grilla);
         t.grupo3vuelta(gruposConc.get(0), 40, 1, segundaFase);
         t.Serie(gruposConc.get(1).get(0), gruposConc.get(1).get(1), 40, mundial);    
         grilla.clear();
         
     }
     
     if(!Torneo.campeones.get(4).equals(Torneo.isr)){
     Random r1= new Random();
     Collections.shuffle(repechaje, r1);
     t.Serie(Torneo.isr, repechaje.get(0), 40, mundial);
     
     }
     mundial.add(Torneo.swe);
     if(!Torneo.campeones.get(4).equals(Torneo.swe)){
     mundial.add(Torneo.campeones.get(4));}
     return mundial;
 }
  
    
}
