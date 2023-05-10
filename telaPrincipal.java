import java.util.Random;
import java.util.Scanner;

public class telaPrincipal {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);

        int valorTentativa = 0;
        int contador = 1;

        while (contador <= 5) {
            System.out.print("Digite um número inteiro entre 0 e 100, para sua tentativa nº " + contador + " : ");
            Scanner digitaNumero = new Scanner(System.in);
            valorTentativa = digitaNumero.nextInt();

            if(valorTentativa < numeroAleatorio){
                System.out.println("O número gerado pela máquina é maior que o digitado");
            } else if (valorTentativa > numeroAleatorio) {
                System.out.println("O número gerado pela máquina é menor do que o digitado");
            } else if (valorTentativa == numeroAleatorio){
                System.out.println("Você acertou o número gerado pela máquina!");
                break;
            }
            if (valorTentativa != numeroAleatorio && contador == 5){
                System.out.println();
                System.out.println("Você teve "+ contador +" tentativas e não acertou, o número gerado pela máquina era " + numeroAleatorio);
            }

            System.out.println("");

            ++contador;
        }

    }
}
