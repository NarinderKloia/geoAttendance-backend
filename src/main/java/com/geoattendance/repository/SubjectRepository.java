package com.geoattendance.repository;
import com.geoattendance.domain.Subject; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="subjects") public interface SubjectRepository extends CrudRepository<Subject,Long> { }
