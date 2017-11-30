package com.test.ws.DBTest;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="CASE_INFORMATION")
public class CaseInformation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5541539478761126566L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String case_id; 
	private String category_id;//CATEGORY_ID
	private String person_id;//	PERSON_ID; 
	private String channel_id;//CHANNEL_ID;
	private String company_id;//COMPANY_ID; 
	private String status_id;//STATUS_ID; 
	private String received_date;//RECEIVED_DATE; 
	private String assigned_date;//ASSIGNED_DATE;
	private String drug_name;//DRUG_NAME; 
	private String drug_description;//DRUG_DESCRIPTION; 
	private String reviewer_comments;//REVIEWER_COMMENTS;
	private String case_documents;//CASE_DOCUMENTS; 
	private String approved_date;//APPROVED_DATE; 
	private String detailed_description;//DETAILED_DESCRIPTION; 
	
	
	public String getCase_id() {
		return case_id;
	}
	public void setCase_id(String case_id) {
		this.case_id = case_id;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getPerson_id() {
		return person_id;
	}
	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}
	public String getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public String getStatus_id() {
		return status_id;
	}
	public void setStatus_id(String status_id) {
		this.status_id = status_id;
	}
	public String getReceived_date() {
		return received_date;
	}
	public void setReceived_date(String received_date) {
		this.received_date = received_date;
	}
	public String getAssigned_date() {
		return assigned_date;
	}
	public void setAssigned_date(String assigned_date) {
		this.assigned_date = assigned_date;
	}
	public String getDrug_name() {
		return drug_name;
	}
	public void setDrug_name(String drug_name) {
		this.drug_name = drug_name;
	}

	public String getDrug_description() {
		return drug_description;
	}
	public void setDrug_description(String drug_description) {
		this.drug_description = drug_description;
	}
	public String getReviewer_comments() {
		return reviewer_comments;
	}
	public void setReviewer_comments(String reviewer_comments) {
		this.reviewer_comments = reviewer_comments;
	}
	public String getCase_documents() {
		return case_documents;
	}
	public void setCase_documents(String case_documents) {
		this.case_documents = case_documents;
	}
	public String getApproved_date() {
		return approved_date;
	}
	public void setApproved_date(String approved_date) {
		this.approved_date = approved_date;
	}
	public String getDetailed_description() {
		return detailed_description;
	}
	public void setDetailed_description(String detailed_description) {
		this.detailed_description = detailed_description;
	}
	
}
