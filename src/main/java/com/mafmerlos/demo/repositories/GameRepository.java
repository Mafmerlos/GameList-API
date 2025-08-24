package com.mafmerlos.demo.repositories;

import com.mafmerlos.demo.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
