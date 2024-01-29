
import java.util.Scanner;

public class CalculArees {
  private double area = 0;
  private boolean FI = false;

  public static void main(String args[]) {

    CalculArees_Mod programa = new CalculArees_Mod();
    programa.inici();

  }

  public void inici() {
    while (!FI) {
      mostrarMenu();
      tractarOpcio();

    }
  }

  public void mostrarMenu() {
    System.out.println("que figura quieres mostrar ");
    System.out.println(
        "tienes las seguientes opciones: triangulo, cuadrado, rectangulo, trapezi, rombe, paralelogram o circulo. ");
    System.out.println("Escribe 'fi' para terminar ");

  }

  public void tractarOpcio() {
    Scanner teclado = new Scanner(System.in);
    String figura = "";
    figura = teclado.nextLine();
    double area = 0;
    if (figura.equals("triangulo")) {
      area = triangulo();

    } else if (figura.equals("cuadrado")) {
      area = cuadrado();
    } else if (figura.equals("rectangulo")) {
      area = rectangulo();
    } else if (figura.equals("trapezi")) {
      area = trapezi();
    } else if (figura.equals("rombe")) {
      area = rombe();
    } else if (figura.equals("paralelogram")) {
      area = paralelogram();
    } else if (figura.equals("FI")) {
      Fi = true;
    } else {
      System.out.println("Opcion correcta \n");
    }
  }

  public void resultado() {
    System.out.println("El resultado de tu figuro es: " + area);
  }

  public double triangulo() {
    double b = 23.0;
    double h = 8.0;
    area = (b * h) / 2;
    return area;
  }

  public double cuadrado() {
    double r = 37.0;
    area = Math.pow(r, 2);
    return area;
  }

  public double rectangulo() {

  }

  public double trapezi() {

  }

  public double rombe() {

  }

  public double paralelogram() {

  }

  public double circulo() {

  }
}
