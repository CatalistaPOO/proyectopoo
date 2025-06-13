//com.objetos es el "package" de nuestras clases (proyectopoo/src/com/objetos)
//La carpeta bin (binarios, generados por la maquina virtual de Java) NO DEBERIA ESTAR EN GIT (gitignore)
import com.objetos.Prueba;
import com.objetos.Persona;

//las clases siempre seran con mayúsculas (App)
public class App {
    //Esta linea contiene throws Exception y la eliminamos (para usar try/catch)
    // public static void main(String[] args) throws Exception {
    public static void main(String[] args) {
        System.out.println("Usando App");
        System.out.println("-------------------------------------------");
        //EJECUTAMOS UN METODO DE OTRA CLASE (PRUEBA)
        Prueba.saludar();

        //CREAMOS UN NUEVO OBJETO(personaje) DE UNA CLASE (Persona)
        Persona personaje = new Persona();

        System.out.println("-------------------------------------------");

        personaje.setNombre("Lucas"); 
        personaje.setApellido("Lopez");
        //setEdad de la clase PERSONA, en su método contiene throws Exception y Exception en particular si es negativo
        //por esto el método debe ir con try/catch (intenta setearlo y lanza error en la exception contemplada)
        try {
            personaje.setEdad(30); 
        } catch (Exception e) {
            // Un catch nunca estará vacío
            System.out.println("ERROR: " + e.getMessage());
        } finally{
            //finally siempre se ejecuta con indepenedencia de si hay Exception o no. Es opcional.
            //Sirve para asegurar que se cumple un paso sí o sí a pesar del Exception.
            //ejemplo una conexion a BBDD y si pasa algo por el camino, la conexion siempre la cerraremos en finally
        }

        System.out.println("OBJETO PERSONAJE(creado con la clase Persona.java): \nNombre y apellido: " + personaje.getNombre() + " " + personaje.getApellido() + "\nEdad: " +  personaje.getEdad());
    }
}