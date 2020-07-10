package com.JPASPRING.ejemploJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.JPASPRING.ejemploJPA.accessingdatajpa.DDR;
import com.JPASPRING.ejemploJPA.accessingdatajpa.DDRRepository;

@SpringBootApplication
public class AccessingDataJpaApplication {

  private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(AccessingDataJpaApplication.class);
  }

  @Bean
  public CommandLineRunner demo(DDRRepository repository) {
    return (args) -> {
    	// inserta datos
    	//repository.save(new DDR((long) 1800, "10", "Moneda falsa", 2020, 1));
      
    	// Elimina datos por ID
        //repository.deleteById((long)1800);
      
      // fetch all customers
      log.info("Las monedas encontradas con findAll():");
      log.info("-------------------------------");
      for (DDR d : repository.findAll()) {
        log.info(d.toString());
      }
      log.info("");

      // fetch an individual customer by ID
      DDR d = repository.findByCodigo((long)1540);
      log.info("La moneda encontrada con findById((long)1540):");
      log.info("--------------------------------");
      log.info(d.toString());
      log.info("");

      // fetch customers by last name
      log.info("Customer found with findByDenominacion('5'):");
      log.info("--------------------------------------------");
      repository.findByDenominacion("5").forEach(bauer -> {
        log.info(bauer.toString());
      });
      // for (Customer bauer : repository.findByDenominacion("5")) {
      //  log.info(bauer.toString());
      // }
      log.info("");
    };
  }

}