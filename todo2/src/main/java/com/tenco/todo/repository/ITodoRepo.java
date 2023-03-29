package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;

public interface ITodoRepo {
	
	public ArrayList<TodoDTO> select();
	public int insert(TodoDTO dto);
	public int update(String description, String title);
	public int delete(int id);

}
