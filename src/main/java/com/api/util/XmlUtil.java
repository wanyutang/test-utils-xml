package com.api.util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XmlUtil {
    private static final XmlMapper xmlMapper = new XmlMapper();

    static {
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        xmlMapper.setSerializationInclusion(Include.NON_NULL);
    }

    public static String objectToXml(Object objetc) {
        try {
            return xmlMapper.writeValueAsString(objetc);
        } catch (JsonProcessingException e) {
            log.error("JsonProcessingException JsonUtil#objectToXml fail .", e);
            throw new RuntimeException("MessageConst.RtnCode.M9999");
        }
    }

    public static <T> T jsonToObject(String xmlString, Class<T> valueType) {
        try{
            return xmlMapper.readValue(xmlString, valueType);
        } catch (JsonProcessingException e) {
            log.error("JsonProcessingException JsonUtil#jsonToObject fail jsonInString:{}.", xmlString);
            log.error("JsonProcessingException JsonUtil#jsonToObject fail .", e);
            throw new RuntimeException("MessageConst.RtnCode.M9999");
        }
    }

    public static <T> T xmlStringToObject(String xmlString, TypeReference<T> typeReference) {
        try{
            return xmlMapper.readValue(xmlString, typeReference);
        } catch (JsonProcessingException e) {
            log.error("JsonProcessingException JsonUtil#jsonToObject fail jsonInString:{}.", xmlString);
            log.error("JsonProcessingException JsonUtil#jsonToObject fail .", e);
            throw new RuntimeException("MessageConst.RtnCode.M9999");
        }
    }

}