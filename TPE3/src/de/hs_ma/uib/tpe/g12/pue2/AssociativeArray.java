/*
 * 
 */
package de.hs_ma.uib.tpe.g12.pue2;

<<<<<<< HEAD
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

=======
// TODO: Auto-generated Javadoc
/**
 * The Interface AssociativeArray.
 *
 * @param <K> the key type
 * @param <V> the value type
 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
public interface AssociativeArray<K, V> {

	/**
	 * Clear.
	 */
	public void clear();

	/**
	 * Contains value.
<<<<<<< HEAD
	 * 
	 * @param value
	 *            the value
=======
	 *
	 * @param value the value
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	 * @return true, if successful
	 */
	public boolean containsValue(V value);

	/**
	 * Contains key.
<<<<<<< HEAD
	 * 
	 * @param Key
	 *            the key
=======
	 *
	 * @param Key the key
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	 * @return true, if successful
	 */
	public boolean containsKey(K Key);

	/**
	 * Checks if is empty.
<<<<<<< HEAD
	 * 
=======
	 *
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	 * @return true, if is empty
	 */
	public boolean isEmpty();

	/**
	 * Put.
<<<<<<< HEAD
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
=======
	 *
	 * @param key the key
	 * @param value the value
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	 */
	public void put(K key, V value);

	/**
	 * Put all.
<<<<<<< HEAD
	 * 
	 * @param m
	 *            the m
	 */
	public void putAll(Baum<K, V> m);
=======
	 *
	 * @param m the m
	 */
	void putAll(Baum<K, V> m);
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git

	/**
	 * Removes the.
<<<<<<< HEAD
	 * 
	 * @param key
	 *            the key
=======
	 *
	 * @param key the key
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	 * @return the v
	 */
	public V remove(K key);

	/**
	 * Size.
<<<<<<< HEAD
	 * 
=======
	 *
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	 * @return the int
	 */
	public int size();

	/**
	 * Update.
<<<<<<< HEAD
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public void update(K key, V value);
=======
	 *
	 * @param key the key
	 * @param value the value
	 */
	void update(K key, V value);
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git

	/**
	 * For each.
<<<<<<< HEAD
	 * 
	 * @param biconsumer
	 *            the biconsumer
	 */
	public void forEach(BiConsumer<K, V> biconsumer);
=======
	 */
	public void forEach();
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git

	/**
	 * Extract all.
<<<<<<< HEAD
	 * 
	 * @param neu
	 *            the neu
	 */
	public void extractAll(Baum<K, V> neu);
=======
	 *
	 * @param neu the neu
	 */
	void extractAll(Baum<K, V> neu);
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git

	/**
<<<<<<< HEAD
	 * Gets the.
	 * 
	 * @param key
	 *            the key
=======
	 * Map.
	 */
	public void map();

	/**
	 * Gets the.
	 *
	 * @param key the key
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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
