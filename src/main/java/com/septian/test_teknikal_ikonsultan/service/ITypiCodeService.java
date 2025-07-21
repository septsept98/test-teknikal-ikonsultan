package com.septian.test_teknikal_ikonsultan.service;

import com.septian.test_teknikal_ikonsultan.model.response.GetTypiCodePaginationResponse;

public interface ITypiCodeService {
    GetTypiCodePaginationResponse getAllData(int page, int size);
}
