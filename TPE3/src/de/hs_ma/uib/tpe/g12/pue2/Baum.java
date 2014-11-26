package de.hs_ma.uib.tpe.g12.pue2;

import java.util.Map;

public class Baum<K, V> implements AssociativeArray<K, V> {

	public class Baumknoten<K, V> {

		private K key;
		private V value;
		private Baumknoten<K, V> links;
		private Baumknoten<K, V> rechts;

		public Baumknoten(K key, V value) {
			this.key = key;
			this.value = value;
			this.links = null;
			this.rechts = null;
		}

		public Baumknoten() {
		}

	}

	Baumknoten<K, V> wurzel = null;

	public Baum() {

	}

	@Override
	public void clear() {
		wurzel = null;

	}

	@Override
	public boolean containsValue(V value) {
		if (isEmpty()) {
			return false;
		} else {
			return containsValue(wurzel, value);
		}

	}

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

	@Override
	public boolean containsKey(K key) {
		if (isEmpty()) {
			return false;
		} else {
			return containsKey(wurzel, key);
		}

	}

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

	@Override
	public V get(K key) {
		if (!containsKey(key)) {
			return null;
		} else {
			return get(wurzel, key);
		}

	}

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

	@Override
	public boolean isEmpty() {
		return wurzel == null;
	}

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

	@Override
	public void putAll(Baum <K, V> m) {
		//Baum<? extends K, ? extends V> m
		
		
		putAll(m,wurzel);
	}
		public void putAll(Baum<K,V> m,Baumknoten<K,V>node){
			Baum<K,V>n = new Baum <K,V>();
		
			for(int i=0;i<=m.size();i++){
				n.put(node.key,node.value);
		}
	}

	@Override
	public V remove(K key) {
		if (!containsKey(key)) {
			return null;
		} else {
			return remove(wurzel, key);
		}
	}

	public V remove(Baumknoten<K, V> node, K key) {
		Baum<K, V> tree = new Baum<K, V>();
		
		if (node.key == key) {
			V wert = node.value;
			node = null;
			putAll(tree);
			return wert;

			/*
			 * Hinweis – Überlegen Sie, wie sie bei ¨ remove mit den Kindknoten
			 * des zu entfernenden Knotens umgehen. Hier kann durch geschickte
			 * Wiederverwendung einer anderen Methode viel Programmieraufwand
			 * gespart werden.
			 */

		}

		else if (key.hashCode() < node.key.hashCode()) {
		
			remove(node.links, key);
		}

		else if (key.hashCode() > node.key.hashCode()) {
			remove(node.rechts, key);
		}
		return null;

	}

	@Override
	public int size() {
		if (isEmpty()) {
			return 0;
		} else {
			return size(wurzel);
		}

	}

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

	@Override
	public void update(K key, V value) {

		update(wurzel, key, value);
	}

	public void update(Baumknoten<K, V> node, K key, V value) {
		node.value = value;

	}

	@Override
	public  void forEach(BiConsumer<K,V>a) {
		
		for( a : Baum ){
			
		}

	}

	@Override
	public void extractAll(Baum<K, V> m) {
	//Baum<? extends K, ? extends V> m
			
			extractAll(m,wurzel);
		}
			public void extractAll(Baum<K,V> m,Baumknoten<K,V>node){
				Baum<K,V>n = new Baum <K,V>();
			
				for(int i=0;i<=n.size();i++){
					m.put(node.key,node.value);
			}
		}
	
	

	@Override
	public Baum<K, V> map(BiFunction<K, V> b) {

		Baum<K, V> alt = new Baum<K, V>();
	}

}
}