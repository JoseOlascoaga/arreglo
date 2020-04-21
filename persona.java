

public class persona
{    
   String nombre;
   String apellido;
   String genero;
   String telefono;
   String direccion;
   String fecha_de_nacimiento;
   String lugar_de_nacimiento;
   
    public persona()
    {
       
    }

    public persona(String nom, String ape, String gen, String tel, String dir, String fcn, String lgn){
    this.nombre = nom;
    this.apellido = ape;
    this.genero = gen;
    this.fecha_de_nacimiento = fcn;
    this.lugar_de_nacimiento = lgn;
    this.direccion = dir;
    this.telefono = tel;
    
    
} 

    public void setnombre(String nom){
     this.nombre = nom; 
     
}

   public void setapellido(String ape){
    this.apellido = ape;
}
   
   public void setgenero(String gen){
    this.genero = gen;
}
   
   public void setfecha_de_nacimiento(String fn){
    this.fecha_de_nacimiento = fn;
}
  
  public void setlugar_de_nacimiento(String lgn){
    this.lugar_de_nacimiento = lgn;
}
  
  public void setdireccion(String dir){
    this.direccion = dir;
}
  
 public void settelefono(String tel){
    this.telefono = tel;
}




  public String getnombre(){
    return this.nombre;
}

  public String getapellido(){
    return this.apellido;
}
 
public String getgenero(){
    return this.genero;
}
   
   public String getfecha_de_nacimiento(){
    return this.fecha_de_nacimiento;
}
  
  public String getlugar_de_nacimiento(){
    return this.lugar_de_nacimiento;
}
  
  public String getdireccion(){
    return this.direccion;
}
  
 public String gettelefono(){
    return this.telefono;
}
  
}
