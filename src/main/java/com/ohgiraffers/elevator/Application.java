package com.ohgiraffers.elevator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        User user = new User();

        Scanner sc = new Scanner(System.in);





//        System.out.print("현재 층수를 입력하세요 : ");
//        int userLayerN = sc.nextInt();
//        user.inputLayer(userLayerN);  // 현재 층수와 엘리베이터가 있는 층수를 비교하여 사용자가 있는 층으로 이동
//        user.inputOpen();               // 문을 연다
//        System.out.print("이동하고 싶은 층수를 입력하세요 : ");
//        int moveLayerN = sc.nextInt();
//        user.moveLayer(moveLayerN);
//        user.arrive(moveLayerN);

        while(true) {
            System.out.print("현재 층수를 입력하세요 : ");
            int userLayerN = sc.nextInt();
            if (userLayerN > 0 && userLayerN <= 20) {
                user.inputLayer(userLayerN);
                System.out.println("엘리베이터의 문을 여시겠습니까? ");
                System.out.print("1. Yes   2. No  : ");
                int yesOrNo = sc.nextInt();
                switch (yesOrNo) {
                    case 1 : user.inputOpen(); break;              // 문을 연다
                    case 2 :
                        System.out.println("안녕히가세요~"); break;
                    default: System.out.println("엘리베이터 이용을 종료합니다."); break;
                }
                System.out.print("이동하고 싶은 층수를 입력하세요 : ");
                int moveLayerN = sc.nextInt();
                user.moveLayer(moveLayerN);
                user.arrive(moveLayerN);
                user.inputOpen();
                break;

            } else {
                System.out.println("이 건물은 1층부터 20층까지 있습니다. 다시 입력 바랍니다.");
            }

        }


    }
}
