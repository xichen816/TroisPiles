import Stack.ArrayStack;
public class MovingDay {

    /**
     * Vérifie s'il est possible de déménager toute une ville en respectant le temps et l'ordre demandé. Il faut
     * passer de Nam à Pam à Sam en 10 jours maximum et les unités de la ville doivent être dans cette ordre précis:
     * [N5, N4, N3, N2, N1].
     *
      * @param <String> le type d'élément contenu dans la pile
     */
    public static <String> void movingDay() {
        ArrayStack<String> Nam = new ArrayStack<String>();
        Nam.push((String) "N5: Le Roi");
        Nam.push((String) "N4: Gouvernement");
        Nam.push((String) "N3: Académie");
        Nam.push((String) "N2: Manufacture");
        Nam.push((String) "N1: Agriculture");
        ArrayStack<String> Pam = new ArrayStack<String>();
        ArrayStack<String> Sam = new ArrayStack<String>();


        int days = 0; // Initialisation du compteur

        // Imprimer l'état du déplacement
        System.out.println("\u001B[1m" + "Jour " + days + ": Nam" + "\u001B[0m" + Nam + " ,Pam" + Pam + " " +
                "et Sam " + Sam);

        // Transférer les éléments de la pile Nam dans la pile Pam et imprimer l'état du déplacement à chaque jour
        while (!Nam.isEmpty()) {
            Pam.push(Nam.top());
            Nam.pop();
            days++;
            System.out.println("Jour " + days + ": Nam" + Nam + ", Pam" + Pam + " et Sam " + Sam);
        }

        // Transférer les éléments de la pile Pam dans la pile Sam et imprimer l'état du déplacement à chaque jour
        while (Sam.size() < 5) {
            Sam.push(Pam.top());
            Pam.pop();
            days++;
            System.out.println("Jour " + days + " : Nam" + Nam + " , Pam" + Pam + " et Sam " + Sam);
        }

        // Imprimer un message lorsque le compteur dépasse 10 jours
        if (days > 10) {
            System.out.println("Il est IMPOSSIBLE de déplacer la ville dans les 10 jours, car " + days + "nombre de jours sont nécessaires.");

        // Imprimer un message lorsque le compteur ne dépasse pas 10 jours
        } else {
            System.out.println("Il est POSSIBLE de déplacer la ville dans les 10 jours, car " + days + "nombre de jours sont nécessaires.");
        }

    }
}