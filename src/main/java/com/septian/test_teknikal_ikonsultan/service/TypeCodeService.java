package com.septian.test_teknikal_ikonsultan.service;

import com.septian.test_teknikal_ikonsultan.model.response.TypiCodeResponse;
import com.septian.test_teknikal_ikonsultan.repository.TypiCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeCodeService implements ITypiCodeService{
    private final TypiCodeRepository typiCodeRepository;

    @Autowired
    public TypeCodeService(TypiCodeRepository typiCodeRepository) {
        this.typiCodeRepository = typiCodeRepository;
    }

    @Override
    public List<TypiCodeResponse> getAllData() {
        return typiCodeRepository.getTypiCodeList()
                .stream()
                .map(data -> {
                    TypiCodeResponse res = new TypiCodeResponse();
                    res.setId(data.getId());
                    res.setTitle(data.getTitle());
                    return res;
                })
                .toList();
    }
}
