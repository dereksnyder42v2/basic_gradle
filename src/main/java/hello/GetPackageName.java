package hello;


public class GetPackageName {


	public GetPackageName() {
		;
	}

	public static void main(String[] args) {
		System.out.println("hello world!");
		GetPackageName gpn = new GetPackageName();
		System.out.println(gpn.getClass().getCanonicalName());

	}

}

