package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {




@KafkaListener(topics = ConsumerAppConstants.LOCATION_UPDATE_TOPIC,groupId = ConsumerAppConstants.GROUP_ID)
public void updatedLocation(String value){


    System.out.printf(value);
}


}
