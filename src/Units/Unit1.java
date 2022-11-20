package Units;

import java.util.Scanner;

public class Unit1 {

    static Scanner scanner = new Scanner(System.in);

    public static class Animal {
        public String species = "default";
        public String name = "default";
        public String owner = "default";
        public int age = -1;
        
        public void feed() { System.out.println(this.getName() + " is eating"); }
        

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
        }
        public int getAge() { return this.age; }

        public void setParameters() {
            setSpecies();
            setName();
            setOwner();
            setAge();
        }

        public void getParameters() {
            String newline = System.lineSeparator();
            System.out.println(
                "Especie: " + getSpecies() + newline +
                "Nombre: "  + getName()    + newline +
                "Edad: "    + getAge()     + newline +
                "Dueño: "   + getOwner()
            );
        }
    }
    public static void main (String args[]) {
        boolean loop = true;
        while (loop) {
            Animal animal = new Animal();
            animal.setParameters();
            animal.getParameters();
        }
            
    }
}
