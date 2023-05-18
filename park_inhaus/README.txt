*수정 사항
DataService class의 main메서드가 crawlData 메서드로 이름이 바뀌었습니다.
Events class를 삭제하고 data class로 대체했습니다.
DataService의 crawlData 메서드가 Data 객체를 반환하기 위해서 DataDto class를 정의했습니다.

*추가 코드
DataController가 추가되었습니다.
DataService에서 DataRepository의 의존성을 주입받을 코드가 추가되었습니다.
DataRepository interface가 spring data JPA를 이용할 수 있도록 작성되었습니다.
DataBase로 crawlData 메서드에서 추출된 Data 객체가 저장될 수 있도록 saveData메서드가 DataService class 안에 추가되었습니다.

**추가 의존성
build.gradle에 dependencies에
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
의 두개의 의존성을 추가했습니다.


**주의사항
드라이버 경로 및 학번이 비어있습니다. 수정하셔야 합니다.

DataBase를 어떤걸로 하실지는 모르겠지만 mysql이나 oracle 등 사용하실 때 먼저 build.gradle에서 의존성을 추가하시고 시작하시는게 편할 것 같습니다.
추가적으로 DataRepository가 spring data JPA로 구현이 되어있어서 spring data JPA를 이용했을 때 어떻게 database 쿼리문을 작성해야하는지 찾아보면 더 편할 것 같습니다.
DataRopository에 주석처리 되어있는 코드는 spring data JPA를 이용할 때 database에서 원하는 data를 찾을 때 사용하는 코드를 임의로 작성했습니다.
필요하시면 사용하시고 필요없으시면 그대로 주석처리하면 될 것 같습니다. 사실 실제로 사용이 되는지 안되는지는 안해봐서 모르는... ㅠ





