
/**
 * Escreva uma descrição da classe orbita aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.lang.Math;
public class orbita
{
    static double G = 6.67426 * Math.pow(10, -11);
    static double M = 5.97 * Math.pow(10, 24);
    static double R = 6371000;
    public static void main(String args[]){
       
        System.out.println("\fPara tempo = 45 minutos, temos altitude: " + orbita.altitude(45));
        System.out.println("Para tempo = 90 minutos, temos altitude: " + orbita.altitude(90));
        System.out.println("Para tempo = um dia inteiro, temos altitude: " + orbita.altitude(60*24));
      
    }
    
    public static double altitude(double t){
        double h;
        h = Math.pow((G * M * Math.pow(t, 2)) / 4 * Math.PI, 1/3) - R;
        return h;
    }
    
    
}
