//package EX;
//
//public class Temp {
//	//함수 생성
//	//위에 만든 새 부모클래스로 매개변수로 받고
//	 public void checkBirdType(Bird bird) {
//	     if (bird instanceof Penguin) {
//	    	 //맞는 자식클래스로 강제 캐스팅
//	    	 Penguin penguin = (Penguin) bird;
//	    	 //자식클래스 함수 실행
//	    	 System.out.println(penguin.toString());
//	     
//		 }
//	}
//	 //매개변수 인터페이스 사용
//	 public void ifCPrint(Birdif birdif) {
//		 System.out.println("Bird ?" + (birdif instanceof Bird));
//		 //인터페이스 안에 구현체의 인스턴스 주소에 가서 Bird 확인
//		 if (birdif instanceof Bird) {
//			 //버드타입 강제 캐스팅을 해서 넣음
//			 Bird bird = (Bird) birdif;
//			 //버드안에 함수 사용
//			 bird.eatPrint1();
//		 }
//	 }
//}
//
