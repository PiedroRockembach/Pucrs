import java.util.Scanner;

public class sale_price{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\fInforme o preço de custo: ");
        double price = teclado.nextDouble();
        if(price < 10) {
            System.out.println("O preço de venda deve ser: " + price * 1.7);
        } else if(price >= 10 && price < 30) {
            System.out.println("O preço de venda deve ser: " + price * 1.5);
        } else if(price >= 30 && price < 50) {
            System.out.println("O preço de venda deve ser: " + price * 1.4);
        } else if(price > 50) {
            System.out.println("O preço de venda deve ser: " + price * 1.3);
        } else {
            System.out.println("O valor informado deve ser positivo");
        }
    }
}