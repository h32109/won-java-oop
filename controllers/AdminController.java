package com.bitcamp.controllers;

import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;


public class AdminController {

	public static void main(String[] args) {
		MemberBean member = null;
		MemberService service = new MemberService();
		String temp = "";
		
		while(true) {
			
			switch(JOptionPane.showInputDialog(	"관리자모드\n"
					+ "1.회원목록\n"
					+ "2.아이디검색\n"
					+ "3.이름검색\n"
					+ "4.전체회원수")) {
			
					case "1":
						JOptionPane.showMessageDialog(null, service.list());
						break;
					case "2":
						temp = JOptionPane.showInputDialog("아이디입력");
						member = service.findById(temp);
						JOptionPane.showMessageDialog(null, member.toString());
						break;
					case "3":
						temp = JOptionPane.showInputDialog("이름입력"); 
						JOptionPane.showMessageDialog(null, service.findByName(temp).toString());
						break;
					case "4":
						break;
					default:
						break;
			
			}
		}
		

	}

}
