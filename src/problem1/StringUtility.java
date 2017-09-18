package problem1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StringUtility extends JFrame  {
JButton BtnCountLetter=new JButton();
JButton ReverseLetters=new JButton();
JButton RemovesDup=new JButton();
JLabel inputL=new JLabel();
JLabel outputL=new JLabel();
JTextField input=new JTextField();
JTextField output=new JTextField();

	StringUtility()
	{
		setLayout(null);
		setBounds(300,200,600,250);
		
		BtnCountLetter.setBounds(50, 50, 150, 30);
		BtnCountLetter.setText("Count Letters");
		add(BtnCountLetter);
		
		ReverseLetters.setBounds(50, 90, 150, 30);
		ReverseLetters.setText("Reverse Letters");
		add(ReverseLetters);
		
		RemovesDup.setBounds(50, 130, 150, 30);
		RemovesDup.setText("Remove Duplicates");
		add(RemovesDup);
		
		inputL.setBounds(220, 50, 80, 20);
		inputL.setText("input");
		add(inputL);

		input.setBounds(220, 70, 170, 20);
		add(input);
		
		outputL.setBounds(220, 95, 80, 20);
		outputL.setText("output");
		add(outputL);
		
		output.setBounds(220, 115, 170, 20);
		add(output);
		
		BtnCountLetter.addActionListener(e->{output.setText(Integer.valueOf(input.getText().trim().length()).toString());});
		ReverseLetters.addActionListener(e->
		{
			char[] strArr=input.getText().toCharArray();
			StringBuilder st=new StringBuilder();
			for(int i=input.getText().length()-1;i>=0;i--)
			{
				st.append(strArr[i]);
			}
			output.setText(st.toString());
		});
		
		
		RemovesDup.addActionListener(e->
		{
			//input.setText(output.getText());
			char[] strArr=input.getText().toCharArray();
			StringBuilder st=new StringBuilder();
			boolean FoundDup=false;
			int len=input.getText().length()-1;
			
			for(int i=0;i<len;i++)
			{
				FoundDup=false;				
				for(int j=0;j<st.length();j++)
				{
					if(strArr[i]==st.charAt(j))
					{
						FoundDup=true;					
					}
				}
				if(FoundDup==false)
				{
					st.append(strArr[i]);
				}
				
			}
			output.setText(st.toString());
		
		});
	}

	public static void main(String[] args) {
		
		StringUtility Su=new StringUtility();
		Su.setVisible(true);
	}
public String rvers()
{
	char[] strArr=input.getText().toCharArray();
	StringBuilder st=new StringBuilder();
	for(int i=input.getText().length()-1;i>=0;i--)
	{
		st.append(strArr[i]);
	}
	return st.toString();
}
public void dup()
{
	char[] strArr=input.getText().toCharArray();
	StringBuilder st=new StringBuilder();
	for(int i=0;i<input.getText().length()-1;i++)
	{
		for(int j=i;j<st.length();j++)
		{
			if(st.length()<0)
			{
				st.append(strArr[i]);
			}
			if(strArr[i]!=st.charAt(j))
			{
				st.append(strArr[i]);
			}
		}
		
	}
	output.setText(st.toString());
}


}
