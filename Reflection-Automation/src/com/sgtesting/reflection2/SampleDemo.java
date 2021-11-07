package com.sgtesting.reflection2;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Class cls=obj.getClass();
			Method method[]=cls.getDeclaredMethods();
			for(int i=0;i<method.length;i++)
			{
				String name=method[i].getName();
				System.out.println(name);
				method[i].invoke(obj);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

