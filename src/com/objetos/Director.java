package com.objetos;

public class Director extends Empleado{

    private int plusSueldo = 200;
    private int plusVacaciones = 8;
   

    public Director(){
        //Hereda de emplado un set para sueldoMinimo cobrando 200 mas que el empleado
        int salMinimo = super.getSueldoMinimo();//lo que gana el empleado
        this.setSueldoMinimo(salMinimo + plusSueldo);//200 más de lo que gana el empleado
    }

     //DECORACION: La palabra clave override indica que estamos sobreescribiendo un metodo de la clase super (Empleado), excepto metodos finales
    @Override //podríamos optar por no usarlo pero esto provocará errores en cambios de entorno, afecta al compilado no es solo un indicador para un metodo existente heredado.
    public int getDiasVacaciones() {
        int vacas = super.getDiasVacaciones();//debemos llamar a la clase super (Empleado) para recuperar getDiasVacaciones (22)
        System.out.println("Vacaciones de director");
        return vacas + plusVacaciones;
    }
    // @Override //no se puede usar porque el metodo heredado( metodoFinal() ) es de tipo final
    // public void metodoFinal(){
    //     System.out.println("Metodo final director");
    // }

    public void mandar(){
        System.out.println("Aquí mando yo!!");
    }

}