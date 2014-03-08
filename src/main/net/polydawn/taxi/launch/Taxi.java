package net.polydawn.taxi.launch;

import java.io.*;
import net.polydawn.taxi.demo.*;

/**
 * Default run target for platforms that aren't rude.
 */
public class Taxi {
	public static void main(String... args) throws IOException {
		System.out.println("Hello, world.");
		new SimplestServer().connect().serve();
		System.out.println(new SimplestClient().connect().ping());
	}
}
