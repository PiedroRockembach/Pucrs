
/**
 * Escreva uma descrição da classe E1_PiedroRockembach aqui.
 * 
 * Uma rede de hotéis, deseja fazer uma promoção especial de final de semana,
concedendo um desconto de 25% na diária, se o valor da sua diária é superior a 1.500,00
e se a reserva não for nos meses de julho e dezembro.
 É preciso informar via teclado, o
nome do hotel,
o número de apartamentos do hotel 
e o valor da diária por apartamento

para o final de semana completo, elabore um programa em Java para calcular:
• Valor promocional da diária;
• Valor total a ser arrecadado caso a ocupação neste final de semana atinja 100%;
• Valor total a ser arrecadado caso a ocupação neste final de semana atinja 70%;
• Valor que o hotel deixará de arrecadar em virtude da promoção, caso a ocupação
atinja 100%.

 * 
 * @author (Piedro Rockembach Nunes) 
 */
import java.util.Scanner;
public class E1_PiedroRockembach
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double diaria, valorTotal;
        String hotelNome;
        int mes, quantidadeQuartos;
        
        System.out.println("\fInforme o nome do hotel: ");
        hotelNome = in.nextLine();
        System.out.println("Informe o número de apartamentos no hotel: ");
        quantidadeQuartos = in.nextInt();
        System.out.println("Informe o valor da diária por apartamento para o final de semana completo: ");
        //recebe o valor para cada dia do fim de semana
        diaria = in.nextDouble();
        System.out.println("Em que mês gostaria de fazer a reserva? ");
        System.out.println("1- Janeiro");
        System.out.println("2- Fevereiro");
        System.out.println("3- Março");
        System.out.println("4- Abril");
        System.out.println("5- Maio");
        System.out.println("6- Junho");
        System.out.println("7- Julho");
        System.out.println("8- Agosto");
        System.out.println("9- Setembro");
        System.out.println("10- Outubro");
        System.out.println("11- Novembro");
        System.out.println("12- Dezembro");
        mes = in.nextInt();

        //Define o valor do fim de semana
        if(diaria > 1500 && mes != 7 && mes != 12){
            //desconto de 25%
            valorTotal = (diaria * 2) * 0.75;
            System.out.println("\nO valor promocional da diária é " + (diaria * 0.75));
        }else {
            valorTotal = diaria * 2;
            // neste caso não há valor promocional pois a diária não alcançou 1500 reais;
            System.out.println("\nO valor da diária é " + diaria);
        }
        
        //Valor total a ser arrecadado caso a ocupação neste final de semana atinja 100%;
        System.out.println("\nSe a ocupação neste final de semana atingir 100%, o valor arrecadado vai ser: " + (valorTotal * quantidadeQuartos));
        
        //total a ser arrecadado caso a ocupação neste final de semana atinja 70%;
        System.out.println("\nSe a ocupação neste final de semana atingir 70%, o valor arrecadado vai ser: " + (valorTotal * (quantidadeQuartos * 0.7)));
        
        //Valor que o hotel deixará de arrecadar em virtude da promoção, caso a ocupação atinja 100%
        System.out.println("\no valor que o hotel deixará de arrecadar em virtude da promoção, caso a ocupação atinja 100% é: "
        + (((diaria * 2) * quantidadeQuartos) - (valorTotal * quantidadeQuartos)));
    }
}
