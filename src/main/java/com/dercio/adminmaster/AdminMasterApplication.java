package com.dercio.adminmaster;

import com.dercio.adminmaster.enumeration.Status;
import com.dercio.adminmaster.model.Server;
import com.dercio.adminmaster.repo.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdminMasterApplication {

	public static void main(String[] args) {

		SpringApplication.run(AdminMasterApplication.class, args);
	}
	@Bean
	CommandLineRunner run(ServerRepository serverRepository){
		return args -> {
			serverRepository.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB", "Personal PC", "http://localhost:8080/server/image/server1.PNG", Status.SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.58", "Fedora Linux", "16 GB", "Dell Tower", "http://localhost:8080/server/image/server2.PNG", Status.SERVER_DOWN));
			serverRepository.save(new Server(null, "192.168.1.21", "MS 2008", "32 GB", "Web Server", "http://localhost:8080/server/image/server3.PNG", Status.SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.14", "Red Hat Enterprise Linux", "64 GB", "Mail Server", "http://localhost:8080/server/image/server4.PNG", Status.SERVER_DOWN));

		};
	}
}
