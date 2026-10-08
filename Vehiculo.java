import java.util.Scanner;
abstract class Vehiculo {
protected String placa;
protected double tarifaBase;
public Vehiculo(String placa, double tarifaBase) {
    this.placa = placa;
this.tarifaBase = tarifaBase;
}
public String getPlaca() { return placa; }
public abstract double calcularPeaje();
}
class VehiculoParticular extends Vehiculo {
public VehiculoParticular(String placa, double tarifaBase) {
super(placa, tarifaBase);
}
@Override
public double calcularPeaje() {
return tarifaBase;
}
}