package AP_Encoder;
import java.util.ArrayList;

public class StringCodeRunner {
	
	public static void main(String[] args)  {

	StringCoder coder = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
	
	ArrayList<StringPart> message = new ArrayList<StringPart>();
	
	
	// Testing part a
	StringPart a = new StringPart(37, 3);
	message.add(a);
	
	a = new StringPart(14, 2);
	message.add(a);
	
	a = new StringPart(46,2);
	message.add(a);
	
	a = new StringPart(9, 2);
	message.add(a);
	
	System.out.println(coder.decodeString(message));
	// output should be overeager
			
	
		
	
	ArrayList<StringPart> message2 = new ArrayList<StringPart>();
	message2 = coder.encodeString("goodjobbuddy");
	System.out.println(coder.decodeString(message2));
	
	
	}
	
}
