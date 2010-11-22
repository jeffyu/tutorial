package net.familyyu.jeff.jbcache;

import junit.framework.Assert;

import org.junit.Test;

public class CacheTest extends Assert{
	
	@Test
	public void testCache() throws Exception {
		
		Cache<String, Object> cache = CacheProviderFactory.getCacheProvider().createCache();
		cache.put("Test1", "Value1");
		assertEquals("Value1", cache.get("Test1"));
		
		boolean value = cache.containsKey("tee");
		System.out.println(value);
	}

}
