/* A function that returns no meaningful value
 */

fun printSum(a: Int, b: Int): Unit {
	
	/* Unit in Kotlin coresponds to void in Java
	 * Like void, Unit is the return type of any function
	 * that does not return any meaningful value, and it
	 * is optional to mention Unit as the return type
	 *
	 * But unlike void, Unit is a real singleton class with
	 * only one object.
	 *
	 * Dont worry,
	 * there are also another two types similar to this
	 * 
	 * Void (from Java, won't use unless you're using some Java
	 * library that uses it)
	 *
	 * Unit (what you return from a function that doesn't return
	 * anything of interest)
	 *
	 * Nothing (no values - actually the type that captures only
	 * null value in Kotlin)
	 *
	 * Credits: https://stackoverflow.com/a/55953300
	 * License: CC-BY-SA 4.0
	 */

	/*
	 * Singleton Pattern is a software design pattern that
	 * restricts the instantiation of the class to only
	 * 'one' instance.
	 */

	println("sum of $a and $b is ${a + b}")
}

fun main() {
	printSum(7, 2);
}
