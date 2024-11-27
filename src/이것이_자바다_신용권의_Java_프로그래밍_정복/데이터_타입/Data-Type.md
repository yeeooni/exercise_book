### 타입 변환
데이터 타입을 다른 데이터 타입으로 변환하는 것.

예) byte -> int or int -> byte
타입 변환은 자동(묵시적) 타입 변환, 강제(명시적) 타입 변환이 있다.

작은 타입이 큰 타입으로 저장될 때 byte(1) -> int(4) or char(2) -> int or int -> long(8) or int -> double(8) or float(4) -> double
byte -> char 로 가는 것은 예외이다. __(음수를 허용하지 않기 때문에)___
float(4) 이지만 int(4) or long(8) 보다 크다. __(표현할 수 있는 수의 크기가 크기 때문에)__