package task;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HotelBookingGUI extends JFrame {

    private JTextField bookingNo;
    private JTextField date;
    private JTextField cusName;
    private JTextField phone;
    private JTextField address;
    private JComboBox roomType;
    private JTextField specialReq;
    private JButton submitButton;

    public HotelBookingGUI() {

        super("Hotel Booking");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2));

        panel.add(new JLabel("Booking No.:"));
        bookingNo = new JTextField();
        panel.add(bookingNo);

        panel.add(new JLabel("Date:"));
        date = new JTextField();
        panel.add(date);

        panel.add(new JLabel("Customer Name:"));
        cusName = new JTextField();
        panel.add(cusName);

        panel.add(new JLabel("Phone Number:"));
        phone = new JTextField();
        panel.add(phone);

        panel.add(new JLabel("Address:"));
        address = new JTextField();
        panel.add(address);

        panel.add(new JLabel("Room Type:"));
        roomType = new JComboBox(new String[] {"Single", "Double", "Family"});
        panel.add(roomType);

        panel.add(new JLabel("Special Request:"));
        specialReq = new JTextField();
        panel.add(specialReq);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // Handle the booking submission event.

            }
        });

        panel.add(submitButton);

        add(panel);

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {

        new HotelBookingGUI();

    }
}