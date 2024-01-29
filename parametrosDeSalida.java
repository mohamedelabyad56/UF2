import java.util.Scanner;

public class parametrosDeSalida {
    static Scanner scanner = new Scanner(System.in);

    public void main(String[] args) {
        int numero = LlegirEnter("Ingrese un número entero:");
        Calcular2nNombreMesGran(numero);
    }

    public int LlegirEnter(String mensaje) {
        System.out.println(mensaje);
        int numero = scanner.nextInt();
        return numero;
    }

    public void Calcular2nNombreMesGran(int numero) {
        int[] vector1 = new int[7];

    }
}
