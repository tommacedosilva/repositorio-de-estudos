package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.model.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	// Conectar o CustomerService
	
		@Autowired
		private CustomerService customerService;
		
		// adc mapeamento para obter(GET) /customers
		
		@GetMapping("/customers")
		public List<Customer> getCustomers(){
			return customerService.getCustomers();
		}
		
		// adc mapeamento para obter(GET) /customers/{customerId}
		
		@GetMapping("/customers/{customerId}")
		public Customer getCustomer(@PathVariable int customerId) {
			
			Customer theCustomer = customerService.getCustomer(customerId);
			
			if(theCustomer == null) {
				throw new CustomerNotFoundException("Customer id not found - " + customerId);
			}
			
			return theCustomer;
		}
		
		// adc mapeamento para POST /customers - adc novo customer
		
		@PostMapping("/customers")
		public Customer addCustomer(@RequestBody Customer theCustomer) {
			
			// para o caso de passar um id no JSON, configurar id para 0
			// isso vai forçar a salvar um novo item invés de atualizar um existente
			
			theCustomer.setId(0);
			
			customerService.saveCustomer(theCustomer);
			
			return theCustomer;
		}
		
		// adc mapeamento para PUT /customers - atualiza customer existente
		
		@PutMapping("/customers")
		public Customer updateCustomer(@RequestBody Customer theCustomer) {
			
			// faz a atualização e salva o update no banco de dados
			
			customerService.saveCustomer(theCustomer);
			
			return theCustomer;
		}
		
		// adc mapeamento para DELETE /customers/{customerId} - deleta customer existente
		
		@DeleteMapping("/customers/{customerId}")
		public String deleteCustomer(@PathVariable int customerId) {
			
			Customer tempCustomer = customerService.getCustomer(customerId);
			
			// joga uma exceção se id for nulo
			if(tempCustomer == null) {
				throw new CustomerNotFoundException("Customer id not found - " + customerId);
			}
			
			
			// deleta o customer de acordo com a id
			customerService.deleteCustomer(customerId);
			
			return "Delete customer id - " + customerId;
		}

}
