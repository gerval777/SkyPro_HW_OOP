package Transport;

public class ValidateUtils {
    public static String validateDefault(String value) {
        return (value == null || value.isBlank() || value.isEmpty()) ? "Некорректные данные" : value;
    }
    public static Integer validateNumber(Integer value) {
        return (value == null || value <= 0) ? 999999 : value;
    }
    public static Boolean validateBoolean(Boolean value) {
        return value != null && value;
    }
}
