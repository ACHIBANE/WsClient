package wmd.serviceInvoc;

import generated.Client_managerStub;
import generated.Client_managerStub.CheckUser;
import generated.Client_managerStub.CheckUserResponse;

public class WsConsumer {

	public static void main(String[] args) throws Exception {
		
		Client_managerStub stub = new Client_managerStub("http://localhost:8080/axis2/services/client_manager");
		
		CheckUser request = new CheckUser();
		request.setLogin("achiban");
		request.setPswd("azerty123");
		
		CheckUserResponse response = stub.checkUser(request);
		Client_managerStub.User user = response.get_return();
		
		System.out.println(user);
		

	}

}
