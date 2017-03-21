package com.hsbc.vs.config;

/*import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.context.annotation.ConditionalOnMissingAmazonClient;
import org.springframework.cloud.aws.messaging.config.QueueMessageHandlerFactory;
import org.springframework.cloud.aws.messaging.config.SimpleMessageListenerContainerFactory;
import org.springframework.cloud.aws.messaging.listener.QueueMessageHandler;
import org.springframework.cloud.aws.messaging.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClient;
import com.amazonaws.services.sqs.buffered.AmazonSQSBufferedAsyncClient;*/

//@Configuration
//@ComponentScan("com.hsbc.vs")
public class AWSConfiguration {
/*
	@Value("${cloud.aws.credentials.accessKey}")
	private String accessKey;

	@Value("${cloud.aws.credentials.secretKey}")
	private String secretKey;

	@Value("${cloud.aws.region}")
	private String region;

	@Bean
	public BasicAWSCredentials basicAWSCredentials() {
		return new BasicAWSCredentials(accessKey, secretKey);
	}
 
    @Bean
    public SimpleMessageListenerContainer simpleMessageListenerContainer() {
        SimpleMessageListenerContainer messageListenerContainer = simpleMessageListenerContainerFactory().createSimpleMessageListenerContainer();
        messageListenerContainer.setMessageHandler(queueMessageHandler());
        return messageListenerContainer;
    }
 
    @Bean
    public SimpleMessageListenerContainerFactory simpleMessageListenerContainerFactory(){
        SimpleMessageListenerContainerFactory messageListenerContainerFactory = new SimpleMessageListenerContainerFactory();
        messageListenerContainerFactory.setAmazonSqs(amazonSQS());
        //messageListenerContainerFactory.setDeleteMessageOnException(false);
        return messageListenerContainerFactory;
    }
 
    @Bean
    public QueueMessageHandler queueMessageHandler() {
        QueueMessageHandlerFactory queueMessageHandlerFactory = new QueueMessageHandlerFactory();
        queueMessageHandlerFactory.setAmazonSqs(amazonSQS());
        QueueMessageHandler messageHandler = queueMessageHandlerFactory.createQueueMessageHandler();
 
        List<HandlerMethodArgumentResolver> list = new ArrayList<>();
        HandlerMethodArgumentResolver resolver = new PayloadArgumentResolver(this.messageConverter);
        list.add(resolver);
        messageHandler.setArgumentResolvers(list);
        return messageHandler;
    }
 
 
    @Lazy
    @Bean(destroyMethod = "shutdown")
    @ConditionalOnMissingAmazonClient(AmazonSQS.class)
    public AmazonSQSAsync amazonSQS() {
    	BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials(accessKey, secretKey);
        AmazonSQSAsyncClient amazonSQSAsyncClient  = new AmazonSQSAsyncClient(basicAWSCredentials);
        amazonSQSAsyncClient.setEndpoint("sqs.us-west-2.amazonaws.com");
    //    amazonSQSAsyncClient.setRegion(Region.getRegion(Regions.fromName(region)));
        return new AmazonSQSBufferedAsyncClient(amazonSQSAsyncClient);
    }*/

}
