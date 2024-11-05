package br.edu.projeto.server.repository;

import br.edu.projeto.server.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
