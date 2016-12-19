/**
 * Client_managerCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package generated;


/**
 *  Client_managerCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class Client_managerCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public Client_managerCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public Client_managerCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for checkUser method
     * override this method for handling normal response from checkUser operation
     */
    public void receiveResultcheckUser(
        generated.Client_managerStub.CheckUserResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkUser operation
     */
    public void receiveErrorcheckUser(java.lang.Exception e) {
    }
}