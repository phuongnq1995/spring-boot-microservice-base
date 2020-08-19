package com.ecommerce.address.province.sql;

import java.util.StringJoiner;

import com.ecommerce.address.province.ProvinceSource;

public class ProvinceSQL {

    public static String search(ProvinceSource source) {
        StringJoiner sql = new StringJoiner(" and ");
        if(source.getCode() != null && !source.getCode().isEmpty()) {
            sql.add("p.code = "+ source.getCode());
        }
        if(source.getName() != null && !source.getName().isEmpty()) {
            sql.add("p.name = "+ source.getName());
        }
        return sql.toString();
    }
}
