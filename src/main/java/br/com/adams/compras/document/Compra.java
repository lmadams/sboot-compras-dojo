package br.com.adams.compras.document;

import br.com.adams.compras.domain.Estoque;
import br.com.adams.compras.domain.Livro;
import br.com.adams.compras.domain.Preco;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Setter
@Getter
@Document(collection = "compra")
public class Compra {

  @Id private String id;
  private String endereco;

  @CreatedDate private LocalDateTime createdAt;
  @LastModifiedDate private LocalDateTime updatedAt;

  private Livro livro;
  private Preco preco;
  private Estoque estoque;

  private String copumDeDesconto;
}
