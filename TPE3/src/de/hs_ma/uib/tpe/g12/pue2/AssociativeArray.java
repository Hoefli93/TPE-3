package de.hs_ma.uib.tpe.g12.pue2;

import java.util.Map;

public interface AssociativeArray <K,V> {

	public void clear();

	public boolean containsValue(V value);

	public boolean containsKey(K Key);

	public boolean isEmpty();

	public void put(K key, V value);

	public void putAll(Baum<? extends K,? extends V> m);

	public V remove(K key);

	public int size();

	public void update(K key);

	public void forEach(BiConsumer<K,V>a);

	void extractAll(Baum<K, V> neu);

	public Baum<K,V> map(BiFunction<K,V>b);

	public V get(K key);

	

	

	
	
}