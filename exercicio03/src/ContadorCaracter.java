import java.util.Scanner;

public class ContadorCaracter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int contadorEspaco = 0;
        int contadorCarater = 0;

        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == ' '){
                contadorEspaco++;
            }
            else {
                contadorCarater++;
            }
        }

        System.out.println(contadorEspaco);
        System.out.println(contadorCarater);
    }
}
