public class Carro extends Veiculo implements Imanutencao, IMeusImpostos{
    private int numPortas;

    public Carro() {
        super();
        
    }

    public Carro(String placa, int velocidadeMax, String tipoCombustivel, String cor, int numPortas) {
        super(placa, velocidadeMax, tipoCombustivel, cor);
        this.numPortas = numPortas;
        
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public void mover() {
        IO.print("O carro se moveu"); 
    }

    @Override
    public void adicionar() {
        IO.println ("Impostos adicionados");
        
    }

    @Override
    public void revisaoProgramada() {
        IO.println("Faça a revisão com taxa de:" +Imanutencao.TAXA);
        
    }
}
    

