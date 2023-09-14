# at_school_test

<h2 align="center">

    Данный проект позволяет расширить таблицу task в базе данных с помощью flayway и взаимодействовать с данными.
</h2>
<h3 >

    Исходная база данных имеет таблицу task со следующими столбцами: 
    int id;
    varchar alias;
    varchar name;
    varchar pipeline.

    Необходимо расширить таблицу task, добавив 2 столбца:
     varchar branch;
     varchar repository;
     
    Для этого созданы скрипты миграций, находящиеся в директории: src/main/resources/db.migration
    Запустить скрипты миграций командой: mvn flyway:migrate

    База данных и проект разворачиваются в Docker контейнере.

    Сначала необходимо собрать проект командой: mvn clean package. После этого появится директория 
    target, в которой будет содержаться .jar файл проекта. 
    Следующим шагом будет создание образа проекта из Dockerfile. 
    Для этого выполним команду: docker build -t docker-test:1.0-SNAPSHOT .
    Приложение использует базу данных, поэтому перед тем, как запустить созданный 
    образ (docker-test), необходимо развернуть БД в docker контейнере.
    Выполним команду: docker run --rm  --name docker-postgres -e POSTGRES_PASSWORD=password -d -p 5400:5432 postgres
    
    И наконец, запустим образ docker-test, образ нашего приложения:
    docker run -d -p 8081:8081 docker-test:1.0-SNAPSHOT
</h3>
