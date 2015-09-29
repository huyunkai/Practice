package File;

public class EncodingDemo2 {

	public static void main(String[] args) throws Exception
	{
		String s="ÁªÍ¨";
		byte []bs=s.getBytes("gbk");
		for(byte b:bs)
		{
			System.out.println(Integer.toBinaryString(b&255));	
		}
		
	}

}
