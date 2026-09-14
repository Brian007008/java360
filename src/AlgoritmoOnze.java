public class AlgoritmoOnze {
    void main(){
        String meuNome = "Brian";

        System.out.print("Digite seu nome: ");
        String nomeDigitado = IO.readln();

        if (nomeDigitado.equalsIgnoreCase(meuNome)) {
            System.out.println("Sim, esse é o seu nome!");
        } else {
            System.out.println("Não, esse não é o seu nome, acesso negado.");
        }
    }
}
