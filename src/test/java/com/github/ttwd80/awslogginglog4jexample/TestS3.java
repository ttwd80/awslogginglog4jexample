package com.github.ttwd80.awslogginglog4jexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.AmazonS3Exception;

public class TestS3 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		AWSCredentials awsCredentials = new BasicAWSCredentials("fakeAccessKey", "fakeSecretKey");
		AmazonS3Client s3Client = new AmazonS3Client(awsCredentials);
		try {
			s3Client.listBuckets();
			fail("should have thrown an exception");
		} catch (AmazonS3Exception e) {
		}
	}
}
