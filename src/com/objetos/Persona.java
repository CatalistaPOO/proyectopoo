package com.objetos;

public class Persona {
    // Las variables de Persona, serán privadas:
    private String nombre;
    private String  apellido;
    private int edad;
    private tipoGenero genero;

    public enum tipoGenero{FEMENINO,MASCULINO,OTROS};
    private int dni;

    //podemos generar los Getter  y Setter con CodeGenerator (extensionVsCode)
    //click derecho sobre nombre de la propiedad y codegenerator for Java/generate getter and setters
  
    // Por cada propiedad habra metodo Get (recuperar) y set opcionalmente(dar valor):
    public String getNombre(){
         //this se refiere a edad en la clase definida por primera vez
        return this.nombre;
    }
    public void setNombre(String nombre){//setter llama a su valor con el nombre de su propiedad
        this.nombre = nombre;//LA VARIABLE STRING TIENE EL MISMO NOMBRE QUE LA VARIABLE QUE RECIBE;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;//LA VARIABLE STRING TIENE EL MISMO NOMBRE QUE LA VARIABLE QUE RECIBE;
    }
    
    public int getEdad(){
            return this.edad;
    }
    public void setEdad(int edad)throws Exception{//anunciamos posible error con throws Exception,El metodo puede dar un error si edad = 0
        if (edad < 0){
            throw new Exception("La edad no puede ser negativa");//anunciamos el motivo de error con nombre
        }
        else{
           
            this.edad = edad;//LA VARIABLE INT TIENE EL MISMO NOMBRE QUE LA VARIABLE QUE RECIBE;
        }
    }
    
    //Getter y Setter, usando enum tipoGenero y la propiedad genero (ambos definidos al principio de la clase):
    public tipoGenero getGenero(){
        return this.genero;
    }
    public void setGenero(tipoGenero genero ){
        this.genero = genero;
    }

    public int getDni(){
        return this.dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public char getDniLetra(){
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";

            int resultado = (this.dni - (this.dni /23) * 23);
            char letra = letrasDni.charAt (resultado);
            return letra;
    }

    //METODO PARA DEVOLVER NOMBRE Y APELLIDO. Firma de metodo() para generar SOBRECARGA
    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;
    }
    
    //TODOS LOS METODOS A CONTINUACIÓN SON DERIVADOS DE nombreCompleto(), ESTAS VARIACIONES SON SOBRECARGA del metodo getNombreCompleto()
    //QUE SON TODAS LAS SUGERENCIAS QUE TE DA VSCODE CUANDO ESCRIBES: getnombrecompleto.lo_que_incluye_el_parentesis

    //METODO QUE DEVUELVA EL NOMBRE COMPLETO EN MAYUSCULAS(sobrecarga, siempre mismo nombre que el método firma):
    public String getNombreCompleto(int numero){//elegimos un tipo cualquiera (este caso int)
        return this.nombre.toUpperCase() + this.apellido.toUpperCase();
    }
    
    //METODO PARA DEVOLVER EL NOMBRE COMPLETO AL REVÉS(APELLIDO Y NOMBRE):
    public String getNombreCompleto(boolean orden){//elegimos un tipo cualquiera (este caso boolean)
        return this.apellido + ", " + this.nombre;
    }
   
    //METODO PARA DEVOLVER EL NOMBRE Y APELLIDOS CON SEPARADOR QUE DECIDAMOS:
    public String getNombreCompletoM(String separador){//elegimos un tipo cualquiera (este caso String)
        return this.nombre + separador + this.apellido;
    }

}