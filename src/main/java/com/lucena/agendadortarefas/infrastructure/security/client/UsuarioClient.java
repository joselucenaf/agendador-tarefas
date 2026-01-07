package com.lucena.agendadortarefas.infrastructure.security.client;


import com.lucena.agendadortarefas.business.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "usuario", url = "${usuario.url}")
public interface UsuarioClient {

    //Apontar p/ a API que trará os dados do usuário
    //Apontar o verbo http (get) // Apontar os parametros para que os endpoints sejam adicionados
    @GetMapping("/usuario")
    UsuarioDTO buscaUsuarioPorEmail(@RequestParam("email")String email,
                                    @RequestHeader("Authorization") String Token);
}

