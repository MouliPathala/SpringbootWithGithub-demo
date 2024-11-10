package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWithGithubDemoApplication {

        private Map<String,Object> cache=new HashMap<String,Object>();

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithGithubDemoApplication.class, args);
		int i=10;
                int j=20;
	}

        public void lodaDataToCache(){

               //logic
        }

}
