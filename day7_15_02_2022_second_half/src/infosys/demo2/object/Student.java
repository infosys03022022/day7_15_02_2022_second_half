package infosys.demo2.object;

import java.util.Objects;

public class Student {
private int roll;
private String name;
private int marks;
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + marks;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + roll;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (marks != other.marks)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (roll != other.roll)
		return false;
	return true;
}



}
