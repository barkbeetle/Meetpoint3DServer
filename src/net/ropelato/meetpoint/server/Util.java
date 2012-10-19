package net.ropelato.meetpoint.server;

import java.text.DecimalFormat;

public class Util
{
	public static final DecimalFormat doubleFormatter = new DecimalFormat("#.##");

	public static String formatDouble(double d)
	{
		return doubleFormatter.format(d);
	}
}
