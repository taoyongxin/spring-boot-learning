package com.soft1851.verify.validator;

import com.soft1851.verify.annotation.Region;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;

/**
 * @author Tao
 * @version 1.0
 * @ClassName RegionValidator
 * @Description TODO
 * @date 2020-04-30 17:31
 **/
public class RegionValidator implements ConstraintValidator<Region,String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        HashSet<Object> regions = new HashSet<>();
        regions.add("China");
        regions.add("China-Taiwan");
        regions.add("China-HongKong");
        return regions.contains(s);
    }
}
