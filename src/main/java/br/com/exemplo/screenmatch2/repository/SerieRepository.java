package br.com.exemplo.screenmatch2.repository;

import br.com.exemplo.screenmatch2.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
