package com.clover.btrace.script;

import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class BtraceTestScript {
	@OnMethod(clazz = "com.clover.jvm.btrace.BtraceTest", method = "add", location = @Location(Kind.RETURN))
	public static void func(@Self Object o, @ProbeClassName String pcn, int a, int b, @Return int result) {
		println(strcat("当前类：", str(o)));
		println(pcn);
		println("调用堆栈");
		jstack();
		println(strcat("方法参数A", str(a)));
		println(strcat("方法参数B", str(b)));
		println(strcat("方法结果：", str(result)));
	}
}