package net.familyyu.jeff.jbcache;

import org.jboss.cache.CacheFactory;
import org.jboss.cache.DefaultCacheFactory;
import org.jboss.cache.Fqn;

public class JBossCacheProvider implements CacheProvider{
	
	public static final String RIFTSAW_NODE_PREFIX = "jboss/riftsaw/";
	
	private static int counter = 1;
	
	public <K, V> Cache<K, V> createCache() {
		CacheFactory<K, V> factory = new DefaultCacheFactory<K, V>();
		org.jboss.cache.Cache<K, V> theCache = factory.createCache();
		String fqnString = RIFTSAW_NODE_PREFIX + String.valueOf(counter);
		counter ++;
		Fqn<String> theFqn = Fqn.fromString(fqnString);		
		return new JBossCache<K, V>(theCache, theFqn);
	}
	
}

