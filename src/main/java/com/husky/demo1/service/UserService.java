package com.husky.demo1.service;

import com.husky.demo1.domain.User;
import com.infinitus.husky.service.BaseService;
import org.springframework.data.repository.CrudRepository;

public interface UserService extends CrudRepository<User,Integer>,BaseService {

}
