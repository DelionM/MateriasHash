package materiashash;
public class Materia {
    public String materia;
    public double Promedio;
    public String clave;

    public Materia(String materia, String clave, double Promedio) {
        this.materia = materia;
        this.Promedio = Promedio;
        this.clave = clave;
    }

     public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }
     
    public double getPromedio() {
        return Promedio;
    }
    
    @Override
    public String toString()
    {
        return String.format("Materia  "+ materia + "  Clave de la Materia: "+clave+ " Promedio %.2f ", Promedio);
    }
    
    
   
    
}
