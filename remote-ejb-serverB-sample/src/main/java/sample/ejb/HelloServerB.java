package sample.ejb;

import javax.ejb.Stateful;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateful
public class HelloServerB implements HelloServerBRemote {
	
	public String helloServerB() {
		System.out.println("executed helloServerB()");
		return "Hello Server B.";
	}
}
