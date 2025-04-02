```shell
# resources & wepbapp
touch src/main/resources/.env
mkdir -p src/main/webapp/WEB-INF/views
touch src/main/webapp/WEB-INF/views/index.jsp
# 소스코드 기준 변수화
BASE=src/main/java/org/example/jpaexercise
echo $BASE
# 주요 폴더 생성
mkdir -p $BASE/model/{dto,repository}
mkdir -p $BASE/{controller,service,config,util}
# .gitignore (윈도우일 경우 안될 수도 있으니 AI로 보강)
echo "\n### Dotenv ###\n.env" >> .gitignore
# 불필요한 파일 제거
rm $BASE/HelloServlet.java
rm src/main/webapp/index.jsp
```