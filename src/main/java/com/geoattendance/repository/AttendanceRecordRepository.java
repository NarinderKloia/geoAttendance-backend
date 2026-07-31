package com.geoattendance.repository;
import com.geoattendance.domain.AttendanceRecord; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="attendance-records", exported=false) public interface AttendanceRecordRepository extends CrudRepository<AttendanceRecord,Long> { boolean existsByClassSessionIdAndStudentId(Long classSessionId, Long studentId); }
