package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {

	@Before
	public void setup(Scenario scenario)
	{
		System.out.println("++Launching the browser and executing scenario "+scenario.getName());
	}
	
	@After
	public void tearDown()
	{
		System.out.println("--Browser got closed");
	}
	

	/*
	 * //cucumber hook @Before method gets called before each scenario
	 * 
	 * @Before(order = 0,value="@search") public void setupOne() {
	 * System.out.println("++Browser got opened setup One "); }
	 * 
	 * @Before(order=1,value="@search") public void setupTwo() {
	 * System.out.println("++setup Two"); }
	 * 
	 * //Cucumber hook @After method gets called after each scenario
	 * // @After("@login") this tagged hook method runs after each scenario with
	 * tag @login
	 * 
	 * @After public void tearDownOne() {
	 * System.out.println(">>Browser got closed"); }
	 */
}
