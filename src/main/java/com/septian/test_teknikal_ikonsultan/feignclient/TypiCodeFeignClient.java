package com.septian.test_teknikal_ikonsultan.feignclient;

import com.septian.test_teknikal_ikonsultan.model.entity.TypiCodeEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
@FeignClient(name = "typi-code", url = "${typi-code.url}")
public interface TypiCodeFeignClient {

    @GetMapping
    List<TypiCodeEntity> getTypiCodeList();
}
