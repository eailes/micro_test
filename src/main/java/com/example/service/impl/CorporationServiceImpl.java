package com.example.service.impl;

import com.example.esi.ApiClient;
import com.example.esi.api.CorporationApi;
import com.example.esi.model.CorporationResponse;
import com.example.service.CorporationService;
import com.example.service.EveDatasource;
import org.springframework.stereotype.Component;

/**
 * User: eailes
 * Created: 2/15/17
 * Time: 4:18 PM
 * Project: micro_test
 */
@Component
public class CorporationServiceImpl implements CorporationService {
    @Override
    public CorporationResponse getPublicCorpInfo(Integer id) throws Exception {
        return new CorporationApi().getCorporationsCorporationId(id, EveDatasource.TRANQUILITY.toString());
    }
}
