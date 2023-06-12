package com.servletproject;


public class User {
	String email;
	String username;
	String password;
	String mobileNo;
	String totalQual;
	String gender;
	String totalTech;
	String country;
	String totalAddrs;
	String review;
	
	public User(String email, String username, String password, String mobileNo, String totalQual,String gender, String totalTech, String country, String totalAddrs, String review)
	{
		this.email=email;
		this.username=username;
		this.password=password;
		this.mobileNo=mobileNo;
		this.totalQual=totalQual;
		this.gender=gender;
		this.totalTech=totalTech;
		this.country=country;
		this.totalAddrs=totalAddrs;
		this.review=review;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getMobileNo()
	{
		return mobileNo;
	}
	public void setMobileNo(String mobileNo)
	{
		this.mobileNo=mobileNo;
	}
	public String getTotalQual()
	{
		return totalQual;
	}
	public void setTotalQual(String totalQual)
	{
		this.totalQual=totalQual;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getTotalTech()
	{
		return totalTech;
	}
	public void setTotalTech(String totalTech)
	{
		this.totalTech=totalTech;
	}
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public String getTotalAddrs()
	{
		return totalAddrs;
	}
	public void setTotalAddrs(String totalAddrs)
	{
		this.totalAddrs=totalAddrs;
	}
	public String getReview()
	{
		return review;
	}
	public void setReview(String review)
	{
		this.review=review;
	}
}


