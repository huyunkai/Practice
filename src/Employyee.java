
 public  class Employyee
    {
    	private static int nextId;
		private String name;
    	private double salary;
    	private int id;
    	public Employyee(String n,double s)
    	{
    		name=n;
    		salary=s;
    		id=0;
    	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId() {
			id=nextId;
			nextId++;
			
		}
       
  public static void main(String []args)
  {
	  Employyee e=new Employyee("Harry", 50000);
      System.out.println(e.getName()+" "+e.getSalary());
  }
    
}
