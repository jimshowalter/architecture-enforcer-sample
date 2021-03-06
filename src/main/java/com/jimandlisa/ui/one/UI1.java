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

package com.jimandlisa.ui.one;

import java.io.PrintStream;

import com.jimandlisa.service.one.Service1;
import com.jimandlisa.utils.Utils;

public class UI1 {

	public static void u1(Class<?> callerClass, String caller, int depth, PrintStream ps) throws Exception {
		Utils.called(UI1.class, "u1", callerClass, caller, depth, ps);
		Service1.s1(UI1.class, "u1", depth + 2, ps);
	}

	@SuppressWarnings("unused")
	private static void u1Private(Class<?> callerClass, String caller, int depth, PrintStream ps) throws Exception {
		Utils.called(UI1.class, "u1Private", callerClass, caller, depth, ps);
		Service1.s1(UI1.class, "u1Private", depth + 2, ps);
	}
}
