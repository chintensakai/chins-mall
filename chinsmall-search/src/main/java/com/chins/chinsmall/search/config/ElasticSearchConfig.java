package com.chins.chinsmall.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticSearchConfig {

  public static final RequestOptions COMMON_OPTIONS;

  static {
    COMMON_OPTIONS = RequestOptions.DEFAULT.toBuilder().build();
  }

  @Bean
  public RestHighLevelClient ESRestClient() {
    return new RestHighLevelClient(RestClient.builder(new HttpHost("127.0.0.1", 9200, "http")));
  }

}
