/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Exceptions;

/**
 *
 * @author afons
 */
public class ValorNumericoInvalidoException extends Exception {

    /**
     * Creates a new instance of <code>ValorNumericoInvalidoException</code>
     * without detail message.
     */
    public ValorNumericoInvalidoException() {
    }

    /**
     * Constructs an instance of <code>ValorNumericoInvalidoException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ValorNumericoInvalidoException(String msg) {
        super(msg);
    }
}
