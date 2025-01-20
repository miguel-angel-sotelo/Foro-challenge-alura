package foro.alura.challenge.topico;

public record DatosListadoTopico(Long id, String autor, String titulo, String mensaje) {
    public DatosListadoTopico(Topico topico){
        this(topico.getId(),topico.getAutor(),topico.getTitulo(),topico.getMensaje());
    }
}

