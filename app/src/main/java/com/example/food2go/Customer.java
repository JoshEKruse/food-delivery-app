package com.example.food2go;

public class Customer extends User
{
    String address;
    Order order;

    public Customer()
    {
        super();
        this.address = "";
    }
    public Customer(String address,
                    double rating, String name, String username,
                    String password, String email, String phone_number)
    {
        super(rating, name, username, password, email, phone_number);
        this.address = address;
    }
    public void startOrder()
    {
        //create order
        this.order = new Order();
        this.order.order_items = new OrderItems();
    }

    public void addToOrder( MenuItem item )
    {
        this.order.order_items.addToOrder( item );
    }

    public void addToOrder( double price, String item_name, String item_url, String feedback )
    {
        //this.order.order_items.addToOrder( price, item_name, feedback, null );
    }

    public void submitOrder()
    {
        // find restaurant
        // find driver
    }

    public void rateItem( MenuItem item, String feedback )
    {
        //item.feedback[0] = feedback;
    }

    public void rateDriver()
    {
        //TODO
    }

    public void leaveReview()
    {
        //TODO
    }

    @Override
    public void createAccount()
    {
        //TODO
    }

    @Override
    public void viewAccount()
    {
        //TODO
    }
}