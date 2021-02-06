package com.dryfire.medify_art.Controllers;

import com.dryfire.medify_art.Models.Course;
import com.dryfire.medify_art.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CourseController {

        @Autowired
        CourseRepository courseRepository;

        @GetMapping("/create-course")
    public ResponseEntity<Course> createCourse(){
            try {
                Course cRef = courseRepository.save(new Course("Flutter App Development", "Cross Platform App Development", "John", 2, true));
                // JSON Response for COURSE attributes
                return new ResponseEntity<Course>(cRef, HttpStatus.CREATED);
            }catch (Exception e) {
                System.out.println("Error Occurred");
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
}
