package citi.StepDef;



import citiDriverPackage.driverSetUp;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeActionClass {
	
	@Before
	public void beforeScenarioAction(Scenario scenario) {
		
			System.out.println(">>>Initialising Chrome Driver  <<<");
	driverSetUp.setupChromeDriver();
	System.out.println(">>Scenario Executed:" +scenario.getName() );
	
	
	}
	

	

}
