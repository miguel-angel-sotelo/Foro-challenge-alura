package foro.alura.challenge.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "topicos")
@Entity(name = "topico")

@AllArgsConstructor

@EqualsAndHashCode
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;
    private String mensaje;

    @Column(name = "fecha_de_creacion", nullable = false)
    private LocalDate fecha_de_creacion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    private String autor;
    private String curso;

    // Constructor que toma un objeto DatosTopico
    public Topico(DatosTopico datosTopico) {
        this.titulo = datosTopico.titulo();
        this.mensaje = datosTopico.mensaje();
        this.fecha_de_creacion = datosTopico.fecha_de_creacion();
        this.status = datosTopico.status();
        this.autor = datosTopico.autor();
        this.curso = datosTopico.curso();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.autor() != null){
            this.autor = datosActualizarTopico.autor();
        }
        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }

    }

    public Topico() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFecha_de_creacion() {
        return fecha_de_creacion;
    }

    public void setFecha_de_creacion(LocalDate fecha_de_creacion) {
        this.fecha_de_creacion = fecha_de_creacion;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}
