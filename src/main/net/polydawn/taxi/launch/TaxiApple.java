package net.polydawn.taxi.launch;

import java.io.*;
import org.robovm.cocoatouch.foundation.*;

/**
 * Run target for platforms that are rude.
 */
public class TaxiApple {
	public static void main(String... args) throws IOException {
		NSAutoreleasePool pool = new NSAutoreleasePool();
		Taxi.main(args);
		pool.drain();
	}
}
