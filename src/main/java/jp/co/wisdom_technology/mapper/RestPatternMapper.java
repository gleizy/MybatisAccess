package jp.co.wisdom_technology.mapper;

import java.util.Date;
import java.util.List;
import jp.co.wisdom_technology.model.RestPattern;
import org.apache.ibatis.annotations.Param;

public interface RestPatternMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rest_pattern
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	int deleteByPrimaryKey(@Param("id") Integer id, @Param("start") Date start);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rest_pattern
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	int insert(RestPattern record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rest_pattern
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	RestPattern selectByPrimaryKey(@Param("id") Integer id, @Param("start") Date start);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rest_pattern
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	List<RestPattern> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rest_pattern
	 * @mbg.generated  Fri Apr 03 20:57:54 JST 2020
	 */
	int updateByPrimaryKey(RestPattern record);
}