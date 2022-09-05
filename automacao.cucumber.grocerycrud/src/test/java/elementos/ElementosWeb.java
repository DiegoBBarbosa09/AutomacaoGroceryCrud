package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	public By versao = By.xpath("//select[@id='switch-version-select']");
	public By name = By.xpath(" //input[@id='field-customerName']");
	public By lastName = By.xpath("//input[@id='field-contactLastName']");
	public By contactFirstName = By.xpath("//input[@id='field-contactFirstName']");
	public By phone = By.xpath("//input[@id='field-phone']");
	public By address1 = By.xpath("//input[@id='field-addressLine1']");
	public By address2 = By.xpath("//input[@id='field-addressLine2']");
	public By city = By.xpath("//input[@id='field-city']");
	public By state = By.xpath("//input[@id='field-state']");
	public By postalCode = By.xpath("//input[@id='field-postalCode']");
	public By country = By.xpath("//input[@id='field-country']");
	public By fromEnployeer = By.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']//span[1]");
	public By fromEnployeer2 = By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[5]");
	public By creditLimit = By.xpath("//input[@id='field-creditLimit']");
	public By delete = By.xpath("//input[@id='field-deleted']");

}
