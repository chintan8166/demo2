package javaconcept;

public class googlechrome implements webdriver {

	public static void main(String[] args) {
		webdriver g= new googlechrome();
		System.out.println(webdriver.b);
		g.closebrowser();
		g.openbrowser();
		g.navigate();
	}

	@Override
	public void openbrowser() {
		// TODO Auto-generated method stub
		System.out.println("open google chrome");
		
	}

	@Override
	public void closebrowser() {
		
		System.out.println("close google chrome");
	}

	@Override
	public void navigate() {
		System.out.println("navigate google chrome");
		
	}
	public void addons()
	{
		System.out.println("many extensions are Inbuild");
	}

}
