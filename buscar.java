import java.util.Scanner;

public class buscar {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que longitud quieres que tenga el vector?");
        int valor = scanner.nextInt();
        int numb;
        int[] vector = new int[valor];

        System.out.println("Escribe los valores para el vector:");
        for (int i = 0; i < valor; i++) {
            System.out.print("Valor: ");
            vector[i] = scanner.nextInt();
        }

        System.out.println("Que numero quieres buscar?");
        numb = scanner.nextInt();

        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < valor; i++) {
            if (vector[i] == numb) {
                encontrado = true;
                posicion = i + 1;
                break;
            }
        }

        if (encontrado) {
            System.out.println(
                    "El numero que estas buscando '" + numb + "' está en el vector en la posicion '" + posicion + "'.");
        } else {
            System.out.println("El numero que estás buscando '" + numb + "' no esta en el vector.");
        }
    }
}
