package com.easyacademy.easyacademy_backend.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "identity-client", url = "${clients.identity.url}")
public interface IdentityClient {
}
