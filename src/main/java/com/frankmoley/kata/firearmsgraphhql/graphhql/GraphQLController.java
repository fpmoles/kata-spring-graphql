package com.frankmoley.kata.firearmsgraphhql.graphhql;

import java.util.List;

import com.frankmoley.kata.firearmsgraphhql.data.Manufacturer;
import com.frankmoley.kata.firearmsgraphhql.data.ManufacturerRepository;
import com.frankmoley.kata.firearmsgraphhql.data.Model;
import com.frankmoley.kata.firearmsgraphhql.data.ModelRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQLController {

    private final ManufacturerRepository manufacturerRepository;
    private final ModelRepository modelRepository;

    public GraphQLController(ManufacturerRepository manufacturerRepository, ModelRepository modelRepository) {
        this.manufacturerRepository = manufacturerRepository;
        this.modelRepository = modelRepository;
    }

    @QueryMapping
    public Iterable<Manufacturer> manufacturers(){
        return this.manufacturerRepository.findAll();
    }

    @QueryMapping
    public Iterable<Model> models(){
        return this.modelRepository.findAll();
    }
}
