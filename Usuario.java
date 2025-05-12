public class Usuario {

    // Atributos privados (encapsulados)
    private String nombre;
    private String apellido;
    private int edad;
    private int fechaN;  // Año de nacimiento

    // Constructor: se ejecuta al crear un nuevo objeto
    public Usuario(String nombre, String apellido, int edad, int fechaN) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaN = fechaN;
    }

    // Métodos Get (acceden a los valores de los atributos)
    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getFecha() {
        return this.fechaN;
    }

    // Métodos Set (modifican los valores de los atributos)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaN(int fechaN) {
        this.fechaN = fechaN;
    }

    // Método para mostrar todos los datos del usuario
    public void mostrardatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha de Nacimiento: " + fechaN);
    }
}
