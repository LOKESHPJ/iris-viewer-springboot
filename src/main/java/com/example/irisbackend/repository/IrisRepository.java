package com.example.irisbackend.repository;

import com.example.irisbackend.model.Iris;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IrisRepository extends JpaRepository<Iris, Long> {
    Page<Iris> findBySpeciesContainingIgnoreCase(String species, Pageable pageable);
}
