package com.bezcoder.spring.login.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bezcoder.spring.login.payloads.CategoryDto;


public interface CategoryService {
	
	
	
	// create
	CategoryDto createCategory(CategoryDto categoryDto);

	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// delete
	
	// get
	CategoryDto getCategory(Integer categoryId);

	// get All

	List<CategoryDto> getCategories();

}
