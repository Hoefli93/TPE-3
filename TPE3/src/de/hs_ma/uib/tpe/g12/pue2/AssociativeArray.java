package de.hs_ma.uib.tpe.g12.pue2;

public interface AssociativeArray <K,V> {

	public void clear();

	public boolean containsValue(V value);

	public boolean containsKey(K Key);

	public boolean isEmpty();

	public void put(K key, V value);

	public void putAll();

	public int remove();

	public int size();

	public void update();

	public void forEach();

	public void extractAll();

	public void map();

	public K getKey(V value);

	public V getValue(K key);

	
}