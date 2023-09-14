# at_school_test

<h2 align="center">

    ������ ������ ��������� ��������� ������� task � ���� ������ � ������� flayway � ����������������� � �������.
</h2>
<h3 >

    �������� ���� ������ ����� ������� task �� ���������� ���������: 
    int id;
    varchar alias;
    varchar name;
    varchar pipeline.

    ���������� ��������� ������� task, ������� 2 �������:
     varchar branch;
     varchar repository;
     
    ��� ����� ������� ������� ��������, ����������� � ����������: src/main/resources/db.migration
    ��������� ������� �������� ��������: mvn flyway:migrate

    ���� ������ � ������ ��������������� � Docker ����������.

    ������� ���������� ������� ������ ��������: mvn clean package. ����� ����� �������� ���������� 
    target, � ������� ����� ����������� .jar ���� �������. 
    ��������� ����� ����� �������� ������ ������� �� Dockerfile. 
    ��� ����� �������� �������: docker build -t docker-test:1.0-SNAPSHOT .
    ���������� ���������� ���� ������, ������� ����� ���, ��� ��������� ��������� 
    ����� (docker-test), ���������� ���������� �� � docker ����������.
    �������� �������: docker run --rm  --name docker-postgres -e POSTGRES_PASSWORD=password -d -p 5400:5432 postgres
    
    � �������, �������� ����� docker-test, ����� ������ ����������:
    docker run -d -p 8081:8081 docker-test:1.0-SNAPSHOT
</h3>
