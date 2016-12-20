package wmd.serviceInvoc;

import wmd.Client_managerStub;
import wmd.Client_managerStub.Hello;
import wmd.Client_managerStub.HelloResponse;


public class WsConsumer {

	public static void main(String[] args) throws Exception {
		
		Client_managerStub stub = new Client_managerStub("http://localhost:8080/axis2/services/client_manager");
		
		Hello request = new Hello();
		request.setLogin("ACHIBANE");
		
		
		HelloResponse response = stub.hello(request);
		String greeting = response.get_return();
		
		System.out.println(greeting);
		

	}

}
