package com.growllateral.visitorManagement.repo;

import com.growllateral.visitorManagement.model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitorRepo extends JpaRepository<Visitor,Long> {
    void deleteVisitorById(Long id);

    Optional<Visitor> findVisitorById(Long id);
}
