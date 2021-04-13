package br.com.adams.compras.controller;

import br.com.adams.compras.document.Compra;
import br.com.adams.compras.service.CompraService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("compra")
public class CompraController {

  private final CompraService compraService;

  @GetMapping
  public List<Compra> listar() {
    return compraService.listar();
  }

  @GetMapping("livro/{idLivro}")
  public List<Compra> listarPorIdlivro(@PathVariable("idLivro") final int idLivro) {
    return compraService.listarPorIdLivro(idLivro);
  }

  @PostMapping
  public Compra salvar(@RequestBody final Compra compra) {
    log.info("Salvar uma nova compra");
    return compraService.salvar(compra);
  }

  @GetMapping("{id}")
  public Compra recuperar(@PathVariable final String id) {
    log.info("Consultar uma compra com ID: {}", id);
    return compraService.consultar(id);
  }
}
