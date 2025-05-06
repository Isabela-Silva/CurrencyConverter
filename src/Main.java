import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String response = " ";
        Scanner scanner = new Scanner(System.in);

        while (!response.equals("sair")) {

            System.out.println("Escolha uma opção:\n" +
                    "(1) - real brasileiro -> dólar\n" +
                    "(2) - dólar -> real brasileiro\n" +
                    "(3) - dólar -> argentina\n" +
                    "(4) - argentina -> dólar\n" +
                    "(5) - real brasileiro -> euro\n" +
                    "(6) - dólar -> euro\n" +
                    "Digite 'sair' para encerrar.");
            response = scanner.nextLine();

            switch (response) {
                case "1":
                    System.out.println("Convertendo de BRL para USD...");
                    System.out.println("Digite o valor em BRL: ");
                    double userValue = scanner.nextDouble();
                    scanner.nextLine();

                    ApiRequestService apiService = new ApiRequestService();
                    CurrencyData convertionRates = apiService.fetchConvertionRates("BRL");

                    double rateValue = convertionRates.conversion_rates().get("USD");
                    CurrencyConverter currencyConverter = new CurrencyConverter();
                    double rateTotal = currencyConverter.calculateConvertion(userValue, rateValue);
                    System.out.println("Resultado: " + rateTotal);
                    break;

                case "2":
                    System.out.println("Convertendo de USD para BRL...");
                    System.out.println("Digite o valor em USD: ");
                    userValue = scanner.nextDouble();
                    scanner.nextLine();

                    apiService = new ApiRequestService();
                    convertionRates = apiService.fetchConvertionRates("USD");

                    rateValue = convertionRates.conversion_rates().get("BRL");
                    currencyConverter = new CurrencyConverter();
                    rateTotal = currencyConverter.calculateConvertion(userValue, rateValue);
                    System.out.println("Resultado: " + rateTotal);
                    break;

                case "3":
                    System.out.println("Convertendo de USD para ARS...");
                    System.out.println("Digite o valor em USD: ");
                    userValue = scanner.nextDouble();
                    scanner.nextLine();

                    apiService = new ApiRequestService();
                    convertionRates = apiService.fetchConvertionRates("USD");

                    rateValue = convertionRates.conversion_rates().get("ARS");
                    currencyConverter = new CurrencyConverter();
                    rateTotal = currencyConverter.calculateConvertion(userValue, rateValue);
                    System.out.println("Resultado: " + rateTotal);
                    break;

                case "4":
                    System.out.println("Convertendo de ARS para USD...");
                    System.out.println("Digite o valor em ARS: ");
                    userValue = scanner.nextDouble();
                    scanner.nextLine();

                    apiService = new ApiRequestService();
                    convertionRates = apiService.fetchConvertionRates("ARS");

                    rateValue = convertionRates.conversion_rates().get("USD");
                    currencyConverter = new CurrencyConverter();
                    rateTotal = currencyConverter.calculateConvertion(userValue, rateValue);
                    System.out.println("Resultado: " + rateTotal);
                    break;

                case "5":
                    System.out.println("Convertendo de BRL para EUR...");
                    System.out.println("Digite o valor em BRL: ");
                    userValue = scanner.nextDouble();
                    scanner.nextLine();

                    apiService = new ApiRequestService();
                    convertionRates = apiService.fetchConvertionRates("BRL");

                    rateValue = convertionRates.conversion_rates().get("EUR");
                    currencyConverter = new CurrencyConverter();
                    rateTotal = currencyConverter.calculateConvertion(userValue, rateValue);
                    System.out.println("Resultado: " + rateTotal);
                    break;

                case "6":
                    System.out.println("Convertendo de USD para EUR...");
                    System.out.println("Digite o valor em USD: ");
                    userValue = scanner.nextDouble();
                    scanner.nextLine();

                    apiService = new ApiRequestService();
                    convertionRates = apiService.fetchConvertionRates("USD");

                    rateValue = convertionRates.conversion_rates().get("EUR");
                    currencyConverter = new CurrencyConverter();
                    rateTotal = currencyConverter.calculateConvertion(userValue, rateValue);
                    System.out.println("Resultado: " + rateTotal);
                    break;

                case "sair":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
