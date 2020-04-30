package com.soft1851.verify.service;

import com.soft1851.verify.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author Tao
 * @version 1.0
 * @ClassName PersonService
 * @Description TODO
 * @date 2020-04-30 17:18
 **/
@Service
@Validated
@Slf4j
public class PersonService {
    public void validatePerson(@Valid Person person){
        log.info("service方法验证");
    }
}
