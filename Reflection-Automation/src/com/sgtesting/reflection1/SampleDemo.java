package com.sgtesting.reflection1;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Method method[]=obj.getClass().getMethods();
			for(int i=0;i<method.length;i++)
			{
				String name=method[i].getName();
				if(name.startsWith("display"))
				{
					method[i].invoke(obj);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
