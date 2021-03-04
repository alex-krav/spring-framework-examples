package org.example.core.validation.bean_validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

@Service
public class SpringService {

    @Autowired
    private Validator validator;
}