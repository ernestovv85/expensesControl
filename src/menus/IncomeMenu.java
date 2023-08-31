package menus;

import java.util.Scanner;

import static controllers.IncomeCreateController.incomeRegister;
import static controllers.IncomeGetController.incomeGetAll;
import static controllers.IncomeUpdateController.incomeUpdate;
import static menus.AlternativeMenu.alternativeMenuIncome;
import static menus.GeneralMenu.generalMenu;

public class IncomeMenu {
  private static final Scanner in = new Scanner(System.in);

  public static void incomeMenu() {
    System.out.println("Elija la opción deseada:");
    System.out.println(
            "1. Agregar ingreso\n" +
            "2. Historial de ingresos\n" +
            "3. Ingresos por mes\n" +
            "4. Ingresos por año\n" +
            "5. Modificar ingreso\n" +
            "6. Eliminar ingreso\n" +
            "7. Menú anterior\n" +
            "8. Salir");
    int options = in.nextInt();
    switch(options) {
      case 1:
        System.out.println("Agregar ingreso");
        incomeRegister();
        System.out.println("Operación realizada con éxito");
        alternativeMenuIncome();
        break;
      case 2:
        System.out.println("Historial de ingresos");
        incomeGetAll();
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuIncome();
        break;
      case 3:
        System.out.println("Ingresos por mes");
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuIncome();
        break;
      case 4:
        System.out.println("Ingresos por año");
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuIncome();
        break;
      case 5:
        System.out.println("Modificar ingreso");
        incomeUpdate();
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuIncome();
        break;
      case 6:
        System.out.println("Eliminar ingreso");
        System.out.println("Operación realizada con éxito\n" + "Elija una opción:");
        alternativeMenuIncome();
      case 7:
        generalMenu();
        break;
      case 8:
        System.out.println("Gracias por usar la aplicación. ¡Vuelva pronto!");
        break;
      default:
        System.out.println("No se encontró la opción indicada. Intente de nuevo.");
        incomeMenu();
    }
  }
}
