package com.geoattendance.repository;
import com.geoattendance.domain.Student; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="data-students", collectionResourceRel="students") public interface StudentRepository extends CrudRepository<Student,Long> { java.util.Optional<Student> findByUid(String uid); }
