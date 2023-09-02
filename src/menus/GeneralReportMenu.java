package menus;

import java.util.Scanner;

import static controllers.generalReportControllers.RemainingPerMonth.remainingPerMonth;
import static controllers.generalReportControllers.RemainingPerYear.remainingPerYear;
import static menus.AlternativeMenu.alternativeMenuGeneralReport;
import static menus.GeneralMenu.generalMenu;

public class GeneralReportMenu {
  private static final Scanner in = new Scanner(System.in);

  public static void generalReportMenu() {
    System.out.println("Elija la opción deseada:");
    System.out.println("1. Restante por mes\n" + "2. Restante por año\n" + "3. Menú anterior\n" + "4. Salir");
    int options = in.nextInt();
    switch(options) {
      case 1:
        System.out.println("Restante por mes");
        remainingPerMonth();
        System.out.println("Operación realizada con éxito");
        alternativeMenuGeneralReport();
        break;
      case 2:
        System.out.println("Restante por año");
        remainingPerYear();
        System.out.println("Operación realizada con éxito");
        alternativeMenuGeneralReport();
        break;
      case 3:
        generalMenu();
        break;
      case 4:
        System.out.println("Gracias por usar la aplicación. ¡Vuelva pronto!");
        break;
      default:
        System.out.println("No se encontró la opción indicada. Intente de nuevo.");
        generalReportMenu();
    }
  }
}
