package com.bitcamp.controllers;

import javax.swing.JOptionPane;
import com.bitcamp.services.MemberService;
import com.bitcamp.domains.MemberBean;

public class MemberController {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		MemberBean member = null;
		String[] arr = null;
		String temp = "";
		MemberBean[] members = null;
		int b = 0;
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.마이페이지\n"
					+ "3.비번수정\n"
					+ "4.회원탈퇴\n"
					+ "5.아이디중복 여부\n"
					+ "6.로그인\n")){
			case "0":
				JOptionPane.showMessageDialog(null , "종료");
				return;
			case "1":
				b++;
				members = new MemberBean[b];
				member = new MemberBean();
				temp = JOptionPane.showInputDialog("이름, ID, PASSWORD, 주민번호, 혈액형, 키, 몸무게");
				arr = temp.split(",");
				System.out.println("****"+temp);
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				member.setBlood(arr[4]);
				member.setHeight(Double.parseDouble(arr[5]));
				member.setWeight(Double.parseDouble(arr[6]));
				JOptionPane.showMessageDialog(null, service.join(member));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.getMyPage(member));
				break;
			case "3":
				arr = JOptionPane.showInputDialog("아이디, 비밀번호 , 신규비밀번호를 입력해 주세요.").split(",");
				JOptionPane.showMessageDialog(null, service.changePw(arr));
				JOptionPane.showMessageDialog(null, service.login(member));
				break;
			case "4":
				
				
				
				break;
			case "5":
				
				
				
				break;
			case "6":
				temp = JOptionPane.showInputDialog("로그인ID, PW");
				arr = temp.split(",");
				String loginId = arr[0];
				member = new MemberBean();
				member.setId(loginId);
				member.setPw(arr[1]);
				String msg = service.login(member);
				JOptionPane.showMessageDialog(null, msg);
				break;
				
			default:
				break;
			}}
		
	}

}
