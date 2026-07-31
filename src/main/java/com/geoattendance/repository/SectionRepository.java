package com.geoattendance.repository;
import com.geoattendance.domain.Section; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="sections") public interface SectionRepository extends CrudRepository<Section,Long> { }
