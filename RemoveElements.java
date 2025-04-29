class RemoveElements{
		public static void main(String ...AS){
			String str = "AatifShaheen";
			char sameChar = 'a';
			int count = 0;
			for(int i = 0; i<str.length(); i++){
				if(str.charAt(i) == sameChar){
					count++;
				}
				System.out.println("...."+sameChar);
			}
			System.out.println("....."+str+".....");
		}
}