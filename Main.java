import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    CuentaAhorro cuentaAhorro;
    CuentaCorriente cuentaCorriente;
    ArrayList<CuentaAhorro> cuentasPobres = new ArrayList<>();
    ArrayList<CuentaCorriente> cuentasRicos = new ArrayList<>();
    int opcion;
    float saldo;
    float tasa;
    //Crear leer actualizar eliminar salir
    do{
      menu();
      opcion = scanner.nextInt();
      linea();
      switch(opcion){
        case 1:
          System.out.println("1.-Ahorros");
          System.out.println("2.-Corriente");
          int tipo = scanner.nextInt();
          linea();
          switch(tipo){
            case 1:
              msj();
              saldo = scanner.nextFloat();
              msj2();
              tasa = scanner.nextFloat();
              linea();
              cuentaAhorro = new CuentaAhorro(saldo, tasa);
              cuentasPobres.add(cuentaAhorro);
              break;
            case 2:
              msj();
              saldo = scanner.nextFloat();
              msj2();
              tasa = scanner.nextFloat();
              linea();
              cuentaCorriente = new CuentaCorriente(saldo, tasa);
              cuentasRicos.add(cuentaCorriente);
              break;
            default:
              System.out.println("error");
          }
          break;
        case 2:
          System.out.println("ingrese el identificador de registro");
          int identificador = scanner.nextInt();

        default:
          System.out.println("error");
      }  
    }while(opcion != 5);
    scanner.close();
  }
  public static void menu(){
    System.out.println("¿Qué operación quiere realizar?");
    System.out.println("1.-Crear cuenta");
    System.out.println("2.-Leer cuenta");
    System.out.println("3.-Actualizar cuenta");
    System.out.println("4.-Elinar cuenta");
    System.out.println("5.-salir");
  }
  public static void linea(){
    System.out.println("---------------------------------------------------------------------------");
  }
  public static void msj(){
    System.out.println("ingresar monto");
  }
  public static void msj2(){
    System.out.println("ingresar tasa anual");
  }
}
