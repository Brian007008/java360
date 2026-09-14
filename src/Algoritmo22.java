public class Algoritmo22 {

     void main() {

        String usuarioCorreto = "senai";
        String senhaCorreta = "123";
        int tentativas = 0;
        boolean acesso = false;
        while (tentativas < 3 && acesso == false) {

            System.out.println("===== BANCO SENATECH =====");

            System.out.println("Digite o usuário:");
            String usuario = IO.readln();

            System.out.println("Digite a senha:");
            String senha = IO.readln();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                acesso = true;
                System.out.println("Login realizado com sucesso!");
            } else {
                tentativas++;
                System.out.println("Usuário ou senha incorretos.");
                System.out.println("Tentativa " + tentativas + " de 3.");
           }
        }
        if (acesso == false) {
            System.out.println("Cartão bloqueado!");
            System.out.println("Procure o gerente.");
        } else {

            System.out.println();
            System.out.println("Parabéns, seja bem vindo a família SENATECH.");

            System.out.println();
            System.out.println("Você tem um limite de 20.000R$ disponivel deseja simular um empréstimo?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            int opcao = Integer.parseInt(IO.readln());

            if (opcao == 1) {

                System.out.println("Digite o valor do empréstimo:");
                double valor = Double.parseDouble(IO.readln());

                if (valor > 20000) {
                    System.out.println("O empréstimo máximo é de R$ 20.000,00.");
                } else if (valor <= 0) {
                    System.out.println("Digite um valor válido.");
                } else {

                    System.out.println("Digite a quantidade de parcelas (até 10):");
                    int parcelas = Integer.parseInt(IO.readln());

                    if (parcelas < 1 || parcelas > 10) {
                        System.out.println("A quantidade de parcelas deve ser de 1 até 10.");
                    } else {

                        // Juros de 1% ao mês
                        double valorFinanciado = valor * Math.pow(1.01, parcelas);
                        double valorParcela = valorFinanciado / parcelas;

                        System.out.println();
                        System.out.println("===== SIMULAÇÃO DO EMPRÉSTIMO =====");
                        System.out.println("Valor financiado: R$ " + valor);
                        System.out.println("Quantidade de parcelas: " + parcelas);
                        System.out.println("Valor total do financiamento: R$ " + valorFinanciado);
                        System.out.println("Valor de cada parcela: R$ " + valorParcela);
                    }
                }

            } else {
                System.out.println("Obrigado por utilizar o Banco SENATECH!");
            }
        }
    }
    
}
