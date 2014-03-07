package net.polydawn.taxi;

import java.io.*;
import net.polydawn.taxi.demo.*;

public class Taxi {
	public static void main(String... args) throws IOException {
		System.out.println("Hello, world.");
		new SimplestServer().connect().serve();
		System.out.println(new SimplestClient().connect().ping());
	}
}
