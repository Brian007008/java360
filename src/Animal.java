public abstract class Animal {
    private String nome;
    private String arquivoSom;
    private String AnimalPorco;

    public String getAnimalPorco() {
        return AnimalPorco;
    }

    public void setAnimalPorco(String animalPorco) {
        AnimalPorco = animalPorco;
    }

    public Animal(String nome, String arquivoSom){
        this.nome = nome;
        this.arquivoSom = arquivoSom;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArquivoSom() {
        return arquivoSom;
    }

    public void setArquivoSom(String arquivoSom) {
        this.arquivoSom = arquivoSom;
    }
    

    //contratos -- Assinatura
    public abstract void comer();
    public abstract void tocarSom();

   
    }

    
    
