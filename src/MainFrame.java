import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.util.Timer;


public class MainFrame extends Frame{
    private Button btnexit = new Button("Get out");
    private Button btnsub  = new Button("Add");
    private Button btnc = new Button("--");
    private Label gg = new Label("~~~~");
    private int lex = 50;
    private int  count =0;
    private Timer t1;

    public  MainFrame(){
        initComp();
    }

    private void initComp(){
        this.setBounds(100,120,400,300);
        this.setLayout(null);
        btnexit.setBounds(150,110,80,30);
        btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(btnexit);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });

        btnsub.setBounds(50,110,100,30);
        this.add(btnsub);
        btnsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(count++));
                gg.setBounds(lex+=100,200,100,30);

            }
        });
        btnc.setBounds(200,110,100,30);
        this.add(btnc);
        btnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(--count));
                gg.setBounds(lex-=100,200,100,30);

            }
        });

        {
            gg.setBounds(100, 200, 100, 30);
            this.add(gg);
        }



    }}