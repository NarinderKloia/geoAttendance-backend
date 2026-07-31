package com.geoattendance.repository;
import com.geoattendance.domain.Timetable; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="timetables") public interface TimetableRepository extends CrudRepository<Timetable,Long> { }
