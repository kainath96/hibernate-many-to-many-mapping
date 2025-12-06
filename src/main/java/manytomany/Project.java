package manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="project")
public class Project {

	@Column(name="pro_id")
	@Id
	private int pro_id;
	
	@Column(name="pro_name")
	private String pro_name;
	
	@ManyToMany(fetch=FetchType.LAZY , cascade= {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(name="Emp_Proj",
			joinColumns = @JoinColumn(name = "pro_id"),
			inverseJoinColumns = @JoinColumn(name="id")
			)
	private List<Employee> employee;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int pro_id, String pro_name) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
	}

	public int getPro_id() {
		return pro_id;
	}

	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	
	

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Project [pro_id=" + pro_id + ", pro_name=" + pro_name + "]";
	}
	
	
}
