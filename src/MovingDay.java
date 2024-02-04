import Stack.ArrayStack;
public class MovingDay {
    public static <String> void movingDay() {

        ArrayStack<String> Nam = new ArrayStack<String>();
        Nam.push((String) "N5: Le Roi");
        Nam.push((String) "N4: Gouvernement");
        Nam.push((String) "N3: Académie");
        Nam.push((String) "N2: Manufacture");
        Nam.push((String) "N1: Agriculture");
        ArrayStack<String> Pam = new ArrayStack<String>();
        ArrayStack<String> Sam = new ArrayStack<String>();

        int days = 0;
        System.out.println("\u001B[1m" + "Jour " + days + ": Nam" + "\u001B[0m" + Nam + " ,Pam" + Pam + " et Sam " + Sam);

        while (!Nam.isEmpty()) {
            Pam.push(Nam.top());
            Nam.pop();
            days++;
            System.out.println("Jour " + days + ": Nam" + Nam + ", Pam" + Pam + " et Sam " + Sam);
        }
        while (Sam.size() < 5) {
            Sam.push(Pam.top());
            Pam.pop();
            days++;
            System.out.println("Jour " + days + " : Nam" + Nam + " , Pam" + Pam + " et Sam " + Sam);
        }

        if (days > 10) {
            System.out.println("Il est IMPOSSIBLE de déplacer la ville dans les 10 jours, car " + days + "nombre de jours sont nécessaires.");
        } else {
            System.out.println("Il est POSSIBLE de déplacer la ville dans les 10 jours, car " + days + "nombre de jours sont nécessaires.");
        }

    }
}