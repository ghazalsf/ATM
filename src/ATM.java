import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM implements ActionListener {

    // Global button frame label textfiled
    JFrame frame;
    JFrame cash_frame;
    JFrame pass_frame;
    JFrame operation_frame;
    JFrame success_frame;

    JLabel infoLabel;
    JLabel success_label;

    JTextField pass_filed;

    JButton back_button;
    JButton cash_back_button;

    JButton persian_button;
    JButton english_button;
    JButton enter_button;
    JButton cash_enter_button;
    JButton change_password_button;
    JButton card_to_card_button;
    JButton get_cash_button;
    JButton mojodi_button;

    JButton ten;
    JButton fifty;
    JButton hundred;
    JButton eighty;

    int lang; // 0 is persian 1 is english
    int is_entered = 0;
    Font perian_font = new Font("B Jadid", Font.PLAIN, 14);
    Font english_font = new Font("Times New Roman (Headings CS)", Font.PLAIN, 12);

    public void setupMainFrame() {

        frame = new JFrame("ATM");

        frame.setSize(400, 450);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(86, 113, 137));

    }
    public void setupPassFrame() {
        pass_frame = new JFrame("password");
        JPanel panel = new JPanel();
        JTextField pass_filed = new JTextField(25);
        JPanel centerPanel = new JPanel();

        if (lang == 0) {
             infoLabel = new JLabel("   پسورد خود را وارد کنید:   ");
            enter_button = new JButton("ثبت");
            infoLabel.setFont(perian_font);
            enter_button.setFont(perian_font);


        }else{
            infoLabel = new JLabel("   enter your password:  ");
            enter_button = new JButton("enter");
            infoLabel.setFont(english_font);
            enter_button.setFont(english_font);


        }

        enter_button.addActionListener(this);

        panel.add(infoLabel, BorderLayout.NORTH);
        centerPanel.add(pass_filed);
        centerPanel.add(new JLabel(" "));
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(enter_button, BorderLayout.SOUTH);
        pass_frame.add(panel);

        panel.setBackground(new Color(86, 113, 137));

        pass_frame.add(panel);

        pass_frame.setSize(400, 450);
        pass_frame.setLocationRelativeTo(null);
        pass_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pass_frame.setVisible(true);
        System.out.println("done");



    }
    public void setupOperationFrame() {

        operation_frame = new JFrame("ATM");

        operation_frame.setSize(400, 450);
        operation_frame.setVisible(true);
        operation_frame.setResizable(false);
        operation_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        operation_frame.setLocationRelativeTo(null);
        operation_frame.getContentPane().setBackground(new Color(86, 113, 137));

        setupOperationButtons();
    }

    public void setupCashFrame() {

        cash_frame = new JFrame("ATM");

        cash_frame.setSize(400, 450);
        cash_frame.setVisible(true);
        cash_frame.setResizable(false);
        cash_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cash_frame.setLocationRelativeTo(null);
        cash_frame.getContentPane().setBackground(new Color(80, 113, 137));

        setupCashButtons();
    }
    public void setupSuccessFrame() {

        success_frame = new JFrame("ATM");

        success_frame.setSize(400, 450);
        success_frame.setVisible(true);
        success_frame.setResizable(false);
        success_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        success_frame.setLocationRelativeTo(null);
        success_frame.getContentPane().setBackground(new Color(86, 113, 137));


        if (lang == 0) {
            JLabel success_label = new JLabel("عملیات با موفقیت انجام شد");
            success_label.setFont(perian_font);
            success_label.setLocation(200,200);
            success_frame.add(success_label);

        }else {
            JLabel success_label = new JLabel("successfull operation");
            success_label.setFont(english_font);
            success_frame.add(success_label);

        }
    }

    public void mojodi() {

        success_frame = new JFrame("ATM");

        success_frame.setSize(400, 450);
        success_frame.setVisible(true);
        success_frame.setResizable(false);
        success_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        success_frame.setLocationRelativeTo(null);
        success_frame.getContentPane().setBackground(new Color(86, 113, 137));


        if (lang == 0) {
            JLabel success_label = new JLabel("مانده : 200000");
            success_label.setFont(perian_font);
            success_label.setLocation(200,200);
            success_frame.add(success_label);

        }else {
            JLabel success_label = new JLabel("your money: 30000");
            success_label.setFont(english_font);
            success_frame.add(success_label);

        }
    }
    public void setupButton() {
        persian_button = new JButton("فارسی");
        english_button = new JButton("English");

        persian_button.setBounds(250,200,100,30);
        english_button.setBounds(30,200,100,30);

        persian_button.setFont(perian_font);
        english_button.setFont(english_font);

        persian_button.addActionListener(this);
        english_button.addActionListener(this);

        frame.add(persian_button);
        frame.add(english_button);

    }

    public void setupOperationButtons() {

        if (lang == 0){
            card_to_card_button = new JButton("کارت به کارت");
            mojodi_button = new JButton("اعلام موجودی");
            change_password_button = new JButton("تغییر رمز");
            get_cash_button = new JButton("دریافت وجه");
            back_button = new JButton("بازگشت");

            // font
            back_button.setFont(perian_font);
            change_password_button.setFont(perian_font);
            card_to_card_button.setFont(perian_font);
            mojodi_button.setFont(perian_font);
            get_cash_button.setFont(perian_font);

        }else {
            card_to_card_button = new JButton("transfer the money");
            mojodi_button = new JButton("account balance");
            change_password_button = new JButton("change password");
            get_cash_button = new JButton("cash");
            back_button = new JButton("back");

            // font
            back_button.setFont(english_font);
            change_password_button.setFont(english_font);
            card_to_card_button.setFont(english_font);
            mojodi_button.setFont(english_font);
            get_cash_button.setFont(english_font);


        }

        //size
        Dimension buttonSize = new Dimension(120, 30);
        back_button.setPreferredSize(buttonSize);
        card_to_card_button.setPreferredSize(buttonSize);
        mojodi_button.setPreferredSize(buttonSize);
        change_password_button.setPreferredSize(buttonSize);
        get_cash_button.setPreferredSize(buttonSize);



        //action listener
        back_button.addActionListener(this);
        card_to_card_button.addActionListener(this);
        mojodi_button.addActionListener(this);
        change_password_button.addActionListener(this);
        get_cash_button.addActionListener(this);


        JPanel centerLeftPanel = new JPanel();
        centerLeftPanel.setLayout(new GridLayout(2, 1));
        centerLeftPanel.add(mojodi_button);
        centerLeftPanel.add(card_to_card_button);

        JPanel centerRightPanel = new JPanel();
        centerRightPanel.setLayout(new GridLayout(2, 1));
        centerRightPanel.add(get_cash_button);
        centerRightPanel.add(change_password_button);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(100, 20, 100, 20));
        mainPanel.add(centerLeftPanel, BorderLayout.WEST);
        mainPanel.add(centerRightPanel, BorderLayout.EAST);

        ((GridLayout)centerLeftPanel.getLayout()).setHgap(100);
        ((GridLayout)centerLeftPanel.getLayout()).setVgap(100);

        ((GridLayout)centerRightPanel.getLayout()).setHgap(100);
        ((GridLayout)centerRightPanel.getLayout()).setVgap(100);

        centerLeftPanel.setBackground(new Color(86, 113, 137));
        centerRightPanel.setBackground(new Color(86, 113, 137));
        mainPanel.setBackground(new Color(86, 113, 137));
        mainPanel.add(back_button, BorderLayout.SOUTH);

        operation_frame.add(mainPanel);
        operation_frame.setVisible(true);
    }

    public void setupCashButtons() {

        if (lang == 0){
            ten = new JButton("10000");
            fifty = new JButton("50000");
            hundred = new JButton("100000");
            eighty = new JButton("80000");
            cash_back_button = new JButton("بازگشت");


            // font
            cash_back_button.setFont(perian_font);
            change_password_button.setFont(perian_font);
            card_to_card_button.setFont(perian_font);
            mojodi_button.setFont(perian_font);
            get_cash_button.setFont(perian_font);

        }else {
            ten = new JButton("10000");
            fifty = new JButton("50000");
            hundred = new JButton("200000");
            eighty = new JButton("80000");
            back_button = new JButton("back");


            // font
            ten.setFont(english_font);
            fifty.setFont(english_font);
            hundred.setFont(english_font);
            eighty.setFont(english_font);
            get_cash_button.setFont(english_font);


        }

        //size
        Dimension buttonSize = new Dimension(120, 30);
        ten.setPreferredSize(buttonSize);
        hundred.setPreferredSize(buttonSize);
        fifty.setPreferredSize(buttonSize);
        eighty.setPreferredSize(buttonSize);
        get_cash_button.setPreferredSize(buttonSize);



        //action listener
        ten.addActionListener(this);
        hundred.addActionListener(this);
        fifty.addActionListener(this);
        eighty.addActionListener(this);
        cash_back_button.addActionListener(this);

        JPanel centerLeftPanel = new JPanel();
        centerLeftPanel.setLayout(new GridLayout(3, 1));
        centerLeftPanel.add(ten);
        centerLeftPanel.add(hundred);
        centerLeftPanel.add(cash_back_button);


        JPanel centerRightPanel = new JPanel();
        centerRightPanel.setLayout(new GridLayout(3, 1));
        centerRightPanel.add(fifty);
        centerRightPanel.add(eighty);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.add(centerLeftPanel, BorderLayout.WEST);
        mainPanel.add(centerRightPanel, BorderLayout.EAST);

        ((GridLayout)centerLeftPanel.getLayout()).setHgap(100);
        ((GridLayout)centerLeftPanel.getLayout()).setVgap(100);

        ((GridLayout)centerRightPanel.getLayout()).setHgap(100);
        ((GridLayout)centerRightPanel.getLayout()).setVgap(100);

        centerLeftPanel.setBackground(new Color(86, 113, 137));
        centerRightPanel.setBackground(new Color(86, 113, 137));
        mainPanel.setBackground(new Color(86, 113, 137));

        cash_frame.add(mainPanel);
        cash_frame.setVisible(true);
    }

    public void ATM_Text(){
        JLabel label = new JLabel("زبان مورد نظر خود را انتخاب کنید");

        int x = 100;
        int y = 100;
        label.setLocation(x, y);

        frame.add(label);
    }



        @Override
    public void actionPerformed(ActionEvent e) {

            if( e.getSource() == english_button ){
                lang = 1;
                frame.setVisible(false);
                setupPassFrame();

            }
            if( e.getSource() == persian_button ){
                lang = 0;
                frame.setVisible(false);
                setupPassFrame();

            }
            if( e.getSource() == enter_button ){

                pass_frame.setVisible(false);
                System.out.println("111111111");
                setupOperationFrame();
            }

            if( e.getSource() == back_button ){

                operation_frame.setVisible(false);
                frame.setVisible(true);

            }
            if( e.getSource() == cash_back_button ){

                cash_frame.setVisible(false);
                operation_frame.setVisible(true);

            }
            if( e.getSource() == fifty
                    || e.getSource() == eighty
                    || e.getSource() == hundred
                    || e.getSource() == ten){

                cash_frame.setVisible(false);
                setupSuccessFrame();
            }
            if( e.getSource() == mojodi_button ){

                operation_frame.setVisible(false);
                mojodi();
            }
            if( e.getSource() == card_to_card_button ){

                operation_frame.setVisible(false);
                setupSuccessFrame();
            }
            if( e.getSource() == get_cash_button ){

                operation_frame.setVisible(false);
                setupCashFrame();
            }
            if( e.getSource() == change_password_button ){

                operation_frame.setVisible(false);
                setupSuccessFrame();
            }


    }
}
