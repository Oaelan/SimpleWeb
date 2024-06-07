package org.hj.service;

import java.util.ArrayList;

import org.hj.mapper.PostMapper;
import org.hj.model.PostInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServicelmpl implements PostService {

	@Autowired
	PostMapper pm;

	public ArrayList<PostInfo> showPosts() {
		return pm.showPosts();
	}

	public void posting(PostInfo post) {
		pm.posting(post);
	}

	public PostInfo showDetail(PostInfo post) {
		return pm.showDetail(post);
	}

	public void deletePost(PostInfo post) {
		pm.deletePost(post);
		pm.resetCount();
		pm.resetBno();
	}

	public void resetCount() {
	}

	public void resetBno() {

	}

	public PostInfo getEditPost(PostInfo post) {
		return pm.getEditPost(post);
	}

	public void updatePost(PostInfo post) {
		pm.updatePost(post);
	}

}
