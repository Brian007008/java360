public class AlgoritmoQuatorze {
    void main(){
         System.out.println("===== MENU =====");
        System.out.println("1 - Iniciar jogo");
        System.out.println("2 - Sair");

        System.out.println("Escolha uma opção:");
        int opcao = Integer.parseInt(IO.readln());

        if (opcao == 1) {

            System.out.println("Jogo iniciado!");

            System.out.println("Você está em uma floresta.");
            System.out.println("Você deseja andar?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            int andar = Integer.parseInt(IO.readln());

            if (andar == 1) {

                System.out.println("Você começou a andar...");
                System.out.println("Cuidado!");
                System.out.println("Você caiu em um buraco!");
                System.out.println("Game Over!");

            } else if (andar == 2) {

                System.out.println("Você decidiu não andar.");
                System.out.println("Você voltou para casa.");

                System.out.println("Você chegou em casa.");
                System.out.println("Você deseja dormir?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");

                int dormir = Integer.parseInt(IO.readln());

                if (dormir == 1) {

                    System.out.println("Você dormiu tranquilamente.");
                    System.out.println("WIN GAME!");

                } else if (dormir == 2) {

                    System.out.println("Você decidiu não dormir.");
                    System.out.println("Os monstros estão à solta!");
                    System.out.println("FINISH GAME!");

                } else {

                    System.out.println("Número inválido.");

                }

            } else {

                System.out.println("Número inválido.");

            }

        } else if (opcao == 2) {

            System.out.println("Você saiu do jogo.");

        } else {

            System.out.println("Número inválido.");

        }
    }
    
}
