package Basic;

public class CrossBrowser extends BaseClass {

	public static void main(String[] args) {
		BaseClass.OpenBrowser("chrome");
		//BaseClass.OpenBrowser("edge");
		//BaseClass.OpenBrowser("firefox");
       driver.get("https://www.ajio.com/");

	}

}
