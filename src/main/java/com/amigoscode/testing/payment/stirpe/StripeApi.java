package com.amigoscode.testing.payment.stirpe;

import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.net.RequestOptions;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StripeApi {

    public Charge create(Map<String, Object> requestMap, RequestOptions options) throws StripeException {
        return Charge.create(requestMap, options);
    }

}
