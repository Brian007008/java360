import javax.swing.JOptionPane;

public class Algoritmo39 {
    void main(){
    Onibus o1 = new Onibus( "PCU 5678");
    Onibus o2 = new Onibus( "ABC 1234");
    Onibus o3 = new Onibus("PBU 9876");

    Metro m1 = new Metro("EAU 1234");
    Metro m2 = new Metro("PAL 5678");
    Metro m3 = new Metro("LKJ 9137");

    String opcao = JOptionPane.showInputDialog(" 1-Onibus 2-Mêtro");
    int op = Integer.parseInt(opcao);
        if(op==1){
            JOptionPane.showMessageDialog(null,o1.calcularTarifa());
            JOptionPane.showMessageDialog(null, "Frota" +Onibus.getcont());
        }else if(op==2){
            JOptionPane.showMessageDialog(null,m1.calcularTarifa());
        }else{
            JOptionPane.showMessageDialog(null, "opcao invalida");
        }
    }
}