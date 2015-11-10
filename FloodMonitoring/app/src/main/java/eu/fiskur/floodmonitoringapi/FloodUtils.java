package eu.fiskur.floodmonitoringapi;

import android.app.Service;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class FloodUtils {
    public static String[] counties = new String[]{
            "Avon",
            "Bedfordshire",
            "Berkshire",
            "Borders",
            "Buckinghamshire",
            "Cambridgeshire",
            "Central",
            "Cheshire",
            "Cleveland",
            "Clwyd",
            "Cornwall",
            "County Antrim",
            "County Armagh",
            "County Down",
            "County Fermanagh",
            "County Londonderry",
            "County Tyrone",
            "Cumbria",
            "Derbyshire",
            "Devon",
            "Dorset",
            "Dumfries and Galloway",
            "Durham",
            "Dyfed",
            "East Sussex",
            "Essex",
            "Fife",
            "Gloucestershire",
            "Grampian",
            "Greater Manchester",
            "Gwent",
            "Gwynedd County",
            "Hampshire",
            "Herefordshire",
            "Hertfordshire",
            "Highlands and Islands",
            "Humberside",
            "Isle of Wight",
            "Kent",
            "Lancashire",
            "Leicestershire",
            "Lincolnshire",
            "Lothian",
            "Merseyside",
            "Mid Glamorgan",
            "Norfolk",
            "North Yorkshire",
            "Northamptonshire",
            "Northumberland",
            "Nottinghamshire",
            "Oxfordshire",
            "Powys",
            "Rutland",
            "Shropshire",
            "Somerset",
            "South Glamorgan",
            "South Yorkshire",
            "Staffordshire",
            "Strathclyde",
            "Suffolk",
            "Surrey",
            "Tayside",
            "Tyne and Wear",
            "Warwickshire",
            "West Glamorgan",
            "West Midlands",
            "West Sussex",
            "West Yorkshire",
            "Wiltshire",
            "Worcestershire"
    };

    public static void hideKeyboard(Context context, EditText view){
        InputMethodManager imm = (InputMethodManager)context.getSystemService(Service.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}