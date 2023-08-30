package menus;

import java.util.Scanner;

import static controllers.ExpenseCreateController.expenseRegister;
import static menus.AlternativeMenu.alternativeMenuExpense;
import static menus.GeneralMenu.generalMenu;

public class ExpenseMenu {
  private static final Scanner in = new Scanner(System.in);

  public static void expenseMenu() {
    System.out.println("Elija la opción deseada:");
    System.out.println("1. Agregar gasto\n" + "2. Historial de gastos\n" + "3. Gastos por mes\n" + "4. Gastos por año\n" + "5. Menú anterior\n" + "6. Salir");
    int options = in.nextInt();
    switch(options) {
      case 1:
        System.out.println("Agregar gasto");
        expenseRegister();
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuExpense();
        break;
      case 2:
        System.out.println("Historial de gastos");
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuExpense();
        break;
      case 3:
        System.out.println("Gastos por mes");
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuExpense();
        break;
      case 4:
        System.out.println("Gastos por año");
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuExpense();
        break;
      case 5:
        generalMenu();
        break;
      case 6:
        System.out.println("Gracias por usar la aplicación. ¡Vuelva pronto!");
        break;
      default:
        System.out.println("No se encontró la opción indicada. Intente de nuevo.");
        expenseMenu();
    }
  }
}
