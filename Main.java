public class Main {

    public static void main(String[] args) {
        //Usuario 
           Usuario usuario1=new Usuario("Alejandro", "Gomez", 16,2009);
           Usuario usuario2=new Usuario("Derek", "Morales", 77,2008);

           usuario1.mostrardatos();
           usuario2.mostrardatos();
           usuario1.setNombre("Alejo");
           
           System.out.println(usuario1.getNombre());
           System.out.println(usuario1.getEdad());
           System.out.println(usuario2.getApellido());
           System.out.println(usuario2.getEdad());


    }
}