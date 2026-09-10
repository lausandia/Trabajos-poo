public class main {                        

    public static void main(String[] args) {             

        Estudiante e1 = new Estudiante("TI-2026-001", "  Ana Gomez  ", 19);
        
        System.out.println("Creado: " + e1);             

        // --- 2. Leer con getters -----------------------------------------
        System.out.println("Nombre leido con getNombre(): [" + e1.getNombre() + "]");
        System.out.println("Codigo: " + e1.getCodigo());
        System.out.println("Aprobado por ahora: " + e1.isAprobado());  

        e1.setPromedio(4.2);                             
        System.out.println("Tras setPromedio(4.2): " + e1);
        System.out.println("Aprobado ahora: " + e1.isAprobado());       

        System.out.println("\n--- Pruebas de validacion ---");

        try {
            e1.setEdad(3);                               
        } catch (IllegalArgumentException ex) {           
            System.out.println("Rechazado: " + ex.getMessage());
        }

        try {
            e1.setPromedio(7.5);                            
        } catch (IllegalArgumentException ex) {
            System.out.println("Rechazado: " + ex.getMessage());
        }

        try {
            e1.setNombre("   ");                            
        } catch (IllegalArgumentException ex) {
            System.out.println("Rechazado: " + ex.getMessage());
        }

        
        System.out.println("\nEstado final (nada se corrompio): " + e1);
    }
}