package Units;

import java.util.Scanner;

public class Unit1 {

    static Scanner scanner = new Scanner(System.in);
    static String newline = System.lineSeparator();

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }

    public static class Animal {
        public String species = "default";
        public String name = "default";
        public String owner = "default";
        public int age = -1;
        
        public void setSpecies() {
            System.out.println("Ingrese la especie del animal: ");
            this.species = scanner.nextLine();
        }
        public String getSpecies() { return this.species; }

        public void setName() {
            System.out.println("Ingrese el nombre del animal: ");
            this.name = scanner.nextLine();
        }
        public String getName() { return this.name; }

        public void setOwner() {
            System.out.println("Ingrese el nombre del dueño del animal: ");
            this.owner = scanner.nextLine();
        }
        public String getOwner() { return this.owner; }

        public void setAge() {
            System.out.println("Ingrese la edad del animal: ");
            this.age = scanner.nextInt();
            scanner.nextLine();
        }
        public int getAge() { return this.age; }

        public void setParameters() {
            setSpecies();
            setName();
            setAge();
            setOwner();
        }

        public String getParameters() {
            return (
                "Especie: " + getSpecies() + newline +
                "Nombre: "  + getName()    + newline +
                "Edad: "    + getAge()     + newline +
                "Dueño: "   + getOwner()
            );
        }
    }
    public static void main (String args[]) {
        int loop = 1;
        while (loop == 1) {
            clearScreen();
            Animal animal = new Animal();
            animal.setParameters();
            clearScreen();
            System.out.println(animal.getParameters());
            System.out.println(newline + "Ingrese 1 para crear otro animal: ");
            loop = scanner.nextInt();
            scanner.nextLine();
            scanner.reset();
            animal = null;
        }
        clearScreen();
        return;
    }
}
