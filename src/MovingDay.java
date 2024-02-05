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

        /*
        Initialise le compteur "days" (compte le nombre de jours qui passent) à zéro.
        Une phrase est aussi renvoyée afin d'informer l'utilisateur sur l'état du déplacement de la ville lors du jour 0.
         */
        int days = 0;
        System.out.println("\u001B[1m" + "Jour " + days + ": Nam" + "\u001B[0m" + Nam + " ,Pam" + Pam + " et Sam " + Sam);


        /*
        Boucle vérifiant si la pile "Nam" est vide. Si elle ne l'est pas, prendre l'élément du dessus de la pile
        "Nam" et le dépiler pour, ensuite, l'empiler dans la pile "Pam". Lorsque la pile est vide, on sort de la
        boucle.
        De plus, on met à jour, à chaque itération, le nombre de jours passé grâce au compteur "days".
        Une phrase est aussi renvoyée afin d'informer l'utilisateur sur l'état du déplacement de la ville à chaque
        itération.
         */
        while (!Nam.isEmpty()) {
            Pam.push(Nam.top());
            Nam.pop();
            days++;
            System.out.println("Jour " + days + ": Nam" + Nam + ", Pam" + Pam + " et Sam " + Sam);
        }

        /*
        Boucle vérifiant si la taille de la pile "Sam" atteint la valeur 5 . Si elle ne l'est pas, prendre l'élément
        du dessus de la pile "Pam" et le dépiler pour, ensuite, l'empiler dans la nouvelle pile "Sam". Lorsque la pile
        "Sam" atteint la valeur de 5, on sort de la boucle.
        De plus, on met à jour, à chaque itération, le nombre de jours passé grâce au compteur "days".
        Une phrase est aussi renvoyée afin d'informer l'utilisateur sur l'état du déplacement de la ville à chaque
        itération.
         */
        while (Sam.size() < 5) {
            Sam.push(Pam.top());
            Pam.pop();
            days++;
            System.out.println("Jour " + days + " : Nam" + Nam + " , Pam" + Pam + " et Sam " + Sam);
        }

        /*
        Condition qui renvoie un text à l'utilisateur l'informant qu'il est impossible de déplacer la ville en 10
        jours. Ceci est envoyé que si le compteur "day" est supérieur à 10 jours.
         */
        if (days > 10) {
            System.out.println("Il est IMPOSSIBLE de déplacer la ville dans les 10 jours, car " + days + "nombre de jours sont nécessaires.");

        /*
        Condition qui renvoie un text à l'utilisateur l'informant qu'il est effectivement possible de déplacer la
        ville en 10 jours. Ceci est envoyé que si le compteur "day" est inférieur à 10 jours.
         */
        } else {
            System.out.println("Il est POSSIBLE de déplacer la ville dans les 10 jours, car " + days + "nombre de jours sont nécessaires.");
        }

    }
}