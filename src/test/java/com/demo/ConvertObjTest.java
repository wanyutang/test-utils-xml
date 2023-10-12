package com.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.api.rs.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.ApiApplication;
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
    public void xmlConvertObjTable1() throws IOException {
        String filePath = "./src/main/resources/xml-sample-Table1.txt";
        String fileContent = Files.lines(Paths.get(filePath)).collect(Collectors.joining());
        Table11 rs = XmlUtil.xmlToObject(fileContent, Table11.class);
        log.debug("log res getAccount: {}", rs.toString());
    }

    @Test
    public void QryEditItemNewDataSet() throws IOException {
        String filePath = "./src/main/resources/xml-sample2.txt";
        String fileContent = Files.lines(Paths.get(filePath)).collect(Collectors.joining());
        Diffgr<?> diffgr = XmlUtil.xmlToObject(fileContent, Diffgr.class);
        log.debug("log res : {}", diffgr.getNewDataSet());
    }


    @Test
    public void QryEditItemNewDataSet2XML() throws IOException {
        Diffgr<QryEditItemNewDataSet> fakeData = new Diffgr<>();
        fakeData.setNewDataSet(new QryEditItemNewDataSet() {{
            setEditItemList(IntStream.range(0, 5).mapToObj(i -> new EditItem() {{
                setPid("B12345678" + i);
                setAccountPB("777200028951");
                setAccountCK("777970012511");
                setApplyDate("0109/03/1" + (i + 1));
                setStatusAft("06");
                setResCode("12");
                setResCodeTwo("00");
                setDescription("Sample Description " + i);
                setAddImgA1("Y");
                setAddImgA2("Y");
                setAddImgB1("Y");
                setAddImgB2("Y");
                setName("Sample Name " + i);
                setResidentAddress("Sample Resident Address " + i);
                setCommAddress("Sample Comm Address " + i);
                setCommPhone("Sample Comm Phone " + i);
                setBirthCity("Sample Birth City " + i);
                setWorkCompany("Sample Work Company " + i);
                setOccupation("Sample Occupation " + i);
            }}).collect(Collectors.toList()));
        }});
        log.debug("log res : {}", XmlUtil.objectToXml(fakeData));
    }

}
