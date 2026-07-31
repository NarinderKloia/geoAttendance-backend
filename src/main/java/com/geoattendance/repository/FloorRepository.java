package com.geoattendance.repository;
import com.geoattendance.domain.Floor; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="floors") public interface FloorRepository extends CrudRepository<Floor,Long> { java.util.List<Floor> findByBlockId(Long blockId); }
