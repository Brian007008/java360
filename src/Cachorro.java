public class Cachorro extends Animal {

    public Cachorro(String nome, String arquivoSom){
        super(nome, arquivoSom);
    }
    
    @Override
    public void comer() {
        // TODO Auto-generated method stub
        IO.println("Ração Camil para cães");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
        IO.println(" Tocando AUAU.mp3");

    }
    
}
