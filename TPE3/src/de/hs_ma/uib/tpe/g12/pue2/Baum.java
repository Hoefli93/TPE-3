<<<<<<< HEAD

=======
/*
 * 
 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
package de.hs_ma.uib.tpe.g12.pue2;

/**
 * 1312740
 * 1320733
 * 1331770
 */

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

<<<<<<< HEAD

/**
 * The Class Baum.
 *
 * @param <K> the key type
 * @param <V> the value type
=======
// TODO: Auto-generated Javadoc
/**
 * The Class Baum.
 * 
 * @param <K>
 *            the key type
 * @param <V>
 *            the value type
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
 */
public class Baum<K, V> implements AssociativeArray<K, V> {

	/**
	 * The Class Baumknoten.
<<<<<<< HEAD
	 *
	 * @param <K> the key type
	 * @param <V> the value type
=======
	 * 
	 * @param <K>
	 *            the key type
	 * @param <V>
	 *            the value type
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	 */
	public class Baumknoten<K, V> {
<<<<<<< HEAD
		
=======

>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
		/** The key. */
		private K key;
<<<<<<< HEAD
		
=======

>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
		/** The value. */
		private V value;
<<<<<<< HEAD
		
=======

>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
		/** The links. */
		private Baumknoten<K, V> links;
<<<<<<< HEAD
		
=======

>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
		/** The rechts. */
		private Baumknoten<K, V> rechts;

		/**
		 * Instantiates a new baumknoten.
<<<<<<< HEAD
		 *
		 * @param key the key
		 * @param value the value
=======
		 * 
		 * @param key
		 *            the key
		 * @param value
		 *            the value
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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
<<<<<<< HEAD
		
		/**
		 * Gets the key.
		 *
=======

		/**
		 * Gets the key.
		 * 
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
		 * @return the key
		 */
		public K getKey() {
			return key;
		}

		/**
		 * Gets the value.
<<<<<<< HEAD
		 *
=======
		 * 
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
		 * @return the value
		 */
		public V getValue() {
			return value;
		}

		/**
		 * Gets the links.
<<<<<<< HEAD
		 *
=======
		 * 
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
		 * @return the links
		 */
		public Baumknoten<K, V> getLinks() {
			return links;
		}

		/**
		 * Gets the rechts.
<<<<<<< HEAD
		 *
=======
		 * 
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
		 * @return the rechts
		 */
		public Baumknoten<K, V> getRechts() {
			return rechts;
		}

<<<<<<< HEAD

	
=======
		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#hashCode()
		 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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

<<<<<<< HEAD
		
=======
		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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
<<<<<<< HEAD
		 *
=======
		 * 
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
		 * @return the outer type
		 */
		private Baum getOuterType() {
			return Baum.this;
		}

<<<<<<< HEAD
		
=======
		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
		@Override
		public String toString() {
			return "Node {KEY=" + value + "}";
		}

	}

	/** The wurzel. */
	Baumknoten<K, V> wurzel = null;

	/**
	 * Instantiates a new baum.
<<<<<<< HEAD
	 *
	 * @param key the key
	 * @param value the value
=======
	 * 
	 * @param key
	 *            the key
	 * @param value
	 *            the value
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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

<<<<<<< HEAD
	/**
	 * clear soll das assoziative Array leeren
=======
	/*
	 * soll das assoziative Array leeren
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	 */
	@Override
	public void clear() {
		wurzel = null;

	}

<<<<<<< HEAD
	
=======
	/*
	 * (soll überprüfen, ob der übergebene Wert im assoziativen Array vorkommt
	 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	@Override
	public boolean containsValue(V value) {
		if (isEmpty()) {
			return false;
		} else {
			return containsValue(wurzel, value);
		}

	}

	/**
<<<<<<< HEAD
	 * containsValue soll uberprüfen, ob der übergebene Wert im assoziativen Array vorkommt
	 *
	 * @param node the node
	 * @param value the value
=======
	 * Contains value.
	 * 
	 * @param node
	 *            the node
	 * @param value
	 *            the value
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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

<<<<<<< HEAD
	
=======
	/*
	 * soll überprüfen, ob der übergebene Schlüssel im assoziativen Array
	 * vorkommt
	 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	@Override
	public boolean containsKey(K key) {
		if (isEmpty()) {
			return false;
		} else {
			return containsKey(wurzel, key);
		}

	}

	/**
<<<<<<< HEAD
	 * containsKey soll uberprüfen, ob der übergebene Schlüssel im assoziativen Array vorkommt 
	 *
	 * @param node the node
	 * @param key the key
=======
	 * Contains key.
	 * 
	 * @param node
	 *            the node
	 * @param key
	 *            the key
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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

<<<<<<< HEAD
	
=======
	/*
	 * soll den passenden Wert zum ubergebenen Schlüssel zurückgeben
	 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	@Override
	public V get(K key) {
		if (!containsKey(key)) {
			return null;
		} else {
			return get(wurzel, key);
		}

	}

	/**
<<<<<<< HEAD
	 * get soll den passenden Wert zum ubergebenen Schlüssel zurückgeben 
	 *
	 * @param node the node
	 * @param key the key
=======
	 * Gets the.
	 * 
	 * @param node
	 *            the node
	 * @param key
	 *            the key
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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
<<<<<<< HEAD
	
	/**
	 * isEmpty soll uberprüfen, ob das assoziative Array leer ist 
	 
	 * @return the boolean
=======

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hs_ma.uib.tpe.g12.pue2.AssociativeArray#isEmpty()
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	 */
	@Override
	public boolean isEmpty() {
		if (wurzel != null) {
			return false;
		}
		return true;
	}

<<<<<<< HEAD
	
=======
	/*
	 * soll überprüfen, ob das assoziative Array leer ist
	 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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
<<<<<<< HEAD
	 * put soll den ubergebenen Schlüssel und Wert im assoziativen Array speichern
	 *
	 * @param node the node
	 * @param newNode the new node
=======
	 * Put.
	 * 
	 * @param node
	 *            the node
	 * @param newNode
	 *             soll den übergebenen Schlüssel und Wert im
	 *            assoziativen Array speichern
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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

<<<<<<< HEAD
	
=======
	/*
	 * soll alle Schlussel-Wert-Paare des übergebenen assoziativen Arrays zum
	 * aktuellen assoziativen Array hinzufugen
	 */

>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	@Override
	public void putAll(Baum<K, V> m) {

		putAll(m, wurzel);
	}

	/**
<<<<<<< HEAD
	 * putAll soll alle Schlussel-Wert-Paare des übergebenen assoziativen Arrays zum aktuellen assoziati- ¨
	ven Array hinzufugen 
	 *
	 * @param m the m
	 * @param node the node
=======
	 * Put all.
	 * 
	 * @param m
	 *            the m
	 * @param node
	 *            the node
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	 */
	public void putAll(Baum<K, V> m, Baumknoten<K, V> node) {
		Baum<K, V> n = new Baum<K, V>();

		for (int i = 0; i <= m.size(); i++) {
			n.put(node.key, node.value);
		}
	}

<<<<<<< HEAD
	
=======
	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hs_ma.uib.tpe.g12.pue2.AssociativeArray#remove(java.lang.Object)
	 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	@Override
	public V remove(K key) {
		if (containsKey(key)) {
			return remove(wurzel, key);

		}
		return null;

	}

	/**
<<<<<<< HEAD
	 * remove soll das Schlussel-Wert-Paar des übergebenen Schlüssels aus dem assoziativen Array entfer- ¨
nen und den Wert zuruckliefern
	 *
	 * @param node the node
	 * @param key the key
	 * @return the v
=======
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
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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

<<<<<<< HEAD
	
=======
	/*
	 * 
	 * 
	 * 
	 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	@Override
	public int size() {
		if (!isEmpty()) {
			return size(wurzel);
		}
		return 0;
	}

	/**
<<<<<<< HEAD
	 * size soll die Anzahl der Schlussel-Wert-Paare zurückgeben
	 *
	 * @param node the node
	 * @return the int
=======
	 * Size.
	 * 
	 * @param node
	 *            the node
	 * @return the int
	 * 
	 * 
	 * soll die Anzahl der Schlussel-Wert-Paare zurückgeben
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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

<<<<<<< HEAD

=======
	/*
	 * 
	 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	@Override
	public void update(K key, V value) {
		if (containsKey(key)) {
			update(wurzel, key, value);
		}

	}

	/**
<<<<<<< HEAD
	 * update soll den Wert des ubergebenen Schlüssels mit dem übergebenen Wert aktualisieren
	 *
	 * @param node the node
	 * @param key the key
	 * @param value the value
=======
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
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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

<<<<<<< HEAD
	
=======
	/**
	 * For each.
	 * 
	 * @param biconsumer
	 *            the biconsumer
	 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	@Override
	public void forEach(BiConsumer<K, V> biconsumer) {
		if (wurzel != null) {
			forEach(biconsumer, wurzel);
		}
	}

	/**
<<<<<<< HEAD
	 * forEach soll den ubergebenen BiConsumer fur alle Schlüssel-Wert-Paare des assoziativen Arrays ¨
	ausführen 
	 *
	 * @param biconsumer the biconsumer
	 * @param node the node
=======
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
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
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

<<<<<<< HEAD
	
=======
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hs_ma.uib.tpe.g12.pue2.AssociativeArray#extractAll(de.hs_ma.uib.tpe
	 * .g12.pue2.Baum)
	 */
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	@Override
	public void extractAll(Baum<K, V> m) {
		extractAll(m, wurzel);
	}

	/**
<<<<<<< HEAD
	 * extractAll soll alle Schlussel-Wert-Paare des aktuellen assoziativen Arrays zum übergebenen asso- ¨
ziativen Array hinzufugen 
	 *
	 * @param m the m
	 * @param node the node
=======
	 * Extract all.
	 * 
	 * @param m
	 *            the m
	 * @param node
	 *  the node
	 *soll alle Schlussel-Wert-Paare des aktuellen assoziativen Arrays zum 
	 *übergebenen assoziativen Array hinzufügen
	 *            
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
	 */
	public void extractAll(Baum<K, V> m, Baumknoten<K, V> node) {
		Baum<K, V> n = new Baum<K, V>();

		for (int i = 0; i <= n.size(); i++) {
			m.put(node.key, node.value);

		}
	}

<<<<<<< HEAD
	
	@Override
	public Baum<K, V> map(BiFunction<K, V, V> bifunction) {
=======
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
>>>>>>> branch 'master' of https://github.com/Hoefli93/TPE-3.git
		Baum<K, V> neu = new Baum<K, V>();
		return map(bifunction);
		
	}

	

}
