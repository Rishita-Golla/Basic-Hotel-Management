/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;

import java.io.Serializable;



public class Per implements Serializable {
        
        String first_name;
        String last_name;
        String password;
        String confirmpassword;
        String emailid;
        String destination;
         String adults;
         String children;
         String rooms;
        //String cimonth,ciyear,cidate;
        //String comonth,coyear,codate;
        String checkin;
        String checkout;
        String hotelname;
        double cost;
        
        Per()
        {
            first_name=null;
            last_name=null;
            password=null;
            confirmpassword=null;
            emailid=null;
            destination=null;
            adults=null;
            children=null;
            rooms=null;
            checkin=null;
            checkout=null;
            hotelname=null;
            cost=0;
        }
        
        void signup(String first_name,String last_name,String emailid,String password,String confirmpassword)
        {
            this.first_name=first_name;
            this.last_name=last_name;
            this.emailid=emailid;
            this.password=password;
            this.confirmpassword=confirmpassword;
        }
        
        void homeAdd(String checkIn, String checkOut, String Dest,  String rooms,  String child,  String adult)
        {
            this.checkin=checkIn;
            this.checkout=checkOut;
            this.destination=Dest;
            this.adults=adult;
            this.children=child;
            this.rooms=rooms;
        }
        
        void hotelAdd(String hotelname,double cost)
        {
            this.hotelname=hotelname;
            this.cost=cost;
        }
        
        String getemailid()
        {
            return this.emailid;
        }
    
        String getfirstname()
        {
            return this.first_name;
        }
        
        String getlastname()
        {
            return this.last_name;
        }
        
        String getpassword()
        {
            return this.password;
        }
        
        String getconfirmpassword()
        {
            return this.confirmpassword;
        }
        
        String getDestination()
        {
            return this.destination;
        }
        
        String getRooms()
        {
            return this.rooms;
        }
        
         String getAdults()
        {
            return this.adults;
        }
        
        String getChildren()
        {
            return this.children;
        }
        
        String getCheckIn()
        {
            return this.checkin;
        }
        
        String getCheckOut()
        {
            return this.checkout;
        }
        
        String getHotelName()
        {
            return this.hotelname;
        }
        
        double getCost()
        {
            return this.cost;
        }
}
