public class AlgoritmoVinte {
    void main() {
      
    int[] numeros = {45, 67, 89, 34, 23, 56, 78, 98, 45, 34};

    int soma = 0;

    for (int i = 0; i < numeros.length; i++) {
        soma = soma + numeros[i];
    }

    double media = (double) soma / numeros.length;

    System.out.println("A soma dos números é: " + soma);
    System.out.println("A média dos números é: " + media);
    }
    
}
