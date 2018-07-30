package com.husky.demo1.service;

import com.husky.demo1.domain.Function;
import com.infinitus.husky.service.BaseService;
import org.springframework.data.repository.CrudRepository;

public interface FunctionService extends CrudRepository<Function,Integer>,BaseService {

}
