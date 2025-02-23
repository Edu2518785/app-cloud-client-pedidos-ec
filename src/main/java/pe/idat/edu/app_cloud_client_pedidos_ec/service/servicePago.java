package pe.idat.edu.app_cloud_client_pedidos_ec.service;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="app-cloud-client-pagos-ec")
public interface servicePago {

    @GetMapping("/mensaje")
    String obtenerPagoPedido();
    @GetMapping("/realizar-pago/{idPedido}")
    String realizarPago(@PathVariable("idPedido")Long idPedido);
}

