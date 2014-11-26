/*
 * 
 */
package de.hs_ma.uib.tpe.g12.pue2;

// TODO: Auto-generated Javadoc
/**
 * The Interface AssociativeArray.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
public interface AssociativeArray<K, V> {

	/**
	 * Clear.
	 */
	public void clear();

	/**
	 * Contains value.
	 *
	 * @param value the value
	 * @return true, if successful
	 */
	public boolean containsValue(V value);

	/**
	 * Contains key.
	 *
	 * @param Key the key
	 * @return true, if successful
	 */
	public boolean containsKey(K Key);

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty();

	/**
	 * Put.
	 *
	 * @param key the key
	 * @param value the value
	 */
	public void put(K key, V value);

	/**
	 * Put all.
	 *
	 * @param m the m
	 */
	void putAll(Baum<K, V> m);

	/**
	 * Removes the.
	 *
	 * @param key the key
	 * @return the v
	 */
	public V remove(K key);

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size();

	/**
	 * Update.
	 *
	 * @param key the key
	 * @param value the value
	 */
	void update(K key, V value);

	/**
	 * For each.
	 */
	public void forEach();

	/**
	 * Extract all.
	 *
	 * @param neu the neu
	 */
	void extractAll(Baum<K, V> neu);

	/**
	 * Map.
	 */
	public void map();

	/**
	 * Gets the.
	 *
	 * @param key the key
	 * @return the v
	 */
	public V get(K key);

	

	

}