package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.FeedBack;



@Repository
public interface IFeedBackRepository extends JpaRepository<FeedBack, Integer>{

}
