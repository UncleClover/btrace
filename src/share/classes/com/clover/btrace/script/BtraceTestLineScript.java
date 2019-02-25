package com.clover.btrace.script;

import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class BtraceTestLineScript {
	@OnMethod(clazz = "com.clover.jvm.btrace.BtraceTest", location = @Location(value = Kind.LINE, line = 9))
	public static void func() {
		println("调用堆栈");
	}
}