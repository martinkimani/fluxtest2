package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.r2dbc.core.DatabaseClient;
import reactor.core.publisher.Flux;

/**
 *
 * @author martin
 */
@Repository
public class UtilRepositoryImpl implements IUtilRepository {
    
    @Autowired
    private DatabaseClient databaseClient;

    @Override
    public Flux<LimitAmounts> fetchAmounts() {
        return databaseClient.sql("select * from myschema.bet_limits").map(QueryMappers.LIMITS_MAPPER).all();
    }

    

}
