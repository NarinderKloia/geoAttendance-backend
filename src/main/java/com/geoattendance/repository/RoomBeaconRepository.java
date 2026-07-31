package com.geoattendance.repository;
import com.geoattendance.domain.RoomBeacon; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="room-beacons") public interface RoomBeaconRepository extends CrudRepository<RoomBeacon,Long> { boolean existsByRoomIdAndBeaconUuidAndBeaconMajorValueAndBeaconMinorValueAndBeaconActiveTrue(Long roomId, String uuid, Integer major, Integer minor); java.util.Optional<RoomBeacon> findFirstByRoomId(Long roomId); }
