import java.util.Scanner;

public class ReadNumToWord {
    public static String readSingleDigitNum(int n) {
        String str = "";

        switch (n) {
            case 0:
                str = "zero";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
        }
        return str;
    }

    public static String readTwoDigitNumLessThan20(int n) {
        String str = "";
        switch (n) {
            case 10:
                str = "ten";
                break;
            case 11:
                str = "eleven";
                break;
            case 12:
                str = "twelve";
                break;
            case 13:
                str = "thirteen";
                break;
            case 14:
                str = "fourteen";
                break;
            case 15:
                str = "fifteen";
                break;
            case 16:
                str = "sixteen";
                break;
            case 17:
                str = "seventeen";
                break;
            case 18:
                str = "eighteen";
                break;
            case 19:
                str = "nineteen";
                break;
        }
        return str;
    }

    public static String readTwoDigitNumFrom20(int n) {
        int tens, ones;
        String str = "";

        tens = n / 10;
        ones = n % 10;

        switch (tens) {
            case 2:
                str = "twenty";
                break;
            case 3:
                str = "thirty";
                break;
            case 4:
                str = "forty";
                break;
            case 5:
                str = "fifty";
                break;
            case 6:
                str = "sixty";
                break;
            case 7:
                str = "seventy";
                break;
            case 8:
                str = "eighty";
                break;
            case 9:
                str = "ninety";
                break;
        }
        if (ones != 0) {
            str = str + " " + readSingleDigitNum(ones);
        }
        return str;
    }

    public static String readThreeDigitNum(int n) {

        int hundred, lastTwoDigits;
        String str = "";

        hundred = n / 100;
        lastTwoDigits = n % 100;

        if(lastTwoDigits == 0){
            str = "one hudred";
        }else if (lastTwoDigits >= 20) {
            str = readSingleDigitNum(hundred) + " hundred and " + readTwoDigitNumFrom20(lastTwoDigits);
        } else if (lastTwoDigits >= 10) {
            str = readSingleDigitNum(hundred) + " hundred and " + readTwoDigitNumLessThan20(lastTwoDigits);
        } else {
            str = readSingleDigitNum(hundred) + " hundred and " + readSingleDigitNum(lastTwoDigits);
        }
        return str;
    }

    public static void main(String[] args) {

        System.out.println("Nhap vao 1 so: ");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        //int num = Integer.parseInt(str);

        try{
            int num = Integer.parseInt(str);

        String numStr = "";

        if (num < 0) {
            num = num * -1;
            numStr = "minus ";
        }

        if (num < 11) {
            numStr = numStr + readSingleDigitNum(num);
        } else if (num < 20) {
            numStr = numStr + readTwoDigitNumLessThan20(num);
        } else if (num < 100) {
            numStr = numStr + readTwoDigitNumFrom20(num);
        } else if (num < 1000) {
            numStr = numStr + readThreeDigitNum(num);
        } else {
            numStr = "Can't read!!!";
        }

        System.out.println(numStr);

        }
        catch (NumberFormatException ex){
            System.out.println("Ban chua nhap vao 1 so");
        }
    }
}
