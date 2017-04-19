import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;

public class CouchBaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Connect to localhost
		Cluster cluster = CouchbaseCluster.create();
		// Open the default bucket and the "beer-sample" one
		Bucket defaultBucket = cluster.openBucket();
		// Disconnect and clear all allocated resources

		/*JsonObject productJson = JsonObject.empty().put("name", "An ice sculpture").put("price", 12.50)
				.put("length", 7.0).put("width", 12.0).put("height", 9.5)
				.put("description", "This product is not for sale");

		JsonDocument productJsonToBeStored = JsonDocument.create("productKey", productJson);
		JsonDocument productRecievedFromDB = defaultBucket.upsert(productJsonToBeStored);*/
		
		

		cluster.disconnect();
	}

}
