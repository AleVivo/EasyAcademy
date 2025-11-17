package com.easyacademy.easyacademy_backend.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "notification-client", url = "${clients.notification.url}")
public interface NotificationClient {
}
