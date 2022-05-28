package cjl.spring.proxy.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class ProxyUtils {
	public static Object getInstance(Class clazz) {
		String infName = clazz.getSimpleName();
		String content = "";
		String line = "\n";
		String tab = "\t";
		String packageContent = "package cjl.spring.proxy;" + line;
		String importContent = "import " + clazz.getName() + ";" + line;
		String clazzFirstLineContent = "public class $Proxy implement" + infName + "{" + line;
		String filedContent = tab + "private " + infName + "target;" + line;
		String constructorContent = tab + "public $Proxy (" + infName + " target) {" + line + tab + tab + "this.target = target;" + line + tab + "}" + line;
		String methodContent = "";
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			//方法返回值
			String returnTypeName = method.getReturnType().getSimpleName();
			//方法名
			String methodName = method.getName();
			//[String.class]
			Class args[] = method.getParameterTypes();
			String argsContent = "";
			String paramsContent = "";
			int flag = 0;
			for (Class arg : args) {
				//参数类型
				String temp = arg.getSimpleName();
				argsContent += temp + " p" + flag + ",";
				paramsContent += temp + " p" + flag + ",";
				flag++;
			}
			if (argsContent.length() > 0) {
				argsContent = argsContent.substring(0, argsContent.lastIndexOf(","));
				paramsContent = paramsContent.substring(0, paramsContent.lastIndexOf(","));
			}

			methodContent = tab + "public " + returnTypeName + " " + methodName + "(" + argsContent + ") {" + line
					+ tab + tab + "System.out.println(\"log\");" + line + tab + tab + "target." + methodName + "(" + paramsContent + ");" + line + tab + "}" + line;

		}
		content = packageContent + importContent + clazzFirstLineContent+filedContent+constructorContent+methodContent+"}";
		File file = new File("d:\\");
		try {
			if (!file.exists()){
				file.createNewFile();
			}
			FileWriter fw =new FileWriter(file);
			fw.write(content);
			fw.flush();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}


		return null;
	}
}

