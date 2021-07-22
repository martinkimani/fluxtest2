/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import io.r2dbc.spi.Row;
import io.r2dbc.spi.RowMetadata;
import java.util.function.BiFunction;

/**
 *
 * @author martin
 */
public class QueryMappers {
    
    
    public static final BiFunction<Row, RowMetadata, LimitAmounts> LIMITS_MAPPER = (row, rowMetaData) -> LimitAmounts.builder()
            .id(Integer.valueOf(row.get("id", Object.class).toString())).name(row.get("name", String.class))
            .limit(Integer.valueOf(row.get("limit", Object.class).toString())).type(row.get("type", String.class)).build();
    
}
