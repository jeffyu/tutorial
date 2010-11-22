package net.familyyu.jeff.jbcache;

import org.jboss.cache.Fqn;

public class JBossCache<K, V> implements Cache<K, V> {
	
	private final org.jboss.cache.Cache<K, V> cache;
	
	private final Fqn<String> fqn;
	
	public JBossCache(org.jboss.cache.Cache<K, V> cache, Fqn<String> fqn) {
		this.cache = cache;
		this.fqn = fqn;
		
	}
	
	public V get(K key) {
		return this.cache.get(fqn, key);
	}

	public V put(K key, V value) {
		return cache.put(fqn, key, value);
	}

	public V remove(K key) {
		return cache.remove(fqn, key);
	}

	public boolean containsKey(K key) {
		return cache.getData(fqn).containsKey(key);
	}
	
	
}
