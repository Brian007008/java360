public class AlgoritmoDezessete{
    void main(){
         int[] pares = new int[101];

        // Preenchendo o vetor
        for (int i = 0; i <= 100; i++) {
            pares[i] = i * 2;
        }

        // Mostrando os números
        for (int i = 0; i <= 100; i++) {
            System.out.println(pares[i]);
    }

}
}
