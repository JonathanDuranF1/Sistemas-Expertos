import java.util.Scanner;

public class Formula1GuessWho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] characters = {
            "Lewis Hamilton", "Max Verstappen", "Charles Leclerc", "Valtteri Bottas", "Lando Norris",
            "Sergio Perez", "Carlos Sainz", "Daniel Ricciardo", "Fernando Alonso", "George Russell"
        };

        String[] questions = {
            "¿Es el piloto británico?",
            "¿Pilotea para Red Bull Racing?",
            "¿Es el piloto más joven?",
            "¿Ha ganado un Campeonato Mundial de F1?",
            "¿Pilotea para Ferrari?",
            "¿Es el piloto más experimentado?",
            "¿Ha ganado al menos una carrera en 2022?",
            "¿Ha cambiado de equipo en 2022?",
            "¿Es el piloto español?",
            "¿Ha ganado en Silverstone en 2022?"
        };

        boolean[][] characterAnswers = new boolean[characters.length][questions.length];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String answer = scanner.nextLine();

            for (int j = 0; j < characters.length; j++) {
                switch (i) {
                    case 0:
                        characterAnswers[j][i] = characters[j].equals("Lewis Hamilton");
                        break;
                    case 1:
                        characterAnswers[j][i] = characters[j].equals("Max Verstappen");
                        break;
                    case 2:
                        characterAnswers[j][i] = characters[j].equals("Lando Norris");
                        break;
                    case 3:
                        characterAnswers[j][i] = characters[j].equals("Lewis Hamilton") || characters[j].equals("Max Verstappen");
                        break;
                    case 4:
                        characterAnswers[j][i] = characters[j].equals("Charles Leclerc");
                        break;
                    case 5:
                        characterAnswers[j][i] = characters[j].equals("Fernando Alonso");
                        break;
                    case 6:
                        characterAnswers[j][i] = true; // Asumir que todos han ganado al menos una carrera en 2022
                        break;
                    case 7:
                        characterAnswers[j][i] = !characters[j].equals("Lewis Hamilton");
                        break;
                    case 8:
                        characterAnswers[j][i] = characters[j].equals("Fernando Alonso");
                        break;
                    case 9:
                        characterAnswers[j][i] = characters[j].equals("Lewis Hamilton");
                        break;
                }
            }
        }
      
        System.out.println("¿Quién crees que es el piloto? (Escribe el nombre)");
        String guess = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i].equalsIgnoreCase(guess)) {
                found = true;
                boolean correctGuess = true;
                for (int j = 0; j < questions.length; j++) {
                    if (!characterAnswers[i][j]) {
                        correctGuess = false;
                        break;
                    }
                }
                if (correctGuess) {
                    System.out.println("¡Has adivinado! El piloto es " + characters[i]);
                } else {
                    System.out.println("No has adivinado correctamente.");
                }
            }
        }

        if (!found) {
            System.out.println("Personaje no encontrado. ¡Inténtalo de nuevo!");
        }
    }
}
