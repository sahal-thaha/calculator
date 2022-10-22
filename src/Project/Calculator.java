package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	String value;
	float result;
	boolean isOperatorclicked=false;
	String Operator;
	String a[];
	
	JFrame jf;
	JLabel displaylabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton zerobutton;
	JButton dotbutton;
	JButton ACbutton;
	JButton percentageoperator;
	JButton divisonoperator;
	JButton multiplicationoperator;
	JButton additionoperator;
	JButton substractionoperator;
	JButton equalsoperator;
	public Calculator(){
	jf=new JFrame("CALCULATOR");
	jf.setLayout(null);
	jf.setSize(360,520);
	jf.setLocation(600,100);
	
	displaylabel=new JLabel();
	displaylabel.setBounds(20, 10, 300, 50);
	displaylabel.setBackground(Color.LIGHT_GRAY);
	displaylabel.setFont(new Font("Calibiri", Font.BOLD, 20));
	displaylabel.setOpaque(true);
	displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
	displaylabel.setForeground(Color.black);
	jf.add(displaylabel);
	
	ACbutton=new JButton("AC");
	ACbutton.setBounds(20,80,140,60);
	ACbutton.setBackground(Color.lightGray);
	ACbutton.addActionListener(this);
	ACbutton.setForeground(Color.black);
	ACbutton.setFont(new Font("Calibiri", Font.BOLD, 20));
	jf.add(ACbutton);
	
	percentageoperator=new JButton("%");
	percentageoperator.setBounds(180,80,60,60);
	percentageoperator.setFont(new Font("Calibiri", Font.BOLD, 20));
	percentageoperator.addActionListener(this);
	percentageoperator.setBackground(Color.lightGray);
	percentageoperator.setForeground(Color.black);
	jf.add(percentageoperator);
	
	divisonoperator = new JButton("/");
	divisonoperator.setBounds(260,80,60,60);
	divisonoperator.setFont(new Font("Calibiri", Font.BOLD, 20));
	divisonoperator.addActionListener(this);
	divisonoperator.setBackground(Color.orange);
	divisonoperator.setForeground(Color.white);
	jf.add(divisonoperator);
	
	sevenbutton=new JButton("7");
	sevenbutton.setBounds(20,160,60,60);
	sevenbutton.setFont(new Font("Calibiri", Font.PLAIN, 18));
	sevenbutton.addActionListener(this);
	sevenbutton.setBackground(Color.DARK_GRAY);
	sevenbutton.setForeground(Color.white);
	jf.add(sevenbutton);
	
	eightbutton=new JButton("8");
	eightbutton.setBounds(100,160,60,60);
	eightbutton.setFont(new Font("Calibiri", Font.PLAIN, 18));
	eightbutton.addActionListener(this);
	eightbutton.setBackground(Color.DARK_GRAY);
	eightbutton.setForeground(Color.white);
	jf.add(eightbutton);
	
	ninebutton=new JButton("9");
	ninebutton.setBounds(180,160,60,60);
	ninebutton.setFont(new Font("Calibiri", Font.PLAIN, 18));
	ninebutton.addActionListener(this);
	ninebutton.setBackground(Color.DARK_GRAY);
	ninebutton.setForeground(Color.white);
	jf.add(ninebutton);
	
	multiplicationoperator=new JButton("*");
	multiplicationoperator.setBounds(260,160,60,60);
	multiplicationoperator.setFont(new Font("Calibiri", Font.BOLD, 28));
	multiplicationoperator.addActionListener(this);
	multiplicationoperator.setBackground(Color.orange);
	multiplicationoperator.setForeground(Color.white);
	jf.add(multiplicationoperator);
	
	fourbutton=new JButton("4");
	fourbutton.setBounds(20,240,60,60);
	fourbutton.setFont(new Font("Calibiri", Font.PLAIN, 18));
	fourbutton.addActionListener(this);
	fourbutton.setBackground(Color.DARK_GRAY);
	fourbutton.setForeground(Color.white);
	jf.add(fourbutton);
	
	fivebutton=new JButton("5");
	fivebutton.setBounds(100,240,60,60);
	fivebutton.setFont(new Font("Calibiri", Font.PLAIN, 18));
	fivebutton.addActionListener(this);
	fivebutton.setBackground(Color.DARK_GRAY);
	fivebutton.setForeground(Color.white);
	jf.add(fivebutton);
	
	sixbutton=new JButton("6");
	sixbutton.setBounds(180,240,60,60);
	sixbutton.setFont(new Font("Calibiri", Font.PLAIN, 18));
	sixbutton.addActionListener(this);
	sixbutton.setBackground(Color.DARK_GRAY);
	sixbutton.setForeground(Color.white);
	jf.add(sixbutton);
	
	substractionoperator=new JButton("-");
	substractionoperator.setBounds(260,240,60,60);
	substractionoperator.setFont(new Font("Calibiri", Font.BOLD, 25));
	substractionoperator.addActionListener(this);
	substractionoperator.setBackground(Color.orange);
	substractionoperator.setForeground(Color.white);
	jf.add(substractionoperator);
	
	onebutton=new JButton("1");
	onebutton.setBounds(20,320,60,60);
	onebutton.setFont(new Font("Calibiri", Font.PLAIN, 18));
	onebutton.addActionListener(this);
	onebutton.setBackground(Color.DARK_GRAY);
	onebutton.setForeground(Color.white);
	jf.add(onebutton);
	
	twobutton=new JButton("2");
	twobutton.setBounds(100,320,60,60);
	twobutton.setFont(new Font("Calibiri", Font.PLAIN, 18));
	twobutton.addActionListener(this);
	twobutton.setBackground(Color.DARK_GRAY);
	twobutton.setForeground(Color.white);
	jf.add(twobutton);
	
	threebutton=new JButton("3");
	threebutton.setBounds(180,320,60,60);
	threebutton.setFont(new Font("Calibiri", Font.PLAIN, 18));
	threebutton.addActionListener(this);
	threebutton.setBackground(Color.DARK_GRAY);
	threebutton.setForeground(Color.white);
	jf.add(threebutton);
	
	additionoperator=new JButton("+");
	additionoperator.setBounds(260,320,60,60);
	additionoperator.setFont(new Font("Calibiri", Font.BOLD, 25));
	additionoperator.addActionListener(this);
	additionoperator.setBackground(Color.orange);
	additionoperator.setForeground(Color.white);
	jf.add(additionoperator);
	
	zerobutton=new JButton("0");
	zerobutton.setBounds(20,400,140,60);
	zerobutton.setFont(new Font("Calibiri", Font.PLAIN, 18));
	zerobutton.addActionListener(this);
	zerobutton.setBackground(Color.DARK_GRAY);
	zerobutton.setForeground(Color.white);
	jf.add(zerobutton);
	
	dotbutton=new JButton(".");
	dotbutton.setBounds(180,400,60,60);
	dotbutton.setFont(new Font("Calibiri", Font.BOLD, 30));
	dotbutton.addActionListener(this);
	dotbutton.setBackground(Color.DARK_GRAY);
	dotbutton.setForeground(Color.white);
	jf.add(dotbutton);
	
	equalsoperator=new JButton("=");
	equalsoperator.setBounds(260,400,60,60);
	equalsoperator.setFont(new Font("Calibiri", Font.BOLD, 25));
	equalsoperator.addActionListener(this);
	equalsoperator.setBackground(Color.orange);
	equalsoperator.setForeground(Color.white);
	jf.add(equalsoperator);
	
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		new Calculator();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenbutton) { 
			if(isOperatorclicked) {
				displaylabel.setText("7");
				isOperatorclicked=false;
			}else{
				displaylabel.setText(displaylabel.getText()+"7"); }
			}
		else if(e.getSource()==eightbutton) {if(isOperatorclicked) {
			displaylabel.setText("8");
			isOperatorclicked=false;
			
		}else{
			displaylabel.setText(displaylabel.getText()+"8"); }
		} 
		else if(e.getSource()==ninebutton) {if(isOperatorclicked) {
			displaylabel.setText("9");
			isOperatorclicked=false;
			
		}else{
			displaylabel.setText(displaylabel.getText()+"9"); }
		}
		else if(e.getSource()==fourbutton) {if(isOperatorclicked) {
			displaylabel.setText("4");
			isOperatorclicked=false;
			
		}else{
			displaylabel.setText(displaylabel.getText()+"4"); }
		}
		else if(e.getSource()==fivebutton) {if(isOperatorclicked) {
			displaylabel.setText("5");
			isOperatorclicked=false;
			
		}else{
			displaylabel.setText(displaylabel.getText()+"5"); }
		}
		else if(e.getSource()==sixbutton) {if(isOperatorclicked) {
			displaylabel.setText("6");
			isOperatorclicked=false;
			
		}else{
			displaylabel.setText(displaylabel.getText()+"6"); }
		}
		else if(e.getSource()==threebutton) {if(isOperatorclicked) {
			displaylabel.setText("3");
			isOperatorclicked=false;
			
		}else{
			displaylabel.setText(displaylabel.getText()+"3"); }
		}
		else if(e.getSource()==twobutton) {if(isOperatorclicked) {
			displaylabel.setText("2");
			isOperatorclicked=false;
			
		}else{
			displaylabel.setText(displaylabel.getText()+"2"); }
		}
		else if(e.getSource()==onebutton) {if(isOperatorclicked) {
			displaylabel.setText("1");
			isOperatorclicked=false;
			
		}else{
			displaylabel.setText(displaylabel.getText()+"1"); }
		}
		else if(e.getSource()==zerobutton) {if(isOperatorclicked) {
			displaylabel.setText("0");
			isOperatorclicked=false;
		}else{
			displaylabel.setText(displaylabel.getText()+"0"); }
		}
		else if(e.getSource()==dotbutton) {if(isOperatorclicked) {
			displaylabel.setText(".");
			isOperatorclicked=false;
		}else{
			displaylabel.setText(displaylabel.getText()+"."); }
		}
		else if(e.getSource()==ACbutton) {displaylabel.setText("");}
		else if(e.getSource()==percentageoperator) {
			Operator="%";
			isOperatorclicked=true;
			value=displaylabel.getText();
			displaylabel.setText("");}
		else if(e.getSource()==divisonoperator) {
			Operator="/";
			isOperatorclicked=true;
			value=displaylabel.getText();
			displaylabel.setText("");
		}
		else if(e.getSource()==multiplicationoperator) {
			Operator="*";
			isOperatorclicked=true;
			value=displaylabel.getText();
			displaylabel.setText("");
		}
		else if(e.getSource()==additionoperator) {
			System.out.println("fghj");
			Operator="+";
			isOperatorclicked=true;
			value=displaylabel.getText();
			displaylabel.setText("");
		}
		else if(e.getSource()==substractionoperator) {
			Operator="-";
			isOperatorclicked=true;
			value=displaylabel.getText();
			displaylabel.setText("");
		}
		
		
		else if(e.getSource()==equalsoperator) {
		if(Operator=="%") {
			String secondvalue=displaylabel.getText();
			float second=Float.parseFloat(secondvalue);
			float value1=Float.parseFloat(value);
			float result=value1%second;
		displaylabel.setText(result+" ");}
		else if(Operator=="/") {
			String secondvalue=displaylabel.getText();
			float second=Float.parseFloat(secondvalue);
			float value1=Float.parseFloat(value);
			float result=value1/second;
		displaylabel.setText(result+" ");}
		else if(Operator=="*") {
			String secondvalue=displaylabel.getText();
			float second=Float.parseFloat(secondvalue);
			float value1=Float.parseFloat(value);
			float result=value1*second;
		displaylabel.setText(result+" ");}
		else if(Operator=="+") {
			String secondvalue=displaylabel.getText();
			float second=Float.parseFloat(secondvalue);
			float value1=Float.parseFloat(value);
			float result=value1+second;
			displaylabel.setText(result+" ");
			System.out.println(secondvalue);
			System.out.println(value);
		}
		else if(Operator=="-") {
			String secondvalue=displaylabel.getText();
			float second=Float.parseFloat(secondvalue);
			float value1=Float.parseFloat(value);
			float result=value1-second;
		displaylabel.setText(result+" ");
		}
		}
	}
}
