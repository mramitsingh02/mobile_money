package com.tester.mobilemoney.common.cache.api;


import com.tester.mobilemoney.common.cache.pojo.Country;
import com.tester.mobilemoney.common.cache.pojo.Gender;

import java.util.List;

public interface Cache {

    public List<Gender> getGender();

    public List<Country> getCountries();
}
