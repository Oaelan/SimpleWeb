package org.hj.controller;

import javax.servlet.http.HttpSession;

import org.hj.model.CommentVO;
import org.hj.model.PostInfo;
import org.hj.service.CommentService;
import org.hj.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PostsController {
	@Autowired
	PostService ps;

	@Autowired
	CommentService cs;

	@GetMapping("/board")
	public String showPosts(Model model, HttpSession session) {
		String userId = (String) session.getAttribute("id");
		boolean isLoggedIn = (userId != null);
		model.addAttribute("isLoggedIn", isLoggedIn);
		model.addAttribute("post", ps.showPosts());
		session.removeAttribute("CommentBno");
		return "board/board";
	}

	// 로그아웃 서버
	@GetMapping("/logout")
	public String logOut(HttpSession session, Model model) {
		session.removeAttribute("id");
		System.out.println("로그아웃");
		model.addAttribute("post", ps.showPosts());
		return "board/board";
	}

	// 게시글 작성 페이지
	@GetMapping("/posting")
	public String post() {
		return "board/posting";
	}

	// 게시글 작성 후 등록 서버
	@PostMapping("/posted")
	public String posting(HttpSession session, PostInfo post) {
		// 게시글 작성할 때 writer 값은 세션에 저장되어 있는 id값으로 setter 해줬다.
		// 왜냐하면 사용자가 입력하는 값은 제목 내용이니까
		post.setWriter((String) session.getAttribute("id"));
		ps.posting(post);
		return "redirect:/board";
	}

	// 게시글 상세 페이지
	// 댓글까지 뿌리는 기능
	@GetMapping("/boardDetail")
	public String showDetail(PostInfo post, Model model, HttpSession session,
			CommentVO cvo) {
		
		if (session.getAttribute("CommentBno") == null) {
			cvo.setBno(post.getBno());
			cs.showComments(cvo);
			model.addAttribute("detail", ps.showDetail(post));
			model.addAttribute("comments", cs.showComments(cvo));
			
			// 로그인한 사용자와 게시글을 작성한 사용자의 아이디가 일치할 때 수정,삭제 가능
			String userId = (String) session.getAttribute("id");
			System.out.println("게시글 상세 페이지");
			if (userId != null) {
				// 같을때 true 아닐 때 false
				// 자바에서 문자열이 같은지를 비교할 때는 equals 메서 드를 쓰자 == 쓰지마라
				boolean sameUser = (userId.equals(ps.showDetail(post).getWriter()));
				model.addAttribute("sameUser", sameUser);

				return "board/detailboard";
			} else {
				return "board/detailboard";
			}
		} else {

			post.setBno((int)session.getAttribute("CommentBno"));
			cvo.setBno(post.getBno());			
			model.addAttribute("detail", ps.showDetail(post));
			model.addAttribute("comments", cs.showComments(cvo));
			// 로그인한 사용자와 게시글을 작성한 사용자의 아이디가 일치할 때 수정,삭제 가능
			String userId = (String) session.getAttribute("id");
			System.out.println(cs.showComments(cvo));
			if (userId != null) {
				// 같을때 true 아닐 때 false
				// 자바에서 문자열이 같은지를 비교할 때는 equals 메서 드를 쓰자 == 쓰지마라
				boolean sameUser = (userId.equals(ps.showDetail(post).getWriter()));
				model.addAttribute("sameUser", sameUser);
				return "board/detailboard";
			} else {
				return "board/detailboard";
			}
		}

	}

	// 게시글 삭제
	@PostMapping("/delete")
	// 선택한 게시글의 번호와 일치하는 데이터를 지울거임
	public String deletePost(PostInfo post) {

		System.out.println(post.getBno());
		System.out.println("삭제");
		ps.deletePost(post);
		return "redirect:/board";
	}

	// 게시글 수정하러 가는 페이지
	@GetMapping("/edit")
	public String editPost(PostInfo post, Model model) {
		model.addAttribute("getEditPost", ps.getEditPost(post));
		System.out.println("수정화면");

		return "board/edit";
	}

	// 게시글 수정
	@PostMapping("/update")
	public String updatePost(PostInfo post) {
		ps.updatePost(post);
		System.out.println("수정완료");
		return "redirect:/board";
	}

	// 댓글 다는거

	@PostMapping("/commentUpload")
	public String commentUpload(CommentVO cvo, HttpSession session) {
		cvo.setWriter((String) session.getAttribute("id"));
		session.setAttribute("CommentBno",cvo.getBno());
		cs.commentUpload(cvo);
		//System.out.println(cvo.toString());
		return "redirect:/boardDetail";
	}
	
//	@PostMapping("/commentUpload")
//	public String commentUpload(CommentVO cvo, HttpSession session, RedirectAttributes rttr) {
//		cvo.setWriter((String) session.getAttribute("id"));
//		cs.commentUpload(cvo);
//		rttr.addFlashAttribute("bno", cvo.getBno());
//		//System.out.println(cvo.toString());
//		return "redirect:/boardDetail";
//	}
}
