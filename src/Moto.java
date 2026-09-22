public class Moto extends Veiculo implements Imanutencao, IMeusImpostos{
    private Boolean temBau;

    public Moto(String placa, int velocidadeMax, String tipoCombustivel, String cor, Boolean temBau) {
        super(placa, velocidadeMax, tipoCombustivel, cor);
        this.temBau = temBau;
    }

    public Boolean getTemBau() {
        return temBau;
    }

    public void setTemBau(Boolean temBau) {
        this.temBau = temBau;
    }

     @Override
    public void mover() {
        IO.print("A moto se moveu"); 

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