package com.github.mperry.rest;

import groovy.transform.Canonical;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created with IntelliJ IDEA.
 * User: MarkPerry
 * Date: 6/12/13
 * Time: 9:14 AM
 * To change this template use File | Settings | File Templates.
 */
//@Canonical
@Controller
@RequestMapping("")
class RestController {

	@RequestMapping("/person")
	public @ResponseBody Person person() {
		return new Person("mark", "perry", 1978);
	}

}
