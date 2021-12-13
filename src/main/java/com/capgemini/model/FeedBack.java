package com.capgemini.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="feedback_table")
public class FeedBack {
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedBackId;
	
	@Column
	private int schemeRating;
	
	@Column
	private int schemeTrainingRating;
	
	@Column
	private int overallRating;
	
	@Column
	private String comments;
	
	@Column
	private	LocalDate feedbackdate;
	
	@ManyToOne
	@JoinColumn(name="courseId")
	private TrainingCourse trainingCourse;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "scheme")
	private Scheme scheme;

	public FeedBack() {
		super();
	}

	public FeedBack(int feedBackId, int schemeRating, int schemeTrainingRating, int overallRating, String comments,
			LocalDate feedbackdate, TrainingCourse trainingCourse, Scheme scheme) {
		super();
		this.feedBackId = feedBackId;
		this.schemeRating = schemeRating;
		this.schemeTrainingRating = schemeTrainingRating;
		this.overallRating = overallRating;
		this.comments = comments;
		this.feedbackdate = feedbackdate;
		this.trainingCourse = trainingCourse;
		this.scheme = scheme;
	}

	public int getFeedBackId() {
		return feedBackId;
	}

	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
	}

	public int getSchemeRating() {
		return schemeRating;
	}

	public void setSchemeRating(int schemeRating) {
		this.schemeRating = schemeRating;
	}

	public int getSchemeTrainingRating() {
		return schemeTrainingRating;
	}

	public void setSchemeTrainingRating(int schemeTrainingRating) {
		this.schemeTrainingRating = schemeTrainingRating;
	}

	public int getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public LocalDate getFeedbackdate() {
		return feedbackdate;
	}

	public void setFeedbackdate(LocalDate feedbackdate) {
		this.feedbackdate = feedbackdate;
	}

	public TrainingCourse getTrainingCourse() {
		return trainingCourse;
	}

	public void setTrainingCourse(TrainingCourse trainingCourse) {
		this.trainingCourse = trainingCourse;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}

	@Override
	public String toString() {
		return "FeedBack [feedBackId=" + feedBackId + ", schemeRating=" + schemeRating + ", schemeTrainingRating="
				+ schemeTrainingRating + ", overallRating=" + overallRating + ", comments=" + comments
				+ ", feedbackdate=" + feedbackdate + ", trainingCourse=" + trainingCourse + ", scheme=" + scheme + "]";
	}


}
