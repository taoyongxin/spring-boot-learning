package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.common.Result;
import com.soft1851.springboot.aop.util.AliOssUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Tao
 * @version 1.0
 * @ClassName UploadController
 * @Description 文件上传接口
 * @date 2020-04-14 20:48
 **/
@Api(value = "UploadController" ,tags = {"图片上传接口"})
@RestController
@RequestMapping(value = "/api/upload")
@Slf4j
public class UploadController {
    @ApiOperation(value = "单文件上传", notes = "注意请求头的Content-Type修改form/data")
    @PostMapping("/single")
    public Result uploadSingle(@RequestParam("file") MultipartFile sourceFile) {
        String url = AliOssUtil.upload(sourceFile);
        return Result.success(url);
    }
}
