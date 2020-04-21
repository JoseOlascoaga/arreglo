import java.util.ArrayList;



public class Principal
{
    
    public static void Principal(String[] args)
    {
     ArrayList<empleado> contratistas = new ArrayList<empleado>(); 
     
     empleado empleado1 = new empleado();
     empleado1.setnombre("David");
     empleado1.setapellido("Vasquez");
     empleado1.setgenero("Masculino");
     empleado1.setdireccion("CRA 48# 76B43");
     empleado1.settelefono("3456787");
     empleado1.setfecha_de_nacimiento("21/11/1987");
     empleado1.setlugar_de_nacimiento("Barranquilla");
     
     
     empleado empleado2 = new empleado();
     empleado2.setnombre("Carl");
     empleado2.setapellido("Johnson");
     empleado2.setgenero("Masculino");
     empleado2.setdireccion("CRA 28# 67B34");
     empleado2.settelefono("3751767");
     empleado2.setfecha_de_nacimiento("12/01/1999");
     empleado2.setlugar_de_nacimiento("Barranquilla");
    
     contratistas.add(empleado1);
     contratistas.add(empleado2);
     
     
     contratistas.forEach((emp) -> System.out.println(emp.getnombre() + "  " + emp.getapellido() + " | " + emp.getgenero() + " | " + emp.getdireccion() + " | " + emp.gettelefono() + " | " + emp.getfecha_de_nacimiento() + " | " + emp.getlugar_de_nacimiento() ));
        
    }

    
}
