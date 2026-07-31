package com.geoattendance.repository;
import com.geoattendance.domain.Teacher; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="teachers") public interface TeacherRepository extends CrudRepository<Teacher,Long> { java.util.Optional<Teacher> findByEmail(String email); }
