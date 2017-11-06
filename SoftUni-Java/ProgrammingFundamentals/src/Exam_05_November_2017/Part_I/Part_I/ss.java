package Exam_05_November_2017.Part_I.Part_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ss {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        BigInteger securityKey = new BigInteger(bufferedReader.readLine());

        BigInteger securityToken = securityKey.pow(n);

        List<BigDecimal> totalLoss = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = bufferedReader.readLine().split(" ");
            String siteName = inputArr[0];


            BigDecimal siteVisits = new BigDecimal(inputArr[1]);
            BigDecimal siteCommercialPricePerVisit = new BigDecimal(inputArr[2]);

            BigDecimal perSite = siteCommercialPricePerVisit.multiply(siteVisits);
            totalLoss.add(perSite);

            System.out.println(siteName);
        }
        BigDecimal sum = totalLoss.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        DecimalFormat df = new DecimalFormat("#0.00000000000000000000");

        System.out.println("Total Loss: " + df.format(sum));
        System.out.println("Security Token: " + securityToken);

    }
}
//purvata_parola