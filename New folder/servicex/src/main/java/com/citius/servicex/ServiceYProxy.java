package com.citius.servicex;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servicey")
public interface ServiceYProxy {

	@GetMapping("/message")
	public String getMessage();
}
