package com.chins.chinsmall.search;

import static com.chins.chinsmall.search.config.ElasticSearchConfig.COMMON_OPTIONS;

import java.io.IOException;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChinsmallSearchApplicationTests {

	@Autowired
	private RestHighLevelClient client;

	@Test
	void contextLoads() throws IOException {
		IndexRequest request = new IndexRequest("users");
		request.id("001");
		request.source("username", "zhangsan",
				"age", 18);
		System.out.println(client.index(request, COMMON_OPTIONS));
	}

}
