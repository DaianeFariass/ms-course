package com.daianefarias.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daianefarias.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	

}
