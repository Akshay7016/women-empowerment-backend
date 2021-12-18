package com.capgemini.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="scheme")
public class Scheme implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer schemeId;
	
	@Column(name="scheme_name", nullable =false)
	private String schemeName;
	
	@Column(name="scheme_type", nullable= false)
	private String schemeType;
	
	@Column(name="launch_date")
	private LocalDate schemeLaunchDate;
	
	@Column(name="scheme_eligibility")
	String schemeEligibility;
	
	@Column(name="scheme_objective")
	String schemeObjective;
	
	@ManyToOne
	@JoinColumn(name="courseId")
	private TrainingCourse trainingCourse;
	

	public Scheme() {
		super();
	}

	

	public Scheme(Integer schemeId, String schemeName, String schemeType, LocalDate schemeLaunchDate,
			String schemeEligibility, String schemeObjective, TrainingCourse trainingCourse) {
		super();
		this.schemeId = schemeId;
		this.schemeName = schemeName;
		this.schemeType = schemeType;
		this.schemeLaunchDate = schemeLaunchDate;
		this.schemeEligibility = schemeEligibility;
		this.schemeObjective = schemeObjective;
		this.trainingCourse = trainingCourse;
	}



	public Integer getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(Integer schemeId) {
		this.schemeId = schemeId;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSchemeType() {
		return schemeType;
	}

	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}

	public LocalDate getSchemeLaunchDate() {
		return schemeLaunchDate;
	}

	public void setSchemeLaunchDate(LocalDate schemeLaunchDate) {
		this.schemeLaunchDate = schemeLaunchDate;
	}

	public String getSchemeEligibility() {
		return schemeEligibility;
	}

	public void setSchemeEligibility(String schemeEligibility) {
		this.schemeEligibility = schemeEligibility;
	}

	public String getSchemeObjective() {
		return schemeObjective;
	}

	public void setSchemeObjective(String schemeObjective) {
		this.schemeObjective = schemeObjective;
	}



	public TrainingCourse getTrainingCourse() {
		return trainingCourse;
	}



	public void setTrainingCourse(TrainingCourse trainingCourse) {
		this.trainingCourse = trainingCourse;
	}



	@Override
	public String toString() {
		return "Scheme [schemeId=" + schemeId + ", schemeName=" + schemeName + ", schemeType=" + schemeType
				+ ", schemeLaunchDate=" + schemeLaunchDate + ", schemeEligibility=" + schemeEligibility
				+ ", schemeObjective=" + schemeObjective + ", trainingCourse=" + trainingCourse + "]";
	}



	

	
	
}