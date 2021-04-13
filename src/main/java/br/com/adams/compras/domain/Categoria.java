package br.com.adams.compras.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Categoria implements Serializable {

  private Long id;

  private String nome;
}
