/**
 * 
 */
package com.smitha.playground.integrations.quickbooks.desktop.ws;
import javax.jws.WebService;

import com.smitha.playground.integrations.ArrayOfString;
import com.smitha.playground.integrations.Authenticate;
import com.smitha.playground.integrations.AuthenticateResponse;

/**
 * @author Smitha Paramanandan
 *
 */

@WebService(portName = "QBDPort", serviceName = "QBD", targetNamespace = "http://playground.com/wsdl", endpointInterface = "com.smitha.playground.integrations.quickbooks.desktop.ws.QuickBooksDesktopIntegration")
public class QuickBooksDesktopIntegrationImpl implements QuickBooksDesktopIntegration {

	public AuthenticateResponse authenticate(Authenticate authenticate) {
		AuthenticateResponse response = new AuthenticateResponse();
        String username = authenticate.getStrUserName();
        String password = authenticate.getStrPassword();
        if(username != null && !"".equals(username) && password != null && !"".equals(password)) {
            ArrayOfString aos = new ArrayOfString();
            aos.getString().add("none");
            response.setAuthenticateResult(aos);
            System.out.println(username);
            System.out.println(password);
        }
        return response;
	}

}
