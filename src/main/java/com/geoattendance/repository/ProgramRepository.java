package com.geoattendance.repository;
import com.geoattendance.domain.Program; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="programs") public interface ProgramRepository extends CrudRepository<Program,Long> { }
