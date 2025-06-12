//com.objetos es el "package" de nuestras clases (proyectopoo/src/com/objetos)
//La carpeta bin (binarios, generados por la maquina virtual de Java) NO DEBERIA ESTAR EN GIT (gitignore)
import com.objetos.Prueba;
import com.objetos.Persona;

//las clases siempre seran con mayúsculas (App)
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Usando App");
        System.out.println("-------------------------------------------");
        //EJECUTAMOS UN METODO DE OTRA CLASE (PRUEBA)
        Prueba.saludar();

        //CREAMOS UN NUEVO OBJETO(personaje) DE UNA CLASE (Persona)
        Persona personaje = new Persona();

        System.out.println("-------------------------------------------");

        personaje.nombre = "Lucas";
        personaje.apellidos = "Lopez";
        personaje.edad = 30;

        System.out.println("OBJETO PERSONAJE(creado con la clase Persona.java): \nNombre y apellido: " + personaje.nombre + " " + personaje.apellidos + "\nEdad: " +  personaje.edad);
    }
}