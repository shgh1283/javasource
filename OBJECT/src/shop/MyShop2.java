package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {

    private String title;
    // User 리스트 생성
    List<User> users = new ArrayList<>();

    // 상품 리스트 생성
    List<Product> products = new ArrayList<>();

    // cart 리스트 생성
    List<Product> cart = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    // 선택된 user 담기
    private int selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // User 2명을 생성 후 users 배열 담기
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("성춘향", PayType.CASH));
    }

    @Override
    public void genProduct() {
        // CellPhone, SamrtTv 5개 생성 후 products 배열 담기
        products.add(new CellPhone("아이폰13", 1500000, "KT"));
        products.add(new CellPhone("갤럭시 노트13", 1000000, "SKT"));
        products.add(new CellPhone("갤럭시 z 플립", 1300000, "LG"));
        products.add(new SmartTv("삼성 울트라HD", 1800000, "4K"));
        products.add(new SmartTv("LG 스마트", 1400000, "1080p"));
    }

    @Override
    public void start() {
        // 출력
        // MyShop : 메인화면 - 계정선택
        // ============================
        // [1] 홍길동(CARD)
        // [2] 성춘향(CASH)
        // 선택
        System.out.println(title + " 메인 화면 - 계정 선택");
        System.out.println("============================");
        for (int i = 0; i < users.size(); i++) {
            if (users != null) {
                System.out.printf("[%d]%s(%s)\n", i + 1, users.get(i).getName(), users.get(i).getPayType());

            }
        }
        System.out.println("[X] 종료");
        System.out.println(" 번호를 선택하세요.");
        String input = sc.nextLine();

        switch (input) {
            case "1":
            case "2":
                // 배열 인덱스와 동일하도록 -1
                selUser = Integer.parseInt(input) - 1;
                productList();
                break;
            case "X":
            case "x":
                System.exit(0);
                break;
            default:
                System.out.println("입력을 확인해주세요");
                start();
                ;
                break;
        }

    }

    public void productList() {
        // 출력
        // MyShop : 메인화면 - 계정선택
        // ============================
        // [1] 상품 보여주기
        // [2] 상품 보여주기
        // [3] ~ [5]
        // [h] 메인화면
        // [c]
        // 선택
        System.out.println(title + " 상품목록 - 상품 선택");
        System.out.println("============================");

        int i = 1;

        for (Product product : products) {
            System.out.printf("[%d]", i++);
            product.printDetail();
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("[X] 종료");
        System.out.println("선택 >>");

        String input = sc.nextLine();
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":

                int no = Integer.parseInt(input);
                cart.add(products.get(no));
                productList();

                break;
            case "h":
                start();
                break;
            case "c":
                checkOut();

                break;
            default:
                System.out.println(" 입력을 확인해주세요. ");
                productList();
                break;
        }

        // 메뉴 받기
        // 0~4 or h or c
        // h : 메인화면 - 계정선택 호출
        // c : checkOut();
        // 0~4 : cart에 담기
    }

    public void checkOut() {

        // cart 화면 출력
        System.out.println();
        System.out.println(title + "-" + users.get(selUser).getName() + " 사용자 이름" + " : 체크아웃");
        System.out.println("========================");
        int i = 0, sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d]%s (%d)\n", i++, product.getpName(), product.getPrice());
            }
        }
        // 결제 방법 : CARD or CASH

        for (Product product : cart) {
            if (product != null) {

                System.out.printf("[%d]%s(%d)\n ", i++, users.get(selUser).getPayType(), product.getPrice());
                sum += product.getPrice();
            }
        }
        // 합계 : 카트에 담긴 물건
        System.out.println("결제 방법 : " + users.get(selUser).getPayType());
        // [p] 이전
        System.out.println("[p] 이전");
        // [q] 결제완료
        System.out.println("[q] 결제 완료");
        // 입력값에 따라
        String input = sc.nextLine();
        switch (input) {
            case "p":
                productList();
                break;
            case "q":
                System.exit(0);
                break;

            default:
                System.out.println("입력값을 확인해주세요.");
                break;
        }
    }

}
