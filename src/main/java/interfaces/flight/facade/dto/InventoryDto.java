/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.flight.facade.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ajadriano
 */
public class InventoryDto {
    private final String date;
    private final String flightNumber;
    private final int businessSeatCount;
    private final int economySeatCount;
    
    public InventoryDto(String date,
                    String flightNumber,
                    int businessSeatCount,
                    int economySeatCount) {
        this.date = date;
        this.flightNumber = flightNumber;
        this.businessSeatCount = businessSeatCount;
        this.economySeatCount = economySeatCount;                
    }
    
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * @return the businessSeatCount
     */
    public int getBusinessSeatCount() {
        return businessSeatCount;
    }

    /**
     * @return the economySeatCount
     */
    public int getEconomySeatCount() {
        return economySeatCount;
    }
    
    
}
