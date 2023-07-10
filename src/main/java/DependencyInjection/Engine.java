package DependencyInjection;

public class Engine {
 int id; 
 String cc;
 @Override
  public String toString()
  {
	return "Engine"+"id="+id+"cc="+cc;
	  
  }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCc() {
	return cc;
}
public void setCc(String cc) {
	this.cc = cc;
}
}
