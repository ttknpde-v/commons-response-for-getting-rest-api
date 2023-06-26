package com.ttknpdev.commonsresponsettknpdev.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class CommonsResponseObject <T> {
    private Short status;
    private String code;
    private T info;
}
