public class Principal {
    
    void main(){
        Algoritmo31 objeto = new Algoritmo31();
        IO.println(objeto.getAloMundo());
        objeto.printarNaTela();

        Algoritmo32 objeto2 = new Algoritmo32();
        String nome = IO.readln("digite seu nome");
        objeto2.mostrarSalaEco("JP Max Plus");
        objeto2.mostrarSalaEco(nome);

        Algoritmo32 objeto3 = new Algoritmo32();
        IO.println(objeto3.mostrarSala("Maria Eduarda"));

        Algoritmo33 objeto4 = new Algoritmo33();
        objeto4.inserirChave(7);
        IO.println(objeto4.retornarChave());
        IO.println(objeto4.abrirPorta());
}

  }