/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package monlau.dao;
import monlau.model.Producto;
/**
 *
 * @author davidapalop
 */public interface ProductoDAO {
    public void insert(Producto producto);
    public void update(Producto producto);
    public void delete(Producto producto);
    public Producto read(Integer id);
}
