package com.score6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

// DB�� �����ؼ� query�� �����ϴ� ��
// Data Access Object
public class ScoreDAO2 {

	// �Է�
	public int insertData(ScoreDTO dto) { // ��ȯ�� �Ƚᵵ �ȴ� // ��ȯ �Ǹ� 1, �ȵǸ� 0

		int result = 0;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {

			/*
			 * // Statement ��� sql = "insert into score (hak,name,kor,eng,mat) "; sql +=
			 * "values('"+dto.gethak()+"','"; dto.getName()+"','"; dto.getKor()+ ",";
			 * dto.getEng()+","; dto.getMat()+")";
			 */

			// PreparedStatement - ������ �ξ� �ܼ�������
			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql += "values(?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getHak()); // ���� ? ����
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

	// ����
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
	
	
	// ����
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
	
	// ��ü���
	public List<ScoreDTO> getList(){
		
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select�� �����͸� ��Ƴ��� �׸� �������̽�
		
		String sql;
		
		try {
			
			sql = "select hak,name,kor,eng,mat, ";
			sql += "(kor+eng+mat) tot, (kor+eng+mat)/3 ave, ";
			sql += "rank() over (order by (kor+eng+mat) desc) rank ";
			sql += "from score";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				ScoreDTO dto = new ScoreDTO(); // �ݺ��� �ȿ� ��������� �� �����Ͱ� 5���� 5�� �����������
				
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
		ResultSet rs = null; // select�� �����͸� ��Ƴ��� �׸� �������̽�
		
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
				
				ScoreDTO dto = new ScoreDTO(); // �ݺ��� �ȿ� ��������� �� �����Ͱ� 5���� 5�� �����������
				
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

		ScoreDTO dto=null; // ��ü���� ���ص� �ȴ�. ���� �� �� ����
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select�� �����͸� ��Ƴ��� �׸� �������̽�
		
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
				
				dto = new ScoreDTO(); // �ݺ��� �ȿ� ��������� �� �����Ͱ� 5���� 5�� �����������
				
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
			System.out.println("�˻��ȉ�");
		}
		
		return dto;
		
		
	}
	
	
	
	

}
