<<<<<<< HEAD
package classtest;

// 상품재고
public class GoodsStock {
    // 속성

    private String goodsCode; // 상품코드(goodsCode) : p1015
    private int stockNum; // 재고 수량(stockNum) : 100개

    // 생성자
    public GoodsStock(String goodsCode, int stockNum) {
        this.goodsCode = goodsCode;
        this.stockNum = stockNum;
    }

    // 기능
    // 재고추가(addStock) / 재고감소(subStock)
    void addStock(int num) {
        stockNum += num;
    }

    int subStock(int num) {
        stockNum -= num;
        return stockNum;
    }

    // 상품코드 반환
    public String getGoodsCode() {
        return goodsCode;
    }

    // 재고수량 반환
    public int getStockNum() {
        return stockNum;
    }
}
=======
package classtest;

// 상품재고
public class GoodsStock {
    // 속성

    private String goodsCode; // 상품코드(goodsCode) : p1015
    private int stockNum; // 재고 수량(stockNum) : 100개

    // 생성자
    public GoodsStock(String goodsCode, int stockNum) {
        this.goodsCode = goodsCode;
        this.stockNum = stockNum;
    }

    // 기능
    // 재고추가(addStock) / 재고감소(subStock)
    void addStock(int num) {
        stockNum += num;
    }

    int subStock(int num) {
        stockNum -= num;
        return stockNum;
    }

    // 상품코드 반환
    public String getGoodsCode() {
        return goodsCode;
    }

    // 재고수량 반환
    public int getStockNum() {
        return stockNum;
    }
}
>>>>>>> 127bf4033bfbbb9b926e7a09d6597aacb616766f
