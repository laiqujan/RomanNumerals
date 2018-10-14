
public class RomanNumerals {

	public int convertToInteger(String str) {
		int result = 0;	
		if(str==null||str.isEmpty()||!(isValid(str))){
			return 0;
		}
		else{
		for (int i = 0; i < str.length(); i++){
			
			int s1 = getIntegerValue(str.charAt(i));
			if (i + 1 < str.length()){
				
				int s2 = getIntegerValue(str.charAt(i + 1));
				if (s1 >= s2){
					result = result + s1;
				} else 
				{
					result = result + s2 - s1;
					i++; 
				}
			} else {
				result = result + s1;
				i++;
			}
		}
		}
		return result;

	}

	public int getIntegerValue(char r) {
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}
	public boolean isValid(String str){
		if(str.matches("IIII")||str.matches("XXXX")||str.matches("CCCC")||str.matches("MMMM")){
			return false;
		}
		if(str.matches("DD")||str.matches("LL")||str.matches("VV")){
			return false;
		}
		return true;
	}

}
