package de.hs_ma.uib.tpe.g12.pue2;

import java.util.HashMap;
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

		K key = this.get(key);
		

		Baumknoten<K, V> newNode = new Baumknoten<K, V>(key, value);

		if (newNode.key.hashCode() < wurzel.key.hashCode()) { // links einfuegen
			if (wurzel.links == null)
				wurzel.links = newNode;
			else
				put(wurzel.links, newNode);
		} else { // rechts einfuegen
			if (wurzel.rechts == null)
				wurzel.rechts = newNode;
			else
				put(wurzel.rechts, newNode);
		}

	}

	public void containsValue(Baumknoten<K, V> node, Baumknoten<K, V> newNode) {
		if (newNode.key.hashCode() < node.key.hashCode()) { // links einfuegen
			if (node.links == null)
				node.links = newNode;
			else
				put(node.links, newNode);
		} else { // rechts einfuegen
			if (node.rechts == null)
				node.rechts = newNode;
			else
				put(node.rechts, newNode);
		}
	}

	@Override
	public boolean containsKey() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public V getValue(K key) {

		
		Baumknoten<K, V> newNode = new Baumknoten<K, V>(key, value);

		if (newNode.key.hashCode() < wurzel.key.hashCode()) {
			if(newNode.key.hashCode()==key.hashCode())// links einfuegen
			return(newNode.value); //mehrmals 
		} else { // rechts einfuegen
			if (wurzel.rechts == null)
				wurzel.rechts = newNode;
			else
				getValue(wurzel.rechts, newNode);
		}

	}
	
	public K getKey(V value) {
		
		if (isEmpty()) {
			return null; }
		
		
		
	}

	@Override
	public boolean isEmpty() {
		return wurzel == null;
	}

	@Override
	public void put(K key, V value) {
		Baumknoten<K, V> newNode = new Baumknoten<K, V>(key, value);

		if (newNode.key.hashCode() < wurzel.key.hashCode()) { // links einfuegen
			if (wurzel.links == null)
				wurzel.links = newNode;
			else
				put(wurzel.links, newNode);
		} else { // rechts einfuegen
			if (wurzel.rechts == null)
				wurzel.rechts = newNode;
			else
				put(wurzel.rechts, newNode);
		}

	}

	public void put(Baumknoten<K, V> node, Baumknoten<K, V> newNode) {
		if (newNode.key.hashCode() < node.key.hashCode()) { // links einfuegen
			if (node.links == null)
				node.links = newNode;
			else
				put(node.links, newNode);
		} else { // rechts einfuegen
			if (node.rechts == null)
				node.rechts = newNode;
			else
				put(node.rechts, newNode);
		}
	}

	@Override
	public void putAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public V remove(K key) {
		
		
		Baumknoten<K, V> newNode = new Baumknoten<K, V>(key, get(key));
		
		if( newNode == null ){
			return newNode.value;} // nichts gefunden; tue nichts
			if( key.compareTo(b.daten) < 0 )
			b.links = remove(x, b.links );
			else if( x.compareTo(b.daten) > 0 )
			b.rechts = remove( x, b.rechts );
			else if( b.links != null && b.rechts != null ) // Zwei Kinder
			{
			b.daten = findMin(b.rechts).daten;
			b.rechts = remove(b.daten, b.rechts);
			}
			else
			b = ( b.links != null ) ? b.links : b.rechts;
			return b;
			}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void forEach() {
		// TODO Auto-generated method stub

	}

	@Override
	public void extractAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void map() {
		// TODO Auto-generated method stub

	}

}