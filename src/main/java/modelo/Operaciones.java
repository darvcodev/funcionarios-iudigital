/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author darv
 */
public interface Operaciones {

    public boolean insertar(Object obj);

    public boolean eliminar(Object obj);

    public boolean modificar(Object obj);

    public ArrayList<Object[]> consultar();

}
