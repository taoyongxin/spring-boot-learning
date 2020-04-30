package com.soft1851.verify.service;

import com.soft1851.verify.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.Resource;
import javax.validation.*;
import java.util.Set;

@SpringBootTest
class PersonServiceTest {
    @Resource
    private PersonService personService;

    @Test
    @ExceptionHandler(ConstraintViolationException.class)
    void validatePerson() {
//        Person person = new Person();
//        person.setId("123");
//        person.setName("Soft1851");
//        person.setAge(11);
//        person.setPhone("1380001111");
//        person.setEmail("Soft1851@qq.com");
//        person.setSex("男");
//        personService.validatePerson(person);
        Person person = new Person();
        person.setId("123");
        person.setName("Soft1851");
        person.setAge(20);
        person.setPhone("17826012341");
        person.setEmail("Soft1851@qq.com");
        person.setSex("Man");
        person.setRegion("China");
        personService.validatePerson(person);
    }

    @Test
    void checkManually() {
        //通过 Validator 工厂类获得的Validator实例，也可以通过注入的方式
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Person person = new Person();
        person.setId("123");
        person.setSex("Man22");
        person.setEmail("abc");
        //对参数进行校验，得到一组结果
        Set<ConstraintViolation<Person>> violations = validator.validate(person);
        for(ConstraintViolation<Person> constraintViolation : violations){
            System.out.println(constraintViolation.getMessage());
        }
    }
}