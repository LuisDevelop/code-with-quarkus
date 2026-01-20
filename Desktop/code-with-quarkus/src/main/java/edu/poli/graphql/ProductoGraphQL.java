package edu.poli.graphql;

import edu.poli.model.Producto;
import edu.poli.service.ProductoService;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

@GraphQLApi
public class ProductoGraphQL {

    ProductoService service;

    public ProductoGraphQL(ProductoService service) {
        this.service = service;
    }

    @Query("productos")
    public List<Producto> productos() {
        return service.listarProductos();
    }
}
