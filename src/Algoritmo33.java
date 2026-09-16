public class Algoritmo33 {

    private int chave;

    public void inserirChave(int c){
        chave = c;
    }
    public int retornarChave(){
        return chave;
    }
    public String abrirPorta(){
        String resposta;
        if(chave ==7){
            resposta = "A porta verde agua se abre;";
        }else{
            resposta = "A porta de cobre se abre";
        }
        return resposta;
    }
    
}
