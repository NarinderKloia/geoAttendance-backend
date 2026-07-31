package com.geoattendance.repository;
import com.geoattendance.domain.Beacon; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="beacons") public interface BeaconRepository extends CrudRepository<Beacon,Long> { java.util.Optional<Beacon> findByLabel(String label); }
