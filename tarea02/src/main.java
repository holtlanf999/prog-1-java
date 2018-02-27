/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lanford
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public class Client {
        //Atributes
        int clientId; //Don't know if Id is numeric or alphanumeric, I choose numeric.
        int clientPhoneNumber;
        String clientIdType;
        String clientType;
        String clientName;
        String clientLastName;
        String clientEmail;
        String clientBirthDate; //Don't know the date format.
        String clientAddress;
        String clientGender;
        //Methods
        public int calculateDiscount(){return 0;}
        public String verifyOrders(){return null;}
        public String verifyClientType(){return null;}
    }
    public class Inventory {
        //Attributes
        boolean productAvailability;
        boolean retail;
        int productQty;
        float productWeight;
        int productQtyByPackage;
        int rack; //Don't know if the the racks uses numeric or alphanumeric codes for identification.
        String productLocation;
        String entryDate; //Don't know the date format.
        //Methods
        public int verifyExistence(){return 0;}
        public int calculateRequestedProducts(){return 0;}
        public String updateInventory(){return null;}
        public String verifyIfRetailProduct(){return null;}
    }
    public class Product  {
        //Attributes
        float productPrice;
        int productId; //Don't know if Id is numeric or alphanumeric, I choose numeric.
        String productType;
        String productSize;
        String productColor;
        String productDesign;
        String productBrand;
        String productDecription;
        String productCategory;
        //Methods
        public float calculateDiscount(){return 0;}
        public float calculatePrice(){return 0;}
        public int checkQty(){return 0}
    }
    public class Employee {
        //Attributes
        float employeeSalary;
        int employeeId; //Don't know if Id is numeric or alphanumeric, I choose numeric.
        String employeeName;
        String employeeCode;
        String employeeGender;
        String employeeRole;
        String employeeDepartment;
        String employeePhoneNumber;
        String employeeEmail;
        String employeeShift;
        String headquartersCode;
        //Methods
        public String insertRequest(){return null;}
        public String manageRequest(){return null;}
        public String modifyInventory(){return null;}
    }
    public class Invoice {
        //Aattributes
        float invoiceTotal;
        float invoiceSubTotal;
        int invoiceNumber;
        String invoiceDate;
        String invoiceDescription;
        //Methods
        public float calculateTotal(){return 0;}
        public float calculateTaxes(){return 0;}
        public boolean processPayment(){return false;}
        public String verifyClientType(){return null;}
        public String selectPaymentType(){return null;}
    }
    public class Catalog {
        //Attributes
        boolean catalogAvailability;
        float price;
        int catalogDiscount;
        String catalogPromo;
        String catalogReleaseDate;
        String catalogEndDate;
        //Methods
        public String addProduct(){return null;}
        public String verifyPromotion(){return null;}
    }
    public class Order {
        //Attributes
        int orderId; //Don't know if Id is numeric or alphanumeric, I choose numeric.
        String orderDate;
        String orderType;
        String orderShipping;
        String orderShippingDate;
        String orderPaymentType;
        String orderStatus;
        String orderEstimatedTimeForArrival;
        //Methods
        public float calculateTotal(){return 0;}
        public int indicateQty(){return 0;}
        public int productExistenceVerification(){return 0;}
        public String determinePaymentType(){return null;}
        public String verifyShipping(){return null;}
        public String verifyOrderType(){return null;}
    }
    public class Provider {
        //Attributes
        int providerId; //Don't know if Id is numeric or alphanumeric, I choose numeric.
        int providerPhone;
        String porviderName;
        String productType;
        String providerType;
        String providerAddress;
        String providerWebSite;
        String providerContactName;
        //Methods
        public String verifyContactType(){return null;}
        public String verifyProduct(){return null;}
        public String verifyProviderStatus(){return null;}
    }
    //Constructor 
    public void main(String[] args) {
        
        Client testClient = new Client();
        testClient.verifyOrders();
        testClient.calculateDiscount();

        Inventory testInventory = new Inventory();
        testInventory.verifyExistence();
        testInventory.updateInventory();

        Product testProduct = new Product();
        testProduct.calculateDiscount();
        testProduct.calculatePrice();

        Employee testEmployee = new Employee();
        testEmployee.insertRequest();
        testEmployee.modifyInventory();        
        
        Invoice testInvoice = new Invoice();
        testInvoice.calculateTaxes();
        testInvoice.calculateTotal();
        
        Catalog testCatalog = new Catalog();
        testCatalog.addProduct();
        testCatalog.verifyPromotion();
        
        Order testOrder = new Order();
        testOrder.calculateTotal();
        testOrder.indicateQty();

        Provider testProvider = new Provider();
        testProvider.verifyContactType();
        testProvider.verifyProviderStatus();
    }
    
}
