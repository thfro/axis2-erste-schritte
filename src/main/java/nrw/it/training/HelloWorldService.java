package nrw.it.training;

public class HelloWorldService {

	public String createGreeting(String personName, String language) {

		if ("de".equalsIgnoreCase(language)) {
			return "Hallo " + personName + "!";

		} else if ("en".equalsIgnoreCase(language)) {
			return "Hi " + personName + "!";

		} else if ("fr".equalsIgnoreCase(language)) {
			return "Bonjour " + personName + "!";

		} else {
			return "Sprache nicht unterstützt.";
		}
	}
}