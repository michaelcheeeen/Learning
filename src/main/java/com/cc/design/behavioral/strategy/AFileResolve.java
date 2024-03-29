package com.cc.design.behavioral.strategy;

import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AFileResolve implements IFileStrategy {
    private  final Logger logger = LoggerFactory.getLogger(AFileResolve.class);
    @Override
    public FileTypeResolveEnum gainFileType() {
        return FileTypeResolveEnum.File_A_RESOLVE;
    }

    @Override
    public void resolve(Object objectparam) {
        logger.info("A 类型解析文件，参数：{}",objectparam);
        //A类型解析具体逻辑
    }
}