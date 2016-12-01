package controller;

import org.springframework.stereotype.Controller;

import entities.Comments;
import service.CommentService;

@Controller
@RequestMapping(value = "")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	public HashMap<String, Object> addComment(int motId, String content){
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(!commentService.addComment(motId, content)){
			map.put("errorCode", 1);
			map.put("errorMsg", "Error! Cannot add comment.");
		}
		map.put("errorCode", 1);
		return map;
	}

	public HashMap<String, Object> deleteComment(int motId, int comtId){
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(!commentService.deleteComment(motId, comtId)){
			map.put("errorCode", 1);
			map.put("errorMsg", "Error! Cannot delete comment.");
		}
		map.put("errorCode", 1);
		return map;
	}
	
	public HashMap<String, Object> showComment(int motId){
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(!commentSevice.showAllComment(motId)){
			map.put("errorCode", 1);
			map.put("errorMsg", "Error! Cannot show comment.");
		}
		map.put("errorCode", 1);
		return map;
	}
	
	public HashMap<String, Object> modifyComment(int motId, int comtId, String content){
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(!commentService.modifyComment(motId, comtId, content)){
			map.put("errorCode", 1);
			map.put("errorMsg", "Error! Cannot modify comment.");
		}
		map.put("errorCode", 1);
		return map;
	}
}