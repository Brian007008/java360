public class Algoritmo40{
    void main(){
        //3D matriz tridimensional
        //Tabela -Matriz bidimensional
        //vetor - matriz unidimensional
        int[] notas = {7, 9, 5, 10, 6};
        int maior = notas [0];
        IO.println(maior);
        for (int i=1;i<notas.length;i++){
            if(notas[i]> maior){
                maior=notas[i];
            }
        }
        IO.println("Maior Nota " +maior);
    }
    
}