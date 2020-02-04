
public class DecimalToBinary {

	public static int DecimalToBinary (int decimal){
	
	int base = 2;
	int result = 0;
	int multiplier = 1;
	
	while (decimal > 0)
	{
		int remainder = decimal % base;
		decimal = decimal / base;
		result = result + remainder * multiplier;
		multiplier = multiplier * 10;
	}
	return result;
   }
}