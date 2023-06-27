package com.bezkoder.spring.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.login.models.Category;


public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
