package cl.tnt.backendpedidos360tnt.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    // Spring Security antepone "SCOPE_" a los ámbitos leídos del token JWT
    @GetMapping
    @PreAuthorize("hasAuthority('SCOPE_OT.Create')")
    public String obtenerPedidos() {
        return "¡Token válido y permiso OT.Create confirmado! Aquí están tus pedidos.";
    }
}
