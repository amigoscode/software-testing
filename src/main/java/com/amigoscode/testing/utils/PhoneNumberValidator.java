package com.amigoscode.testing.utils;

import java.util.function.Predicate;
import org.springframework.stereotype.Service;

@Service
public class PhoneNumberValidator implements Predicate<String> {

    @Override
    public boolean test(String phoneNumber) {
        return phoneNumber.startsWith("+44") &&
                phoneNumber.length() == 13;
    }
}
