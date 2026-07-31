package com.geoattendance.repository;
import com.geoattendance.domain.TeacherSubject; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="teacher-subjects") public interface TeacherSubjectRepository extends CrudRepository<TeacherSubject,Long> { }
