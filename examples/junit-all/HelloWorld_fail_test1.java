package apluslms;

public class HelloWorld {

	private String name = "";

	public String getName() {
		return "wrong name";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return "Hello" + (name == "" ? "" : " " + name) + "!";
	}
}
