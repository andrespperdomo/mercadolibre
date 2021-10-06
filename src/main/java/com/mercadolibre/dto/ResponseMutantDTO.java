package com.mercadolibre.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMutantDTO {

	private Integer countHumanDNA;
	private Integer countMutantDNA;
	private Double ratio;
}
