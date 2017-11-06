package Exam_05_November_2017.Part_I.Part_I;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;

public class ss {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int securityKey = Integer.parseInt(bufferedReader.readLine());
        int securityToken = 1;

        for (int i = 0; i < n; i++) {
            securityToken *= securityKey;
        }


        List<String> allNames = new LinkedList<>();
        List<BigDecimal> totalLoss = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = bufferedReader.readLine().split(" ");
            String siteName = inputArr[0];

            allNames.add(siteName);

            BigDecimal siteVisits = new BigDecimal(inputArr[1]);
            BigDecimal siteCommercialPricePerVisit = new BigDecimal(inputArr[2]);

            BigDecimal perSite = siteCommercialPricePerVisit.multiply(siteVisits);
            totalLoss.add(perSite);

            allNames.add(siteName);
        }
        System.out.println();
        BigDecimal sum = totalLoss.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        String[] sumStr = sum.toString().split(".");

        DecimalFormat df = new DecimalFormat("#0.00000000000000000000");

        System.out.println("Total Loss: " + df.format(sum));
        System.out.println("Security Token: " + securityToken);

    }
}
//purvata_parola