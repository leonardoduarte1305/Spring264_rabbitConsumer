package dev.leoduarte.exemplo.service;

import dev.leoduarte.exemplo.dto.Message;

public interface ConsumerService {

	void action(Message message) throws Exception;
}
