import java.util.Scanner;

public class predeccionP {
    private Scanner teclado;

    public predeccionP() {
        teclado = new Scanner(System.in);
    }

    public static void main(String args[]) {
        predeccionP programa = new predeccionP();
        programa.inici();
    }

    public void inici() {
        mostrarmenu();
        opciones();
    }

    public void mostrarmenu() {
        System.out.println("Escriu el mes en què vas néixer.");
        System.out.println("Gener\tFebrer\tMarc");
        System.out.println("Abril\tMaig\tJuny");
        System.out.println("Juliol\tAgost\tSetembre");
        System.out.println("Octubre\tNovembre\tDesembre");
        System.out.println();
    }

    public String mesnacimiento() {
        System.out.print("Introdueix el nom del mes: ");
        return teclado.nextLine();
    }

    public String nombre() {
        System.out.print("Introduce tu nombre: ");
        return teclado.nextLine();
    }

    public int edad() {
        int age = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Cuantos años tienes?: ");
                age = Integer.parseInt(teclado.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un numero valido.");
            }
        }
        return age;
    }

    public void opciones() {
        int numSort = 0;
        String equipFutbol = "";
        String llenguatgeProgramacio = "";

        String mesNaixement = mesnacimiento();

        if (mesNaixement.equalsIgnoreCase("Gener")) {
            numSort = edad() * 3 / 2;
            equipFutbol = "Bayern de Munich";
            llenguatgeProgramacio = "C++";
        } else if (mesNaixement.equalsIgnoreCase("Febrer")) {
            numSort = edad() - 4;
            equipFutbol = "Atlético de Madrid";
            llenguatgeProgramacio = "Python";
        } else if (mesNaixement.equalsIgnoreCase("Marc")) {
            numSort = edad() / 2;
            equipFutbol = "Chelsea";
            llenguatgeProgramacio = "JavaScript";
        } else if (mesNaixement.equalsIgnoreCase("Abril")) {
            numSort = edad() % 4;
            equipFutbol = "Manchester city";
            llenguatgeProgramacio = "Node.js";
        } else if (mesNaixement.equalsIgnoreCase("Maig")) {
            numSort = edad() * 3 / 6;
            equipFutbol = "Liverpool";
            llenguatgeProgramacio = "React";
        } else if (mesNaixement.equalsIgnoreCase("Juny")) {
            numSort = edad() + edad();
            equipFutbol = "Real Madrid";
            llenguatgeProgramacio = "C#";
        } else if (mesNaixement.equalsIgnoreCase("Juliol")) {
            numSort = edad() * edad() / 5;
            equipFutbol = "BVB";
            llenguatgeProgramacio = "Swift";
        } else if (mesNaixement.equalsIgnoreCase("Agost")) {
            numSort = edad() * 1 / 2 * edad();
            equipFutbol = "FCB";
            llenguatgeProgramacio = "Java";
        } else if (mesNaixement.equalsIgnoreCase("Setembre")) {
            numSort = edad() / edad();
            equipFutbol = "Juve";
            llenguatgeProgramacio = "PHP";
        } else if (mesNaixement.equalsIgnoreCase("Octubre")) {
            numSort = edad() * 4 / 3;
            equipFutbol = "PSG";
            llenguatgeProgramacio = "R";
        } else if (mesNaixement.equalsIgnoreCase("Novembre")) {
            numSort = edad() % 2 + 23;
            equipFutbol = "Sevilla CF";
            llenguatgeProgramacio = "Go";
        } else if (mesNaixement.equalsIgnoreCase("Decembre")) {
            numSort = (edad() + edad()) / 2;
            equipFutbol = "Manchester United";
            llenguatgeProgramacio = "Ruby";

        } else {
            numSort = 0;
            equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
            llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
            System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
        }

        resultado(numSort, equipFutbol, llenguatgeProgramacio);
        teclado.close();
    }

    public void resultado(int numSort, String equipFutbol, String llenguatgeProgramacio) {
        String nom = nombre();

        System.out.print("------------------------------------------------\n");
        System.out.print("Un plaer conèixer-te " + nom
                + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
        System.out.print("\n\n");
        System.out.print(">>> El teu número de la sort és el " + numSort + "!");
        System.out.print("\n\n");
        System.out.print(
                ">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
        System.out.print("\n\n");
        System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
        System.out.print("\n\n");
        System.out.print("Torna quan vulguis!\n");
        System.out.print("------------------------------------------------\n\n\n");
    }
}
