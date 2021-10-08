package com.mercadolibre.test;


import static org.junit.Assert.assertFalse;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mercadolibre.StartWebApplication;
import com.mercadolibre.service.MutantService;

@RunWith(SpringRunner.class)
@SpringBootTest(
  classes = StartWebApplication.class)
public class MutantTest {
	
	@Autowired
	MutantService mutantService;
	
	MutantTestDTO dto = new MutantTestDTO();
		
	
	@Test
	public void validateCharactersOk() {
		boolean ok =mutantService.validateCharactersOk(dto.getDnaCharracterOK());
		assertFalse(!ok);
	}
	
	@Test
	public void validateCharactersOkFalse() {

		boolean ok =mutantService.validateCharactersOk(dto.getDnaCharracterFalse());
		assertFalse(ok);
	}
	
	@Test
	public void horizontal() {
		boolean horizontal = false;
		outerloop:
		for (int i = 0; i < dto.getDnaErrorHo().length; i++) {
			for (int j = 0; j < dto.getDnaErrorHo().length; j++) {
              mutantService.horizontal(dto.getDnaErrorHo(), i, j);
              if(mutantService.secuenciashorizontal>0) {
            	  horizontal=true;
            	  break outerloop;
              }

			}

		}
		
		assertFalse(!horizontal);
	}
	
	@Test
	public void vertical() {
		boolean vertical = false;
		outerloop:
		for (int i = 0; i < dto.getDnaVertical().length; i++) {

			for (int j = 0; j < dto.getDnaVertical().length; j++) {
              mutantService.vertical(dto.getDnaVertical(), i, j);
              if(mutantService.secuenciaVert>0) {
            	  vertical=true;
            	  break outerloop;
              }

			}

		}
		
		assertFalse(!vertical);
	}
	
	@Test
	public void oblicuo() {
		boolean oblicuo = false;
			for (int i = 0; i < dto.getDnaOblicuo().length; i++) {
              mutantService.oblicuo(dto.getDnaOblicuo(), i);
              if(mutantService.secuenciasOblicua>0) {
            	  oblicuo=true;
            	  break;
              }

			}
		
		assertFalse(!oblicuo);
	}
	
	@Test
	public void esMutante() {
		boolean esMutante = mutantService.isMutant(dto.getDnaMutante());
		assertFalse(!esMutante);
	}
	
	@Test
	public void guardarMutante() {
		String dna  = Arrays.asList(dto.getDnaMutante()).toString();
		mutantService.guardarMutante(dna, false);
	}
	
	@Test
	public void stats() {
		mutantService.stats();
	}

}
