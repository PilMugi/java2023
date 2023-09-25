package swingtalk;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Chat extends JFrame{
	JLabel userIdLabel;
	JPanel jp_top, jp_buttom;
	JScrollPane jp_chat;
	
	JMenuBar menubar;
	JMenu menu;
	JMenuItem menuItem[];
	
	
	Chat(){
		
	}
	
	Chat(String userId){
		setBounds(1500, 0, 320, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jp_top = new JPanel();
		jp_chat = new JScrollPane();
		jp_buttom = new JPanel();
		
		jp_top.setBounds(0,0,300,40);
		jp_chat.setBounds(0, 40, 300, 440);
		jp_buttom.setBounds(0, 480, 300, 80);
		
		createMenu();
		
		add(jp_top);
		add(jp_chat);
		add(jp_buttom);
		
		setVisible(true);
	}
	private void createMenu() {
		menubar = new JMenuBar();
		menu = new JMenu("환경설정");
		menubar.add(menu);
		menuItem = new JMenuItem[4]; 
		String menuTitle[] = {"이름 바꾸기", "배경색 바꾸기", "폰트 바꾸기","서버주소 변경"};
		for(int i = 0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(menuTitle[i]);
			menu.add(menuItem[i]);
		}
		menubar.setVisible(true);
		this.setJMenuBar(menubar);
	}
	
	
}