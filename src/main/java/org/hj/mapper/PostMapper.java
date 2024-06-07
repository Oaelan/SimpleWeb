package org.hj.mapper;

import java.util.ArrayList;

import org.hj.model.PostInfo;

public interface PostMapper {
	// 게시글을 뿌리는
	public ArrayList<PostInfo> showPosts();
	// 게시글을 등록하는
	public void posting(PostInfo post);
	// 등록된 게시글의 상세 페이지
	public PostInfo showDetail(PostInfo post);
	
	// 로그인 후 게시글 삭제
	public void deletePost(PostInfo post);
	
	//게시글 삭제 후 bno 재정렬하기 위한 변수 선언문
	public void resetCount();
	
	//게시글 삭제 후 bno 재정렬
	public void resetBno();
	
	//수정할 게시글 가져오기
	public PostInfo getEditPost(PostInfo post);

	//게시글 수정하기
	public void updatePost(PostInfo post);
	
}
