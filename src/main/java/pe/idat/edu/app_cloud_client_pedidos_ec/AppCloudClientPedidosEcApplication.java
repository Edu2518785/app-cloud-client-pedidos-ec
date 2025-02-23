package pe.idat.edu.app_cloud_client_pedidos_ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppCloudClientPedidosEcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCloudClientPedidosEcApplication.class, args);
	}

}
