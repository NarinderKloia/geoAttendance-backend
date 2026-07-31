package com.geoattendance.repository;
import com.geoattendance.domain.ClassSession; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="class-sessions") public interface ClassSessionRepository extends CrudRepository<ClassSession,Long> { }
