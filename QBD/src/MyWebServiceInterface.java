import javax.jws.WebService;

/**
 * 
 */

/**
 * @author Smitha Paramanandan
 *
 */
@WebService(targetNamespace = "http://smitha.com/wsdl")
public interface MyWebServiceInterface {
	public int sum(int add1, int add2);
	 
    public int multiply(int mul1, int mul2);
}
