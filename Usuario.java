public class Usuario {

    //Propiedades del objeto
   private String nombre;
    private String apellido;
    private int edad;
     private int fechaN;

    public Usuario(String nombre, String apellido, int edad, int fechaN) {
     this.nombre=nombre;
     this.apellido=apellido;
     this.edad=edad;
     this.fechaN=fechaN;

        

    }

    //Metodos gets
    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;

      
        }

        public int getFecha(){
            return this.fechaN;
        }

        //Metodos sets

        public void setNombre(String nombre){
            this.nombre=nombre;

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
    

    //Encapsulamiento

    public void mostrardatos(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Fecha de Nacimiento: "+fechaN);

    }

}