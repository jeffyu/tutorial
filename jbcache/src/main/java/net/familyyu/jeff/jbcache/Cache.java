package net.familyyu.jeff.jbcache;

public interface Cache<K, V> {
	
	public V put(K key, V value);
	
	public V get(K key);
	
	public V remove(K key);
	
	public boolean containsKey(K key);
}
