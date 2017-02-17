package com.example.service.impl;

import com.example.esi.ApiClient;
import com.example.esi.api.SearchApi;
import com.example.esi.model.SearchResponse;
import com.example.service.EveDatasource;
import com.example.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * User: eailes
 * Created: 2/15/17
 * Time: 3:54 PM
 * Project: micro_test
 */
@Component
public class SearchServiceImpl implements SearchService {
    private static final Logger log = LoggerFactory.getLogger(SearchServiceImpl.class);

    @Override
    public SearchResponse searchOnString(String search, String[] categories, boolean strict) throws Exception {
        return new SearchApi().getSearch(search, Arrays.asList(categories),"en-us", strict, EveDatasource.TRANQUILITY.toString());
    }
}
