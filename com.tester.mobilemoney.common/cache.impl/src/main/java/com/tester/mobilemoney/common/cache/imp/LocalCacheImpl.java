package com.tester.mobilemoney.common.cache.imp;

import com.tester.mobilemoney.common.cache.api.Cache;
import com.tester.mobilemoney.common.cache.pojo.Country;
import com.tester.mobilemoney.common.cache.pojo.Gender;

import java.util.List;

public class LocalCacheImpl implements Cache {
    public List<Gender> getGender() {
        return List.of(Gender.values());
    }

    public List<Country> getCountries() {
        return null;
    }
}
