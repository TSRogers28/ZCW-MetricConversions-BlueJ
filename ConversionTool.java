public class ConversionTool {
    static final float CM2IN = 0.3937007874f;
    static final float IN2CM = 2.54f;
    static final float FT2MT = 0.3048f;
    static final float MT2FT = 3.280839895f;
    static final float MPH2KPH = 1.609344f;
    static final float KPH2MPH = 0.6213712f;
    
    
    public static void main(String[] args){}

    public static float CelsiusToFahrenheit(float celsius){
        return (celsius * 9) / 5 + 32;
    }

    public static float FahrenheitToCelsius(float fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public static float checkForZeroOrNegative(float input){
        if(input <= 0){
            input = 0;
        }
        return input;
    }
    
    public static float CentimetersToInches(float centimeters){
        centimeters = checkForZeroOrNegative(centimeters);
        return centimeters * CM2IN;
    }

    public static float InchesToCentimeters(float inches){
        inches = checkForZeroOrNegative(inches);
        return inches * IN2CM;
    }

    public static float FeetToMeters(float feet){
        feet = checkForZeroOrNegative(feet);
        return feet * FT2MT;
    }

    public static float MetersToFeet(float meters){
        meters = checkForZeroOrNegative(meters);
        return meters * MT2FT;
    }

    public static float MphToKph(float mph){
        mph = checkForZeroOrNegative(mph);
        return mph * MPH2KPH;
    }

    public static float KphToMph(float kph){
        kph = checkForZeroOrNegative(kph);
        return kph * KPH2MPH;
    }
}
