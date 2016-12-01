package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entities.Moments;
import service.MomentService;

@Controller
@RequestMapping(value = "")
public class MomentController {

	@Autowired
	MomentService momentservice = new MomentService();

	@RequestMapping(value = "submitMomentAction",method = RequestMethod.POST)
	public void sendMoment(String motContent, int id) {
		momentservice.saveContent(motContent, id);
	}

	@RequestMapping(value = "getMomentsAction", method = RequestMethod.POST)
	public List showAllMoment() {
		return momentservice.showAllMoment();
	}

	@RequestMapping(value = "getOwnMomentsAction", method = RequestMethod.POST)
	public List showOwnMoment() {
		return momentservice.showOwnMoment();
	}

}
