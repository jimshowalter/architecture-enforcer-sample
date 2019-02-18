// Copyright 2019 jimandlisa.com.
//
// Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
// to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
// and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
// IN THE SOFTWARE.

package com.jimandlisa.utils;

public class Utils {
	
	private static final String BLANKS = "                                                                                                             ";

	public static String indent(int count, String s) {
		return BLANKS.substring(0, count) + s;
//		String k = String.format("%1$" + count + "s", s);
//		String y = String.format("%1$-4s", s);
//		String t = String.format("$4s%s", s);
//		return String.format("%1$" + count + "s", s); // Not efficient, but not important for this sample.
	}
	
	// TODO: Use aspects.
	public static void called(Class<?> calledClass, String called, Class<?> callerClass, String caller, int depth) {
		System.out.println(indent(depth + 2, calledClass.getSimpleName() + "." + called + " called by " + callerClass.getSimpleName() + "." + caller));
	}
}