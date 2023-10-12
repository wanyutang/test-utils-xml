package com.api.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class NewDataSet {

    @JsonProperty("Table1")
    List<Table11Rs> table1List;

}
