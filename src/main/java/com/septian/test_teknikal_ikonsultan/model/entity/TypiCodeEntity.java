package com.septian.test_teknikal_ikonsultan.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TypiCodeEntity {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}
