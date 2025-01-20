package foro.alura.challenge.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepo;

    public DatosRespuestaUsuario registrarUsuario(DatosRegistroUsuario datosRegistroUsuario) {
        Usuario usuario = new Usuario(datosRegistroUsuario);
        DatosRespuestaUsuario datosRespuestaUsuario = new DatosRespuestaUsuario(
                usuario.getId(),

                usuario.getLogin());

        usuarioRepo.save(usuario);
        return datosRespuestaUsuario;
    }
}
