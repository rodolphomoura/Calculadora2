
package calculadora2;
import java.util.Scanner;

public class Calculadora2 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int numero2 = scanner.nextInt();
        System.out.println("Escolha uma operação: ");
        System.out.println("1-Soma");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");
        int escolha = scanner.nextInt();
        switch (escolha){
            case 1:
                int soma = numero1+numero2;
                System.out.println("Resultado da soma é: "+soma);
                break;
            case 2:
                int subtracao = numero1-numero2;
                System.out.println("Resultado da subtração é: "+subtracao);
                break;
            case 3:
                int multiplicacao = numero1*numero2;
                System.out.println("Resultado da multiplicação é: "+multiplicacao);
                break;
            case 4:
                if (numero2 != 0){
                    double divisao = (double) numero1/numero2;
                    System.out.println("Resultado da divisão é:" + divisao);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                        }
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
                
            }
        scanner.close();
        }
        
        
    }
 
