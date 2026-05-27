package com.subscription.billing.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
                "name", "Subscription Billing API",
                "status", "running",
                "description", "Spring Boot API for SaaS billing plans, customers, subscriptions, invoices, and revenue metrics.",
                "links", Map.of(
                        "dashboard", "https://subscription-billing-dashboard.vercel.app",
                        "swagger", "https://subscription-billing-api.onrender.com/swagger-ui.html",
                        "health", "https://subscription-billing-api.onrender.com/actuator/health",
                        "repository", "https://github.com/alvarolomba/subscription-billing-api"
                ),
                "demo", Map.of(
                        "email", "demo@alvarolomba.dev",
                        "password", "DemoPassword123!"
                )
        );
    }
}
