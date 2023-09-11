package com.Spring_Reference;

public class Student {
private Scores score;

@Override
public String toString() {
	return "Student [score=" + score + "]";
}

public Scores getScore() {
	return score;
}

public void setScore(Scores score) {
	this.score = score;
}
}
