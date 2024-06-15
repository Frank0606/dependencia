package uv.mx.dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import xx.mx.uv.consumo.wsdl.CancelarCompraResponse;
import xx.mx.uv.consumo.wsdl.EstadoCompraResponse;
import xx.mx.uv.consumo.wsdl.RecibirCompraResponse;

@RestController
@SpringBootApplication
public class dependenciaApplication {

    @Autowired
    private ICompras icompras;
    @Autowired
    ClaseCliente cliente = new ClaseCliente();

    public static void main(String[] args) {

        SpringApplication.run(dependenciaApplication.class, args);
    }

    @RequestMapping(value = "/comprar/{nombre_cliente}/{email_cliente}/{direccion_cliente}/{rfc_cliente}/{nombre_producto}/{cantidad_producto}/{precio_producto}", method = RequestMethod.GET)
    public String hacerCompra(@PathVariable("nombre_cliente") String nombre_cliente,
            @PathVariable("email_cliente") String email_cliente,
            @PathVariable("direccion_cliente") String direccion_cliente,
            @PathVariable("rfc_cliente") String rfc_cliente,
            @PathVariable("nombre_producto") String nombre_producto,
            @PathVariable("cantidad_producto") int cantidad_producto,
            @PathVariable("precio_producto") Double precio_producto) {

        RecibirCompraResponse sr = cliente.hacerCompra(nombre_cliente, email_cliente, direccion_cliente, rfc_cliente,
                nombre_producto, cantidad_producto, precio_producto);

        Compras compra = new Compras();
        compra.setFolio_seguimiento(sr.getFolioSeguimiento());
        compra.setId_cliente(nombre_cliente);
        icompras.save(compra);

        return ("Su folio de compra es: " + sr.getFolioSeguimiento());
    }

    @RequestMapping(value = "/ver/compra/{folio_seguimiento}", method = RequestMethod.GET)
    public String estadoCompra(@PathVariable("folio_seguimiento") String folio_seguimiento) {

        EstadoCompraResponse ec = cliente.estadoCompra(folio_seguimiento);

        return ec.getRespuesta();
    }

    @RequestMapping(value = "/cancelar/compra/{folio_seguimiento}", method = RequestMethod.GET)
    public String cancelarCompra(@PathVariable("folio_seguimiento") String folio_seguimiento) {

        CancelarCompraResponse cc = cliente.cancelarCompra(folio_seguimiento);

        return cc.getRespuesta();
    }

    // @RequestMapping("/productos")
    // public void verProductos() {
    // ClaseCliente cliente;
    // }
}
