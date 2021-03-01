package com.orawts1.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*IoC = 제어의 역전 invert of control?
	 * 개발자가 new X
	 * 스프링이 new O
	 * 이유는 싱글톤패턴 사용과 레퍼런스변수를 스프링이 관리 하겠다는것.
	 *  Class Test
	 *  void Hello A a = new A();
	 *  new를 사용함으로서 heap 공간을 하나 만들고 a로 가르킴 
	 *  특정 Method 내부에서 지역변수로 설정
	 *  Method를 호출 해야만이 변수가 메모리에 떳다가 호출이 끝나면 사라진다.
	 *  이처럼 new 하면 변수관리를 리턴하던가, 전역을 쓰던가 해야함으로 스프링이 그렇게 하지 못하게 하고
	 *  관리를 스프링에서 관리하겠다.
	 *  어떤 페키지가 있을때 페키지 하위 전체를 스캔해서 필요한것들을 메모리로드 IoC 싱글톤
	 *  스프링컨테이너에서 페키지를 스켄해서 관리한다. 
	 *  그래서 페키지를 임의로 만들게되면 스프링이 스켄하지 않고 결국 메모리에 뜨지 않아서 진행이 불가하다.
	 *  항상 페키지 이하에서 페키지를 만들어야한다.
	 *  com.orawts1.test << 이런거 불가하다.
	 *  
	 *  Class A
	 *  
	 *  
	 *  Class B
	 *@Controller//스프링이 com.orawts1.blog 이하를 스캔해서 모든 파일을 메모리에 new 하는것은 아니구요
					//특정 어노테이션이 붙어 있는 클래스파일들을 new 해서(IoC) 스프링컨테이너에서 관리한다.   
	 * */

@RestController
public class BlogControllerTest {
		//http://localhost:8080/test/hello로 접속하면 아래의 내용이 뜬다.
		@GetMapping("/test/hello")
		public String hello() {
			return "<h1>hello spring boot</h1>";			
		}
		
}
