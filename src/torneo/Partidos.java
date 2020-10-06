/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

/**
 *
 * @author Miguel
 */
public class Partidos {

Equipos equipo1,equipo2;
int golesA,golesB,catElo,alargue;
String local;
boolean tExtra;
boolean penales;
        
    
    
    public Partidos(Equipos equipo1,Equipos equipo2, int golesA, int golesB, 
            String local, int catElo, boolean tExtra, boolean penales){    
    this.equipo1=equipo1;
    this.equipo2=equipo2;
    this.golesA=golesA;
    this.golesB=golesB;
    this.local=local;
    this.catElo=catElo;
    this.tExtra=tExtra;
    this.penales=penales;         
    }
    
    public Partidos(Equipos equipo1,Equipos equipo2, int golesA, int golesB, 
            String local, int catElo, boolean tExtra, boolean penales,int alargue){    
    this.equipo1=equipo1;
    this.equipo2=equipo2;
    this.golesA=golesA;
    this.golesB=golesB;
    this.local=local;
    this.catElo=catElo;
    this.tExtra=tExtra;
    this.penales=penales;    
    this.alargue=alargue;
    }
        
 
     
}
