public class Main {

    public static void main(String[] args) {
        // Crear dos objetos de tipo Usuario con valores iniciales
        Usuario usuario1 = new Usuario("Alejandro", "Gomez", 16, 2009);
        Usuario usuario2 = new Usuario("Derek", "Morales", 77, 2008);

        // Mostrar los datos de ambos usuarios usando el método mostrardatos
        usuario1.mostrardatos();
        usuario2.mostrardatos();

        // Cambiar el nombre de usuario1 a "Alejo" usando el método setNombre
        usuario1.setNombre("Alejo");

        // Mostrar el nuevo nombre, edad y otros datos usando los métodos get
        System.out.println(usuario1.getNombre());     // Muestra el nuevo nombre "Alejo"
        System.out.println(usuario1.getEdad());       // Muestra la edad de usuario1
        System.out.println(usuario2.getApellido());   // Muestra el apellido de usuario2
        System.out.println(usuario2.getEdad());       // Muestra la edad de usuario2
    }
}
