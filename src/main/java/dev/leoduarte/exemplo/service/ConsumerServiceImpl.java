package dev.leoduarte.exemplo.service;

import org.springframework.stereotype.Service;

import dev.leoduarte.exemplo.dto.Message;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public void action(Message message) throws Exception {
		System.err.println(message.getText());
	}

}
