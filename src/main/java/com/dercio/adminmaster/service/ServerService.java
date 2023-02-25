package com.dercio.adminmaster.service;

import com.dercio.adminmaster.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);//TODO To apply pagination
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
