package Service;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CalculatorResource {
	CalculatorService service = new CalculatorService();
	@WebMethod
	public double add(double a, double b) {
		return service.add(a, b);
	}
	@WebMethod
	public double sub(double a, double b) {
		return service.sub(a, b);
	}
    @WebMethod
	public double div(double a, double b) {
		return service.div(a, b);
	}
    @WebMethod
	public double mul(double a, double b) {
		return service.mul(a, b);
	}


	
	

}
