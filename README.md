# Iniciar um projeto gradle
```shell
gradle init
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

# Ver todas as dependencias do projeto
```shell
gradle buildEnvironment
gradle dependencies
```