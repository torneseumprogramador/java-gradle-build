# Instalação
- https://gradle.org/install/
```shell
sdk install gradle 7.4.2 # instalação via package manager
brew install gradle # instalação via brew MacOs
gradle -v # verifica versão
```

# Iniciar um projeto gradle
```shell
gradle init # inicia projeto
```

# Como fazer build
```shell
gradle build # sempre escolha a versão em sourceCompatibility do java que está instalado na máquina
```

# Como rodar testes
```shell
gradle test # Roda os testes da aplicação
```

# Mostra ppções disponíveis
```shell
gradle tasks
```

# Como rodar a aplicação
```shell
gradle bootRun # Roda os testes da aplicação
./gradlew bootRun # rodar por shell script
```

# Ver estatisticas de build no serviço do gradle
```shell
gradle build --scan # ao aceitar os termos vc passa a ter uma interface na web com estatísticas de build
```

# O arquivo build.gradle
```gradle
plugins {
	id 'org.springframework.boot' version '2.6.4'
	id 'io.spring.dependency-management' version '1.0.11.RELEASE'
	id 'java'
}

group = 'br.com.didox.testgradle'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '8'

repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

tasks.named('test') {
	useJUnitPlatform()
}
```

# Ver todas as dependencias do projeto
```shell
gradle buildEnvironment
gradle dependencies
```

# Build Jar ou War
```shell
java -jar build/libs/demo-0.0.1-SNAPSHOT.war
java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
```

