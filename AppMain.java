package swingtalk;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AppMain extends JFrame implements ActionListener{

	//전역변수 선언
	JPanel panel = new JPanel();
	JTextField txt_userId;
	JButton btn_login;
	
	public static void main(String[] args) {
		new AppMain();

	}
	AppMain(){
		//화면 디자인
		setBounds(1500, 0, 320, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//패널
		panel.setBackground(Color.yellow);
		panel.setLayout(null);
		//텍스트필드
		txt_userId = new JTextField();
		txt_userId.setBounds(50, 400, 200, 30);
		//버튼
		btn_login = new JButton("로그인");
		btn_login.setBounds(50, 440, 200, 30);
		
		panel.add(txt_userId);
		panel.add(btn_login);
		
		//과제: 프로필 이미지와 상태 메세지 추가하기
		ImageIcon img = new ImageIcon("img/2.jpg");
		JLabel label = new JLabel(img);
		label.setBounds(70, 160, 160, 160);
		panel.add(label);
		//------이벤트 처리--------------
		btn_login.addActionListener(this);
		
		JLabel status = new JLabel("20319 송우기");
		status.setBounds(70, 330, 160, 20);
		status.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(status);
		
		add(panel);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_login) {
			String userId = txt_userId.getText().trim();  //trim()은 앞뒤 공백 제거
			if(userId.length() == 0) {
				JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
			}
			else {
				//새 화면 호출하기
				new Chat(userId);
			}
		}
		
	}

}
