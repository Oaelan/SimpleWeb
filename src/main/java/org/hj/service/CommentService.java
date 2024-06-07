package org.hj.service;

import java.util.ArrayList;

import org.hj.model.CommentVO;

public interface CommentService {
	public void commentUpload(CommentVO cvo);
	public ArrayList<CommentVO> showComments(CommentVO cvo);
}
