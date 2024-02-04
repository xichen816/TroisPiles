import DoubleStack.DoubleArrayStack;
import SpecialStack.SpecialArrayStack;
import Stack.ArrayStack;
public class Test {

    public static void main(String[] args) {
        testArrayStack();
        testDoubleArrayStack();
        testSpecialArrayStack();
    }

    private static void testArrayStack() {

        ArrayStack<String> stringStack = new ArrayStack<String>();
        stringStack.push("One");
        stringStack.push("Two");
        stringStack.push("Three");

        // Affichage du sommet de la pile
        System.out.println("Top: " + stringStack.top());

        // Suppression d'un élément
        stringStack.pop();

        // Affichage du sommet après la suppression
        System.out.println("Top after pop: " + stringStack.top());
    }

    private static void testDoubleArrayStack() {

        DoubleArrayStack<Integer> doubleStack = new DoubleArrayStack<Integer>();

        // Empiler sur la pile 1
        doubleStack.push(true, 5);
        doubleStack.push(true, 10);

        // Empiler sur la pile 2
        doubleStack.push(false, 15);
        doubleStack.push(false, 20);

        // Afficher le sommet de chaque pile
        System.out.println("Top 1: " + doubleStack.top(true));
        System.out.println("Top 2: " + doubleStack.top(false));

        // Afficher la taille de chaque pile
        System.out.println("Size 1: " + doubleStack.size(true));
        System.out.println("Size 2: " + doubleStack.size(false));

        // Afficher si les piles sont pleines
        System.out.println("Stacks Full: " + doubleStack.isFull());

        // Afficher le contenu des piles
        System.out.println("Stack Contents:");
        doubleStack.print();

        // Retirer des éléments des piles
        System.out.println("Pop 1: " + doubleStack.pop(true));
        System.out.println("Pop 2: " + doubleStack.pop(false));

        // Afficher le contenu après le retrait
        System.out.println("Stack Contents after pop:");
        doubleStack.print();
    }

    private static void testSpecialArrayStack() {
        // Création d'une pile spéciale d'entiers
        SpecialArrayStack<Integer> specialStack = (SpecialArrayStack<Integer>) new SpecialArrayStack<>();

        // Test de la pile spéciale
        specialStack.push(5);
        specialStack.push(3);
        specialStack.push(7);

        // Affichage du sommet de la pile
        System.out.println("Top special: " + specialStack.top());

        // Affichage de l'élément maximum
        System.out.println("Max element: " + specialStack.getMax());

        // Suppression d'un élément
        specialStack.pop();

        // Affichage de l'élément maximum après la suppression
        System.out.println("Max element after pop: " + specialStack.getMax());
    }
}
