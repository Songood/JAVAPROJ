import java.util.Scanner;

public class NUM16 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] str = {"가위", "바위", "보"};
		String me;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			int n=(int)(Math.random()*3);
			System.out.print("가위 바위 보!>>");
			me = scanner.next();
			
			if(me.equals("그만"))
				break;
			
			System.out.print("사용자= "+me+", 컴퓨터= "+str[n]+",");
			if(str[n].equals("가위")){
				if(me.equals("가위"))
					System.out.println("비겼습니다.");
				else if(me.equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				else
					System.out.println("컴퓨터가 이겼습니다.");
			} else if(str[n].equals("바위")) {
				if(me.equals("바위"))
					System.out.println("비겼습니다.");
				else if(me.equals("보"))
					System.out.println("사용자가 이겼습니다.");
				else
					System.out.println("컴퓨터가 이겼습니다.");
				
			}else {
				if(me.equals("보"))
					System.out.println("비겼습니다.");
				else if(me.equals("가위"))
					System.out.println("사용자가 이겼습니다.");
				else
					System.out.println("컴퓨터가 이겼습니다.");
			}
				}
		System.out.println("게임을 종료합니다...");
		
		scanner.close();
					}

	
	}