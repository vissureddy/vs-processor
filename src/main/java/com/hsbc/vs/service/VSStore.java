package com.hsbc.vs.service;

import java.util.Collection;
import java.util.Map;

public interface VSStore<K, V> {

	// Method to add key-value
	public void add(K Key, V value);

	// Method to add multiple key-value
	public void addMultiple(Map<K, V> keyValues);

	// Method to delete specific key from store
	public void delete(K key);

	//Method to get value for a key
	public String get(K key);

	//Method to get range of values for a key
	public Collection<V> getRangeList(K key, long start, long end);

}
