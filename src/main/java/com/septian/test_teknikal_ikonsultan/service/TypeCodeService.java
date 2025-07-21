package com.septian.test_teknikal_ikonsultan.service;

import com.septian.test_teknikal_ikonsultan.model.exception.ErrorException;
import com.septian.test_teknikal_ikonsultan.model.response.GetTypiCodePaginationResponse;
import com.septian.test_teknikal_ikonsultan.model.response.TypiCodeResponse;
import com.septian.test_teknikal_ikonsultan.feignclient.TypiCodeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeCodeService implements ITypiCodeService{
    private final TypiCodeFeignClient typiCodeFeignClient;

    @Autowired
    public TypeCodeService(TypiCodeFeignClient typiCodeFeignClient) {
        this.typiCodeFeignClient = typiCodeFeignClient;
    }

    @Override
    public GetTypiCodePaginationResponse getAllData(int page, int size) {
         List<TypiCodeResponse> typiCodeList = typiCodeFeignClient.getTypiCodeList()
                .stream()
                .map(data -> {
                    TypiCodeResponse res = new TypiCodeResponse();
                    res.setId(data.getId());
                    res.setTitle(data.getTitle());
                    return res;
                })
                .toList();

         int totalItems = typiCodeList.size();
         int fromIndex = page * size;
         int toIndex = Math.min(fromIndex + size, totalItems);
         int totalPages = totalItems /size ;

         List<TypiCodeResponse> typiCodePage;
         if (fromIndex<toIndex)
            typiCodePage = typiCodeList.subList(fromIndex, toIndex);
         else
             throw new ErrorException("Page terlalu besar", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST);

         return new GetTypiCodePaginationResponse(typiCodePage,page,size, totalPages,totalItems);
    }
}
