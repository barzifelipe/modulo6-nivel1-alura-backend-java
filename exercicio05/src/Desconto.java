/*crie um programa que receba o valor da compra
e exiba uma mensagem informando se o desconto foi aplicado ou não.*/

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = scan.nextDouble();
        verificarDesconto(valor);
    }

    public static void verificarDesconto(double valor){
        if(valor >= 100){
            double novoValor = valor - (valor*0.1);
            System.out.println("Desconto de 10% aplicado");
            System.out.println("Novo valor: R$ " + novoValor);
        }
        else{
            System.out.println("Nenhum desconto aplicado");
            System.out.println("Valor total: R$ "+valor);
        }
    }
}
