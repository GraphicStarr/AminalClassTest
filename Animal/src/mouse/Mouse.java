package mouse;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		* A Mouse is an Animal but all Animals are not a Mouse
		*/
		class Mouse extends Animal {

		public Mouse()
		{
		System.out.println("Now I am a Mouse!");
		}

		@Override
		public String sleep() {
			return "A Mouse sleeps...";
		}

		@Override
		public String eat() {
			return "A Mouse eats...";
		}

		public String squeak(){
			return "Squeak!";
		}

		}
	}
}
	