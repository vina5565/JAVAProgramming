abstract class Printer {
    String model;        // 모델명
    int printedCount;    // 지금까지 출력한 매수
    int availableCount;  // 앞으로 출력 가능한 매수

    public Printer(String model, int availableCount) {
        this.model = model;
        this.printedCount = 0;
        this.availableCount = availableCount;
    }

    public abstract boolean print();
}

// 잉크젯 프린터
class InkjetPrinter extends Printer {

    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        if (availableCount == 0) {
            int tryCount = printedCount + 1;  // xx매 = 이전까지 출력 + 1
            System.out.println(model + ": " + tryCount + "매째 인쇄 실패 -잉크 부족.");
            return false;
        }
        printedCount++;
        availableCount--;
        return true;
    }
}

// 레이저 프린터
class LaserPrinter extends Printer {

    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        if (availableCount == 0) {
            int tryCount = printedCount + 1;  // xx매 = 이전까지 출력 + 1
            System.out.println(model + ": " + tryCount + "매째 인쇄 실패 -토너 부족.");
            return false;
        }
        printedCount++;
        availableCount--;
        return true;
    }
}

public class homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while(laser.print());
    }
}
