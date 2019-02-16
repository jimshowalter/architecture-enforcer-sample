package com.jimandlisa.service;

import com.jimandlisa.app.App1;
import com.jimandlisa.ui.UI1;

public class Service1 {

	public static void s1() {
		App1.f1();
		UI1.u1(); // Illegal!
	}
}
