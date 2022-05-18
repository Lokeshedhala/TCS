package ecommerceapp.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestMessage {
@GetMapping(value = "/showmessage") // this is called point
String displayMessage() {

	return "hi how are you";

}

}
