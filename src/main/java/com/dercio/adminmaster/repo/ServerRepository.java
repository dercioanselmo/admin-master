package com.dercio.adminmaster.repo;

import com.dercio.adminmaster.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
    //Server findByName(String name); I canbt use this cose name is not unique
}
