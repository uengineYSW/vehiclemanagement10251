package com.posco.vehicle.s20a01.domain;

import com.posco.vehicle.s20a01.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "vehicles", path = "vehicles")
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {}
