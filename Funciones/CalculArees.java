
import java.util.Scanner;

public class CalculArees {
  private double area = 0;
  private boolean fi = false;

  public static void main(String args[]) {
    CalculArees programa = new CalculArees();
    programa.inici();
  }

  public void inici() {
    while (!fi) {
      mostrarMenu();
      tractarOpcio();
      resultado();
    }
  }

  public void mostrarMenu() {
    System.out.println("¿Qué figura quieres mostrar?");
    System.out.println(
        "Tienes las siguientes opciones: triangulo, cuadrado, rectangulo, trapezi, rombe, paralelogram o circulo.");
    System.out.println("Escribe 'fi' para terminar");
  }

  public void tractarOpcio() {
    Scanner teclado = new Scanner(System.in);
    String figura = teclado.nextLine();
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
    } else if (figura.equals("circulo")) {
      area = circulo();
    } else if (figura.equals("fi")) {
      fi = true;
    } else {
      System.out.println("Opcion incorrecta \n");
    }
  }

  public void resultado() {
    System.out.println("El resultado de tu figura es: " + area);
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
    double a = 68.0;
    double b = 39.0;
    area = a * b;
    return area;
  }

  public double trapezi() {
    double a = 35.0;
    double b = 16.0;
    double h = 5.0;
    area = ((a + b) * h) / 2;
    return area;
  }

  public double rombe() {
    double dM = 75.0;
    double dm = 30.0;
    area = (dM * dm) / 2;
    return area;
  }

  public double paralelogram() {
    double b = 45.0;
    double h = 13.0;
    area = b * h;
    return area;
  }

  public double circulo() {
    Scanner s = new Scanner(System.in);
    System.out.println("Cuál es el radio del círculo?");
    double r = s.nextDouble();
    area = Math.pow(r, 2) * Math.PI;
    return area;
  }
}
