package com.hack.maze.util;

import com.hack.maze.json.EmployeeDetails;

import java.util.ArrayList;
import java.util.List;

public class LoadDataUtils {

    public static List<EmployeeDetails> load() {

        List<EmployeeDetails> list = new ArrayList<>();

        EmployeeDetails e1 = new EmployeeDetails();
        e1.setName("Katherine Yetta");
        e1.setSsn("20100526345");
        e1.setAmount("139$");
        e1.setDisposalPay("9%/Month");
        e1.setAsOf("01/23/2023");
        e1.setType("Garnish");

        list.add(e1);

        e1 = new EmployeeDetails();
        e1.setName("JACK MILLER");
        e1.setSsn("19000101123");
        e1.setAmount("213$");
        e1.setDisposalPay("5%/Month");
        e1.setAsOf("02/02/2023");
        e1.setType("Garnish");

        list.add(e1);

        e1 = new EmployeeDetails();
        e1.setName("Agnes Irene");
        e1.setSsn("19451212258");
        e1.setAmount("38$");
        e1.setDisposalPay("7%/Month");
        e1.setAsOf("30/04/2023");
        e1.setType("Garnish");

        list.add(e1);

        e1 = new EmployeeDetails();
        e1.setName("Ruth Harriet");
        e1.setSsn("19990729234");
        e1.setAmount("37$");
        e1.setDisposalPay("11%/Month");
        e1.setAsOf("10/05/2023");
        e1.setEmployer("Dutch-Garnishment Support Corporation (Add- 520 5TH AVE, MCKEESPORT PA 15132)");
        e1.setCreditorAgancy("olvers Wage Pvt. Ltd. (Add - 337 BRIGHTSEAT ROAD, LANDOVER MD 20785)");
        e1.setType("Garnish");

        list.add(e1);

        e1 = new EmployeeDetails();
        e1.setName("Helen Ethel");
        e1.setSsn("19590629357");
        e1.setAmount("80$");
        e1.setDisposalPay("4.5%/Month");
        e1.setAsOf("16/06/2023");
        e1.setEmployer("qbc Corporation Pvt Ltd (Add- 177 MAIN STREET, LITTLETON NH 03561)");
        e1.setCreditorAgancy("ybgt Garnishment Pvt Ltd (Add - 202 HARLOW ST, BANGOR ME 04401)\n" +
                "                - contact - Mildred Doris\n" +
                "                - email - ybgt.ga@sfgo.com");
        e1.setType("Garnish");

        list.add(e1);

        e1 = new EmployeeDetails();
        e1.setName("Sadie Marie");
        e1.setSsn("19011212456");
        e1.setAmount("289$");
        e1.setDisposalPay("9.5%/Month");
        e1.setAsOf("03/07/2023");
        e1.setEmployer("Sactions Services Pvt Ltd (Add- 380 WESTMINSTER ST, PROVIDENCE RI 02903)");
        e1.setCreditorAgancy("Garnishment Order xyz Solution pvt. Ltd. (Add - 93 NORTH 9TH STREET, BROOKLYN NY 11211)" +
                " contact - Lucille Vera\n" +
                        "                - email - ssp.solution@sactionservice.com");
        e1.setType("Garnish");

        list.add(e1);

        e1 = new EmployeeDetails();
        e1.setName("Esther Martha");
        e1.setSsn("20050917888");
        e1.setAmount("289$");
        e1.setDisposalPay("0.5%/Month");
        e1.setAsOf("06/21/2023");
        e1.setEmployer("hhhd Corp. Pvt. Ltd (Add- 75 OAK STREET, PATCHOGUE NY 11772)");
        e1.setCreditorAgancy("KJLB-garnishment support Pvt. Ltd (Add - 1 CLINTON AVE, ALBANY NY 12207)\n" +
                "                - contact - Julia Mai\n" +
                "                - email - garnish.support@kjlb.com");
        e1.setType("Garnish");

        list.add(e1);

        return list;

    }
}
