package Units;

import java.util.Stack;
import java.util.Scanner;

public class Unit3 {
    
    static Integer Elementomax;
    static Integer Elementomin;
    static Integer numero;

    static void isFull(Stack<Integer> pila) {
        if (!pila.isEmpty()) {
            System.out.println("La pila no contiene valores");
        }
        else {
            System.out.println("La pila contiene valores");
        }
    }
    
    static void insertar(Stack<Integer> pila) {
        for (int i=0;i<5 ;i++) {
            Scanner pilanum = new Scanner(System.in);
            
            while (!pilanum.hasNextInt()) {
                System.out.println("Inserte un valor entero");
                pilanum.next();
            }
            numero = pilanum.nextInt();
            pila.push(numero);
            pilanum.close(); 
        }
        System.out.println("La pila se ha vaciado");
    }
    
    static void vaciar(Stack<Integer> pila) {
        while (!pila.isEmpty()) {
            pila.pop();
        }
        System.out.println("La pila se ha vaciado");
    }

    static void getMin(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía");
        }

        else {
            Elementomin = pila.peek();
            while (!pila.isEmpty()) {
                numero = pila.peek();
                if (numero<Elementomin) {
                    Elementomin = numero;
                }
                pila.pop();
            }
            System.out.println("El elemento mínimo en la pila es: "+Elementomin);
        }
    }

    static void getMax(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía");
        }

        else {
            Elementomax = pila.peek();
            while (!pila.isEmpty()) {
                numero = pila.peek();
                if (numero>Elementomax) {
                    Elementomin = numero;
                }
                pila.pop();
            }
            System.out.println("El elemento mínimo en la pila es: "+Elementomax);
        }
    }

    static void displaymenu() {
        System.out.println("[1]Insertar 5 valores en la pila");
        System.out.println("[2]Vaciar la pila");
        System.out.println("[3]Revisar si la pila se encuentra llena");
        System.out.println("[4]Obtener el valor mínimo de la pila");
        System.out.println("[5]Obtener el valor máximo de la pila");
        System.out.println("[6]Cerrar programa");
    }

    public static void main(String args[]) {

        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Elija una opción");
        displaymenu();

        Scanner opcion = new Scanner(System.in);
        
        while (!opcion.hasNextInt()) {
            System.out.println("Inserte un valor entero");
            opcion.next();
        }
              
        int opcionmenu = opcion.nextInt();

        while (opcionmenu!=6) {
            switch(opcionmenu) {
            case 1:
                insertar(pila);
                break;
            case 2:
                vaciar(pila);
                break;
            case 3:
                isFull(pila);
                break;
            case 4:
                getMin(pila);
                break;
            case 5:
                getMax(pila);
                break;
            default:
                System.out.println("Opción no válida");
            }
            
        displaymenu();
        opcion.nextInt();
        while (!opcion.hasNextInt()) {
            System.out.println("Inserte un valor entero");
            opcion.nextInt();
        }
        opcionmenu = opcion.nextInt();
        opcion.nextLine();
        }
        opcion.close();
        return;
    }
}
