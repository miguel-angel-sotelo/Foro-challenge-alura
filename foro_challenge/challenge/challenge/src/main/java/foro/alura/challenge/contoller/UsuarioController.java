package foro.alura.challenge.contoller;

import foro.alura.challenge.usuarios.DatosRegistroUsuario;
import foro.alura.challenge.usuarios.DatosRespuestaUsuario;
import foro.alura.challenge.usuarios.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<DatosRespuestaUsuario>registrarUsuario(@RequestBody @Valid DatosRegistroUsuario datosRegistroUsuario,
                                           UriComponentsBuilder uriComponentsBuilder) {

        System.out.println(datosRegistroUsuario.clave() + datosRegistroUsuario.login());

        DatosRespuestaUsuario datosRespuestaUsuario = usuarioService.registrarUsuario(datosRegistroUsuario);
        URI url = uriComponentsBuilder.path("/usuarios/{id}").buildAndExpand(datosRespuestaUsuario.id()).toUri();
        return ResponseEntity.created(url).body(datosRespuestaUsuario);
    }
}
