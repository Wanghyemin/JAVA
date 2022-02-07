package com.score6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

// DB에 연동해서 query를 실행하는 곳
// Data Access Object
public class ScoreDAO2 {

	// 입력
	public int insertData(ScoreDTO dto) { // 반환값 안써도 된다 // 반환 되면 1, 안되면 0

		int result = 0;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {

			/*
			 * // Statement 방식 sql = "insert into score (hak,name,kor,eng,mat) "; sql +=
			 * "values('"+dto.gethak()+"','"; dto.getName()+"','"; dto.getKor()+ ",";
			 * dto.getEng()+","; dto.getMat()+")";
			 */

			// PreparedStatement - 쿼리가 훨씬 단순해진다
			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql += "values(?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getHak()); // 위의 ? 순서
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}

	// 수정
	public int updateData(ScoreDTO dto) {

		int result = 0;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;

		String sql;

		try {

			sql = "update score set kor = ?, eng= ?,mat= ? where hak = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, dto.getKor());
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setString(4, dto.getHak());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}
	
	
	// 삭제
	public int deleteData(String hak) {
		
		int result = 0;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		
		String sql;
		
		try {
			sql = "delete score where hak = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, hak);
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
					
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
		
	
		
	}
	
	// 전체출력
	public List<ScoreDTO> getList(){
		
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select한 데이터를 담아놓는 그릇 인터페이스
		
		String sql;
		
		try {
			
			sql = "select hak,name,kor,eng,mat, ";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave, ";
			sql += "rank() over (order by (kor+eng+mat) desc) rank ";
			sql += "from score";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
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
			pstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return lists;
	}
	
	
	public List<ScoreDTO> getList(String name){

		
		
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select한 데이터를 담아놓는 그릇 인터페이스
		
		String sql;
		
		try {
			
			sql = "select hak,name,kor,eng,mat, ";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave ";
			//sql += "rank() over (order by (kor+eng+mat) desc) rank ";
			sql += "from score where name like ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name+"%");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
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
			pstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return lists;
		
		
	}
	
public ScoreDTO getHakList(String hak){

		ScoreDTO dto=null; // 객체생성 안해도 된다. 없을 수 도 있음
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select한 데이터를 담아놓는 그릇 인터페이스
		
		String sql;
		
		try {
			
			sql = "select hak,name,kor,eng,mat, ";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave ";
			//sql += "rank() over (order by (kor+eng+mat) desc) rank ";
			sql += "from score where hak=?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, hak);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
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
			pstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("검색안됌");
		}
		
		return dto;
		
		
	}
	
	
	
	

}
