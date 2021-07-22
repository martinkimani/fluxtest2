package com.example.demo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author martin
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class LimitAmounts implements Serializable {

    private static long serialVersionUID = -8847723138903556843L;
    private int id;
    private String name;
    private int limit;
    private String type;

}
