package com.cts.demo.abstractfactory;

public class MercedesFactory extends Factory{
	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeaddlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}
