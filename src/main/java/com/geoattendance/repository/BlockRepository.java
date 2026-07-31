package com.geoattendance.repository;
import com.geoattendance.domain.Block; import org.springframework.data.repository.*; import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="blocks") public interface BlockRepository extends CrudRepository<Block,Long> { }
