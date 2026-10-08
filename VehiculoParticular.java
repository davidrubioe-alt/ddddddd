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