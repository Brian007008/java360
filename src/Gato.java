public class Gato extends Animal{

    public Gato (String nome, String arquivoSom){
        super(nome, arquivoSom);
    }
    @Override
    public void comer() {
        // TODO Auto-generated method stub
        IO.println ("Whiskas para Gatos");
        
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
        IO.println ("tocando som do gato miau" +super.getArquivoSom());
    }
    
}
