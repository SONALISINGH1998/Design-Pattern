package com.cts.demo.abstractfactory;

public class Client {
	public static void main(String[] args) {
		
		Factory fact1=new MercedesFactory();
		Headlight hl = fact1.makeHeadlight();
		hl.headlightProducedType("Mercedes");
		Tire t1 = fact1.makeTire();
		t1.tireProducedType("Mercedes");
		
		Factory fact2=new AudiFactory();
		Headlight h2 = fact2.makeHeadlight();
		h2.headlightProducedType("Audi");
		Tire t2 = fact1.makeTire();
		t2.tireProducedType("Audi");
		
		}
}
