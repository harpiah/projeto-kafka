package com.harpiah.strproducer;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;

@RequiredArgsConstructor
@Configuration

public class KafkaAdminConfig {
	
	public final KafkaProperties properties;	
	
    @Bean
	public KafkaAdmin kafkaAdmin() {
			var configs = new HashMap<String,Object>();
			configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG,properties.getBootstrapServers());
			return new KafkaAdmin(configs);
	}
}
