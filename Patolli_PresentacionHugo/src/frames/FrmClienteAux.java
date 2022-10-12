/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import dominio.Jugador;
import dominio.Partida;


/**
 *
 * @author Hugo Rivera
 */
abstract class FrmClienteAux extends FrmBase{
    protected static Jugador jugador= new Jugador();
    protected static Partida partida=new Partida();
    /**
     * Construye la instancia de la clase, inicializando los siguientes valores:
     * @param jugadorN Instancia del jugador de este cliente.
     * @param partidaN Instancia de la partida que se recibe.
     */
    
    
    public FrmClienteAux(){
        
    }

    
}
