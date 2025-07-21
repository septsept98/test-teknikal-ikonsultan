package com.septian.test_teknikal_ikonsultan.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GetTypiCodePaginationResponse {
    private List<TypiCodeResponse> content;
    private int page;
    private int size;
    private int totalPages;
    private int tolatItems;
}
