package net.familyyu.jeff.jbcache;


public interface CacheProvider{
	
	public <K, V> Cache<K, V> createCache();
	
}
