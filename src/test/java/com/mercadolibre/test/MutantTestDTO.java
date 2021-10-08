package com.mercadolibre.test;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MutantTestDTO {

	String[] dnaCharracterFalse= 
		   {"ACAAAA",
            "BATAAA", 
            "LBQBBY", 
            "MBBAAA", 
            "NBCBAA", 
            "CCCCGB"};
	
	String[] dnaCharracterOK= 
		   {"ACAAAA",
            "TAAAAG", 
            "GTAAAA", 
            "CCCCCC", 
            "GGGAAA", 
            "CCCCGA"};
	
	String [] dnaHorizontal = 
		   {"ACAAAA",
            "TTTTAG", 
            "GTAAAA", 
            "TATATA", 
            "GGGAAA", 
            "CCCCGA"};
	
	String [] dnaErrorHo =
		{"AGCGGG",
                "CACAAA", 
                "TATTTT", 
                "CCTCCC", 
                "AAGGGA", 
                "CACCGG"};
	
	String [] dnaVertical = 
		   {"ACAAAA",
            "TAAAAG", 
            "GAAAAA", 
            "CATCCC", 
            "GAGTAA", 
            "CCCCGA"};
	
	String [] dnaOblicuo =
		   {"ACAAAA",
            "TAAAAG", 
            "GTAAAA", 
            "CCCACC", 
            "GGGAAA", 
            "CCCCGA"};
	
	String [] dnaMutante =
		{"ATGCGA",
		 "CAGTGC", 
		 "TTATGT", 
		 "AGAAGG", 
		 "CCCCTA", 
		 "TCACTG"	
		};
}
