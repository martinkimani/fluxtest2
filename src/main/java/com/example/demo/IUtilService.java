package com.example.demo;

import reactor.core.publisher.Flux;

/**
 *
 * @author martin
 */
public interface IUtilService {

    public Flux<LimitAmounts> fetchAmounts();
}
