public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(){;}
    public Stock(String symbol,String name){
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
        return (currentPrice-previousClosingPrice)/previousClosingPrice*100;
    }

    public static void main(String[] args){
        Stock s = new Stock("ORCL","Oracle");
        s.previousClosingPrice = 34.5;
        s.currentPrice = 34.35;
        System.out.printf("股票%s市值变化百分比为：百分之%.2f",s.name,s.getChangePercent());
    }
}
