import java.util.ArrayList;
import java.util.List;

public class Algoritmo46 {
    void main(){
        List<String> frutas = new ArrayList<>();
        frutas.add("Goiaba");
         frutas.add("mamão");
          frutas.add("Melancia");

        IO.println("terceira fruta:"+frutas.get(2));
        IO.println (frutas);
        frutas.set(1, "Uva");
        for(String fruta:frutas){
            IO.println("elemento: " +fruta);
        }
        IO.println("total de frutas:"+frutas.size());
        frutas.remove("mamão");
        IO.println("Total de frutas: "+frutas.size());
        IO.print("lista "+frutas);
        frutas.add("Laranja");
        frutas.add("Morango");
    }
    
}

//Generics maior e menor juntos
