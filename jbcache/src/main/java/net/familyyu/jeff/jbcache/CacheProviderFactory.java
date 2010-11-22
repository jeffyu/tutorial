/**
 * 
 */
package net.familyyu.jeff.jbcache;

import java.util.HashSet;
import java.util.*;

/**
 * 
 * @author jeffyu
 */
public class CacheProviderFactory{

	public static CacheProvider getCacheProvider() {
		Class<?> clz;
		CacheProvider cp = null;
		try {
			clz = Thread.currentThread().getContextClassLoader().loadClass("net.familyyu.jeff.jbcache.JBossCacheProvider");
			cp = (CacheProvider)clz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cp;
	}
	
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}
	
	public static <K, V> Map<K, V> newMap() {
		return new HashMap<K, V>();
	}
	
}
