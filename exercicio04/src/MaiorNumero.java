/* Crie um programa que solicite ao usuário dois números inteiros,
compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.*/

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();
        verificarMaior(num1, num2);
    }

    public static void verificarMaior(int num1, int num2){
        if(num1 > num2){
            System.out.println("O maior número é: " + num1);
        }
        else if(num1 == num2){
            System.out.println("Os números são iguais");
        }
        else{
            System.out.println("O maior número é: "+num2);
        }
    }
}
