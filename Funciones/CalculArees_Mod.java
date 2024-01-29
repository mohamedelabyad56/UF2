import java.util.Scanner;

public class CalculArees_Mod {

  // Variables globals
  private double area = 0;
  private boolean fi = false;

  public static void main(String args[]) {
    CalculArees_Mod programa = new CalculArees_Mod();
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
    System.out.println("De quina figura vols calcular l'area?");
    System.out
        .println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");
    System.out.println("Per acabar el programa: FI");
  }

  public void tractarOpcio() {
    Scanner s = new Scanner(System.in);
    String figura = s.nextLine();
    double area = 0;
    if (figura.equals("triangle")) {
      area = triangle();
    } else if (figura.equals("quadrat")) {
      quadrat();
    } else if (figura.equals("rectangle")) {
      rectangle();
    } else if (figura.equals("trapezi")) {
      trapezi();
    } else if (figura.equals("rombe")) {
      rombe();
    } else if (figura.equals("paralelogram")) {
      paralelogram();
    } else if (figura.equals("cercle")) {
      cercle();
    } else if (figura.equalsIgnoreCase("FI")) {
      fi = true;
    }

    else {
      System.out.println("Opció incorrecta!\n");
    }
  }

  public void resultado() {
    System.out.println("L area de tu figura " + " es " + area);
  }

  // cas en que la figura = "triangle"
  public double triangle() {
    double b = 23.0;
    double h = 8.0;
    area = (b * h) / 2;
    return area;
  }

  // cas en que la figura = "quadrat"
  public double quadrat() {
    double r = 37.0;
    // funció matemàtica que eleva a 2 el radi
    area = Math.pow(r, 2);
    return area;
  }

  // cas en que la figura = "rectangle"
  public double rectangle() {
    double a = 68.0;
    double b = 39.0;
    area = a * b;
    return area;
  }

  // cas en que la figura = "trapezi"
  public double trapezi() {
    double a = 35.0;
    double b = 16.0;
    double h = 5.0;
    area = ((a * b) * h) / 2;
    return area;
  }

  // cas en que la figura = "rombe"
  public double rombe() {
    double dM = 75.0;
    double dm = 30.0;
    area = (dM * dm) / 2;
    return area;
  }

  // cas en que la figura = "paralelogram"
  public double paralelogram() {
    double b = 45.0;
    double h = 13.0;
    area = b * h;
    return area;
  }

  // cas en que la figura = "cercle"
  public double cercle() {
    Scanner s = new Scanner(System.in);
    System.out.println("Quin es el radi del cercle?");
    double r = s.nextDouble();
    // funció matemàtica que eleva a 2 el radi
    // Math.PI = nombre pi (3.14159....)
    area = Math.pow(r, 2) * Math.PI;
    return area;
  }
}
