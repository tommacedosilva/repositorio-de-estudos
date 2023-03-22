package com.qintess.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			// criar objeto mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// ler arquivo JSON e mapear/converter para Java POO: 
			// data/sample-lite.json
			// Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// imprimir nome e sobrenome
			System.out.println("First Name = " + theStudent.getFirstName());
			System.out.println("Last Name = " + theStudent.getLastName());
			
			// imprimir address: street e city
			Address tempAddress = theStudent.getAddress();
			
			System.out.println("Street = " + tempAddress.getStreet());
			System.out.println("City = " + tempAddress.getCity());
			
			// imprimir languages
			
			System.out.println("Languages: ");
			
			for (String tempLang : theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
			
			
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
