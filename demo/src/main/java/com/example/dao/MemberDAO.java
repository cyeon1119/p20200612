package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vo.MemberVO;

@Service
public class MemberDAO {
	

	
	@Autowired //@Bean으로 만들어진 객체를 받아옴.
	private SqlSessionFactory sqlFactory = null;
	
	public int insertMember(MemberVO obj){
		return sqlFactory.openSession().insert("member.join", obj);
	}
	
	public List<MemberVO> selectMemberList(){
		return sqlFactory.openSession().selectList("member.memberList");
	}
	
	public MemberVO seleMemberLogin(MemberVO obj) {
		return sqlFactory.openSession().selectOne("member.login", obj);
	}
	
	
	
}
