package org.hj.service;

import java.util.ArrayList;

import org.hj.model.PostInfo;

public interface PostService {

	public ArrayList<PostInfo> showPosts();

	public void posting(PostInfo post);

	public PostInfo showDetail(PostInfo post);

	public void deletePost(PostInfo post);

	public void resetCount();
	
	public void resetBno();
	
	public PostInfo getEditPost(PostInfo post);

	public void updatePost(PostInfo post);
}