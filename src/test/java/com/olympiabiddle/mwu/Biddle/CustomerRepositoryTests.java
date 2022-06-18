package com.olympiabiddle.mwu.Biddle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import com.olympiabiddle.mwu.entity.Customer;
import com.olympiabiddle.mwu.repository.CustomerRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CustomerRepositoryTests {
	
	@Autowired
	private CustomerRepository repo;

	@Test
	public void testCreatCustomer() {
		Customer customer = new Customer();
		customer.setFirstName("Mike");
		customer.setLastName("Jones");
		customer.setPassword("password123");
		customer.setEmail("mikeJones@yahoo.com");
		customer.setPhoneNumber("281-330-8004");

		Customer savedCustomer = repo.save(customer);
		/* this test checks if customer was created and saved */
		assertNotNull(savedCustomer);

		/*
		 * this test checks if the id is greater than 0 checks if customer was created
		 */
		assertTrue(savedCustomer.getId() > 0);

	}

	@Test
	public void testUpdateCustomer() {
		/* test will update the customers with id of 1
		 * and update lastname to Williams */
		Integer customerId = 1;
		String lastName = "Williams";

		Customer customer = repo.findById(customerId).get();
		customer.setLastName(lastName);

		Customer updatedCustomer = repo.save(customer);
		/* Will check if updated lastname( formerly Jones)
		 *  in database equals "Williams"*/
		assertEquals(updatedCustomer.getLastName(), lastName);
	}

	@Test
	public void testFindByEmail() {
		/* test determines  if customer object exists
		 * for given lastname*/
		String email = "mikeJones@yahoo.com";
		Customer customer = repo.findByEmail(email);

		assertNotNull(customer);
		System.out.println(customer);
	}

}
