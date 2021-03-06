package jp.co.wisdom_technology.mapper;

import java.util.List;
import jp.co.wisdom_technology.model.StaffRest;
import org.apache.ibatis.annotations.Param;

public interface StaffRestMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table staff_rest
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	int deleteByPrimaryKey(@Param("staffId") Integer staffId, @Param("patternId") Integer patternId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table staff_rest
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	int insert(StaffRest record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table staff_rest
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	List<StaffRest> selectAll();
}