package com.septian.test_teknikal_ikonsultan.controller;

import com.septian.test_teknikal_ikonsultan.model.response.GetTypiCodePaginationResponse;
import com.septian.test_teknikal_ikonsultan.service.TypeCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TypiCodeController {
    private final TypeCodeService typiCodeService;

    @Autowired
    public TypiCodeController(TypeCodeService typiCodeService) {
        this.typiCodeService = typiCodeService;
    }

    @GetMapping("/typi-code")
    public ResponseEntity<GetTypiCodePaginationResponse> getAllData(@RequestParam("page") int page,
                                                                    @RequestParam("size") int size){
        return ResponseEntity.ok(typiCodeService.getAllData(page, size));
    }
}