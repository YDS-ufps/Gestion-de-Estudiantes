
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante
{
    // instance variables - replace the example below with your own
    public String nombre;
    public String apellido;
    public int edad;
    public String codigo;
    public String numeroEstudiante;

    /**
     * Constructor for objects of class Estudiante
     */
    public Estudiante(String nombre, String apellido, int edad, String codigo)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.codigo=codigo;
    
        
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCodigo() {
        return codigo;
    }
    public int getEdad(){
        return edad;
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Número de Estudiante: " + codigo;
    }
    
}
