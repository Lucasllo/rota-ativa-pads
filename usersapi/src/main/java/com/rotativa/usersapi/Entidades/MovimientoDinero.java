package com.rotativa.usersapi.Entidades;

public class MovimientoDinero {
    private double montoMovimiento;
    private String conceptoMovimiento;

    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
    }
    
    public double getMontoMovimiento() {
        return montoMovimiento;
    }
    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }
    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }
    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }
@Override
public String toString() {
    return "MovimientoDinero {" +
    "montoMovimiento='" + montoMovimiento + '\'' +
    ", conceptoMovimiento='" + conceptoMovimiento +
    '}';

}

}
