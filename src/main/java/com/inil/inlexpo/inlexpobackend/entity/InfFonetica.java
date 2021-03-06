package com.inil.inlexpo.inlexpobackend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "InfFonetica")
@Table(name = "informacion_fonetica")
public class InfFonetica {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "informacion_fonetica_id")
  private Long id;

  @Column(name = "nombre", nullable = false)
  private String nombre;
  @Column(name = "descripcion", nullable = false, length = 1000)
  private String descripcion;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "diccionario_id")
  @JsonIgnore
  private Diccionario diccionario;

  public InfFonetica() {
  }

  public InfFonetica(@NotNull String nombre, @NotNull String descripcion) {
    this.nombre = nombre;
    this.descripcion = descripcion;
  }

  /**********************************************************************************************************/

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Diccionario getDiccionario() {
    return diccionario;
  }

  public void setDiccionario(Diccionario diccionario) {
    this.diccionario = diccionario;
  }
}