package com.growllateral.visitorManagement.service;

import com.growllateral.visitorManagement.model.Visitor;
import com.growllateral.visitorManagement.repo.VisitorRepo;
import com.growllateral.visitorManagement.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VisitorService {
    private final VisitorRepo visitorRepo;

    @Autowired
    public VisitorService(VisitorRepo visitorRepo) {
        this.visitorRepo = visitorRepo;
    }

    public Visitor addVisitor(Visitor visitor){
        visitor.setVisitorCode(UUID.randomUUID().toString());
        return visitorRepo.save(visitor);
    }

    public List<Visitor> findAllVisitors(){

        return visitorRepo.findAll();
    }

    public Visitor updateVisitor(Visitor visitor){

        return visitorRepo.save(visitor);
    }

    public Visitor findVisitorById(Long id){
        return visitorRepo.findVisitorById(id)
                .orElseThrow(() -> new UserNotFoundException ("User by id : " + id + "was not found") );
    }

    public void deleteVisitor(Long id){

        visitorRepo.deleteVisitorById(id);
    }
}
