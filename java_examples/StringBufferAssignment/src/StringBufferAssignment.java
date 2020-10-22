
public class StringBufferAssignment {

	public static void main(String[] args) {

		String toConvert = "hello have a great day";
		StringBuilder sb = new StringBuilder();
		
		String[] splitted = toConvert.split(" ");
		for(String s : splitted)
		{
			sb.append(s.substring(0, s.length() - 1))
			.append(Character.toUpperCase(s.charAt(s.length() - 1)))
			.append(" ");
		}
		System.out.println("Result : " + sb.toString().trim());
	}

}
