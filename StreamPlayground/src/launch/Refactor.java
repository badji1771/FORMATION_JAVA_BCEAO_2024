package launch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Department;
import model.Employee;
import model.Invoice;
import model.NamePhone;
import model.NamePhoneEmail;

public class Refactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		Stream<Integer> sqrtRootstrm = myList.stream().map((a)->a*a);
		sqrtRootstrm.forEach(System.out::println);
		
		System.out.println("-------------  -----------------------");
		List<NamePhoneEmail> myList2 = new ArrayList<>();
		myList2.add(new NamePhoneEmail("Larry", "555-5555","larry@google.com"));
		myList2.add(new NamePhoneEmail("Jame", "555-4444","jame@google.com"));
		myList2.add(new NamePhoneEmail("Mary", "555-2222","mary@google.com"));
		myList2.add(new NamePhoneEmail("azert", "555-1111","azert@google.com"));
		
		myList2.stream().forEach(a->{
			System.out.println(a.getName()+" "+a.getPhonenum()+" "+a.getEmail());
		});

		System.out.println("-----------------  ---------------------------");
		
		//List<NamePhone> namePhones = new ArrayList<>();
		
		//myList2.stream().forEach((a)-> new NamePhone(a.getName(), a.getPhonenum()));
		
		System.out.println("--------------------- depatement --------------------------");
		Employee john = new Employee("John", 30);
		Employee jane = new Employee("jane", 30);
		Employee jack = new Employee("jack", 30);
		Employee snow = new Employee("snow", 30);
		
		Department hr = new Department("Human Ressources");
		hr.addEmployee(john);
		hr.addEmployee(jane);
		hr.addEmployee(jack);
		hr.addEmployee(snow);
		
		Department accounting = new Department("Accounting");
		accounting.addEmployee(john);
		
		List<Department> departements = new ArrayList<>();
		departements.add(hr);
		departements.add(accounting);
		
		List<Employee> subList =departements.stream().flatMap(departement->departement.getEmployees()
				.stream()).collect(Collectors.toList());
		System.out.println(subList);
	}
	private static void oldSchool(List<Invoice> invoices) {

		List<Invoice> trainingInvoices = new ArrayList<>();
		for (Invoice inv : invoices) {
			if (inv.getTitle().contains("Training")) {
				trainingInvoices.add(inv);
			}
		}
		Collections.sort(trainingInvoices, new Comparator<Invoice>() {
			public int compare(Invoice inv1, Invoice inv2) {
				return inv2.getAmount().compareTo(inv1.getAmount());
			}
		});
		List<Integer> invoiceIds = new ArrayList<>();
		for (Invoice inv : trainingInvoices) {
			invoiceIds.add(inv.getId());
		}
	}

}
