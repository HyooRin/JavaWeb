package com.tenco.todo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.utils.DBHelper;

public class TodoDAO implements ITodoRepo{
	
	private DBHelper dbHelper;
	private Connection conn;
	
	public TodoDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public ArrayList<TodoDTO> select() {
		
		ArrayList<TodoDTO> list = new ArrayList<>();
		
		String queryStr = " SELECT * FROM todolist ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				int priority = rs.getInt("priority");
				int completed = rs.getInt("completed");
				String createdAt = rs.getString("createdAt");
				int categoryId = rs.getInt("category_id");
				TodoDTO dto = new TodoDTO(id, title, description, priority, completed, createdAt, categoryId);
				System.out.println(dto.toString());
				list.add(dto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return list;		
	}

	@Override
	public int insert(TodoDTO dto) {
		
		int resultRowCount = 0;
		
		String queryStr = " INSERT INTO todolist(title, description, priority, completed,category_id) "
				+ " VALUES( ?, ?, ?, ?, ?) " ;
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getDescription());
			pstmt.setInt(3, dto.getPriority());
			pstmt.setInt(4, dto.getCompleted());
			pstmt.setInt(5, dto.getCategoryId());
			
			resultRowCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return resultRowCount;
	}

	@Override
	public int update(String description, String title) {
		
		int resultRowCount = 0;
		String queryStr = " UPDATE todolist SET description = ? WHERE title = ?  ";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, description);
			pstmt.setString(2, title);
			resultRowCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return resultRowCount;
	}

	@Override
	public int delete(int id) {
		
		int resultRowCount = 0;
		String queryStr = " DELETE FROM todolist WHERE id = ? ";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setInt(1, id);
			resultRowCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return resultRowCount;
	}
	

}
