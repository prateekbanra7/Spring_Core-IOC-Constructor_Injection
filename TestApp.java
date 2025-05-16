package in.abc.Test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.abc.bean.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) {

		// using the FileSystemResource to locate the configuration file
		FileSystemResource resource = new FileSystemResource("./src/applicationContext.xml");

		// Creating in IOC container
		XmlBeanFactory factory = new XmlBeanFactory(resource);

		// Requesting IOC container to give the object,searching will happen in cache and 
		//if it is not found then object will created by loading and performing setter injection.
		WishMessageGenerator generator1 = factory.getBean("wmg", WishMessageGenerator.class);

				
		// using the target object performing the operation and printing the result
		String result = generator1.generateWishMessage("sachin");
		System.out.println(result);
	}
}
