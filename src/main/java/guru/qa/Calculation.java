package guru.qa;

public class Calculation {
    public static void main(String[] args) {

        // 0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int aInt = 5;
        int bInt = 2;
        int arithmeticResult = (aInt + bInt) + (aInt * bInt) / (aInt - bInt);
        System.out.println("0)  (aInt + bInt) + (aInt * bInt) / (aInt - bInt) = " + arithmeticResult);

        // 1) применить несколько арифметических операций над int и double в одном выражении
        double cDouble = 4.0;
        double intDoubleResult = (cDouble - aInt) * cDouble / aInt;
        System.out.println("1) (cDouble - aInt) * cDouble / aInt = " + intDoubleResult);

        // 2) применить несколько логических операций ( < , >, >=, <= )
        boolean lessThan = bInt < aInt;
        boolean greaterThan = cDouble > bInt;
        boolean greaterThanOrEqualTo = bInt >= aInt;
        boolean lessThanOrEqualTo = cDouble <= aInt;
        System.out.println("2) bInt < aInt = " + lessThan);
        System.out.println("2) cDouble > bInt = " + greaterThan);
        System.out.println("2) bInt >= aInt = " + greaterThanOrEqualTo);
        System.out.println("2) cDouble <= aInt = " + lessThanOrEqualTo);

        // 3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение
        System.out.println("3) Float.MIN_VALUE  = " + Float.MIN_VALUE);
        System.out.println("3) Float.MAX_VALUE  = " + Float.MAX_VALUE);
        System.out.println("3) Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("3) Double.MAX_VALUE = " + Double.MAX_VALUE);

        // 4) получить переполнение при арифметической операции
        int overflowedInt = Integer.MAX_VALUE + 1;
        System.out.println("4) Integer.MAX_VALUE + 1 = " + overflowedInt);

        double overflowedDouble = Double.MAX_VALUE * 3;
        System.out.println("4) Double.MAX_VALUE * 3 = " + overflowedDouble);
    }
}