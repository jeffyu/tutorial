package net.familyyu.jeff.jbcache;

public class DefaultCacheProvider implements CacheProvider{
	
	public <K, V> Cache<K, V> createCache() {
		return new HashMapCache<K, V>();
	}

}
