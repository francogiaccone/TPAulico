package tpaulico;

import java.util.ArrayList;

public class Empresa {
    
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }
    
    public String mostrarEmpleados() {
        String lista = "";
        for (Empleado empleado : empleados) {
            lista += empleado + "\n";
        }
        return lista;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return razonSocial + " CUIT: " + cuit;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.cuit;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (this.cuit != other.cuit) {
            return false;
        }
        return true;
    }
     
}
