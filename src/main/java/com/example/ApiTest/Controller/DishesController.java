package com.example.ApiTest.Controller;

import com.example.ApiTest.Entity.Dishes;
import com.example.ApiTest.Service.DishesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/dishes")
public class DishesController {

    private final DishesService dishesService;

    public DishesController(DishesService dishesService){
        this.dishesService = dishesService;

    }

    @GetMapping
    public List <Dishes> getDishes(){
        return dishesService.getALLDishes();
    }

    @GetMapping("{Id}")
    public Dishes getDishesId(
            @PathVariable Integer Id
    ){
        return dishesService.getDishesById(Id);
    }

    @PostMapping
    public void addNewDishes(
            @RequestBody Dishes dishes){
        dishesService.insertDishes(dishes);
    }


}
