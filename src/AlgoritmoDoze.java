public class AlgoritmoDoze {
    void main(){
         System.out.println("Digite um número:");
        int numero = Integer.parseInt(IO.readln());

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
    
}
