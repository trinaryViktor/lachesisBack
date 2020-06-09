# lachesisBack
UCI Medical Center Radiation and Oncology Lachesis Project

This is temperery open for public because I am still building the project.

# File Structure:

APIDOC file store the api documentation.

/src file store the main logic data
  /src/main/java contains com.inf191.lachesis package
  Controller file is controller level
  generate is class file and DAO class
  Helper file store the LRU Cache
  Server file store the main logic
  
  Under the /src/main/java/resource/generate
    that contains mybatis xml file
# how to deploy it:
  for big server, please use Docker to manage the services, but for small server, I jsut deploy it on the webserver.
  use maven generate .jar package,
  nohup java -jar lachesis.jar& 
  //then the code would run, do not forget to setup the database with the ip, user name, and password. in this project, I used root as user name and password
  
  
