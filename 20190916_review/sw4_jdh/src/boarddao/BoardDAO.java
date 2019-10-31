package boarddao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.JDBCUtil;
import vo.BoardBean;

public class BoardDAO {
	
	Connection con = null;
	
	private BoardDAO() {}
	private static BoardDAO boardDao=null;
	
	public static BoardDAO getInstance() {
		if(boardDao==null) {
			boardDao = new BoardDAO();
		}
		return boardDao;
	}
	public void setConnection(Connection con) {
		this.con = con;
	}
	
	//db���
	public void insertDB(BoardBean data) {
		
		PreparedStatement pstmt=null;
		
		try {
			pstmt=con.prepareStatement("INSERT INTO product VALUES(?,?,?,?,?,?,?);");
			pstmt.setString(1, data.getCode());
			pstmt.setString(2, data.getPname());
			pstmt.setInt(3, data.getCost());
			pstmt.setInt(4, data.getPnum());
			pstmt.setInt(5, data.getJnum());
			pstmt.setInt(6, data.getSale());
			pstmt.setString(7, data.getGcode());
			if(data.getCode().length()<4) {
				pstmt.executeUpdate();
				JDBCUtil.commit(con);
				System.out.println("DB������Ʈ ����");
			}else {
				System.out.println("code�Ǳ��̴� 3���ڱ����� �����մϴ�");
			}
			
		} catch(Exception e) {
			System.out.println("DB������Ʈ����" + e);
		}finally {
			JDBCUtil.close(pstmt);
		}
	}
	
	//db��ȸ
	public BoardBean FindDB(String code) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardBean boardBean = null;
		try {
			pstmt=con.prepareStatement("select * from product where CODE=?;");
			pstmt.setString(1,code);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				boardBean = new BoardBean();
				boardBean.setCode(rs.getString("code"));
				boardBean.setPname(rs.getString("pname"));
				boardBean.setCost(rs.getInt("cost"));
				boardBean.setPnum(rs.getInt("pnum"));
				boardBean.setJnum(rs.getInt("jnum"));
				boardBean.setSale(rs.getInt("sale"));
				boardBean.setGcode(rs.getString("gcode"));
			}
			
			System.out.println("������ �ҷ����� ����" );
		}catch(Exception e){
			System.out.println("������ �ҷ����� ����" + e);
		}finally {
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
		}
		return boardBean;
	}
	
	public void FixDB(BoardBean data) {
		PreparedStatement pstmt = null;
		
		try {
			pstmt=con.prepareStatement("UPDATE product SET code=?, pname=?, cost=?, pnum=?, jnum=?, sale=?, gcode=? WHERE code=?;");
			pstmt.setString(1,data.getCode());
			pstmt.setString(2,data.getPname());
			pstmt.setInt(3,data.getCost());
			pstmt.setInt(4,data.getPnum());
			pstmt.setInt(5,data.getJnum());
			pstmt.setInt(6,data.getSale());
			pstmt.setString(7,data.getGcode());
			pstmt.setString(8,data.getCode());
			
			pstmt.executeUpdate();
			JDBCUtil.commit(con);
			System.out.println("DB�����Ϸ�");
			
		}catch(Exception e){
			System.out.println("DB��������" + e);
		}finally {
			JDBCUtil.close(pstmt);
		}
		
	}
	
	public void DeleteDB(String code) {
		PreparedStatement pstmt = null;
		
		try {
			pstmt=con.prepareStatement("DELETE FROM product WHERE code=?;");
			pstmt.setString(1,code);
		
			pstmt.executeUpdate();
			JDBCUtil.commit(con);
			System.out.println("DB�����Ϸ�");
		}catch(Exception e){
			System.out.println("DB��������" + e);
		}finally {
			JDBCUtil.close(pstmt);
		}
	}
}
