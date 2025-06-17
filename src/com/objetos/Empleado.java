package com.objetos;

public class Empleado extends Persona{//extends indica que hereda de la clase Persona
    
    
    //CONSTRUCTOR DE EMPLEADO (mismo nombre que la clase) HEREDA DE PERSONA(EXTENDS PERSONA)
    public Empleado(){
        //super hace referencia a la clase de la que heredamos(Llama al constructor vacío de la clase persona)
        super();
        this.sueldoMinimo = 1600;
        System.out.println("Constructor de empleado");

    }
    // public Empleado(String nombre, String apellido){
    //     //super con parámetros hace referencia a la clase de la que heredamos(Llama al constructor con nombre de la clase empleado)
    //     super(nombre,apellido);
    //     System.out.println("Constructor de empleado con nombre y apellido");
    // }

    //PROPIEDADES
    private int sueldo;
    private int sueldoMinimo;
    
    //GETTERS SETTERS
    public int getSueldoMinimo() {
        return this.sueldoMinimo;
    }
    //PROTECTED porque solo queremos hacer que afecte a las clases que hereden
    protected void setSueldoMinimo(int sueldoMinimo) {
        this.sueldoMinimo = sueldoMinimo;
    }

    public int getSueldo() {
        return this.sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getDiasVacaciones(){
        System.out.println("Vacaciones de empleado");
        return 22;
    }

    //Metodo final  con la palabra clave final (no se puede hacer @Override en las clases que heredan)
    public final void metodoFinal(){
        System.out.println("Metodo final");
    }

    //Las clases tienen en herencia String y sus metodos, entre ellos 
    @Override
    public String toString() {
    return (this.getNombre() + ", " + this.getApellido() + " sueldo: " +  this.getSueldoMinimo());
    }

}

