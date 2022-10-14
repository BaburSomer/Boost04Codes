package com.bilgeadam.course04.lesson36.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("com.bilgeadam.course04.lesson36.reflection" + ".ReflectedClass");
			System.out.println(clazz);

			if (clazz.isEnum()) {
				System.out.println(clazz.getSimpleName() + " bir ENUM sınıfıdır");
			} else if (clazz.isLocalClass()) {
				System.out.println(clazz.getSimpleName() + " bir yerel sınıftır");
			}

			listFields(clazz);
			listMethods(clazz);
			listConstructors(clazz);
			
			ReflectedClass cl = createObject(clazz);
			
			Method theMethod = findMethod(clazz, "setBirthYear");
			theMethod.invoke(cl, 1955);
			System.out.println(cl);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	private static Method findMethod(Class clazz, String methodName) {
		Method[] methods = clazz.getDeclaredMethods();
		Method foundMethod = null;
		for (Method method : methods) {
			if (methodName.equalsIgnoreCase(method.getName())) {
				foundMethod = method;
				break;
			}
		}
		if (foundMethod != null) {
			if (!foundMethod.isAccessible())
				foundMethod.setAccessible(true);
		}
		return foundMethod;
	}

	private static ReflectedClass createObject(Class clazz) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?>[] constType = {String.class, String.class, int.class, boolean.class};
		Constructor<?> contructor = clazz.getConstructor(constType);
		Object[] params = {"Ali", "Veli", 4950, false};
		Object newInstance = contructor.newInstance(params);
		System.out.println(newInstance);
		return (ReflectedClass)newInstance;
	}

	private static void listConstructors(Class clazz) {
		Constructor[] methods = clazz.getConstructors();
		for (Constructor method : methods) {
			System.out.println(method);
		}
	}

	private static void listMethods(Class clazz) {
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}

	private static void listFields(Class clazz) {
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("2. Field bilgileri: " + fields[1].getType() + " " + fields[1].getName() + " "
				+ fields[1].getModifiers());
	}
}
