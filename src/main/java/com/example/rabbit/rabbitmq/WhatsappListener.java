package com.example.rabbit.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class WhatsappListener {
    @RabbitListener(queues = {"whatsapp"})
    public void atenderCliente(String mensaje){
        System.out.println("Al correo te llego el siguiente mensaje: "+mensaje);
    }
}
