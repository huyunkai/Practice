package package2;

public enum Size
{ 
	
	  SAMLL("S"),MEDIUN("M"),LARGE("L"),EXTRA_LARGE("XL");
	  private Size(String abbreviation)
	  {
		  this.abbreviation=abbreviation;
	  }
	  public String getAbbreviation()
	  {
		  return abbreviation;
	  }
	  private String abbreviation;
}
