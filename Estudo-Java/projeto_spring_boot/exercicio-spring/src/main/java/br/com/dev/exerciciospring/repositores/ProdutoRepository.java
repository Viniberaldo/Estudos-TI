package br.com.dev.exerciciospring.repositores;

import br.com.dev.exerciciospring.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author viniberaldo
 */
@Repository
public interface ProdutoRepository
        extends JpaRepository<Produto, Integer>,
        PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String partNome);
}
