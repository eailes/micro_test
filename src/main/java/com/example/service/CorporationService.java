package com.example.service;

import com.example.esi.model.CorporationResponse;
import org.jvnet.hk2.annotations.Service;

/**
 * User: eailes
 * Created: 2/15/17
 * Time: 4:17 PM
 * Project: micro_test
 */
@Service
public interface CorporationService {
    CorporationResponse getPublicCorpInfo(Integer id) throws Exception;
}
