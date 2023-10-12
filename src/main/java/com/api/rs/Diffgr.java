package com.api.rs;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JacksonXmlRootElement(localName = "diffgram")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diffgr<T> {

    @JacksonXmlProperty(localName = "NewDataSet")
    T newDataSet;

}
