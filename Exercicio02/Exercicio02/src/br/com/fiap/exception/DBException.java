package br.com.fiap.exception;

@SuppressWarnings("serial")
public class DBException extends Exception {

	public DBException(String x, Exception y) {
		System.out.println(x + "\n" + y);
	}

}
