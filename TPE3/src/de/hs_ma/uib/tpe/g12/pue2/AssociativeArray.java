package de.hs_ma.uib.tpe.g12.pue2;

/**
 * 1312740
 * 1320733
 * 1331770
 */

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * The Interface AssociativeArray.
 * 
 * @param <K>
 *            the key type
 * @param <V>
 *            the value type
 */

public interface AssociativeArray<K, V> {

	/**
	 * Clear.
	 */
	public void clear();

	/**
	 * Contains value.
	 * 
	 * @param value
	 *            the value
	 * @return true, if successful
	 */
	public boolean containsValue(V value);

	/**
	 * Contains key.
	 * 
	 * @param Key
	 *            the key
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
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public void put(K key, V value);

	/**
	 * Put all.
	 * 
	 * @param m
	 *            the m
	 */
	public void putAll(Baum<K, V> m);

	/**
	 * Removes the.
	 * 
	 * @param key
	 *            the key
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
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public void update(K key, V value);

	/**
	 * For each.
	 * 
	 * @param biconsumer
	 *            the biconsumer
	 */
	public void forEach(BiConsumer<K, V> biconsumer);

	/**
	 * Extract all.
	 * 
	 * @param neu
	 *            the neu
	 */
	public void extractAll(Baum<K, V> neu);

	/**
	 * Gets the.
	 * 
	 * @param key
	 *            the key
	 * @return the v
	 */
	public V get(K key);

	/**
	 * Map.
	 * 
	 * @param bifunction
	 *            the bifunction
	 * @return the baum
	 */
	public Baum<K, V> map(BiFunction<K, V, V> bifunction);

}