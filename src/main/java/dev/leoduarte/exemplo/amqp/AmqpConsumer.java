package dev.leoduarte.exemplo.amqp;

public interface AmqpConsumer<T> {

	void consumer(T t);

}
