# 메서드 (Method)

---

## 메서드란?

- 특정 작업을 수행하는 코드의 집합(함수)

## 메서드의 구성

```java

ReturnType nameOfTheMethod() {
	// Body of the Method
}
```

- 모든 메서드는 이름이 필요
- 메서드는 코드를 포함함
- 리턴 타입은 메서드가 실행한 후 호출한 곳으로 전달하는 결과값의 타입
- 리턴값이 없는 메소드는 void로 작성

예제

```java
package Method;

public class CreateMethod {

    public static void sayHelloTwice() {
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void main(String[] args) {

        sayHelloTwice();

        // 결과 :
        // Hello World
        // Hello World


    }
}
```

- sayHelloTwice 라는 메소드를 만들고 main() 에서 sayHelloTwice로 호출했더니 그 메서드 안의 코드가 실행되었다
