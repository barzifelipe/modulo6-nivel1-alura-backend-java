/*Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.*/

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo:  ");
        double valorEmprestimo = scan.nextDouble();
        verificarEmprestimo(valorEmprestimo);
    }

    public static void verificarEmprestimo(double valor){
        if(valor >= 1000 && valor <= 5000){
            System.out.println("O valor " + valor + " está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + valor + " não está dentro do intervalo permitido para empréstimo.");
        }
    }
}
