class VehiculoCarga extends Vehiculo {
private int numeroEjes;
public VehiculoCarga(String placa, double tarifaBase, int numeroEjes) {
super(placa, tarifaBase);
this.numeroEjes = numeroEjes;
}
@Override
public double calcularPeaje() {
return tarifaBase + (numeroEjes * 5000.0);
}
}
public class SistemaPeaje 
public static void main(String[] args) 
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
