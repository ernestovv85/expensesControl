package Menus;

import java.util.Scanner;

import static Menus.ExpenseMenu.expenseMenu;
import static Menus.GeneralReportMenu.generalReportMenu;
import static Menus.IncomeMenu.incomeMenu;

public class GeneralMenu {
  private static final Scanner in = new Scanner(System.in);

  public static void generalMenu() {
    String wellcome = "Bienvenido a control de gastos!\n" + "Elija la opción deseada:";
    System.out.println(wellcome);
    System.out.println("1. Ingresos\n" + "2. Gastos\n" + "3. Reporte general\n" + "4. Salir");

    int options = in.nextInt();
    switch (options) {
      case 1:
        incomeMenu();
        break;
      case 2:
        expenseMenu();
        break;
      case 3:
        generalReportMenu();
        break;
      case 4:
        System.out.println("Gracias por usar la aplicación. ¡Vuelva pronto!");
        break;
      default:
        System.out.println("No se encontró la opción indicada. Intente de nuevo");
        generalMenu();
    }
  }
}
