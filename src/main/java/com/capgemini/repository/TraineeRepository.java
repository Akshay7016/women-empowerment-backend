package com.capgemini.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.model.Trainee;



@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Integer> {
	
	public abstract Trainee findByAadharNo(Long aadharNo);

	public abstract List<Trainee> getAllTraineeByLocation(String location);

	public abstract List<Trainee> findByFirstName(String firstName);

	public abstract List<Trainee> findByLastName(String lastName);

	public abstract Optional<Trainee> findByLocation(String location);

	public abstract String deleteByLocation(String location);

}
