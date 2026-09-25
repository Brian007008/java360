public class Alogritmo47 {
    void main(){
        int[]numeros = new int[10];
        int soma = 0;//soma dos elementos do vetor

        for (int i=0; i <10; i++){
            IO.println("Digite o valor"+ (i+1)+":");
            numeros[i] = Integer.parseInt(IO.readln());
            soma+= numeros[i];
        }
        double media = soma/10.0;
                IO.println("Soma: " +soma);
                IO.println("A média dos valores é: " +media);
            
        }
    }
    


