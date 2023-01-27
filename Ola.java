package Abstraction;

interface olaCustomer
    {
        void bookCab();
        void findRide();
        void rentCab();
        void rateDriver();
        void scheduleCab();
        void cancelCab();
        void addMoneytoWallet();
        void raiseTicket();
        void signUp();
        void singIn();

    }
    interface olaDriver
    {
        void acceptBooking();
        void getCustomerLocation();
        void setAvailableComissin();
        void getMyCommision();
        void raiseMoneyTransferRequest();
        void callYourVehicle();
        void callCustomer();
        void customerFeedback();
        void setUpYourVehicle();

    }
    interface olaOwner
    {
        void DriverRecords();
        void getReportByDriverId();
        void getReportByRegion();
        void getTotalRevenue();
        void getCustomerFeedback();
        void addDriver();
        void removeDriver();
        void changeDriverStatus();

    }
public class Ola implements olaOwner,olaDriver,olaCustomer {

    public static void main(String[] args) {
        // Ola obj=new Ola();
        olaDriver manoj=new Ola();
        manoj.getCustomerLocation();
    }
    @Override
    public void bookCab() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void findRide() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void rentCab() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void rateDriver() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void scheduleCab() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cancelCab() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addMoneytoWallet() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void raiseTicket() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void signUp() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void singIn() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void acceptBooking() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getCustomerLocation() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setAvailableComissin() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getMyCommision() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void raiseMoneyTransferRequest() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void callYourVehicle() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void callCustomer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void customerFeedback() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setUpYourVehicle() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void DriverRecords() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getReportByDriverId() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getReportByRegion() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getTotalRevenue() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getCustomerFeedback() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addDriver() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeDriver() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void changeDriverStatus() {
        // TODO Auto-generated method stub
        
    }
    
    
}
