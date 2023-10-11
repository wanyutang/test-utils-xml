package com.demo;

import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.ApiApplication;
import com.api.res.Table11Rs;

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
    public void XMLStirngConvertTable11() throws IOException, JAXBException{
        String filePath = "./src/main/resources/xml-sample1.txt";
        String xml = Files.lines(Paths.get(filePath)).collect(Collectors.joining());
        JAXBContext jaxbContext = JAXBContext.newInstance(Table11Rs.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(xml);
        Table11Rs table11Rs = (Table11Rs) unmarshaller.unmarshal(reader);
        log.debug("log res: {}", table11Rs.getAccount());
    }
    
}
