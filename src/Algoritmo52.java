import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; //formata

public class Algoritmo52 {
    void main(){

        int r = 0;
        do{
             DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
             IO.println("Digite uma Dúvida: ");
             String duvida = IO.readln();
             String carimbo = LocalDateTime.now().format(formato);
        try(FileWriter arquivo = new FileWriter("Registro.txt", true)){
            arquivo.write("[" +carimbo + "]" +duvida + "\n");
            IO.println("Registrado✅ [" + carimbo +"] " +duvida);
            IO.println("Deseja registrar nova mensagem 1- sim 0 - não");

             }catch(Exception e){
                IO.print(e.getMessage());
            }   IO.print("adicionar msg:1[sim] 0[não]");
            r = Integer.parseInt(IO.readln());
        }while(r==1);

        }

    }

