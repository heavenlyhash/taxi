package net.polydawn.taxi.launch;

import java.io.*;
import org.robovm.apple.foundation.*;

/**
 * Run target for platforms that are rude.
 */
public class TaxiApple {
	public static void main(String... args) throws IOException {
		NSAutoreleasePool pool = new NSAutoreleasePool();
		try {
			Taxi.main(args);
		} finally {
			pool.drain();
			pool.close();
		}
	}
}
