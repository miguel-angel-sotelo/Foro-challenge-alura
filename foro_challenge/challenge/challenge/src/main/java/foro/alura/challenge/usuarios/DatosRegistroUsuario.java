package foro.alura.challenge.usuarios;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroUsuario(

            @NotBlank String login,
            @NotNull String clave
    ) {
    }

