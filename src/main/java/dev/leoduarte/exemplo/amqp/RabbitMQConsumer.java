package dev.leoduarte.exemplo.amqp;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.leoduarte.exemplo.dto.Message;
import dev.leoduarte.exemplo.service.ConsumerService;

@Component
public class RabbitMQConsumer implements AmqpConsumer<Message> {

	@Autowired
	private ConsumerService service;

	@Override
	@RabbitListener(queues = "${spring.rabbitmq.routing-key.producer}")
	public void consumer(Message t) {
		try {
			service.action(t);
		} catch (Exception e) {
			throw new AmqpRejectAndDontRequeueException(e);
		}
	}

}
