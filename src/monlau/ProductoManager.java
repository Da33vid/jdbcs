/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monlau;

import monlau.dao.ProductoDAO;
import monlau.dao.ProductoDAOImpi;
import monlau.model.Producto;

/**
 *
 * @author davidapalop
 */

public class ProductoManager {

    public static void main(String[] args) {
        ProductoDAO producto = new ProductoDAOImpi();

        producto.insert(new Producto(2, "hello", 10.0));
        producto.insert(new Producto(1, "hello", 10.0));

        Producto productoAActualizar = producto.read(2);
                System.out.println(productoAActualizar);

        productoAActualizar.setNombre("hello actualizado");
        producto.update(productoAActualizar);       
                System.out.println(productoAActualizar);

        // Eliminar el producto con ID 2
        producto.delete(productoAActualizar);

        Producto p = producto.read(2);
        System.out.println(p);
    }
}
