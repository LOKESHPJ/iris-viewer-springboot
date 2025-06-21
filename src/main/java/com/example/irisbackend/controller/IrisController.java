package com.example.irisbackend.controller;

import com.example.irisbackend.model.Iris;
import com.example.irisbackend.repository.IrisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/iris")
public class IrisController {

    @Autowired
    private IrisRepository irisRepository;

    // GET /api/iris?species=setosa&page=0&size=10
    @GetMapping
    public Page<Iris> getAll(
            @RequestParam(defaultValue = "") String species,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        return irisRepository.findBySpeciesContainingIgnoreCase(species, PageRequest.of(page, size));
    }
}

