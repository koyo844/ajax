package com.example.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.form.PassForm;
import org.springframework.web.bind.annotation.ModelAttribute;

public class CheckPassController {

	@Controller
	@RequestMapping("/checkPass")
	public class CheckEmailController {

		// 入力画面の内容を示すメソッド
		@RequestMapping("")
		public String index() {
			return "input_pass";
		}
		
		@ManagedAttribute
		PassForm setUpInputForm() {
			return new PassForm();
		}
		
		@ResponseBody
		@RequestMapping(value = "/check", method = RequestMethod.POST)
		public Map<String, String> check(PassForm form) {
			Map<String, String> map = new HashMap<>();
			String duplicateMessage = null;
			if (form.getPassword().equals(form.getSecondPassword())) {
				duplicateMessage = "確認用パスワード入力OK";
			} else {
				duplicateMessage = "間違っています";
			}
			map.put("duplicateMessage", duplicateMessage);
			return map;
		}
	}
}
