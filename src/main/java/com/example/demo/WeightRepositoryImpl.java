package com.example.demo;

public class WeightRepositoryImpl implements WeightRepository {
	
	@Override

	public double selectByNo(double number) {
		double name;
		name = number * number * 18;
		name = Math.ceil(name);

		return name; 
		
	}
}		


