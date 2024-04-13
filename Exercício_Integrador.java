import java.util.Scanner;

public class Integrador {
    public static void main(String args[]) {
        
        // cria um scanner chamado "in";
        Scanner in = new Scanner(System.in);
        
        //declara as variáveis que vão armazenar as datas como tipo inteiro;
        int diaAniversario, mesAniversario, anoAniversario, diaAtual, mesAtual, anoAtual;
        
        //Pede para o usuário informa sua data de nascimento
        System.out.println("\f Informe o dia do seu aniversário no formato dd:");
        diaAniversario = in.nextInt();
        
        System.out.println("\f Informe o mês do seu aniversário no formato mm:");
        mesAniversario = in.nextInt();
        
        System.out.println("\f Informe o ano do seu aniversário no formato aaaa:");
        anoAniversario = in.nextInt();
        
        //pede para o usuário informar a data atual
        System.out.println("\f Informe o dia atual no formato dd:");
        diaAtual = in.nextInt();
        
        System.out.println("\f Informe o mês atual formato mm:");
        mesAtual = in.nextInt();
        
        System.out.println("\f Informe o ano atual aaaa:");
        anoAtual = in.nextInt();
        
        // Não coloquei um if para testar se os valores estão corretos porque iremos aprender uma forma melhor de fazer isso no futuro e ficaria muito longo
        // inclusive se quiserem dps eu mostro pra vcs
        
   
        //cria uma variável do tipo string, chamada signo, que vai guardar o signo do usuário.
        String signo;
        
        //salva na variável "signo" o valor que for retornado do método "Signo";
        //Ao chamar o método "Signo", são passados os valores do dia de nascimento, o mês de nascimento e o ano de nascimento do usuário;
        signo = Signo(diaAniversario, mesAniversario, anoAniversario);
        
        //O valor de signo só será "" (um texto vazio) se a data informada for inválida (está explicado no método "Signo").
        //Então este if só permite o programa continuar caso a data informada seja válida, permitindo o programa entrar no "else";
        if(signo == "") { System.out.println("Data inválida!");}
        else {
            System.out.println("Você é de " + signo + "!");
        }
        
    }
    
    //Cria um método que pede um dia, um mês e um ano e informa o signo que corresponde essa data
    public static String Signo(int dia, int mes, int ano) {
        
        //declara uma variável que vai armazenar o valor do signo e inicia ela com o valor de "" (um texto vazio sem espaço)
        String signoDoUsuario = "";
        
        //esta variável vai ser usada para verificar se o dia informado é válido.
        boolean diaValido;
        
        //Este switch lê a variavel que informa o mês e separa os possíveis signos de quem nasce nesses meses;
        switch(mes) {
            case 1:
                
                //testa se foi passado um dia válido para aquele mês
                diaValido = dia > 0 && dia <= 31;
                
            
                //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                if(dia <= 20 && diaValido ){
                    signoDoUsuario = "Capricórnio";
                } else {
                    signoDoUsuario = "Aquário";
                }
                
                //o break finaliza o switch
                break;
            
            case 2:
                //testa se foi passado um dia válido para aquele mês
                    
                //por ser fevereiro, devemos testar se é ano bissexto ou não, então devemos chamar o método do ano bissexto para testar      
                
                //declara uma variável booleana que pode ter os valores "true" e "false", que correspondem a verdadeiro e falso
                boolean anoBissexto;
                
                //Vamos chamar o método "Bissexto" passando para ele o ano de nascimento do usuário,
                //este método vai retornar "true" se o ano for bissexto e "false" se o ano não for bissexto (mais explicações dentro do próprio método)
                //este valor retornado será salvo na variavel "anoBissexto"
                anoBissexto = Bissexto(ano);
                
                
                if (anoBissexto == true) {
                    // se o ano for bissexto os dias válidos serão entre 1 e 29
                    diaValido = dia > 0 && dia <= 29;
                } else {
                    // se o ano não for bissexto os dias válidos serão entre 1 e 28
                    diaValido = dia > 0 && dia <= 28;
                }
                
                //Este if faz com que um signo seja definido apenas se o dia passado seja válido
                if(diaValido == true) {
                    //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                    if(dia <= 18){
                        signoDoUsuario = "Aquário";
                    } else {
                        signoDoUsuario = "Peixes";
                    }
                }
                //o break finaliza o switch
                break;
            
            case 3:
                 //testa se foi passado um dia válido para aquele mês
                diaValido = dia > 0 && dia <= 31;
                
                //Este if faz com que um signo seja definido apenas se o dia passado seja válido
                if(diaValido == true) {
                    //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                    if(dia <= 20){
                        signoDoUsuario = "Peixes";
                    } else {
                        signoDoUsuario = "Áries";
                    }
                }
                //o break finaliza o switch
                break;
                
            case 4:
                 //testa se foi passado um dia válido para aquele mês
                diaValido = dia > 0 && dia <= 30;
                
                //Este if faz com que um signo seja definido apenas se o dia passado seja válido
                if(diaValido == true) {
                    //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                    if(dia <= 20){
                        signoDoUsuario = "Áries";
                    } else {
                        signoDoUsuario = "Touro";
                    }
                }
                //o break finaliza o switch
                break;
                
            case 5:
                //testa se foi passado um dia válido para aquele mês
                diaValido = dia > 0 && dia <= 31;
                
                //Este if faz com que um signo seja definido apenas se o dia passado seja válido
                if(diaValido == true) {
                    //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                    if(dia <= 20){
                        signoDoUsuario = "Touro";
                    } else {
                        signoDoUsuario = "Gêmeos";
                    }
                }
                //o break finaliza o switch
                break;
                
            case 6:
                 //testa se foi passado um dia válido para aquele mês
                diaValido = dia > 0 && dia <= 30;
                
                //Este if faz com que um signo seja definido apenas se o dia passado seja válido
                if(diaValido == true) {
                    //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                    if(dia <= 20){
                        signoDoUsuario = "Gêmeos";
                    } else {
                        signoDoUsuario = "Câncer";
                    }
                }
                //o break finaliza o switch
                break;
                
            case 7:
                 //testa se foi passado um dia válido para aquele mês
                diaValido = dia > 0 && dia <= 31;
                
                //Este if faz com que um signo seja definido apenas se o dia passado seja válido
                if(diaValido == true) {
                    //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                    if(dia <= 22){
                        signoDoUsuario = "Câncer";
                    } else {
                        signoDoUsuario = "Leão";
                    }
                }
                //o break finaliza o switch
                break;
                
            case 8:
                 //testa se foi passado um dia válido para aquele mês
                diaValido = dia > 0 && dia <= 31;
                
                //Este if faz com que um signo seja definido apenas se o dia passado seja válido
                if(diaValido == true) {            
                    //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                    if(dia <= 22){
                        signoDoUsuario = "Leão";
                    } else {
                        signoDoUsuario = "Virgem";
                    }
                }
                //o break finaliza o switch
                break; 
            
            case 9:
                 //testa se foi passado um dia válido para aquele mês
                diaValido = dia > 0 && dia <= 30;
                
                //Este if faz com que um signo seja definido apenas se o dia passado seja válido
                if(diaValido == true) {
                    //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                    if(dia <= 22){
                        signoDoUsuario = "Virgem";
                    } else {
                        signoDoUsuario = "Libra";
                    }
                }
                //o break finaliza o switch
                break; 
            
            case 10:
                 //testa se foi passado um dia válido para aquele mês
                diaValido = dia > 0 && dia <= 31;
                
                //Este if faz com que um signo seja definido apenas se o dia passado seja válido
                if(diaValido == true) {
                    //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                    if(dia <= 22){
                        signoDoUsuario = "Libra";
                    } else {
                        signoDoUsuario = "Escorpião";
                    }
                }
                //o break finaliza o switch
                break;
                
            case 11:
                 //testa se foi passado um dia válido para aquele mês
                diaValido = dia > 0 && dia <= 30;
                
                //Este if faz com que um signo seja definido apenas se o dia passado seja válido
                if(diaValido == true) {
                    //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                    if(dia <= 21){
                        signoDoUsuario = "Escorpião";
                    } else {
                        signoDoUsuario = "Sagitário";
                    }
                }
                //o break finaliza o switch
                break;
            
            case 12:
                 //testa se foi passado um dia válido para aquele mês
                diaValido = dia > 0 && dia <= 31;
                
                //Este if faz com que um signo seja definido apenas se o dia passado seja válido
                if(diaValido == true) {            
                    //dentro de cada case será usada a variável "dia" para definir o signo correto entre as duas opções de cada mês
                    if(dia <= 21){
                        signoDoUsuario = "Sagitário";
                    } else {
                        signoDoUsuario = "Capricórnio";
                    }
                }
                //o break finaliza o switch
                break;
        }
        
        
        //retorna o valor do signo que foi definido no Switch anterior
        //se for informado uma data inválida, não entrará em nenhum case do Switch anterior e a variável se manterá como ""(vazio)
        return signoDoUsuario;
    }
    
    // cria um método que recebe um valor inteiro que representa um ano e devolve em forma de "verdadeiro" ou "falso" (um valor booleano) se o ano é bissexto ou não;
    public static boolean Bissexto(int ano){
        
        //testa se o ano é divisivel por quatro;
        
        // "ano % 4" nos da o resto da divisão inteira do ano por 4, se este resto for zero, então ano é divsível por 4
        boolean divisivelPorQuatro = ano % 4 == 0;
        
        // "ano % 100" nos da o resto da divisão inteira do ano por 100, se este resto for zero, então ano é divsível por 100
        boolean divisivelPorCem = ano % 100 == 0;
        
        
        // se o ano for divisível por 4 e não for divisível por 100 o ano será bissexto e retornará o valor "true"
        
        // a "!" significa "negação", então neste caso estamos testando se *É* divisível por 4 e se *NÃO É* divisível por cem
        return divisivelPorQuatro && !divisivelPorCem;
    }
} 