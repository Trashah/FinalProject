package Units;

import java.util.Scanner;

public class Unit2 {

    static Scanner scanner = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    static void displayMenu() {
        System.out.println("[1] Cálculo del número n número Fibonacci");
        System.out.println("[2] Cálculo del factorial de n");
        System.out.println("[3] Cerrar programa");
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
     
    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
        
    public static void main(String args[]) {
        int loop = 1;
        while (loop == 1) {
            clearScreen();
            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            clearScreen();
            switch (choice) {
                case 1:
                    System.out.println("Ingrese un número: ");
                    int fibNum = Integer.parseInt(scanner.nextLine());
                    System.out.println("El numero fibonacci en la posicion " + fibNum + " es: " + fib(fibNum));
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Ingrese un número: ");
                    int facNum = Integer.parseInt(scanner.nextLine());
                    System.out.println("El factorial de " + facNum + " es: " + factorial(facNum));
                    scanner.nextLine();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Entrada no valida");
                    scanner.nextLine();
                    break;
            }
        }
        return;
    }    
}

