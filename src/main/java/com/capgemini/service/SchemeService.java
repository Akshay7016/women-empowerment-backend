package com.capgemini.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.SchemeAlreadyExistsException;
import com.capgemini.exception.SchemeNotFoundException;
import com.capgemini.model.Scheme;
import com.capgemini.repository.ISchemeRepository;

@Service
public class SchemeService implements ISchemeService {

	private static final Logger LOG = LoggerFactory.getLogger(ISchemeService.class);

	@Autowired
	private ISchemeRepository iSchemeRepository;

	@Override
	public Scheme addScheme(Scheme scheme) {
		LOG.info("Service addScheme");
		boolean result = iSchemeRepository.existsById(scheme.getSchemeId());
		if (!result) {
			return iSchemeRepository.save(scheme);
		} else {
			throw new SchemeAlreadyExistsException(scheme + " is already exists.");
		}

	}

	// -------------------------------------------------------------------------------------------
	
	@Override
	public Scheme updateScheme(Scheme scheme) {
		LOG.info("Service updateScheme");
		Optional<Scheme> result = iSchemeRepository.findById(scheme.getSchemeId());
		if (result.isPresent())
			return iSchemeRepository.save(scheme);
		else
			throw new SchemeNotFoundException(scheme + " not found.");
	}

	// -------------------------------------------------------------------------------------------

	@Override
	public Scheme viewScheme(int schemeId) {
		LOG.info("Service viewScheme");
		Optional<Scheme> result = iSchemeRepository.findById(schemeId);
		if (!result.isEmpty())
			return result.get();
		else
			throw new SchemeNotFoundException("Scheme Id: " + schemeId + " not found.");
	}

	// -------------------------------------------------------------------------------------------

	@Override
	public List<Scheme> viewAllScheme() {
		LOG.info("Service viewAllScheme");
		List<Scheme> result = iSchemeRepository.findAll();
		if (!result.isEmpty()) {
			return result;
		} else {
			throw new SchemeNotFoundException("Schemes not found.");
		}
	}

	// -------------------------------------------------------------------------------------------

	@Override
	public Scheme deleteScheme(int schemeId) {
		LOG.info("Service deleteScheme");
		Optional<Scheme> result = iSchemeRepository.findById(schemeId);
		if (result.isPresent()) {
			iSchemeRepository.deleteById(schemeId);
			return result.get();
		} else {
			throw new SchemeNotFoundException("Scheme Id: " + schemeId + " not found.");
		}
	}

	// -------------------------------------------------------------------------------------------

	@Override
	public List<Scheme> viewSchemesByType(String schemeType) {
		LOG.info("Service viewSchemesByType");
		List<Scheme> result = iSchemeRepository.findBySchemeType(schemeType);
		if (!result.isEmpty())
			return result;
		else
			throw new SchemeNotFoundException("Scheme with type \" " + schemeType + "\" is not found.");
	}

	// -------------------------------------------------------------------------------------------

	@Override
	public List<Scheme> viewSchemeByLaunchDate(LocalDate date) {
		LOG.info("Service viewSchemeByLaunchDate");
		List<Scheme> result = iSchemeRepository.findBySchemeLaunchDate(date);
		if (!result.isEmpty())
			return result;
		else
			throw new SchemeNotFoundException("Scheme with launch date \" " + date + "\" not found.");
	}

	// -------------------------------------------------------------------------------------------

	@Override
	public List<Scheme> viewSchemesByEligibility(String schemeEligibility) {
		LOG.info("Service viewSchemesByEligibility");
		List<Scheme> result = iSchemeRepository.findBySchemeEligibility(schemeEligibility);
		if (!result.isEmpty())
			return result;
		else
			throw new SchemeNotFoundException("Scheme with eligibility \" " + schemeEligibility + "\" not found.");
	}
}
