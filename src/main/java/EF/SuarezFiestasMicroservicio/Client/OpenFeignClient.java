package EF.SuarezFiestasMicroservicio.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import EF.SuarezFiestasMicroservicio.DTO.Cliente;


@FeignClient(name = "idat-cliente", url="localhost:8080")
public interface OpenFeignClient {
		
		@GetMapping("/cliente/v1/listar")
		public List<Cliente> listarClientesSeleccionados();

}
