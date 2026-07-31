package com.geoattendance.repository;
import com.geoattendance.domain.Room; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="rooms") public interface RoomRepository extends CrudRepository<Room,Long> { java.util.List<Room> findByFloorId(Long floorId); }
