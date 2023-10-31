import java.util.Random;
import java.util.Scanner;

public class ClueSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir personajes, locaciones y armas
        String[] characters = {"Dr. Green (Botánico)", "Prof. Plum (Profesor de Matemáticas)", "Col. Mustard (Coronel del Ejército)", "Miss Scarlett (Actriz)", "Mrs. White (Criada)"};
        String[] locations = {"Casa", "Hotel", "Restaurante", "Biblioteca", "Jardín"};
        String[] weapons = {"Candelabro", "Cuerda", "Llave inglesa", "Cuchillo", "Pistola"};

        Random random = new Random();
        int scenario = random.nextInt(5);

        // Escoger aleatoriamente el culpable, la locación y el arma
        String culprit = characters[random.nextInt(characters.length)];
        String crimeLocation = locations[random.nextInt(locations.length)];
        String murderWeapon = weapons[random.nextInt(weapons.length)];

        System.out.println("¡Bienvenido a Clue: Resolución de Misterios!");
        System.out.println("Has sido convocado para resolver el siguiente caso:");

        switch (scenario) {
            case 0:
                System.out.println("Historia 1: El asesinato en la Biblioteca");
                System.out.println("Un respetado Profesor de Matemáticas ha sido asesinado en la Biblioteca.");
                System.out.println("Tus sospechosos son: Dr. Green, Col. Mustard, Miss Scarlett, Mrs. White, Prof. Plum.");
                System.out.println("Las posibles armas son: Candelabro, Cuerda, Llave inglesa, Cuchillo, Pistola.");
                break;
            case 1:
                System.out.println("Historia 2: El enigma en la Casa");
                System.out.println("Una misteriosa muerte ha ocurrido en una lujosa Casa.");
                System.out.println("Tus sospechosos son: Dr. Green, Miss Scarlett, Mrs. White, Prof. Plum, Col. Mustard.");
                System.out.println("Las posibles armas son: Cuerda, Llave inglesa, Cuchillo, Pistola, Candelabro.");
                break;
            case 2:
                System.out.println("Historia 3: El secreto en el Jardín");
                System.out.println("Un exitoso Botánico ha sido encontrado muerto en su propio Jardín.");
                System.out.println("Tus sospechosos son: Mrs. White, Col. Mustard, Prof. Plum, Dr. Green, Miss Scarlett.");
                System.out.println("Las posibles armas son: Llave inglesa, Cuchillo, Pistola, Cuerda, Candelabro.");
                break;
            case 3:
                System.out.println("Historia 4: El crimen en el Hotel");
                System.out.println("Un Coronel del Ejército ha sido asesinado en un Hotel de lujo.");
                System.out.println("Tus sospechosos son: Prof. Plum, Mrs. White, Col. Mustard, Dr. Green, Miss Scarlett.");
                System.out.println("Las posibles armas son: Candelabro, Cuchillo, Pistola, Cuerda, Llave inglesa.");
                break;
            case 4:
                System.out.println("Historia 5: El misterio en el Restaurante");
                System.out.println("Una famosa Actriz ha sido encontrada muerta en un elegante Restaurante.");
                System.out.println("Tus sospechosos son: Miss Scarlett, Prof. Plum, Dr. Green, Mrs. White, Col. Mustard.");
                System.out.println("Las posibles armas son: Llave inglesa, Cuchillo, Pistola, Cuerda, Candelabro.");
                break;
        }

        System.out.println("Tu misión es descubrir al culpable, la locación y el arma utilizada en el crimen.");
        System.out.println("Comienza tu investigación.");
        
        String guessCulprit, guessLocation, guessWeapon;

        System.out.print("¿Quién crees que es el culpable? ");
        guessCulprit = scanner.nextLine();
        System.out.print("¿Dónde crees que ocurrió el crimen? ");
        guessLocation = scanner.nextLine();
        System.out.print("¿Con qué arma crees que se cometió el asesinato? ");
        guessWeapon = scanner.nextLine();

        if (culprit.equalsIgnoreCase(guessCulprit) && crimeLocation.equalsIgnoreCase(guessLocation) && murderWeapon.equalsIgnoreCase(guessWeapon)) {
            System.out.println("¡Felicidades! Has resuelto el misterio. El culpable es " + culprit + " en " + guessLocation + " con un/a " + guessWeapon + ".");
        } else {
            System.out.println("Lamentablemente, tus suposiciones no son correctas. Sigue investigando.");
        }
    }
}
