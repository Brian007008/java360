import javax.swing.JOptionPane;

public class algoritmo38 {
    void main(){
        JOptionPane.showMessageDialog(null, "Agência SenaiCar");
        Carro c = new Carro("ABC-1234", 240, "Flex", "Azul", 5);
        JOptionPane.showMessageDialog(null, c.getPlaca());
        JOptionPane.showMessageDialog(null, c.getCor());
        JOptionPane.showMessageDialog(null, c.getTipoCombustivel());
        JOptionPane.showMessageDialog(null, c.getNumPortas());
        JOptionPane.showMessageDialog(null, c.getVelocidadeMax());
        c.mover();
        

    }
}
