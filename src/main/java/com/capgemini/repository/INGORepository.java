package com.capgemini.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.model.NGO;


public interface INGORepository extends JpaRepository<NGO, Integer>{
//
////	List<NGO> findByNgoName(String ngoName);
//////	NGO findByNgoId(Integer ngoId);
//	public abstract NGO addNGO(Integer ngo);
////
//	public abstract NGO updateNGO(NGO ngo);
//
//	public abstract NGO viewNGO(int ngoId);
////
//	public abstract List<NGO> viewAllNGO();
//
////	public abstract NGO deleteNGO(int ngoId);
//
	public abstract List<NGO> findByNgoMotive(String ngoMotive);

	public abstract List<NGO> findByNgoLocation(String ngoLocation);
}