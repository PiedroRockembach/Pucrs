import java.lang.Math;
public class biblioteca_de_métodos {
    public static void main(String args[]) {
        System.out.println("\f A área do triangulo com base 3m e altura 3m é: " + AreaTriangulo(3, 3) + "m²");
    }
    public static double AreaTriangulo(double b, double h){
        return (b * h) / 2;

    }
    public static double AreaRetangulo(double b, double h){
        return b * h;

    }
    public static double AreaCirculo(double raio){
        return Math.PI * (Math.pow(raio, 2)) ;

    }
    public static double AreaQuadrado(double lado){
        return lado * lado;
    }
    public static double VolumeParalelepipedo(double base, double altura, double profundidade){
        return base * altura * profundidade;
    }
    public static double VolumePiramide(double raio, double altura){
        return ((Math.PI * Math.pow(raio, 2)) * altura) / 2;
    }
    public static double VolumeEsfera(double raio){
        return ((Math.PI * Math.pow(raio, 3)) * (4/3));
    }
    public static double VolumeCilindro(double raio, double altura){
        return ((Math.PI * Math.pow(raio, 2)) * altura);
    }
    
}