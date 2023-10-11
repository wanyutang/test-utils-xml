package com.api.res;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Table11Rs {
    
    @XmlElement
    private String Account;
    
    @XmlElement
    private String ApplyDate;
    
    @XmlElement
    private String AuditStatus;
    
    @XmlElement
    private String Note;
    
}
