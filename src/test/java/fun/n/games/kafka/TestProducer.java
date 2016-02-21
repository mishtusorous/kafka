package fun.n.games.kafka;

import static org.junit.Assert.fail;

import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestProducer {
	private final static Logger logger = LoggerFactory
			.getLogger("fun.n.games.kafka.TestProducer");

	@Test
	public void test() {
		logger.debug("Let's create and send some messages on kafka topic.");

		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:4242");
		props.put("acks", "all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer",
				"org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer",
				"org.apache.kafka.common.serialization.StringSerializer");

		fail("Not yet implemented");
	}

}
