package customeexception;

public class EmployeeNotFoundException extends RuntimeException {
private String message;

public EmployeeNotFoundException(String message) {
	
	this.message = message;
}

@Override
public String toString() {
	return message;
}

}
