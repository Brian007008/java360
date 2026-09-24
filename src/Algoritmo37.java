public class Algoritmo37 {
    void main(){
    /*
    Exemplos 
    -Herança
    -Super
    -Redefinição do construtor
    -Polimorfismo
    -Sobrecarga
    -Sobrescrita (override)*/
    Cachorro c = new Cachorro("Rex", "auau.mp3");
    
    IO.println("Nome: " + c.getNome());
    c.comer();
    c.tocarSom();

    Gato g = new Gato("Juliano", "miau.mp3");

    IO.println("Nome: " +g.getNome());
    g.comer();
    g.tocarSom();

    JavaPorco j = new JavaPorco("Java Porco", "Grunhido.mp3");

    IO.println("Nome: " +j.getNome());
    j.comer();
    j.tocarSom();

}
}
