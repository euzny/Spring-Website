package member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	@Autowired @Qualifier("hanul") private SqlSession sql;
	
	public MemberVO login(MemberVO inputVO) {
		MemberVO vo =  sql.selectOne("member.mapper.login",inputVO);
		return vo;
	}
	
	public void join(MemberVO vo) {
		sql.insert("member.mapper.join",vo);
	}
}
