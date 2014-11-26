package de.hs_ma.uib.tpe.g12.pue2;

public interface AssociativeArray<K, V> {

	public void clear();

	public boolean containsValue(V value);

	public boolean containsKey(K Key);

	public boolean isEmpty();

	public void put(K key, V value);

	void putAll(Baum<K, V> m);

	public V remove(K key);

	public int size();

	void update(K key, V value);

	public void forEach();

	void extractAll(Baum<K, V> neu);

	public void map();

	public V get(K key);

	

	

}