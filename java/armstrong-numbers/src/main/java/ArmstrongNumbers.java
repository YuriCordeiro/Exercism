import java.math.BigDecimal;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int numberToCheckLength = String.valueOf(numberToCheck).length();

		if (numberToCheckLength > 1) {
			BigDecimal bdSum = new BigDecimal(0);
			char numberInParts[] = String.valueOf(numberToCheck).toCharArray();
			for (int i = 0; i < numberInParts.length; i++) {
				BigDecimal bdCurrentNumber = new BigDecimal(String.valueOf(numberInParts[i]));
				bdSum = bdSum.add(bdCurrentNumber.pow(numberToCheckLength));
			}
			if (bdSum.equals(new BigDecimal(String.valueOf(numberToCheck)))) {
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}

	}

}
