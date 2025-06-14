package com.objetos;


public class Prueba {
    //ESTA CLASE NO SE VA A EJECUTAR A MENOS QUE SE LLAME EN OTRA CLASE
    //Crearemos un metodo PUBLIC(permite el acceso desde otra clase) para saludar
    public static void saludar(){
        System.out.println("Saludando desde Prueba.java");
    }
    //PUBLIC: acceso desde otras clases.
    //PRIVATE: acceso desde solo la propia clase, ninguna externa.
    //PROTECTED: acceso desde la propia clase(como private) y las clases que heredan.
}
