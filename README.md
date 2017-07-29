# Kotlin hello-world example with maven

## 요구사항

 * 메이븐 설치 [Apache Maven homepage](http://maven.apache.org/download.html)
 * 메이븐 설정 [the installation section](http://maven.apache.org/download.html#Installation)

## Compiling/Testing/Running the example

프로젝트에 메이븐 설정을 마쳤다면 아래와 같이 입력해서 예제 클래스들을 컴파일 할 수 있습니다.

	mvn test
	

## Only running the example

테스트 코드가 작동한 후에 maven의 exec 플러그인을 이용한

아래 커멘드를 통해서 예제를 실행해볼 수 있습니다

	mvn exec:java
	
