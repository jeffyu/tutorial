package net.familyyu.jeff.jbcache;

import java.util.concurrent.ConcurrentHashMap;

public class HashMapCache<K, V> implements Cache<K, V> {
	
	private ConcurrentHashMap<K, V> map = new ConcurrentHashMap<K, V>();
	
	public V get(K key) {
		return map.get(key);
	}

	public V put(K key, V value) {
		return map.put(key, value);
	}

	public V remove(K key) {
		return map.remove(key);
	}

	public boolean containsKey(K key) {
		return map.containsKey(key);
	}

}
