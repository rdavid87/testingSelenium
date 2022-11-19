package com.dh.parcial.Reports;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.relevantcodes.extentreports.ExtentReports;


public class ExtentReport {

    public static ExtentReports getIntance() {
        Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmm");
        String fechaTexto = formatter.format(fecha);
        String Path = ("target/Reportes/"+fechaTexto+".html");
        ExtentReports extent = new ExtentReports(Path,false);
        return extent;
    }
}