package org.hj.mapper;

import java.util.ArrayList;

import org.hj.model.CommentVO;

public interface CommentMapper {

	public void commentUpload(CommentVO cvo);
	
	public ArrayList<CommentVO>showComments(CommentVO cvo);
	
}
