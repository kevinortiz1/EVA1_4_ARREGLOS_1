/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_arreglos_1;

/**
 *
 * @author Kevin Ortiz
 */
public class EVA1_4_ARREGLOS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARACION DE ARREGLOS
        
        int[] aiEjemplos = new int[5];//los arreglos son objetos 
        int[] aiArre1, aiArre2, aiArre3, aiArre4;//estos 4 identificadores son arreglos 
        //Los arreglos en java son objetos 
        int aiArre5[], i;//solo aiArre5 es un arreglo, i es una variable entera 
        //Definimos el tamaño del arreglos con el operador new
        aiArre1 = new int[100];//Asignamos 100 espacios de tipo entero

        System.out.println(aiEjemplos);//es una referencia
        System.out.println(aiEjemplos[0]);
    }

}
