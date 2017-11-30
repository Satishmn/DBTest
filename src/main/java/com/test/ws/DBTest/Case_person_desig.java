package com.test.ws.DBTest;

//@Entity // This tells Hibernate to make a table out of this class
public class  Case_person_desig {
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
	//PK
    private String designation_id;

    private String designation;

	public String getDesignation_id() {
		return designation_id;
	}

	public void setDesignation_id(String designation_id) {
		this.designation_id = designation_id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

  

}