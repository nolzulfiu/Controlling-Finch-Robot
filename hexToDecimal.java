
public class hexToDecimal {

	public static int hexToDecimal(String hexInput) {
	    int decimal = 0;
	    int len = hexInput.length();
	    
	    for (int i = 0; i < len; ++i) {
	        char c = hexInput.charAt(i);
	        int cValue;

	        switch (c) {
	        case '0':
	            cValue = 0;
	            break;
	        case '1':
	            cValue = 1;
	            break;
	        case '2':
	            cValue = 2;
	            break;
	        case '3':
	            cValue = 3;
	            break;
	        case '4':
	            cValue = 4;
	            break;
	        case '5':
	            cValue = 5;
	            break;
	        case '6':
	            cValue = 6;
	            break;
	        case '7':
	            cValue = 7;
	            break;
	        case '8':
	            cValue = 8;
	            break;
	        case '9':
	            cValue = 9;
	            break;
	        case 'A':
	            cValue = 10;
	            break;
	        case 'B':
	            cValue = 11;
	            break;
	        case 'C':
	            cValue = 12;
	            break;
	        case 'D':
	            cValue = 13;
	            break;
	        case 'E':
	            cValue = 14;
	            break;
	        case 'F':
	            cValue = 15;
	            break;	       
	        default: throw new IllegalArgumentException("Non-hex character " + c
	                + " found at position " + i);
	        }
	        decimal = 16 * decimal + cValue;
	    }
	    return decimal;
	}
	}


