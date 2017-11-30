package com.test.ws.DBTest;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="CASE_CHANNELS")
public class CaseChannels implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4894058448050052924L;
	//PK category_id
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private String channel_id;
    private String channel_name;
    
	public String getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	public String getChannel_name() {
		return channel_name;
	}
	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "CASE_CHANNELS", 
	           joinColumns = { @JoinColumn(name = "channel_id") }, 
	           inverseJoinColumns = { @JoinColumn(name = "person_id") })
	private List<CasePeople> casePeople;
}
