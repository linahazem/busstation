public class persons {

String name;
String id;
String job;

public String getType() {
	return job;
}
public void setType(String job) {
	this.job = job;
}
public persons(String name,String id,String job) {

	this.name=name;
	this.id=id;
	this.job=job;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

}
