package com.easyacademy.easyacademy_backend.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "organization-client", url = "${clients.organization.url}")
public interface OrganizationClient {
}
