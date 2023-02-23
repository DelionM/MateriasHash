package materiashash;
import java.util.Hashtable;

public class MateriasHash {
    public static void main(String[] args) {
        Hashtable<String, Materia>  materias= new Hashtable <String, Materia>();
        //                              materia, clave, promedio
        materias.put("M1", new Materia("Estructura de Datos", "M1 ", 4.4));
        materias.put("M2", new Materia("Administración de Base de Datos", "M2 ", 8));
        materias.put("M3", new Materia("Matematicas Discretas", "M3 ", 6.9));
        materias.put("M4", new Materia("Sistemas Electronicos II", "M4 ", 7.6));
        materias.put("M5", new Materia("Ingles", "M5 ", 8.1));
        
        System.out.println("Calificación primer parcial");
        for (String key  : materias.keySet()){
            System.out.println("clave "+ key + "  "  + materias.get(key));
        }
        
        System.out.println("Cantidad de Materias");
        System.out.println(materias.size());
        
        //Aumentar medio punto a cada materia 
        materias.forEach((clave, materia) ->{
            materia.setPromedio(0.5 + materia.getPromedio());
            materias.replace(clave, materia);
        }
        );
        System.out.println("Aumentamos la calificación medio punto ");
        for (String key  : materias.keySet()){
            System.out.println("clave "+ key + " Promedio "  + materias.get(key).getPromedio());
        }
        
        //Buscar si exite una materia
        System.out.println("¿Existe la metria M3?");
        if (materias.containsKey("M3")){
            System.out.println("Existe la materia :D");
        }
        else {
            System.out.println("La materia no existe :c ");
        }
        
        //borrar una materia
        System.out.println("Borramos la materia M3");
        materias.remove("M3");
        
        //Imprimimos nuevamente la cantidad de materias 
        System.out.println("\n");
        System.out.println("Cantidad de Materias");
        System.out.println(materias.size());
        
        System.out.println("¿Existe la metria M3?");
        if (materias.containsKey("M3")){
            System.out.println("Existe la materia :D");
        }
        else {
            System.out.println("La materia no existe :c ");
        }
        
    }
    
}
