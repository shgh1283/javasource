<<<<<<< HEAD
package shop;

import java.util.Scanner;

public class MyShop implements IShop {

    private String title;
    // User 배열 생성
    User users[] = new User[2];

    // 상품 배열 생성
    Product products[] = new Product[5];

    Scanner sc = new Scanner(System.in);
    // 선택된 user 담기
    private int selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // User 2명을 생성 후 users 배령 담기
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);
    }

    @Override
    public void genProduct() {
        // CellPhone, SamrtTv 5개 생성 후 products 배열 담기
        products[0] = new CellPhone("아이폰13", 1500000, "KT");
        products[1] = new CellPhone("갤럭시 노트13", 1000000, "SKT");
        products[2] = new CellPhone("갤럭시 z 플립", 1300000, "LG");
        products[3] = new SmartTv("삼성 울트라HD", 1800000, "4K");
        products[4] = new SmartTv("LG 스마트", 1400000, "1080p");
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
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.printf("[%d]%s(%s)\n", i + 1, users[i].getName(), users[i].getPayType());

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

    Product cart[] = new Product[10];

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
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                for (int j = 0; j < cart.length; j++) {
                    if (cart[j] == null) {
                        cart[j] = products[Integer.parseInt(input) - 1];
                        break;
                    }
                }
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
        System.out.println(title + "-" + users[selUser].getName() + "사용자 이름" + " : 체크아웃");
        System.out.println("========================");
        int i = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d]%s (%d)\n", i++, product.getpName(), product.getPrice());
            }
        }
        // 결제 방법 : CARD or CASH
        int sum = 0;
        for (Product product : cart) {
            if (product != null) {

                System.out.printf("[%d]%s(%d)\n ", i++, users[selUser].getPayType(), product.getPrice());
                sum += product.getPrice();
            }
        }
        // 합계 : 카트에 담긴 물건
        System.out.println("결제 방법 : " + users[selUser].getPayType());
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
=======
package shop;

import java.util.Scanner;

public class MyShop implements IShop {

    private String title;
    // User 배열 생성
    User users[] = new User[2];

    // 상품 배열 생성
    Product products[] = new Product[5];

    Scanner sc = new Scanner(System.in);
    // 선택된 user 담기
    private int selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // User 2명을 생성 후 users 배령 담기
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);
    }

    @Override
    public void genProduct() {
        // CellPhone, SamrtTv 5개 생성 후 products 배열 담기
        products[0] = new CellPhone("아이폰13", 1500000, "KT");
        products[1] = new CellPhone("갤럭시 노트13", 1000000, "SKT");
        products[2] = new CellPhone("갤럭시 z 플립", 1300000, "LG");
        products[3] = new SmartTv("삼성 울트라HD", 1800000, "4K");
        products[4] = new SmartTv("LG 스마트", 1400000, "1080p");
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
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.printf("[%d]%s(%s)\n", i + 1, users[i].getName(), users[i].getPayType());

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

    Product cart[] = new Product[10];

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
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                for (int j = 0; j < cart.length; j++) {
                    if (cart[j] == null) {
                        cart[j] = products[Integer.parseInt(input) - 1];
                        break;
                    }
                }
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
        System.out.println(title + "-" + users[selUser].getName() + "사용자 이름" + " : 체크아웃");
        System.out.println("========================");
        int i = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d]%s (%d)\n", i++, product.getpName(), product.getPrice());
            }
        }
        // 결제 방법 : CARD or CASH
        int sum = 0;
        for (Product product : cart) {
            if (product != null) {

                System.out.printf("[%d]%s(%d)\n ", i++, users[selUser].getPayType(), product.getPrice());
                sum += product.getPrice();
            }
        }
        // 합계 : 카트에 담긴 물건
        System.out.println("결제 방법 : " + users[selUser].getPayType());
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
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
