package com.objetos;

public class Persona {
    //ESTRUCTURA DE LAS CLASES:
    //1-Propiedades
    //2-Contructores de la clase (lleva el nombre de la clase)
    //3-Getter y Setter
    //4-Métodos

   
    // Las variables de Persona, serán privadas:
    private String nombre;
    private String  apellido;
    private int edad;
    private tipoGenero genero;

    public enum tipoGenero{FEMENINO,MASCULINO,OTROS};
    private String dni;

    //Metodo crea persona a partir de nombre y apellidos.
    public Persona (String nombre, String apellido){
        System.out.println("Soy un constructor de persona con nombre y apellido !!");
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Metodo para crear persona sin definir parametros con género femenino por defecto
    public Persona(){
        System.out.println("Soy un constructor vacío de persona!!");
        this.genero = tipoGenero.FEMENINO;
    };
    


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


    public String getDni(){
        return this.dni;
    }
    //Metodo estatico, permite que sea llamado sin crear objeto en otra clase(siempre con static)
    public void setDni (String dni)throws Exception{
        
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        char letraDni = dni.charAt(dni.length() - 1);
        String temp = dni.substring(0, dni.length() - 1);
        int numeroDni = Integer.parseInt(temp);
        int resultado = (numeroDni - (numeroDni / 23) * 23);
        char letra = letrasDni.charAt(resultado);

        this.dni = dni;

        if (letraDni == letra ){
            this.dni = dni;
        }else{
            throw new Exception("La letra del DNI es incorrecta "
            + letra);
        }
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