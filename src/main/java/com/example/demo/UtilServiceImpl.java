package com.example.demo;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 *
 * @author martin
 */
@Service
public class UtilServiceImpl implements IUtilService {

    private final IUtilRepository utilRepository;

    public UtilServiceImpl(IUtilRepository utilRepository) {
        this.utilRepository = utilRepository;
    }

    @Override
    public Flux<LimitAmounts> fetchAmounts() {
        return utilRepository.fetchAmounts();
    }

}
