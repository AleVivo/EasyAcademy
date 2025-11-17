package com.easyacademy.easyacademy_backend.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "training-client", url = "${clients.training.url}")
public interface TrainingClient {
}
