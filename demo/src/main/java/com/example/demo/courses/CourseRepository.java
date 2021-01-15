package com.example.demo.courses;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sun.tools.javac.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course,String>{
	
public List<Course> findBytopicId();
}
