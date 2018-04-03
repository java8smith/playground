/**
 * 
 */
package com.smitha.playground.integrations.quickbooks.desktop.ws;

import javax.jws.WebService;

import com.smitha.playground.integrations.AuthenticateResponse;

/**
 * @author Smitha Paramanandan
 *
 */
@WebService(targetNamespace = "http://playground.com/wsdl")
public interface QuickBooksDesktopIntegration {
	
	AuthenticateResponse authenticate(com.smitha.playground.integrations.Authenticate authenticate);

}
