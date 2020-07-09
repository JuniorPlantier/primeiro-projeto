package com.plantier.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeiroProjetoApplication {

	//@Autowired
	//private EmpresaRepository empresaRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoApplication.class, args);
	}

	//@Bean
	//public CommandLineRunner commandLineRunner() {
		/* -- teste senha
		return args -> {
			String senhaEncoded = SenhaUtils.gerarCrypt("macho#23");
			System.out.println("Senha encoded: " + senhaEncoded);
			
			senhaEncoded = SenhaUtils.gerarCrypt("macho#23");
			System.out.println("Senha encoded novamente: " + senhaEncoded);
			
			System.out.println("Senha válida: " + SenhaUtils.senhaValida("macho#23", senhaEncoded));
		};
		*/
		
		/* -- teste h2
		return args -> {
			Empresa emp = new Empresa();
			emp.setRazaoSocial("Plantier Ltda.");
			emp.setCnpj("54458778565632");
			
			this.empresaRepository.save(emp);
			
			List<Empresa> empresas = this.empresaRepository.findAll();
			empresas.forEach(System.out::println);
			
			Optional<Empresa> empDb = this.empresaRepository.findById(1L);
			System.out.println("Empresa por Id: " + empDb.get().getId());
			
			empDb.get().setRazaoSocial("Plantier IT Web");
			this.empresaRepository.save(empDb.get());
			
			Empresa empresaCnpj = empresaRepository.findByCnpj("54458778565632");
			System.out.println("Empresa CNPJ: " + empresaCnpj);
			
			this.empresaRepository.deleteById(1L);
			empresas = this.empresaRepository.findAll();
			System.out.println("Empresas: " + empresas.size());
		};
		*/
	//}
}
