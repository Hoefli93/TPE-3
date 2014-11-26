/*
 * 
 */
package de.hs_ma.uib.tpe.g12.pue2;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

// TODO: Auto-generated Javadoc
/**
 * The Class Baum.
 * 
 * @param <K>
 *            the key type
 * @param <V>
 *            the value type
 */
public class Baum<K, V> implements AssociativeArray<K, V> {

	/**
	 * The Class Baumknoten.
	 * 
	 * @param <K>
	 *            the key type
	 * @param <V>
	 *            the value type
	 */
	public class Baumknoten<K, V> {

		/** The key. */
		private K key;

		/** The value. */
		private V value;

		/** The links. */
		private Baumknoten<K, V> links;

		/** The rechts. */
		private Baumknoten<K, V> rechts;

		/**
		 * Instantiates a new baumknoten.
		 * 
		 * @param key
		 *            the key
		 * @param value
		 *            the value
		 */
		public Baumknoten(K key, V value) {
			this.key = key;
			this.value = value;
			this.links = null;
			this.rechts = null;
		}

		/**
		 * Instantiates a new baumknoten.
		 */
		public Baumknoten() {
		}

		/**
		 * Gets the key.
		 * 
		 * @return the key
		 */
		public K getKey() {
			return key;
		}

		/**
		 * Gets the value.
		 * 
		 * @return the value
		 */
		public V getValue() {
			return value;
		}

		/**
		 * Gets the links.
		 * 
		 * @return the links
		 */
		public Baumknoten<K, V> getLinks() {
			return links;
		}

		/**
		 * Gets the rechts.
		 * 
		 * @return the rechts
		 */
		public Baumknoten<K, V> getRechts() {
			return rechts;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			result = prime * result + ((links == null) ? 0 : links.hashCode());
			result = prime * result
					+ ((rechts == null) ? 0 : rechts.hashCode());
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Baumknoten other = (Baumknoten) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (key == null) {
				if (other.key != null)
					return false;
			} else if (!key.equals(other.key))
				return false;
			if (links == null) {
				if (other.links != null)
					return false;
			} else if (!links.equals(other.links))
				return false;
			if (rechts == null) {
				if (other.rechts != null)
					return false;
			} else if (!rechts.equals(other.rechts))
				return false;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}

		/**
		 * Gets the outer type.
		 * 
		 * @return the outer type
		 */
		private Baum getOuterType() {
			return Baum.this;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Node {KEY=" + value + "}";
		}

	}

	/** The wurzel. */
	Baumknoten<K, V> wurzel = null;

	/**
	 * Instantiates a new baum.
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public Baum(K key, V value) {

		this.wurzel.key = key;
		this.wurzel.value = value;
	}

	/**
	 * Instantiates a new baum.
	 */
	public Baum() {

	}

	/*
	 * soll das assoziative Array leeren
	 */
	@Override
	public void clear() {
		wurzel = null;

	}

	/*
	 * (soll überprüfen, ob der übergebene Wert im assoziativen Array vorkommt
	 */
	@Override
	public boolean containsValue(V value) {
		if (isEmpty()) {
			return false;
		} else {
			return containsValue(wurzel, value);
		}

	}

	/**
	 * Contains value.
	 * 
	 * @param node
	 *            the node
	 * @param value
	 *            the value
	 * @return true, if successful
	 */
	public boolean containsValue(Baumknoten<K, V> node, V value) {
		boolean result;
		if (node.value.equals(value)) {
			return true;
		} else {
			if (value.hashCode() < node.value.hashCode() && node.links != null) {
				result = containsValue(node.links, value);
			} else if (value.hashCode() > node.value.hashCode()
					&& node.rechts != null) {

				result = containsValue(node.rechts, value);
			}
		}

		return false;

	}

	/*
	 * soll überprüfen, ob der übergebene Schlüssel im assoziativen Array
	 * vorkommt
	 */
	@Override
	public boolean containsKey(K key) {
		if (isEmpty()) {
			return false;
		} else {
			return containsKey(wurzel, key);
		}

	}

	/**
	 * Contains key.
	 * 
	 * @param node
	 *            the node
	 * @param key
	 *            the key
	 * @return true, if successful
	 */
	public boolean containsKey(Baumknoten<K, V> node, K key) {
		boolean result;
		if (node.key.equals(key)) {
			return true;
		} else {
			if (key.hashCode() < node.key.hashCode() && node.links != null) {

				result = containsKey(node.links, key);
			} else if (key.hashCode() > node.key.hashCode()
					&& node.rechts != null) {

				result = containsKey(node.rechts, key);
			}
		}

		return false;
	}

	/*
	 * soll den passenden Wert zum ubergebenen Schlüssel zurückgeben
	 */
	@Override
	public V get(K key) {
		if (!containsKey(key)) {
			return null;
		} else {
			return get(wurzel, key);
		}

	}

	/**
	 * Gets the.
	 * 
	 * @param node
	 *            the node
	 * @param key
	 *            the key
	 * @return the v
	 */
	public V get(Baumknoten<K, V> node, K key) {
		V value = null;
		if (node.key.equals(key)) {
			return node.value;
		} else {
			if (key.hashCode() < node.key.hashCode() && node.links != null) {

				value = get(node.links, key);
			} else if (key.hashCode() > node.key.hashCode()
					&& node.rechts != null) {

				value = get(node.rechts, key);
			}
		}

		return value;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hs_ma.uib.tpe.g12.pue2.AssociativeArray#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		if (wurzel != null) {
			return false;
		}
		return true;
	}

	/*
	 * soll überprüfen, ob das assoziative Array leer ist
	 */
	@Override
	public void put(K key, V value) {
		Baumknoten<K, V> newNode = new Baumknoten<K, V>(key, value);

		if (newNode.key.hashCode() < wurzel.key.hashCode()) {
			if (wurzel.links == null)
				wurzel.links = newNode;
			else
				put(wurzel.links, newNode);
		} else {
			if (wurzel.rechts == null)
				wurzel.rechts = newNode;
			else
				put(wurzel.rechts, newNode);
		}

	}

	/**
	 * Put.
	 * 
	 * @param node
	 *            the node
	 * @param newNode
	 *             soll den übergebenen Schlüssel und Wert im
	 *            assoziativen Array speichern
	 */
	public void put(Baumknoten<K, V> node, Baumknoten<K, V> newNode) {
		if (newNode.key.hashCode() < node.key.hashCode()) {
			if (node.links == null)
				node.links = newNode;
			else
				put(node.links, newNode);
		} else {
			if (node.rechts == null)
				node.rechts = newNode;
			else
				put(node.rechts, newNode);
		}
	}

	/*
	 * soll alle Schlussel-Wert-Paare des übergebenen assoziativen Arrays zum
	 * aktuellen assoziativen Array hinzufugen
	 */

	@Override
	public void putAll(Baum<K, V> m) {

		putAll(m, wurzel);
	}

	/**
	 * Put all.
	 * 
	 * @param m
	 *            the m
	 * @param node
	 *            the node
	 */
	public void putAll(Baum<K, V> m, Baumknoten<K, V> node) {
		Baum<K, V> n = new Baum<K, V>();

		for (int i = 0; i <= m.size(); i++) {
			n.put(node.key, node.value);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hs_ma.uib.tpe.g12.pue2.AssociativeArray#remove(java.lang.Object)
	 */
	@Override
	public V remove(K key) {
		if (containsKey(key)) {
			return remove(wurzel, key);

		}

	}

	/**
	 * Removes the.
	 * 
	 * @param node
	 *            the node
	 * @param key
	 *            the key
	 * @return the v
	 * 
	 * soll das Schlussel-Wert-Paar des ¨ 
	 * übergebenen Schlüssels aus dem assoziativen Array entfernen
	 *	und den Wert zuruckliefern 
	 */
	public V remove(Baumknoten<K, V> node, K key) {

		if (node.key == key) {
			V wert = node.value;
			Baumknoten<K, V> nodeLeft = node.links;
			Baumknoten<K, V> nodeRight = node.rechts;
			node = wurzel;
			if (node.links.key == key) {

				node.links = null;
			} else if (node.rechts.key == key) {
				node.rechts = null;
			}
			put(nodeLeft, wurzel);
			put(nodeRight, wurzel);
			return wert;

		}

		if (key.hashCode() < node.key.hashCode()) {
			remove(node.links, key);
		}

		if (key.hashCode() > node.key.hashCode()) {
			remove(node.rechts, key);
		}
		return null;
	}

	/*
	 * 
	 * 
	 * 
	 */
	@Override
	public int size() {
		if (!isEmpty()) {
			return size(wurzel);
		}
	}

	/**
	 * Size.
	 * 
	 * @param node
	 *            the node
	 * @return the int
	 * 
	 * 
	 * soll die Anzahl der Schlussel-Wert-Paare zurückgeben
	 */
	public int size(Baumknoten<K, V> node) {
		int size = 1;
		if (node.links != null && node.rechts != null) {
			size += 2;
			size(node.links);
			size(node.rechts);
		} else if (node.links != null) {
			size++;
			size(node.links);

		}

		else if (node.rechts != null) {
			size++;
			size(node.rechts);

		}

		return size;

	}

	/*
	 * 
	 */
	@Override
	public void update(K key, V value) {
		if (containsKey(key)) {
			update(wurzel, key, value);
		}

	}

	/**
	 * Update.
	 * 
	 * @param node
	 *            the node
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 *            
	 *
	 *   soll den Wert des ubergebenen Schlüssels mit dem übergebenen    
	 *          Wert aktualisieren    
	 */
	public void update(Baumknoten<K, V> node, K key, V value) {
		
		if (key == node.key) {
			node.value = value;
			
		} else if (key.hashCode() < node.key.hashCode()) {
			update(node.links, key, value);
			
		} else {
			update(node.rechts, key, value);
		}
	}

	/**
	 * For each.
	 * 
	 * @param biconsumer
	 *            the biconsumer
	 */
	@Override
	public void forEach(BiConsumer<K, V> biconsumer) {
		if (wurzel != null) {
			forEach(biconsumer, wurzel);
		}
	}

	/**
	 * For each.
	 * 
	 * @param biconsumer
	 *            the biconsumer
	 * @param node
	 *            the node
	 *            
	 *soll den übergebenen BiConsumer fur alle Schlüssel-Wert-Paare des assoziativen Arrays ausführen
	 * 
	 * 
	 */
	private void forEach(BiConsumer<K, V> biconsumer, Baumknoten<K, V> node) {
		if (node != null) {
			biconsumer.accept(node.key, node.value);
		}
		if (node.links != null) {
			forEach(biconsumer, node.links);
		}
		if (node.rechts != null) {
			forEach(biconsumer, node.rechts);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hs_ma.uib.tpe.g12.pue2.AssociativeArray#extractAll(de.hs_ma.uib.tpe
	 * .g12.pue2.Baum)
	 */
	@Override
	public void extractAll(Baum<K, V> m) {
		extractAll(m, wurzel);
	}

	/**
	 * Extract all.
	 * 
	 * @param m
	 *            the m
	 * @param node
	 *  the node
	 *soll alle Schlussel-Wert-Paare des aktuellen assoziativen Arrays zum 
	 *übergebenen assoziativen Array hinzufügen
	 *            
	 */
	public void extractAll(Baum<K, V> m, Baumknoten<K, V> node) {
		Baum<K, V> n = new Baum<K, V>();

		for (int i = 0; i <= n.size(); i++) {
			m.put(node.key, node.value);

		}
	}

	/**
	 * Map.
	 * 
	 * @param biFunktion
	 *            the bi funktion
	 * @return the baum
	 * soll die ubergebene ¨ BiFunction fur alle Schl ¨ ussel-Wert-Paare des assoziativen Arrays ausf ¨ uhren ¨
	 * und damit ein neues assoziatives Array erzeugen, welches die ver¨anderten Werte auf die alten
	 * Schlussel abbildet
	 * 
	 */
	public Baum<K, V> map(BiFunction<K, V, Baum<K, V>> biFunktion) {
		Baum<K, V> neu = new Baum<K, V>();
		return map(biFunktion, wurzel, neu);
	}

}