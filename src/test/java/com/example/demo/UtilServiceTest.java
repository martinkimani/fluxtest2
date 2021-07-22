package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

/**
 *
 * @author martin
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UtilServiceTest {

    @Autowired
    private IUtilService utilSevice;

//    @Test
//    @DisplayName("Test findLimitById Success")
//    void findLimitByIdTest() throws Exception {
//        Flux<LimitAmounts> limits = utilSevice.fetchAmounts();
//        LimitAmounts lim = new LimitAmounts(1, "bonus_min_odd", 5, "bet");
//        StepVerifier.create(limits)
//                .expectNextMatches(t -> t.equals(lim))
//                .expectComplete()
//                .verify();
//    }

    @Test
    @DisplayName("Test findAll Success")
    void findAllTest() throws Exception {
        Flux<LimitAmounts> limits = utilSevice.fetchAmounts();
        StepVerifier.create(limits)
                .expectNextCount(15)
                .expectComplete()
                .verify();
    }
}
