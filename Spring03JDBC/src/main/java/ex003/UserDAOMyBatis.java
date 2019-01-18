package ex003;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
/*[1] Template을 이용하는 방법==> ex03에서
 *[2] DaoSupport를 이용하는 방법==> ex04에서 다룰 예정
 **/
public class UserDAOMyBatis implements UserDAO{
	
	//SqlSession--------------------------------------------
	private SqlSessionTemplate session;
	private final String NS="ex03.UserMapper";
	
	public SqlSessionTemplate getSession() {
		return session;
	}

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	//------------------------------------------------------
	@Override
	public int createUser(UserVO user) {
		return session.insert(NS+".createUser",user);
	}

	@Override
	public List<UserVO> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteUser(int idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(UserVO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserVO getUser(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getUserCount() {
		return session.selectOne(NS+".getUserCount");
	}
	
}
