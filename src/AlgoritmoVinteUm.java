public class AlgoritmoVinteUm {
    void main(){
        String usuario;
    String senha;
    int tentativas = 0;
    boolean acesso = false;

    // Sistema de login
    while (tentativas < 3) {

        System.out.println("Digite o usuário:");
        usuario = IO.readln();

        System.out.println("Digite a senha:");
        senha = IO.readln();

        if (usuario.equals("senai") && senha.equals("123")) {
            acesso = true;
            break;
        } else {
            tentativas++;
            System.out.println("Usuário ou senha incorretos.");
            System.out.println("Tentativa: " + tentativas + " de 3");
        }
    }

    // Verifica se o usuário conseguiu entrar
    if (acesso == false) {

        System.out.println("Cartão bloqueado.");
        System.out.println("Procure o gerente.");

    } else {

        System.out.println("Parabéns, seja bem vindo a família SENATECH.");

        // Pergunta o valor do empréstimo
        System.out.println("Quando deseja simular de empréstimo?");
        double valor = Double.parseDouble(IO.readln());

        // Verifica o limite do empréstimo
        if (valor > 20000) {

            System.out.println("O empréstimo máximo é de R$ 20.000,00.");

        } else if (valor <= 0) {

            System.out.println("Valor de empréstimo inválido.");

        } else {

            // Pergunta a quantidade de parcelas
            System.out.println("Digite a quantidade de parcelas (máximo 10 meses):");
            int parcelas = Integer.parseInt(IO.readln());

            if (parcelas < 1 || parcelas > 10) {

                System.out.println("A quantidade de parcelas deve ser entre 1 e 10.");

            } else {

                // Juros de 1% ao mês
                double juros = valor * 0.01 * parcelas;

                double valorTotal = valor + juros;

                double valorParcela = valorTotal / parcelas;

                System.out.println("Valor financiado: R$ " + valor);
                System.out.println("Valor total do financiamento: R$ " + valorTotal);
                System.out.println("Quantidade de parcelas: " + parcelas);
                System.out.println("Valor de cada parcela: R$ " + valorParcela);
            }
        }
    }
    
    }
}
