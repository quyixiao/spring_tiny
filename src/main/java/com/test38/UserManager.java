package com.test38;

import java.util.Date;

public class UserManager {
    private Date dataValue;

    public Date getDateValue() {
        return dataValue;
    }

    public void setDataValue(Date dataValue) {
        this.dataValue = dataValue;
    }

    public String toString() {
        return "dataValue" + dataValue;
    }
}



