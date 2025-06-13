package com.objetos;

public class Persona {
    // Las variables de Persona, serán privadas:
    private String nombre;
    private String  apellido;
    private int edad;
    //podemos generar los Getter  y Setter con CodeGenerator (extensionVsCode)
    //click derecho y codegenerator for Java/generate getter and setters
    
  
    // Por cada propiedad habra metodo Get (recuperar) y set opcionalmente(dar valor):
    public String getNombre(){
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
    public void setEdad(int edad)throws Exception{//El metodo puede dar un error si edad = 0, anunciamos posible error con throws Exception
        if (edad < 0){
            throw new Exception("La edad no puede ser negativa");//anunciamos el motivo de error con nombre
        }
        else{
            //this se refiere a edad en la clase definida por primera vez
            this.edad = edad;//LA VARIABLE INT TIENE EL MISMO NOMBRE QUE LA VARIABLE QUE RECIBE;
        }
    }
}