public class AlgoritimoDois {

    void main(){
        IO.println("Seja bem ao portal Java 360!");
        String usuario = IO.readln("Qual seu nome? ");
        IO.println("Olá, " + usuario +"! Bem-vindo ao portal do Java.");
        int estrelas = 0;
        //Integer é uma clsse
        IO.println("Quem criou o Java? ");
        IO.println("1 - BillGates");
        IO.println("2 - James Gosling");
        IO.println("3 - Steve Jobs");
        int resp = Integer.parseInt(IO.readln("Digite um número: "));
        if(resp == 2){
            IO.println("Parabéns, você acertou!");
            estrelas = estrelas + 1;
        }else{
            IO.println("Você errou!");
        }
        IO.println("Você obteve " +  estrelas  + " estrelas. ");
        }
    }
    

