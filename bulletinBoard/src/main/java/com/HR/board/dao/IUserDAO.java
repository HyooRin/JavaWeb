package com.HR.board.dao;

import java.util.ArrayList;

import com.HR.board.dto.UserDTO;

public interface IUserDAO {
	
	ArrayList<UserDTO> select();
	int insert();
	int update();
	int delete();

}
