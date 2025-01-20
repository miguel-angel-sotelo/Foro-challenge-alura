package foro.alura.challenge.topico;

import java.time.LocalDate;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, LocalDate fecha_de_creacion, Status status, String autor, String curso) {
}
