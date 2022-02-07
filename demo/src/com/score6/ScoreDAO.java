package com.score6;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;
import oracle.jdbc.OracleTypes;

// DB에 연동해서 query를 실행하는 곳
// Data Access Object
public class ScoreDAO {

	// 입력
	public int insertData(ScoreDTO dto) { // 반환값 안써도 된다 // 반환 되면 1, 안되면 0

		int result = 0;

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		String sql;

		try {

			sql = "{call insertScore(?,?,?,?,?)}";

			cstmt = conn.prepareCall(sql);

			cstmt.setString(1, dto.getHak()); // 위의 ? 순서
			cstmt.setString(2, dto.getName());
			cstmt.setInt(3, dto.getKor());
			cstmt.setInt(4, dto.getEng());
			cstmt.setInt(5, dto.getMat());

			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}

	// 수정
	public int updateData(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;

		String sql;

		try {

			sql = "{call updateScore(?,?,?,?)}";

			cstmt = conn.prepareCall(sql);

			cstmt.setString(1, dto.getHak());
			cstmt.setInt(2, dto.getKor());
			cstmt.setInt(3, dto.getEng());
			cstmt.setInt(4, dto.getMat());

			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}

	// 삭제
	public int deleteData(String hak) {

		int result = 0;

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;

		String sql;

		try {
			sql = "{call deleteScore(?)}";

			cstmt = conn.prepareCall(sql);

			cstmt.setString(1, hak);

			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}

	// 전체출력
	public List<ScoreDTO> getList(){
		
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null; // select한 데이터를 담아놓는 그릇 인터페이스
		
		String sql;
		
		try {
			
			sql = "{call selectAllScore(?)}";
			
			cstmt = conn.prepareCall(sql);
			
			//out 파라미터의 자료형을 설정
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			
			//프로시져 실행
			cstmt.executeUpdate();
			
			// out 파라미터의 값을 돌려 받기
			rs = (ResultSet) cstmt.getObject(1);
			
			while(rs.next()) {
				
				ScoreDTO dto = new ScoreDTO(); // 반복문 안에 만들어져야 함 데이터가 5개면 5번 만들어지도록
				
				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString(2));// name
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt("ave"));
				dto.setRank(rs.getInt("rank"));
	
				lists.add(dto);
				
			}
			
			rs.close();
			cstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return lists;
	}

	// 이름 검색
	public List<ScoreDTO> getList(String name) {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null; // select한 데이터를 담아놓는 그릇 인터페이스

		String sql;

		try {

			sql = "{call selectNameScore(?,?)}";

			cstmt = conn.prepareCall(sql);

			// out 파라미터 자료형 설정
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);

			// in 파라미터
			cstmt.setString(2, name);

			// 프로시저 실행
			cstmt.executeUpdate();

			// out파라미터 값 받기
			rs = (ResultSet) cstmt.getObject(1);

			while (rs.next()) {

				ScoreDTO dto = new ScoreDTO(); // 반복문 안에 만들어져야 함 데이터가 5개면 5번 만들어지도록

				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString(2));// name
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt("ave"));

				lists.add(dto);

			}

			rs.close();
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;

	}

	// 학번검색
	public ScoreDTO getHakList(String hak) {

		ScoreDTO dto = null; // 객체생성 안해도 된다. 없을 수 도 있음
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null; // select한 데이터를 담아놓는 그릇 인터페이스

		String sql;

		try {

			sql = "{call selectHakScore(?,?)}";

			cstmt = conn.prepareCall(sql);

			// out 파라미터 자료형 설정
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);

			// in 파라미터
			cstmt.setString(2, hak);

			// 프로시저 실행
			cstmt.executeUpdate();

			// out파라미터 값 받기
			rs = (ResultSet) cstmt.getObject(1);

			if (rs.next()) {

				dto = new ScoreDTO(); // 반복문 안에 만들어져야 함 데이터가 5개면 5번 만들어지도록

				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString(2));// name
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt("ave"));

			}

			rs.close();
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;

	}

}
