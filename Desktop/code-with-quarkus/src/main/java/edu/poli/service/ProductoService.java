package edu.poli.service;

import edu.poli.model.Producto;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ProductoService {

    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();

        Producto p1 = new Producto();
        p1.id = 1L;
        p1.nombre = "Laptop";
        p1.precio = 2500000.0;

        Producto p2 = new Producto();
        p2.id = 2L;
        p2.nombre = "Mouse";
        p2.precio = 45000.0;

        productos.add(p1);
        productos.add(p2);

        return productos;
    }
}
