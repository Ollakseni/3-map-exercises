import java.util.HashMap;
import java.util.Set;

public class MappiEsimerkit {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> nimetJaArvosanat = new HashMap<>();

        nimetJaArvosanat.put("Arno", 5);
        nimetJaArvosanat.put("Arton", 5);
        nimetJaArvosanat.put("Tea", 5);

        // Tulostetaan Arnon arvosana

        System.out.println(nimetJaArvosanat.get("Arno"));

        // Kaikkien arvojen läpikäynti
        // Tarvitaan keino hakea lista avaimia

        Set<String> arvot = nimetJaArvosanat.keySet();

        for (String nimi : arvot) {
            System.out.println(nimi);
        }
    }
}
