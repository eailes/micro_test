package com.example.service;

import com.example.esi.model.SearchResponse;
import org.jvnet.hk2.annotations.Service;

/**
 * User: eailes
 * Created: 2/15/17
 * Time: 3:47 PM
 * Project: micro_test
 */
@Service
public interface SearchService {
    SearchResponse searchOnString(String search, String[] categories, boolean strict) throws Exception;
}
