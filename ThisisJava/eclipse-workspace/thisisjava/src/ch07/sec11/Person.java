package ch07.sec11;

public sealed class Person permits Employee, Manager{
	protected int hello;
}
