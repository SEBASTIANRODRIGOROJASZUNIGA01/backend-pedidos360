package cl.tnt.backendpedidos360tnt.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200") // <---- temporal solo para prueba
@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    
    @GetMapping
    //@PreAuthorize("isAuthenticated()")  <----- quitar el comentario para volver a la normalidad
    public String obtenerPedidos() {
        return "¡Token válido y permiso OT.Create confirmado! Aquí están tus pedidos XDDD.";
    }
}
