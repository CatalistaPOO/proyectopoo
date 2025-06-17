//com.objetos funciona como "package" de nuestras clases (nombreDelProyecto/src/com/objetos)
//La carpeta bin (binarios, generados por la maquina virtual de Java) NO DEBERIA ESTAR EN GIT (especificar en .gitignore)
import com.objetos.Prueba;
import com.objetos.Persona.tipoGenero;
import com.objetos.Persona;

import java.util.ArrayList;

import com.objetos.Director;
import com.objetos.Empleado;
// import com.objetos.* //import todos las clases de esa carpeta

//las clases siempre seran con mayúsculas (App)
public class App {
    //Esta linea contiene throws Exception y la eliminamos (para usar try/catch)
    // public static void main(String[] args) throws Exception {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("Usando App");
        System.out.println("-------------------------------------------");
        //EJECUTAMOS UN METODO DE OTRA CLASE (PRUEBA)
        Prueba.saludar();

        //CREAMOS UN NUEVO OBJETO(personaje) DE UNA CLASE(Persona)
        Persona personaje = new Persona();

        System.out.println("-------------------------------------------");

        personaje.setNombre("Lucas"); 
        personaje.setApellido("Lopez");
        //setEdad de la clase PERSONA, en su método contiene throws Exception y Exception en particular si es negativo.
        //por esto el método debe ir con try/catch (intenta setearlo y lanza error si falla dando la Exception contemplada)
        try {
            personaje.setEdad(30); 
        } catch (Exception e) {//definimos la Exception con nombre e
            // Un catch NUNCA estará vacío
            System.out.println("ERROR: " + e.getMessage());//e(Exception) lanza un mensaje (getmessage) que hemos definido en la clase persona
        } finally{
            //finally siempre se ejecuta con indepenedencia de si hay Exception o no. Es opcional.
            //Sirve para asegurar que se cumple un paso sí o sí a pesar de producirse Exception.
            //ejemplo una conexion a BBDD y si pasa algo por el camino, la conexion siempre la cerraremos en finally
        }

        System.out.println("OBJETO PERSONAJE(creado con la clase Persona.java): \nNombre y apellido: " + personaje.getNombre() + " " + personaje.getApellido() + "\nEdad: " +  personaje.getEdad());
        
        //METODO FIRMA DE LA CLASE PERSONA Y METODOS CON SOBRECARGA
        
        System.out.println(personaje.getNombreCompleto());
        
        System.out.println(personaje.getNombreCompleto(3));//Sobrecarga de getNombreCompleto
        
        System.out.println(personaje.getNombreCompleto(true));//Sobrecarga de getNombreCompleto

        personaje.setGenero(tipoGenero.MASCULINO);//acceso a Enum con: Enum.elemento
        System.out.println("Genero: " + personaje.getGenero());

        //METODO QUE DEVUELVE UN DNI CON LETRA (comentado en clase)
        // personaje.setDni(12345678);
        // System.out.println("DNI: " + personaje.getDni() + " letra DNI: " + personaje.getDniLetra());

        //METODO STATIC (NO UTILIZA EL OBJETO, SE LLAMA DESDE LA CLASE) QUE DEVUELVE UN DNI CON LETRA
        

        //HERENCIA
        //La clase Empleado hereda de persona y tiene sus metodos, pero ademas implementa nuevos metodos que no tienen Persona
        Empleado empleado = new Empleado();
        empleado.getNombre();//Metodo de persona en empleado
        empleado.getSueldo();//Metodo exclusivo de empleado
        empleado.setSueldo(1200);
        empleado.setNombre("Pedro");
        empleado.setApellido("García");
        System.out.println("Vacaciones de empleado: " + empleado.getDiasVacaciones());
        System.out.println(empleado.toString());//metodo sobreescrito con Override

        //La clase director hereda de Empleado que a su vez hereda de Persona:
        Director direction = new Director();
        direction.setNombre("Bebe");
        direction.setApellido("Jefazo");
        System.out.println(direction.getSueldoMinimo());//hereda de empleado con modificacion en constructor de director
        System.out.println("Vacaciones de director: " + direction.getDiasVacaciones());//Es un metodo override de empleado
        System.out.println(direction.toString());//metodo toString modificado con Override en la clase Empleado

        ArrayList <Persona> empleados = new ArrayList<Persona>();
        Empleado emp1 =new Empleado();
        emp1.setNombre("Empleado1");
        emp1.setApellido("Empleado1Apellido");
        empleados.add(emp1);
        System.out.println("Emp1: "+ emp1.getClass());
        System.out.println("colección 0: "+ empleados.get(0).getClass());
        Empleado emp2 =new Empleado();
        emp1.setNombre("Empleado2");
        emp1.setApellido("Empleado2Apellido");
        empleados.add(emp2);
        Director dire = new Director();
        dire.setNombre("Dire");
        dire.setApellido("Supremo");
        empleados.add(dire);
        Persona becario = new Persona();
        becario.setNombre("Becario");
        becario.setApellido("Tocanmierdas");
        empleados.add(becario);
        //El Array list es de Personas su contenido serán clase persona aunque guardemos clase empleados
        for (Persona per : empleados){
            //recorremos personas aunque los objetos son:Persona,Empleado y Director
            if (per instanceof Director){
                System.out.println("index:" + per + " Soy el director");
            }
            System.out.println(per.getNombreCompleto());
        }
        //Para convertir una persona a  empleado o director se hace un casting:
        Empleado temp0 = (Empleado) empleados.get(0);//recupero emp2 ccon sus metodos Empleado con casting
        Empleado temp1 = (Empleado) empleados.get(1);//recupero emp 1 con sus metodos Empleado con casting
        Director temp2 = (Director) empleados.get(2);//recupero dire con sus metodos Director con casting 
        //Aquí no hay casting puesto que el index3 del Array es el becario que ya era Persona
        Persona temp3 = empleados.get(3); //recupero becario con sus metodos Persona
        
        //Toda clase tiene un metodo que se llama GetClass()
        //

        
    }
}