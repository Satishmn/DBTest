package com.test.ws.DBTest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired 
	private CaseChannelsRepository caseChannelsRepository;
	
	@Autowired
	private CasePeopleRepository casePeopleRepository;
	
	@Autowired
	private CaseInformationRepository  caseInformationRepository;
	

	@GetMapping(path="/getChannels")
	public @ResponseBody Iterable<CaseChannels> getAllChannels() {
		// This returns a JSON or XML with the users
		return caseChannelsRepository.findAll();
	}
	
	@GetMapping(path="/getPeople")
	public @ResponseBody Iterable<CasePeople> getAllPeople() {
		// This returns a JSON or XML with the users
		return casePeopleRepository.findAll();
	}
	
	@GetMapping(path="/getcasesInformation")
	public @ResponseBody Iterable<CaseInformation> getAllCasesInformation() {
		// This returns a JSON or XML with the users
		return caseInformationRepository.findAll();
	}
	
/**
	@Autowired
	private OracleConnectionSample  testConn;
	
	@GetMapping(path="/getUnAssignedCases")
	public @ResponseBody ResultSet getUnAssignedCases() {
		// This returns a JSON or XML with the users
		return testConn.TestDBQuery();
	}
/**
 * 
 * 
 * 
 
	
@Entity
@SqlResultSetMapping(name="compositekey",
        entities=@EntityResult(entityClass=SpaceShip.class,
            fields = {
                    @FieldResult(name="name", column = "name"),
                    @FieldResult(name="model", column = "model"),
                    @FieldResult(name="speed", column = "speed"),
                    @FieldResult(name="captain.firstname", column = "firstn"),
                    @FieldResult(name="captain.lastname", column = "lastn"),
                    @FieldResult(name="dimensions.length", column = "length"),
                    @FieldResult(name="dimensions.width", column = "width")
                    }),
        columns = { @ColumnResult(name = "surface"),
                    @ColumnResult(name = "volume") } )

@NamedNativeQuery(name="compositekey",
    query="select name, model, speed, lname as lastn, fname as firstn, length, width, length * width as surface from SpaceShip", 
    resultSetMapping="compositekey")
} )
public class SpaceShip {
    private String name;
    private String model;
    private double speed;
    private Captain captain;
    private Dimensions dimensions;

    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumns( {
            @JoinColumn(name="fname", referencedColumnName = "firstname"),
            @JoinColumn(name="lname", referencedColumnName = "lastname")
            } )
    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}

@Entity
@IdClass(Identity.class)
public class Captain implements Serializable {
    private String firstname;
    private String lastname;

    @Id
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Id
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
 */
}