
/**
 * Escreva uma descrição da classe ex02 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;
public class ex02
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("\fdigite um numero de 4 dígitos");
        int num, selector;
        int char1, char2, char3, char4;
        num = in.nextInt();
        if(num < 1000 || num > 9999) System.out.println("valor inválido!");
        else {
            String numString = Integer.toString(num);
            char1 = num/1000;
            char2 = (num%1000) / 100;
            char3 = ((num%1000) % 100) / 10;
            char4 = ((num%1000) % 100) % 10;

            switch (char1) {
                case 1:
                    System.out.print("Mil ");
                    break;
                case 2:
                    System.out.print("Dois mil ");
                    break;
                case 3:
                    System.out.print("Três mil ");
                    break;
                case 4:
                    System.out.print("Quatro mil ");
                    break;
                case 5:
                    System.out.print("Cinco mil ");
                    break;
                case 6:
                    System.out.print("Seis mil ");
                    break;
                case 7:
                    System.out.print("Sete mil ");
                    break;
                case 8:
                    System.out.print("Oito mil ");
                    break;
                case 9:
                    System.out.print("Nove mil ");
                    break;
                default:
                    break;
                
            }
        
            switch (char2) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("cento ");
                        break;
                    case 2:
                        System.out.print("duzentos ");
                        break;
                    case 3:
                        System.out.print("trezentos ");
                        break;
                    case 4:
                        System.out.print("quatrocentos ");
                        break;
                    case 5:
                        System.out.print("quinhentos ");
                        break;
                    case 6:
                        System.out.print("seicentos ");
                        break;
                    case 7:
                        System.out.print("setecentos ");
                        break;
                    case 8:
                        System.out.print("oitocentos ");
                        break;
                    case 9:
                        System.out.print("novecentos ");
                        break;
                    
                }
            switch (char3) {
                    case 1:
                        break;
                    case 2:
                        System.out.print("e vinte");
                        break;
                    case 3:
                        System.out.print("e trinta");
                        break;
                    case 4:
                        System.out.print("e quarenta");
                        break;
                    case 5:
                        System.out.print("e cinquenta");
                        break;
                    case 6:
                        System.out.print("e sessenta");
                        break;
                    case 7:
                        System.out.print("e setenta ");
                        break;
                    case 8:
                        System.out.print("e oitenta");
                        break;
                    case 9:
                        System.out.print("e noventa");
                        break;
                    default:
                        break;
            }
            switch (char4) {
                    case 1:
                        if(char3 == 1){
                            System.out.print("e onze");
                        } else {
                            System.out.print(" e um");
                        }
                        break;
                    case 2:
                        if(char3 == 1){
                            System.out.print("e doze");
                        } else {
                            System.out.print(" e dois");
                        }
                        break;
                    case 3:
                        if(char3 == 1){
                            System.out.print("e treze");
                        } else {
                            System.out.print(" e três");
                        }
                        break;
                    case 4:
                        if(char3 == 1){
                            System.out.print("e quatorze");
                        } else {
                            System.out.print(" e quatro");
                        }
                        break;
                    case 5:
                        if(char3 == 1){
                            System.out.print("e quinze");
                        } else {
                            System.out.print(" e cinco");
                        }
                        break;
                    case 6:
                        if(char3 == 1){
                            System.out.print("e dezesseis");
                        } else {
                            System.out.print(" e seis");
                        }
                        break;
                    case 7:
                        if(char3 == 1){
                            System.out.print("e dezessete");
                        } else {
                            System.out.print(" e sete");
                        }
                        break;
                    case 8:
                        if(char3 == 1){
                            System.out.print("e dezoito");
                        } else {
                            System.out.print(" e oito");
                        }
                        break;
                    case 9:
                        if(char3 == 1){
                            System.out.print("e dezenove");
                        } else {
                            System.out.print(" e nove");
                        }
                        break;
                    default:
                        break;
            }
        }
    }   
  
}
