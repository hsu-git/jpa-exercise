```shell
touch src/main/resources/.env
mkdir -p src/main/webapp/WEB-INF/views
touch src/main/webapp/WEB-INF/views/index.jsp
rm src/main/webapp/index.jsp
BASE=src/main/java/org/example/jpaexercise
echo $BASE
mkdir -p $BASE/model/{dto,repository}
mkdir -p $BASE/{controller,service,config,util}
echo "\n### Dotenv ###\n.env" >> .gitignore
```