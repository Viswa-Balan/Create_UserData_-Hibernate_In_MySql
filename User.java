package org.jsp.hibernate_demo;

import javax.persistence.*;

@Entity
@Table(name="User")
public class User      
{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
    private int id;
	@Column(nullable=false)
	private String Name;
	@Column (nullable=false , unique=true)
	private long Phone;
	@Column (nullable=false , unique=true)
	private String Email;
	@Column (nullable=false)
	
	private String Password;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	public long getPhone()
	{
		return Phone;
	}
	public void setPhone(long phone) 
	{
		Phone = phone;
	}
	public String getEmail() 
	{
		return Email;
	}
	public void setEmail(String email) 
	{
		Email = email;
	}
	public String getPassword()
	{
		return Password;
	}
	public void setPassword(String password) 
	{
		Password = password;
	}
	
}
