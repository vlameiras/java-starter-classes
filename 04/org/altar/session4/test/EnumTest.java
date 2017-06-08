package org.altar.session4.test;

class EnumTest{
	public static void main(String[] args) {
		EpicEnum myEnum = EpicEnum.STAR_TREK;
		
		// switch example
		switch(myEnum){
		case STAR_TREK:
			System.out.println("That is correct");
			break;
		case STAR_WARS:
		case DUNE:
		case BATTLESTAR_GALACTICA:
			System.out.println("Also very very good");
			break;
		default:
			System.out.println("This is not sci-fi");
			break;
		}
		
		// IF
		if(myEnum == EpicEnum.STAR_TREK){
			System.out.println("Enums can be compared with == operator");
		}
		
		// Iterate all Enum elements
		for(EpicEnum itEnum : EpicEnum.values()){
			System.out.println(itEnum);
		}
	}
}