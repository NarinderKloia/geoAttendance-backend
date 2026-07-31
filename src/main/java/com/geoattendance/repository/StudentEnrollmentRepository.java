package com.geoattendance.repository;
import com.geoattendance.domain.StudentEnrollment; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="student-enrollments") public interface StudentEnrollmentRepository extends CrudRepository<StudentEnrollment,Long> { boolean existsByStudentIdAndSectionIdAndActiveTrue(Long studentId, Long sectionId); }
