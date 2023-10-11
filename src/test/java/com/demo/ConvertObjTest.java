package com.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.ApiApplication;
import com.api.res.Table11Rs;
import com.api.util.XmlUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest(classes = {ApiApplication.class})
@Slf4j
public class ConvertObjTest {

    @Test
    public void fileConvertString() throws IOException {
        String filePath = "./src/main/resources/xml-sample1.txt";
        String fileContent = Files.lines(Paths.get(filePath)).collect(Collectors.joining());
        log.debug("log res: {}", fileContent);
    }

    
    @Test
    public void xmlConvertObj() throws IOException {
        TypeReference<Table11Rs> typeReference = new TypeReference<Table11Rs>() {};
        String filePath = "./src/main/resources/xml-sample1.txt";
        String fileContent = Files.lines(Paths.get(filePath)).collect(Collectors.joining());
        Table11Rs rs = XmlUtil.xmlStringToObject(fileContent, typeReference);
        log.debug("log res getAccount: {}", rs.toString());
    }

}
