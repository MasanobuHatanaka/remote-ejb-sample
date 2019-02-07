package sample.ejb;

import javax.ejb.Remote;

import org.jboss.ejb.client.annotation.ClientTransaction;
import org.jboss.ejb.client.annotation.ClientTransactionPolicy;

@Remote
public interface HelloServerBRemote {
	String helloServerB();
}
