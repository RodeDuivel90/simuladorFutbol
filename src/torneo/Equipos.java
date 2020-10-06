
package torneo;

import javax.swing.ImageIcon;


public class Equipos implements Comparable<Equipos>  {
String nombre,conf;
int nivel,pts,gf,gc,posicion;
double elo;

   

    
    public Equipos(String nombre, int nivel, int pts, int gf, int gc, double elo, String conf,int posicion){
        this.nombre=nombre;
        this.nivel=nivel;
        this.pts=pts;
        this.gf=gf;
        this.gc=gc;
        this.elo=elo;
        this.conf=conf;
        this.posicion=posicion;
    }
    
    
    
    public void setNivel(int nivel){
        this.nivel=nivel;
    }
    
    public int getNivel(){        
        return this.nivel;
    }
    
  
    
    public int compareTo(Equipos o){
    if (pts < o.pts) {
                return 1;
            }
            if (pts > o.pts) {
                return -1;
            }
            else {
                if(gf-gc<o.gf-o.gc){
                    return 1;
                }
                else if(gf-gc>o.gf-o.gc){
                    return -1;
                }
                else if(gf-gc==o.gf-o.gc){
                    if (gf<o.gf){
                        return 1;
                    }
                    else if(gf>o.gf) {
                        return -1;
                    }
                    else{
                        return 0;
                    }
                }
            }
            
            return 0;
            
}
    
    
    
     
     
            
    
}
