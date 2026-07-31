package com.geoattendance.repository;
import com.geoattendance.domain.Course; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="courses") public interface CourseRepository extends CrudRepository<Course,Long> { }
