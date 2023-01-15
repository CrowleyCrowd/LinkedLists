import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class App {
    private List lst;
    private int valueEntered = 0;
    private String  menu;
    private Scanner sc;
    
    /**
     * List Menu Method
     */
    public App() {
        this.lst = new List();
        this.sc = new Scanner(System.in);
        this.menu = 
        "Listas enlazadas simples \n" +
        "1. Crear lista. \n" +
        "2. Imprimir lista. \n" +
        "3. Agregar nodos al inicio. \n" +
        "4. Agregar nodos al final. \n" +
        "5. Bucar nodo. \n" +
        "6. Borrar nodo inicial. \n" +
        "7. Borrar nodo final. \n" +
        "8. Salir. \n";
    }

    /**
     * Menu Method
     */
    public void displayMenu() {
        int number = 0;
        do {
            System.out.println(this.menu);
            number = sc.nextInt();
            switch (number) {
                case 1: this.createList();
                    break;
                case 2: System.out.println(this.lst.print());
                    break;
                case 3: this.unshiftNode();
                    break;
                case 4: this.pushNode();
                    break;
                case 5: this.searchNode();
                    break;
                case 6: this.shiftNode();
                    break;
                case 7: this.popNode();
                    break;
                case 8: System.out.println("Que tenga un buen día. Adios");
                    break;
                default: System.out.println("La opción marcada no es  válida");
                    break;
            }

        } while (number != 8);
    }

    /**
     * Create a default list from 1 to 10 in the node.
     */
    public void createList() {
        this.lst = new List();
        for(int info=1; info <=10; info ++) {
            this.lst.push(info);
        }
        System.out.println(this.lst.print());
    }
    
    /**
     * Add first node
     */
    public void unshiftNode() {
        System.out.println("Ingrese el valor a ingresar");
        valueEntered = this.sc.nextInt();
        this.lst.unshift(valueEntered);
        System.out.println(this.lst.print());
    }

    /**
     * Add last node
     */
    public void pushNode() {
        System.out.println("Ingrese el valor a ingresar");
        valueEntered = this.sc.nextInt();
        this.lst.push(valueEntered);
        System.out.println(this.lst.print());
    }

    /**
     * Search data in node
     */
    public void searchNode() {
        int n = 0;
        System.out.println("Ingresa el valor que deseas buscar");
        n = sc.nextInt();
        if(this.lst.search(n)) {
            System.out.println("El valor ingresado se ha encontrado.");
        } else {
            System.out.println("El valor ingresado no existe");
        }
        System.out.println(this.lst.print());
    }

    /**
     * Delete first node
     */
    public void shiftNode() {
        if (this.lst.shift()) {
            System.out.println("El nodo se ha eliminado de forma satisfactoria");
        } else {
            System.out.println("El nodo no se ha encontrado");
        }
        System.out.println(this.lst.print());
    }

    /**
     * Delete last node
     */
    public void popNode() {
        if (this.lst.pop()) {
            System.out.println("El nodo se ha eliminado de forma satisfactoria");
        } else {
            System.out.println("El nodo no se ha encontrado");
        }
        System.out.println(this.lst.print());
    }

    /**
     * Main Method
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        App list = new App();
        list.displayMenu();
    }
}
