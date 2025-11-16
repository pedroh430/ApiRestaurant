package com.example.ApiTest.Service;

import com.example.ApiTest.Entity.Dishes;
import com.example.ApiTest.Repository.DishesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishesService {

    private final DishesRepository dishesRepository;


    public DishesService(DishesRepository dishesRepository) {
        this.dishesRepository = dishesRepository;
    }

    public List<Dishes> getALLDishes(){
        return dishesRepository.findAll();
    }

    public void insertDishes(Dishes dishes){
        dishesRepository.save(dishes);
    }

    public Dishes getDishesById(Integer Id){
        return dishesRepository.findById(Id).orElseThrow(()-> new  IllegalStateException(
                Id +"not found"));
    }
}
