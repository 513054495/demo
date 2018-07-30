package com.husky.demo1.service;

import com.husky.demo1.domain.Role;
import com.infinitus.husky.service.BaseService;
import org.springframework.data.repository.CrudRepository;

public interface RoleService extends CrudRepository<Role,Integer>,BaseService {

}
