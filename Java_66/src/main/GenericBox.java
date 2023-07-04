package main;

public class GenericBox<T> {
	private T value;

	/**
	 * @param value
	 */
	public GenericBox(T value) {
		super();
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "GenericBox [value=" + value + "]";
	}

}
