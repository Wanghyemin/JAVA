package com.score6;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;
import oracle.jdbc.OracleTypes;

// DB�� �����ؼ� query�� �����ϴ� ��
// Data Access Object
public class ScoreDAO {

	// �Է�
	public int insertData(ScoreDTO dto) { // ��ȯ�� �Ƚᵵ �ȴ� // ��ȯ �Ǹ� 1, �ȵǸ� 0

		int result = 0;

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		String sql;

		try {

			sql = "{call insertScore(?,?,?,?,?)}";

			cstmt = conn.prepareCall(sql);

			cstmt.setString(1, dto.getHak()); // ���� ? ����
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

	// ����
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

	// ����
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

	// ��ü���
	public List<ScoreDTO> getList(){
		
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null; // select�� �����͸� ��Ƴ��� �׸� �������̽�
		
		String sql;
		
		try {
			
			sql = "{call selectAllScore(?)}";
			
			cstmt = conn.prepareCall(sql);
			
			//out �Ķ������ �ڷ����� ����
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			
			//���ν��� ����
			cstmt.executeUpdate();
			
			// out �Ķ������ ���� ���� �ޱ�
			rs = (ResultSet) cstmt.getObject(1);
			
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
			cstmt.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return lists;
	}

	// �̸� �˻�
	public List<ScoreDTO> getList(String name) {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null; // select�� �����͸� ��Ƴ��� �׸� �������̽�

		String sql;

		try {

			sql = "{call selectNameScore(?,?)}";

			cstmt = conn.prepareCall(sql);

			// out �Ķ���� �ڷ��� ����
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);

			// in �Ķ����
			cstmt.setString(2, name);

			// ���ν��� ����
			cstmt.executeUpdate();

			// out�Ķ���� �� �ޱ�
			rs = (ResultSet) cstmt.getObject(1);

			while (rs.next()) {

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
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;

	}

	// �й��˻�
	public ScoreDTO getHakList(String hak) {

		ScoreDTO dto = null; // ��ü���� ���ص� �ȴ�. ���� �� �� ����
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null; // select�� �����͸� ��Ƴ��� �׸� �������̽�

		String sql;

		try {

			sql = "{call selectHakScore(?,?)}";

			cstmt = conn.prepareCall(sql);

			// out �Ķ���� �ڷ��� ����
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);

			// in �Ķ����
			cstmt.setString(2, hak);

			// ���ν��� ����
			cstmt.executeUpdate();

			// out�Ķ���� �� �ޱ�
			rs = (ResultSet) cstmt.getObject(1);

			if (rs.next()) {

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
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;

	}

}
