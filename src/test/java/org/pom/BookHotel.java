package org.pom;

import org.openqa.selenium.WebElement;

public class BookHotel extends Baseclass
{
public static void main(String[] args) throws Throwable {
configBrowser();
launchUrl("https://adactinhotelapp.com/");
maximize();
AdactinHotel login=new AdactinHotel();
type(login.getTxtUsername(),  "parkavip");
type(login.getTxtpass(), "O7D6EW");
click(login.getBtnlogin());

SearchHotel search=new SearchHotel();
selectByIndex(search.getSelectLocation(), 2);
selectByIndex(search. getSelectHotel(),2);
selectByIndex(search.getSelectRoom(), 2);
selectByIndex(search.getSelectNumber(), 2);
type(search.getSelectDatein(),"05/04/2021");
type(search.getSelectDateout(), "06/04/2021");
selectByIndex(search.getAdultRoom(),2);
selectByIndex(search.getSelectChild(), 2);
click(search.getSelectSubmit());


SelectHotel hotel=new SelectHotel();
click(hotel.getBtnRadio());
click(hotel.getBtnCont());

FinalHotelBooking booking=new FinalHotelBooking();
click(booking.getfNme());
type(booking.getfNme(), "parkavi");
type(booking.getlNme(),"Elam");
type(booking. getBuildAdd(), "chidhambaram");
type(booking.getCreditNum(), "1234567890123456");
selectByIndex(booking.getCcType(), 2);
selectByIndex(booking.getCcMonth(), 2);
selectByIndex(booking.getCcYear(), 2);
type(booking.getCcvvtNum(), "123");
click(booking.getBookkNw());

Bookingconfirm confm=new Bookingconfirm();
Thread.sleep(150000);

WebElement orderNo = confm.getOrderNo();
String value = text(orderNo);

fileValueAddition("C:\\MavenFrameWork\\MavenSample\\Excel\\Excel1.xlsx", "Sheet1", 1, 2, value);















}}	



