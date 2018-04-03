import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * 
 */

/**
 * @author Smitha Paramanandan
 *
 */
@Stateless
@WebService(portName = "MyWebServicePort", serviceName = "MyWebService", targetNamespace = "http://smitha.com/wsdl", endpointInterface = "MyWebServiceInterface")
public class MyWebServiceImplementation implements MyWebServiceInterface {

	@Override
	public int sum(int add1, int add2) {
		return add1 + add2;
	}

	@Override
	public int multiply(int mul1, int mul2) {
		return mul1 * mul2;
	}

}
