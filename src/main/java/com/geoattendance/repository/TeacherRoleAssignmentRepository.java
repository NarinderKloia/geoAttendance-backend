package com.geoattendance.repository;
import com.geoattendance.domain.TeacherRoleAssignment; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="teacher-roles") public interface TeacherRoleAssignmentRepository extends CrudRepository<TeacherRoleAssignment,Long> { }
