package olimpiadas;

import java.util.Date;

public class Olimpiadas {
    
    private int competidores;
    private boolean mayoresDeEdad;
    private int numeroDeSedes;
    private int comites;
    private String paisAnfitrion;
    private int cantidadDePaises;
    
    public void numeroDeCompetidores(){
        competidores = 500;
    }
    
    public void soloMayoresDeEdad(){
        mayoresDeEdad = true;
        
    }
    
    public void nuevasSedes(){
        numeroDeSedes = 10;
    }
    
    public void nuevasOrganizaciones(){
        comites = 4;
   
    }
    
    public void paisElegido(){
        String str = "tokyo";
    }
    
    public void nuevosPaisesAgregados(){
        cantidadDePaises = 12;
    }

    public int getCompetidores() {
        return competidores;
    }

    public void setCompetidores(int competidores) {
        this.competidores = competidores;
    }

    public boolean isMayoresDeEdad() {
        return mayoresDeEdad;
    }

    public void setMayoresDeEdad(boolean mayoresDeEdad) {
        this.mayoresDeEdad = mayoresDeEdad;
    }

    public int getNumeroDeSedes() {
        return numeroDeSedes;
    }

    public void setNumeroDeSedes(int numeroDeSedes) {
        this.numeroDeSedes = numeroDeSedes;
    }

    public int getComites() {
        return comites;
    }

    public void setComites(int comites) {
        this.comites = comites;
    }

    public String getPaisAnfitrion() {
        return paisAnfitrion;
    }

    public void setPaisAnfitrion(String paisAnfitrion) {
        this.paisAnfitrion = paisAnfitrion;
    }

    public int getCantidadDePaises() {
        return cantidadDePaises;
    }

    public void setCantidadDePaises(int cantidadDePaises) {
        this.cantidadDePaises = cantidadDePaises;
    }
    
    public void nuevasSedes(int nuevoNumeroDeSedes){
        if(nuevoNumeroDeSedes<=this.numeroDeSedes){
            System.out.println("No hay nuevas sedes; ");    
        }else{
            this.numeroDeSedes = nuevoNumeroDeSedes;
            System.out.println("Las nuevas sedes son: ");
        }
    }
    

   
}
