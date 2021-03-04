package org.example.core.validation.bean_validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Validator;

@Service
public class JavaxService {

    @Autowired
    private Validator validator;
}
