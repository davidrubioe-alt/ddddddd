import java.util.Scanner;
public class SistemaPeaje {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("=== SISTEMA DE PEAJE ELECTRÓNICO EN COLOMBIA ===");
System.out.println("1. Vehículo Particular");
System.out.println("2. Vehículo de Carga");
System.out.print("Seleccione opción: ");
int opcion = scanner.nextInt();
scanner.nextLine();
System.out.print("Ingrese la placa: ");
String placa = scanner.nextLine();
double tarifaBase = 10000.0;
Vehiculo vehiculo = null;

if (opcion == 1) {
vehiculo = new VehiculoParticular(placa, tarifaBase);
} else if (opcion == 2) {
System.out.print("Ingrese número de ejes: ");
int ejes = scanner.nextInt();
vehiculo = new VehiculoCarga(placa, tarifaBase, ejes);
}
if (vehiculo != null) {
System.out.println("\n-------------------------------------------");
System.out.println(" RECIBO DE PEAJE ");
System.out.println("-------------------------------------------");
System.out.println("Placa: " + vehiculo.getPlaca());
System.out.println("Total Pagar: $" + vehiculo.calcularPeaje() + " COP");
System.out.println("-------------------------------------------");
}
scanner.close();
}
}
