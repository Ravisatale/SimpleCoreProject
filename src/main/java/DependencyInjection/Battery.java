package DependencyInjection;

public class Battery {
 int id;
 int mah;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMah() {
	return mah;
}
public void setMah(int mah) {
	this.mah = mah;
}
@Override
public String toString()
{
	return "id="+id+" mah= "+mah;
	}
}
