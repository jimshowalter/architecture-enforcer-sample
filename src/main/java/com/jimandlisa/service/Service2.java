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

package com.jimandlisa.service;

import java.lang.reflect.Method;

import com.jimandlisa.app.two.App2;
import com.jimandlisa.utils.Utils;

public class Service2 {
	
	// Because pf-CDA is pretty smart and we want an undetected reflection call, we need to obscure the class used for reflection. to hide it from pf-CDA.
	
	static String hideReflectionCall1() {
		if (System.getProperty("bogus1") != null) {
			return "";
		}
		return "com";
	}
	
	static String hideReflectionCall2() {
		if (System.getProperty("bogus2") != null) {
			return "abcd";
		} else {
			return "jima" + "nd" + "lisa";
		}
	}
	
	static String hideReflectionCall3() {
		if (System.getProperty("bogus3") != null) {
			return "efgh";
		} else {
			return ".ui.one.UI1";
		}
	}
	
	private static String hideReflectionCall0() throws Exception {
		return hideReflectionCall1() + "." + hideReflectionCall2() + hideReflectionCall3();
	}

	public static void s2(Class<?> callerClass, String caller, int depth) throws Exception {
		Utils.called(Service2.class, "s2", callerClass, caller, depth);
		App2.a2(Service2.class, "s2", depth + 2);
		Method method = Class.forName(hideReflectionCall0()).getDeclaredMethod("u1Private", Class.class, String.class, int.class); // Illegal!
		method.setAccessible(true);
		method.invoke(null, Service2.class, "s2", depth + 2);
	}
}
