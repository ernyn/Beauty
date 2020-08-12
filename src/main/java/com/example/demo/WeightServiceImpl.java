package com.example.demo;

public class WeightServiceImpl implements WeightService {

	@Override
	public double findByNo(double number) {
	//リポジトリから身長を取得
		WeightRepository weightRepository = new WeightRepositoryImpl();
		double name = weightRepository.selectByNo(number);
	return name;
	}

}
