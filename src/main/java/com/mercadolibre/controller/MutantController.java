package com.mercadolibre.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mercadolibre.dto.MutantDTO;
import com.mercadolibre.dto.ResponseMutantDTO;
import com.mercadolibre.service.MutantService;



@RestController
public class MutantController {
	
	private static final Logger logger = LoggerFactory.getLogger(MutantController.class);
	
	@Autowired
	MutantService mutantService;

	@PostMapping(path = "mutant")
	public boolean isMutant(@RequestBody MutantDTO mutant) {
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		logger.info("mutant: ",mutant.getDna()[0]);
	 	return mutantService.isMutant(mutant.getDna());
	}
	
	@GetMapping("stats")
	public ResponseMutantDTO stats() {
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		return mutantService.stats();
	}
	
}
