package gmiBank.com.stepDefinitions;

import gmiBank.com.pojos.CustomerRole;
import gmiBank.com.pojos.States06;
import gmiBank.com.utilities.PDFGenerator;
import io.cucumber.java.en.And;

import java.util.ArrayList;
import java.util.List;

import static gmiBank.com.utilities.DatabaseUtility.getQueryResultList;
import static gmiBank.com.utilities.PDFGenerator.pdfGeneratorRowsAndCellsWithListLast20;

public class US_030_StepDefs {

    @And("pdf user provides the query {string}")
    public void pdfUserProvidesTheQuery(String query) {

        List<States06> states06List= new ArrayList<>();
        List<List<Object>> list= getQueryResultList(query);

        for (int i = 0; i < 33; i++) {
            States06 states06=new States06();
            states06.setId(Integer.parseInt(list.get(i).get(0).toString()));
            states06.setName(list.get(i).get(1).toString());
        //   states06.setTpcountry(list.get(i).get(2).toString());
            states06List.add(states06);

        }

        PDFGenerator.pdfGeneratorRowsAndCellsWithListFirstToThirtyStates("      *** Team62 PdfGenerator ***\n          "+
                "                                ( first 30 state's ids and names info )           ",states06List,"team62_states.pdf");

//
//        List<CustomerRole> customerRoleList= new ArrayList<>();
//
//        List<List<Object>> list= getQueryResultList(query);
//
//        for (int i = 0; i < 30; i++) {
//
//            CustomerRole customer=new CustomerRole();
//
//            customer.setFirstName(list.get(i).get(1).toString());
//            customer.setLastName(list.get(i).get(2).toString());
//        //    customer.setSsn(list.get(i).get(11).toString());
//            customer.setCity(list.get(i).get(10).toString());
//            customer.setEmail(list.get(i).get(5).toString());
//            customer.setZipCode(list.get(i).get(8).toString());
//          //  customer.setMiddleInitial(list.get(i).get(3).toString());
//
//            customerRoleList.add(customer);

        }




   //     PDFGenerator.pdfGeneratorRowsAndCellsWithList("Team62",customerRoleList,"list.pdf");


//        pdfGeneratorRowsAndCellsWithListLast20("                  ========== TEAM 62 ========= \n              "+
//                          "         ======== first 30 Users' info as firstName, Lastname ======           ",
//                   customerRoleList,"team62.pdf");

    }

