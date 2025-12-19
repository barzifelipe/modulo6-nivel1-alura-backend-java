/* crie um programa que receba três lados e exiba uma mensagem
informando se os lados podem formar um triângulo ou não.*/

import java.util.Scanner;

public class Triangulo {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        double lado1 = scan.nextDouble();
        System.out.println("Digite o segundo lado: ");
        double lado2 = scan.nextDouble();
        System.out.println("Digite o terceiro lado: ");
        double lado3 = scan.nextDouble();
        verificarLados(lado1, lado2, lado3);
    }

    public static void verificarLados(double lado1, double lado2, double lado3){
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
    }
}
