package com.Spring_Reference;
//  pojo/bean class

public class Scores {
private Double physics;
private Double Chemistry;
private Double Maths;
public Double getPhysics() {
	return physics;
}
public void setPhysics(Double physics) {
	this.physics = physics;
}
public Double getChemistry() {
	return Chemistry;
}
public void setChemistry(Double chemistry) {
	Chemistry = chemistry;
}
public Double getMaths() {
	return Maths;
}
public void setMaths(Double maths) {
	Maths = maths;
}
@Override
public String toString() {
	return "Scores [physics=" + physics + ", Chemistry=" + Chemistry + ", Maths=" + Maths + "]";
}


}
