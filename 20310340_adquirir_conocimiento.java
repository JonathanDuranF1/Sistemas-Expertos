import java.util.HashMap;
import java.util.Scanner;
public class ChatBot {

    private HashMap<String, String> baseDeDatos;
    public ChatBot() {
        baseDeDatos = new HashMap<>();
        baseDeDatos.put("Hola", "Hola, como estas?");
        baseDeDatos.put("Como estas?", "Estoy bien, como te puedo ayudar?");
        baseDeDatos.put("De que te gustaria hablar?",
                "Podemos hablar sobre cualquier tema. Tienes alguna pregunta en mente");
    }
