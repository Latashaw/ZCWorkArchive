package watson.latasha.wtfCurrency;

/**
 * Created by latashawatson on 1/12/17.
 */
public class Converter {

    public static void main(String[] args) {

    System.out.println("Welcome to WTF!");
    public double convertDollarToEuro ( double dollar){
            return dollar * ExchangeRates.euro;
        }

    public double convertEuroToDollar(double euro) {
        double rate = ExchangeRates.usDollar - ExchangeRates.euro + ExchangeRates.usDollar;
        return euro * rate;
    }

    public double convertEuroBritishPound(double euro) {
        return euro * .87;
    }

    public double convertBritishPoundToRupee(double britishpound) {
        return britishpound * 82.9;
    }

    public double convertRupeeToCanadianDollar(double rupee) {
        return rupee * 82.9;
    }

    public double convertCanadianDollarToSingaporeDollar(double canadiandollar) {
        return canadiandollar * 1.08;
    }

    public double convertSingaporeDollarToSwissFranc(double singaporedollar) {
        return singaporedollar * .71;
    }

    public double convertSwissFrancToMalaysian

    Ringgit(double swissfranc) {
        return swissfranc * 4.41;
    }

    public double convertMalaysianRinggitToJapaneseYen(double malaysianringgit) {
        return malaysianringgit * 25.78;
    }

    public double ConvertJapaneseYenToChineseYuanRenminbi(double japaneseyen) {
        return japaneseyen * 0.0601501;
    }
}
}