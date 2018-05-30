public class ConversionTool {
    enum metrics{}

    

    public static void main(String[] args){}

    public static float CelsiusToFahrenheit(float celsius){
        return (celsius * 9) / 5 + 32;
    }

    public static float FahrenheitToCelsius(float fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public static float CentimetersToInches(float centimeters){
        float CM2IN =  0.3937007874f;
        if(centimeters <= 0f){
            return 0;
        }
        else
        return centimeters * CM2IN;
    }

    public static float InchesToCentimeters(float inches){
        float IN2CM =  2.54f;
        if(inches <= 0){
            return 0;
        }
        else
        return inches * IN2CM;
    }

    public static float FeetToMeters(float feet){
        float FT2MT =   0.3048f;
        if(feet <= 0){
            return 0;
        }
        else
        return feet * FT2MT;
    }

    public static float MetersToFeet(float meters){
        float MT2FT = (float) 3.280839895f;
        if(meters <= 0){
            return 0;
        }
        else
        return meters * MT2FT;
    }

    public static float MphToKph(float mph){
        float MPH2KPH = 1.609344f;
        if(mph <= 0){
            return 0;
        }
        else
        return mph * MPH2KPH;
    }

    public static float KphToMph(float kph){
        float KPH2MPH = 0.6213711922f;
        if(kph <= 0){
            return 0;
        }
        else
        return kph * KPH2MPH;
    }
}
