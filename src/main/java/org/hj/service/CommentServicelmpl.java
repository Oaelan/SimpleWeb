package org.hj.service;

import java.util.ArrayList;

import org.hj.mapper.CommentMapper;
import org.hj.model.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServicelmpl implements CommentService {
	@Autowired
	CommentMapper cm;

	public void commentUpload(CommentVO cvo) {
		cm.commentUpload(cvo);
	}
	
	public ArrayList<CommentVO> showComments(CommentVO cvo){
		return cm.showComments(cvo);
	}
}