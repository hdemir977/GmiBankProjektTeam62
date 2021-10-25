package gmiBank.com.utilities;

import gmiBank.com.pojos.Country6;
import gmiBank.com.pojos.Customer6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxtUS20 {
    public static List<Customer6> returnCustomer(String filePath){
        List<Customer6>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(ConfigReader.getProperty(filePath)))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                Customer6 customer = new Customer6();
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                String [] each = line.split(",");
                customer.setFirstName(each[0]);
                customer.setLastName(each[1]);
                customer.setSsn(each[2]);
                all.add(customer);
            }
            String everything = sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnCustomerList(String filePath){
        List<String >all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int i = 0;
            while (line != null) {
                Customer6 customer = new Customer6();

                customer.setFirstName(line.split(",")[0]);
                customer.setLastName(line.split(",")[1]);
                customer.setSsn(line.split(",")[2]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(customer.getFirstName()+ ","+customer.getLastName()+","+customer.getSsn());
                        }
            String everything = sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(all);
        return all;
    }


    public static List<Customer6> returnCustomerSNN(String filePath){
        List<Customer6>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Customer6 customer = new Customer6();
                customer.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(customer);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
    public static List<Customer6> readTxtData(String filePath)throws  Exception{
        List<Customer6> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            Customer6 customer = new Customer6();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
//                customer.setSsn(line);
            }
            String everything = sb.toString();
            customer.setSsn(everything);
            list.add(customer);
        } finally {
            br.close();
        }
        return list;
    }
//    public static List<States> returnAllStates(String filePath){
//        List<States>all = new ArrayList<>();
//        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//            System.out.println(line);
//            int i = 0;
//            while (line != null) {
//                States state = new States();
//                String [] allLine = line.split(",");
//                int id = Integer.parseInt(allLine[1].trim());
//                state.setId(id);
//                state.setName(allLine[0]);
//                sb.append(System.lineSeparator());
//                line = br.readLine();
//                System.out.println(i++);
//                all.add(state);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return all;
//    }
    public static List<String> returnCustomerSNNList(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Customer6 customer = new Customer6();
                customer.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(customer.getSsn());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }
//    public static List<States> returnAllStates2(String filePath){
//        List<States>all = new ArrayList<>();
//        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//            System.out.println(line);
//            int i = 0;
//            while (line != null) {
//                States states = new States();
//                states.setName(line.split(",")[0].trim());
//                states.setId(Integer.parseInt(line.split(",")[1].trim()));
//                sb.append(System.lineSeparator());
//                line = br.readLine();
//                System.out.println(i++);
//                all.add(states);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return all;
//    }
    public static List<String> returnAllStates3(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                String temp = "";
                temp =line.split(",")[0].trim();
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(temp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }


    public static List<String> returnCountryIdList(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Customer6 customer = new Customer6();
                customer.setSsn(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(customer.getSsn());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnCountryNameList(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Country6 country5 = new Country6();
                country5.setName(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(country5.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnCountry5IdList(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Country6 country5 = new Country6();
                country5.setId(Integer.parseInt(line.split(",")[0]));
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(String.valueOf(country5.getId()));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> returnCountry6IdList(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Country6 country6 = new Country6();
                country6.setId(Integer.parseInt(line.split(",")[0]));
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);
                all.add(String.valueOf(country6.getId()));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }


}
