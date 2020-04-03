package jp.co.wisdom_technology;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import jp.co.wisdom_technology.mapper.StaffCustomMapper;
import jp.co.wisdom_technology.mapper.StaffMapper;
import jp.co.wisdom_technology.model.Staff;

public class MybatisAccess {

	public static void main(String[] args) {
		
		try (Reader r = Resources.getResourceAsReader("mybatis-config.xml");) {
			 
            // 読み込んだ設定ファイルからSqlSessionFactoryを生成します
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
 
            // SQLセッションを取得します
            try (SqlSession session = factory.openSession()) {
 
                // StaffテーブルのMapperを取得します
                StaffMapper map = session.getMapper(StaffMapper.class);
                // Staffテーブルの主キー（id)が１であるレコードを検索します
                Staff staff = map.selectByPrimaryKey(1);
 
                // 取得した内容を確認します
                System.out.println("staff.id = " + staff.getId());
                System.out.println("staff.name = " + staff.getName());
                System.out.println("staff.department = " + staff.getDepartment());
                System.out.println("staff.time_unit = " + staff.getTimeUnit());
                
                StaffCustomMapper custMap = session.getMapper(StaffCustomMapper.class);
                List<Staff> staffList = custMap.selectStaffsByDepartment(3);
                for (Staff s : staffList) {
                	System.out.println("staff.id = " + s.getId());
                    System.out.println("staff.name = " + s.getName());
                    System.out.println("staff.department = " + s.getDepartment());
                    System.out.println("staff.time_unit = " + s.getTimeUnit());
                }
                
                staff.setTimeUnit(15);                
                System.out.println("部門" + staff.getDepartment() + "の時間単位を" + staff.getTimeUnit() + "に設定します。");
                int resultCount = custMap.setTimeUnitForDepartment(staff);
                System.out.print(resultCount + "レコードを設定しました。");
                
                Staff newStaff = new Staff();
                newStaff.setId(6);
                newStaff.setName("劉二");
                newStaff.setDepartment(2);
                newStaff.setTimeUnit(30);
               
                map.insert(newStaff);
                session.commit();
                System.out.println("データINSERTしました。");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
