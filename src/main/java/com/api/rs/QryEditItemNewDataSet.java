package com.api.rs;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QryEditItemNewDataSet {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "EditItem")
    List<EditItem> editItemList;

}
