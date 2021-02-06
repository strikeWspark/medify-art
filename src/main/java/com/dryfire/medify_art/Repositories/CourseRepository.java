package com.dryfire.medify_art.Repositories;

import com.dryfire.medify_art.Models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course,String> {
}
