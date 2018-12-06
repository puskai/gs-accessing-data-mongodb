package hello;

import java.time.LocalDate;
import java.util.TreeMap;
import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	public String id;

	public String firstName;
	public String lastName;
	public LocalDate birthdate;
	public TreeMap<LocalDate, Double> dateValues;

	public Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

//	public Customer(String firstName, String lastName, LocalDate birthdate) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.birthdate = birthdate;
//	}
	public Customer(String firstName, String lastName, LocalDate birthdate, TreeMap<LocalDate, Double> dateValues) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.dateValues = dateValues;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer[id=%s, firstName='%s', lastName='%s']",
				id, firstName, lastName);
	}

}
