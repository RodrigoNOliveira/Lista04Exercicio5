import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner input = new Scanner(System.in);
    int numero, contador;
    double resultado = 1;

    System.out.println();
    System.out.println("Calculo de um fatorial");
    System.out.println();
    System.out.print("Digite um número: ");
    numero = input.nextInt();
    contador = numero;
    System.out.println();
    while (contador >= 1){
        resultado = resultado * contador;
        contador =  contador - 1;
        
    }
    System.out.printf("O resultado é: %.0f", resultado);

    input.close();

    }
}
