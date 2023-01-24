

import java.util.Scanner;

public class Calc {
    static public void main (String[] args){

        int opera, a, b, continua=1;
        Scanner scan= new Scanner(System.in);
        Numero Calc=new Numero();
        while (continua==1) {
            Calc.prit("|------MENU DE CÁLCULO------|");
            Calc.prit("PARA SOMA DIGITE...........:1");
            Calc.prit("PARA SUBTRAÇÃO DIGITE......:2");
            Calc.prit("PARA MULTIPLICAÇÃO DIGITE..:3");
            Calc.prit("PÁRA DIVISÃO DIGITE........:4");
            Calc.prit("DIGITE SUA OPÇÃO:");  
            opera=scan.nextInt();
            Calc.prit("Digite o primeiro número:");
            a=scan.nextInt();
            Calc.prit("Digite o segundo número:");
            b=scan.nextInt();
            if(opera==1){
                Calc.soma(a, b);
            }else if(opera==2){
                Calc.sub(a, b);
            }else if(opera==3){
                Calc.mult(a, b);
            }else if(opera==4){
                Calc.div(a, b);
            }else{
                Calc.prit("Erro na operação!!!");
            } 
            Calc.prit("Se deseja calcular novamente, digite o número 1 ou então digite o número 0 para sair:");
            continua=scan.nextInt();        
         }
         
    }

}
        

    
