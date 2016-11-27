package com.csmarton.service;

import com.csmarton.model.EmailRequest;

import java.util.Map;

public interface RegistrationService
{
	Map register(EmailRequest emailRequest);
}
