import java.util.Scanner;

public class NumeroMaior{
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro numero ");
        int numero1 = leitura.nextInt();
        System.out.println("Digite o segundo numero ");
        int numero2 = leitura.nextInt();

        if (numero1 > numero2){
            System.out.println("O maior numero é " + numero1);
        } else if (numero2 > numero1){
            System.out.println("O maior numero é " + numero2);
        }
    }
}
