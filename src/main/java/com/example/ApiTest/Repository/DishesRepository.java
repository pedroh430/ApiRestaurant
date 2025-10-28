package com.example.ApiTest.Repository;

import com.example.ApiTest.Entity.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishesRepository extends JpaRepository <Dishes, Integer> {
}
