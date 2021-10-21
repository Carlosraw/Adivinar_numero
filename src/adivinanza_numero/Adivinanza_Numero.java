/* Realizar un juego para adivinar un número. Para ello generar un número
aleatorio entre 0-100, y luego ir     pidiendo números indicando “es mayor” o
“es menor” según sea mayor o menor con respecto a N. El proceso termina 
cuando el usuario acierta y mostrar el número de intentos.*/

package adivinanza_numero;

import java.util.Random;
import javax.swing.JOptionPane;


public class Adivinanza_Numero {


    public static void main(String[] args) {
        /*Creo las variables, intentos que es el número de intentos hechos por el usuario
        numj que es el numero hecho por el jugador y cont que seria un booleano para la condición
        del while o del ciclo*/
        int  num ,numj=-1,cont=0;
        boolean cond;

        
        //Creo el numero aleatorio y lo guardo en la variable num
        num = (int) (Math.random()*100);

        
        //Creo ciclo para que empiece el juego
        while (numj!=num){
            //pido el numero al jugador 
            numj=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            //Se crea condicional para ver si el numero es igual al del jugador
            if (numj==num){
                
                JOptionPane.showMessageDialog(null,"Felicitaciones, acertaste");
                JOptionPane.showMessageDialog(null,"Tu numero de intentos ha sido de: "+cont);
                cond=true;
            }
            //si no lo es entonces verifico si es mayor o menor
            else{
                if (numj<num){
                    JOptionPane.showMessageDialog(null, "Te ha faltado, tu numero es menor");
                 
                }
                else 
                    JOptionPane.showMessageDialog(null, "Te has pasado, tu numero es mayor");                
              
            }
        cont++;
            
            
        }
        
    }
    
}
