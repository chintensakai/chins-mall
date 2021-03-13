package com.chins.chinsmall.search;

import static com.chins.chinsmall.search.config.ElasticSearchConfig.COMMON_OPTIONS;

import java.io.IOException;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.builder.SearchSourceBuilder;
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

	@Test
	void searchDate() throws IOException {
//		1. 创建检索请求
		SearchRequest request = new SearchRequest();
		request.indices("kibana_sample_data_ecommerce");
		SearchSourceBuilder builder = new SearchSourceBuilder();
		request.source(builder);
//	  设置检索条件
		builder.query(QueryBuilders.matchQuery("customer_gender", "MALE"));
//		builder.from(0);
//		builder.size(20);

//		按照customer_id聚合
		builder.aggregation(AggregationBuilders.terms("customerAgg").field("customer_id").size(10));

//
		builder.aggregation(AggregationBuilders.avg("priceAgg").field("taxful_total_price"));

//		2. 执行检索
		SearchResponse response = client.search(request, COMMON_OPTIONS);

//		3. 处理响应
		System.out.println(request.source());
		SearchHit[] hits = response.getHits().getHits();
		for (SearchHit hit : hits) {
			String sourceAsString = hit.getSourceAsString();
			System.out.println(sourceAsString);
		}
//		获取聚合结果
		Terms customerAgg = response.getAggregations().get("customerAgg");
		customerAgg.getBuckets().forEach(bucket -> System.out.println(bucket.getKey()));
	}

}
