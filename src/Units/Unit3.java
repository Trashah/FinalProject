package Units;

import java.util.Stack;
import java.util.Scanner;

public class Unit3 {
    
    static Scanner scanner = new Scanner(System.in);
    static Integer max;
    static Integer min;

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    static void hasValues(Stack<Integer> pila) {
        if (pila.isEmpty()) System.out.println("La pila no contiene valores");
        else System.out.println("La pila contiene valores");
    }
    
    static void insertar(Stack<Integer> pila) {
        for (int i=0; i<5; i++) {
                System.out.println("Inserte un valor entero");
                int numero = Integer.parseInt(scanner.nextLine());
                if (pila.isEmpty()) {
                    min = numero;
                    max = numero;
                }
                if (numero < min) min = numero;
                if (numero > max) max = numero;
                pila.push(numero);
            }
    }
    
    static void vaciar(Stack<Integer> pila) {
        while (!pila.isEmpty()) pila.pop();
        System.out.println("La pila se ha vaciado");
    }

    static void getMin(Stack<Integer> pila) { 
        if (!pila.isEmpty()) System.out.println("El elemento mínimo en la pila es: "+ min);
        else System.out.println ("La pila esta vacia");
    }

    static void getMax(Stack<Integer> pila) { 
        if (!pila.isEmpty()) System.out.println("El elemento mínimo en la pila es: " + max);
        else System.out.println ("La pila esta vacia");
    }

    static void displaymenu() {
        System.out.println("Elija una opción");
        System.out.println("[1] Insertar 5 valores en la pila");
        System.out.println("[2] Vaciar la pila");
        System.out.println("[3] Revisar si la pila contiene valores");
        System.out.println("[4] Obtener el valor mínimo de la pila");
        System.out.println("[5] Obtener el valor máximo de la pila");
        System.out.println("[6] Cerrar programa");
    }

    public static void main(String args[]) {

        Stack<Integer> pila = new Stack<Integer>();
        int opcionMenu = 0;

        while (opcionMenu != 6) {
            clearScreen();
            displaymenu();
            opcionMenu = Integer.parseInt(scanner.nextLine());
            clearScreen();
            switch(opcionMenu) {
            case 1:
                insertar(pila);
                break;
            case 2:
                vaciar(pila);
                scanner.nextLine();
                break;
            case 3:
                hasValues(pila);
                scanner.nextLine();
                break;
            case 4:
                getMin(pila);
                scanner.nextLine();
                break;
            case 5:
                getMax(pila);
                scanner.nextLine();
                break;
            case 6:
                break;
            default:
                System.out.println("Opción no válida");
                scanner.nextLine();
                break;
            }
        }
        scanner.close();
        clearScreen();
        return;
    }
}
