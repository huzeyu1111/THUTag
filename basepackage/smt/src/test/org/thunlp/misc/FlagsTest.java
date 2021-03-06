package org.thunlp.misc;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FlagsTest extends TestCase {
	public void testFlagsSimple() {
		Flags flags = new Flags();
		String[] args = { "--b=description", "--c=d", "--d=false", "--e=true" };
		flags.add("b", "description");
		flags.add("c", "jubo");
		flags.add("d");
		flags.add("e");
		flags.parseAndCheck(args);
		Assert.assertEquals(flags.getString("b"), "description");
		Assert.assertEquals(flags.getString("c"), "d");
		Assert.assertEquals(flags.getBoolean("d"), false);
		Assert.assertEquals(flags.getBoolean("e"), true);
	}
}
