package customer;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO {
	@Autowired @Qualifier("hanul") SqlSession sql;
	
	public List<CustomerVO> search(String data){
		
		return sql.selectList("customer.mapper.list",data);
		
	}

}
