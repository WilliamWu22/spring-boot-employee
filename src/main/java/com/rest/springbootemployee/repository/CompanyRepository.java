package com.rest.springbootemployee.repository;

import com.rest.springbootemployee.domain.Company;
import com.rest.springbootemployee.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CompanyRepository {

    private List<Company> companies = new ArrayList<>();

    public CompanyRepository() {
        companies.add(new Company(1, "huawei"));
        companies.add(new Company(2, "google"));
        companies.add(new Company(3, "apple"));

    }

    public List<Company> findAll() {
        return companies;
    }
}
