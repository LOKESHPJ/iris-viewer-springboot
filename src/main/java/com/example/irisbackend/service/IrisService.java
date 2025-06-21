package com.example.irisbackend.service;

import com.example.irisbackend.model.Iris;
import com.example.irisbackend.repository.IrisRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class IrisService {

    @Autowired
    private IrisRepository irisRepository;

    @PostConstruct
    public void loadJsonData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = new ClassPathResource("iris.json").getInputStream();
            List<Iris> data = mapper.readValue(is, new TypeReference<>() {});
            irisRepository.saveAll(data);
            System.out.println("✅ Loaded JSON into DB: " + data.size() + " rows");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
