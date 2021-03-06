package com.soft1851.verify.entity;

import com.soft1851.verify.annotation.PhoneNumber;
import com.soft1851.verify.annotation.Region;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Person
 * @Description TODO
 * @date 2020-04-30 15:15
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NotNull(message = "Id不能为空")
    private  String id;

//    @Size(max = 30)
    @NotNull(message = "姓名不能为空")
    private  String name;

    @Min(18)
    private  Integer age;

//    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号格式错误")
//    @NotBlank(message = "手机号不能为空")
    @PhoneNumber
    private  String phone;

    @NotNull(message = "邮箱不能为空")
    @Email(message = "邮箱格式错误")
    private  String email;

    @Pattern(regexp = "((^Man$|^Woman$|^UGM$))",message = "性别值不在可选择范围内")
    @NotNull(message = "性别不能为空")
    private  String sex;

    @Region
    private String region;
}
