package com.other.object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

public class Stringconverter implements Converter {
	  public static String fromStream(InputStream paramInputStream)
			    throws IOException
			  {
			    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
			    StringBuilder localStringBuilder = new StringBuilder();
			    String str1 = System.getProperty("line.separator");
			    while (true)
			    {
			      String str2 = localBufferedReader.readLine();
			      if (str2 == null)
			        return localStringBuilder.toString();
			      localStringBuilder.append(str2);
			      localStringBuilder.append(str1);
			    }
			  }

			  public Object fromBody(TypedInput paramTypedInput, Type paramType)
			    throws ConversionException
			  {
			    try
			    {
			      String str = fromStream(paramTypedInput.in());
			      return str;
			    }
			    catch (IOException localIOException)
			    {
			    }
			    return null;
			  }

			  public TypedOutput toBody(Object paramObject)
			  {
			    return null;
			  }}
