package menus;

import java.util.Scanner;

import static menus.ExpenseMenu.expenseMenu;
import static menus.GeneralMenu.generalMenu;
import static menus.GeneralReportMenu.generalReportMenu;
import static menus.IncomeMenu.incomeMenu;

public class AlternativeMenu {
  private static final Scanner in = new Scanner(System.in);

  public static void alternativeMenuExpense() {
    System.out.println("1. Menú anterior\n" + "2. Menú general\n" + "3. Salir");
    int options = in.nextInt();
    switch(options) {
      case 1:
        expenseMenu();
        break;
      case 2:
        generalMenu();
        break;
      case 3:
        System.out.println("Gracias por usar la aplicación. ¡Vuelva pronto!");
        break;
      default:
        System.out.println("No se encontró la opción indicada. Intente de nuevo.");
        alternativeMenuExpense();
    }
  }

  public static void alternativeMenuIncome() {
    System.out.println("1. Menú anterior\n" + "2. Menú general\n" + "3. Salir");
    int options = in.nextInt();
    switch(options) {
      case 1:
        incomeMenu();
        break;
      case 2:
        generalMenu();
        break;
      case 3:
        System.out.println("Gracias por usar la aplicación. ¡Vuelva pronto!");
        break;
      default:
        System.out.println("No se encontró la opción indicada. Intente de nuevo.");
        alternativeMenuIncome();
    }
  }

  public static void alternativeMenuGeneralReport() {
    System.out.println("1. Menú anterior\n" + "2. Menú general\n" + "3. Salir");
    int options = in.nextInt();
    switch(options) {
      case 1:
        generalReportMenu();
        break;
      case 2:
        generalMenu();
        break;
      case 3:
        System.out.println("Gracias por usar la aplicación. ¡Vuelva pronto!");
        break;
      default:
        System.out.println("No se encontró la opción indicada. Intente de nuevo.");
        alternativeMenuGeneralReport();
    }
  }
}
