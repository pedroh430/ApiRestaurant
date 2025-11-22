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
    //GET all dishes
    public List<Dishes> getALLDishes(){
        return dishesRepository.findAll();
    }

    //POST dishes
    public void insertDishes(Dishes dishes){
        dishesRepository.save(dishes);
    }

    public void  deleteDishes(Integer Id){
        com.example.ApiTest.Entity.Dishes dishes = dishesRepository.findById(Id).orElseThrow(()-> new RuntimeException("not found"));
        dishesRepository.delete(dishes);

    }


    //GET id dishes
    public Dishes getDishesById(Integer Id){
        return dishesRepository.findById(Id).orElseThrow(()-> new  IllegalStateException(
                Id +"not found"));
    }
}
