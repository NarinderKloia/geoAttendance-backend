package com.geoattendance.repository;
import com.geoattendance.domain.AttendanceAttempt; import org.springframework.data.repository.*;
public interface AttendanceAttemptRepository extends CrudRepository<AttendanceAttempt,Long> { }
