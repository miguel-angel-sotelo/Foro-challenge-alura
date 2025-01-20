package foro.alura.challenge.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;


public record DatosTopico(

        @NotBlank
        String titulo,

        @NotBlank
        String mensaje,

        @NotNull
        LocalDate fecha_de_creacion,

        @NotNull
        Status status,

        @NotBlank
        String autor,

        @NotBlank
        String curso
) {
}

