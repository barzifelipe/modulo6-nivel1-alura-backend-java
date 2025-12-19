/*escrever um programa que determine se um número é par ou ímpar e exiba o resultado corretamente*/

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if(num%2 == 0){
            System.out.println("O número " + num +" é par");
        }
        else{
            System.out.println("O número " + num + "  é impar");
        }
    }
}
