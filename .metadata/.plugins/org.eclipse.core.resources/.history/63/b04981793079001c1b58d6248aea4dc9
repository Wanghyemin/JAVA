package com.project;

public class ThreadEnd extends Thread {

	String print;

	public void string() { // COVID 19 그림 프린트

		print = "□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□\r\n" 
				+ "□□■■■□□■■■■■□■□□□□□■□■■■□■■■■□□□□□■□□□□■■■□□\r\n"
				+ "□■□□□■□■□□□■□■□□□□□■□□■□□■□□□■□□□■■□□□■□□□■□\r\n"
				+ "□■□□□□□■□□□■□■□□□□□■□□■□□■□□□■□□■□■□□□■□□□■□\r\n"
				+ "□■□□□□□■□□□■□■□□□□□■□□■□□■□□□■□□□□■□□□□■■■■□\r\n"
				+ "□■□□□□□■□□□■□□■□□□■□□□■□□■□□□■□□□□■□□□□□□□■□\r\n"
				+ "□■□□□■□■□□□■□□□■□■□□□□■□□■□□□■□□□□■□□□■□□□■□\r\n"
				+ "□□■■■□□■■■■■□□□□■□□□□■■■□■■■■□□□■■■■■□□■■■□□\r\n"
				+ "□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□";

		System.out.println(print);

	}

	public void xstring() { // COVID 19 그림 반전 프린트

		String xprint = "";
		for (int i = 0; i < print.length(); i++) {

			String str = print.substring(i, i + 1);

			if (str.equals("■")) {
				str = "□";
			} else if (str.equals("□")) {
				str = "■";
			}
			xprint += str;
		}

		System.out.println(xprint);
	}

	public void nomask() {

		String[] end = {				  
				  "□                                      ~!!!!!!!:,                                    □\r\n"
				, "□                                 ;*$@@@#=!;;*#@@@@=*,                               □\r\n"
				, "□                            #@@~.                    .#@#!                          □\r\n"
				, "□                          @@@                           $@@:                        □\r\n"
				, "□                        -@@                               ;@@                       □\r\n"
				, "□                     .@$,                                    =@=                    □\r\n"
				, "□                    .@@.                                      *@*                   □\r\n"
				, "□                   =@,                                          =@-                 □\r\n"
				, "▦                  .@*                                            @@                 ▦\r\n"
				, "▦                  @$        ##@#:                    *@@#~       .@.                ▦\r\n"
				, "▦                  @!       @@  :@:                  #@  $@@       $@                ▦\r\n"
				, "▦                 $@        @#  .@*                  @;  .@@       ;@~               ▦\r\n"
				, "▦                 @@        $@#-@@-                  ;@!-@@-        @@               ▦\r\n"
				, "▦                 @#          ***                     ~***          @@               ▦\r\n"
				, "▦                 @#     ~:   ::    ~-               .:    :  ::    @@               ▦\r\n"
				, "▦                 @#    $@!  *@: .=@:               -@$  !@=  *@=   @@               ▦\r\n"
				, "▦                 @#  .$@; .@@- .@=,               =@:  @@~  $@,    @@               ▦\r\n"
				, "▦                 @@  .~.  ,-   .-                 -.   -.  ~       @@               ▦\r\n"
				, "▦                 #@                                               !@:               ▦\r\n"
				, "▦                  @!                  @       $@                  $@                ▦\r\n"
				, "■                   @$                 @=     .@@                 @.                 ■\r\n"
				, "■                   .@*                =@@,,,;@@                @@                   ■\r\n"
				, "■                    =@,                .*@@@$!                *@-                   ■\r\n"
				, "■                     .$@.                                   -@!                     ■\r\n"
				, "■                       ,@@.                               !@=                       ■\r\n"
				, "■                         =@;                            $@-                         ■\r\n"
				, "■                            #@-.                   .$@#=                            ■\r\n"
				, "■                                ;*#@@@$*;::!=@@@@$*-                                ■\r\n"
				, "■                                     .:!!!!!!!!~                                    ■\r\n"};
			
		try {
			
			
			for(int i=0;i<end.length;i++) {
				System.out.print(end[i]);
				sleep(30);
			}	} catch (Exception e) {
				// TODO: handle exception
			}
	}

	@Override
	public void run() {

		try {
			sleep(500);
			string();
			
			sleep(500);
			nomask();
			
			sleep(300);
			xstring();
			

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
