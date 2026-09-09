import java.util.Scanner;

public class AlgoritmoNove {
    void main(String[] args){
          Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        double tercaParte = numero / 3;

        System.out.println("Terça parte");
        System.out.println(tercaParte);
         scanner.close();
    }
    
}
