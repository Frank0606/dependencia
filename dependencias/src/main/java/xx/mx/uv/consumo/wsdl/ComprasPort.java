
package xx.mx.uv.consumo.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "comprasPort", targetNamespace = "t4is.uv.mx/compras")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ComprasPort {


    /**
     * 
     * @param cancelarCompraRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.CancelarCompraResponse
     */
    @WebMethod(operationName = "CancelarCompra")
    @WebResult(name = "CancelarCompraResponse", targetNamespace = "t4is.uv.mx/compras", partName = "CancelarCompraResponse")
    public CancelarCompraResponse cancelarCompra(
        @WebParam(name = "CancelarCompraRequest", targetNamespace = "t4is.uv.mx/compras", partName = "CancelarCompraRequest")
        CancelarCompraRequest cancelarCompraRequest);

    /**
     * 
     * @param generarFolioRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.GenerarFolioResponse
     */
    @WebMethod(operationName = "GenerarFolio")
    @WebResult(name = "GenerarFolioResponse", targetNamespace = "t4is.uv.mx/compras", partName = "GenerarFolioResponse")
    public GenerarFolioResponse generarFolio(
        @WebParam(name = "GenerarFolioRequest", targetNamespace = "t4is.uv.mx/compras", partName = "GenerarFolioRequest")
        GenerarFolioRequest generarFolioRequest);

    /**
     * 
     * @param recibirCompraRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.RecibirCompraResponse
     */
    @WebMethod(operationName = "RecibirCompra")
    @WebResult(name = "RecibirCompraResponse", targetNamespace = "t4is.uv.mx/compras", partName = "RecibirCompraResponse")
    public RecibirCompraResponse recibirCompra(
        @WebParam(name = "RecibirCompraRequest", targetNamespace = "t4is.uv.mx/compras", partName = "RecibirCompraRequest")
        RecibirCompraRequest recibirCompraRequest);

    /**
     * 
     * @param estadoCompraRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.EstadoCompraResponse
     */
    @WebMethod(operationName = "EstadoCompra")
    @WebResult(name = "EstadoCompraResponse", targetNamespace = "t4is.uv.mx/compras", partName = "EstadoCompraResponse")
    public EstadoCompraResponse estadoCompra(
        @WebParam(name = "EstadoCompraRequest", targetNamespace = "t4is.uv.mx/compras", partName = "EstadoCompraRequest")
        EstadoCompraRequest estadoCompraRequest);

    /**
     * 
     * @param solicitarFacturaRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.SolicitarFacturaResponse
     */
    @WebMethod(operationName = "SolicitarFactura")
    @WebResult(name = "SolicitarFacturaResponse", targetNamespace = "t4is.uv.mx/compras", partName = "SolicitarFacturaResponse")
    public SolicitarFacturaResponse solicitarFactura(
        @WebParam(name = "SolicitarFacturaRequest", targetNamespace = "t4is.uv.mx/compras", partName = "SolicitarFacturaRequest")
        SolicitarFacturaRequest solicitarFacturaRequest);

    /**
     * 
     * @param solicitarPagoRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.SolicitarPagoResponse
     */
    @WebMethod(operationName = "SolicitarPago")
    @WebResult(name = "SolicitarPagoResponse", targetNamespace = "t4is.uv.mx/compras", partName = "SolicitarPagoResponse")
    public SolicitarPagoResponse solicitarPago(
        @WebParam(name = "SolicitarPagoRequest", targetNamespace = "t4is.uv.mx/compras", partName = "SolicitarPagoRequest")
        SolicitarPagoRequest solicitarPagoRequest);

    /**
     * 
     * @param registrarProductoRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.RegistrarProductoResponse
     */
    @WebMethod(operationName = "RegistrarProducto")
    @WebResult(name = "RegistrarProductoResponse", targetNamespace = "t4is.uv.mx/compras", partName = "RegistrarProductoResponse")
    public RegistrarProductoResponse registrarProducto(
        @WebParam(name = "RegistrarProductoRequest", targetNamespace = "t4is.uv.mx/compras", partName = "RegistrarProductoRequest")
        RegistrarProductoRequest registrarProductoRequest);

    /**
     * 
     * @param solicitarPresupuestoRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.SolicitarPresupuestoResponse
     */
    @WebMethod(operationName = "SolicitarPresupuesto")
    @WebResult(name = "SolicitarPresupuestoResponse", targetNamespace = "t4is.uv.mx/compras", partName = "SolicitarPresupuestoResponse")
    public SolicitarPresupuestoResponse solicitarPresupuesto(
        @WebParam(name = "SolicitarPresupuestoRequest", targetNamespace = "t4is.uv.mx/compras", partName = "SolicitarPresupuestoRequest")
        SolicitarPresupuestoRequest solicitarPresupuestoRequest);

}
