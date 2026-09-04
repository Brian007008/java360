public class AlgoritimoQuatroAl {
    void main(String[] args) {
        int diaDaSemana = 3;
        String nomeDoDia;

        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Segunda-feira";
                break;
            case 2: 
                nomeDoDia = "Terça-feira";
                break;
            case 3:
                nomeDoDia = "Quarta-feira";
                break;
            case 4:
                nomeDoDia = "Quinta-feira";
                break;
            case 5:
                nomeDoDia = "Sexta-feira";
                break;
            default:
                nomeDoDia = "Dia inválido";
        }
        System.out.println(nomeDoDia); //Sexta-feira
    }
    
}
