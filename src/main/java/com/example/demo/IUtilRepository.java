package com.example.demo;

import reactor.core.publisher.Flux;

/**
 *
 * @author martin
 */
public interface IUtilRepository {

    public Flux<LimitAmounts> fetchAmounts();
}
