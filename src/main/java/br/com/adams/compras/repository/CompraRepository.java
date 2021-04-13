package br.com.adams.compras.repository;

import br.com.adams.compras.document.Compra;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompraRepository extends MongoRepository<Compra, String> {

    List<Compra> findAllByLivro_Codigo(int idCodigo);
}
