package com.capgemini;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.capgemini.model.Scheme;
import com.capgemini.repository.ISchemeRepository;
import com.capgemini.service.ISchemeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SchemeTest {

	@Autowired
	private ISchemeService ischemeService;

	@MockBean
	private ISchemeRepository iSchemeRepository;
	
	
	@Test
	public void addSchemeTest() {
		Scheme scheme = new Scheme(1, "Beti Bachao Beti Padhao Scheme", "Free", null, "10th Pass", "Women Empowerment");
		when(iSchemeRepository.save(scheme)).thenReturn(scheme);

		assertEquals(scheme, ischemeService.addScheme(scheme));
	}

	// -------------------------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void viewAllTest() {
		when(iSchemeRepository.findAll()).thenReturn(
				Stream.of(new Scheme(2, "Mahila Shakti Kendra", "Free", null, "12th Pass", "Women Safety")).collect(Collectors.toList()));

		assertEquals(1, ischemeService.viewAllScheme().size());
	}

	// -------------------------------------------------------------------------------------------------------------------------------------------------

	@Test
	public void viewSchemesByTypeTest() {
		String type = "Paid";
		when(iSchemeRepository.findBySchemeType(type)).thenReturn(
				Stream.of(new Scheme(3, "Working Women Hostel", "Paid", null, "12th Pass", "Provide eduaction in minimal cost")).collect(Collectors.toList()));

		assertEquals(1, ischemeService.viewSchemesByType(type).size());
	}

	// -------------------------------------------------------------------------------------------------------------------------------------------------

	
	@Test
	public void viewSchemesByEligibilityTest() {
		String eligibility = "10th Pass";
		when(iSchemeRepository.findBySchemeEligibility(eligibility)).thenReturn(
				Stream.of(new Scheme(4, "Rastriya Mahila Kosh", "Paid", null, "10th Pass", "Micro credit to poor women")).collect(Collectors.toList()));

		assertEquals(1, ischemeService.viewSchemesByEligibility(eligibility).size());
	}
	
	
}
