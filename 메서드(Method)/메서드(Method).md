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

## 메서드의 parameter(매개변수) 와 argument(인자)

parameter : 매서드를 정의할때 적는 변수
argument : 메서드를 호출할때 실제로 넣는 값

```java

public static void greet(String name) {
// String name 이부분이 parameter
	   System.out.println("안녕하세요 " + name);
}

```

```java

// 호출
// 철수 이부분이 argument 이다
greet("철수")

```

### 메서드 오버로딩

같은 이름을 갖고 있지만, 서로 다른 매개변수 형식을 가지고 있는 메서드를 여러 개 정의하는 것

```java

// 두 개의 메서드는 같은 이름을 갖지만 다른 매개 변수를 가지고 있어 메서드를 여러개 정의함

public static void Number(int firstNumber) {
		   System.out.println(firstNumber);
}

public static void Number(int firstNumber, int secondNumber) {
		   System.out.println(firstNumber+secondNumber);
}

```

- 메서드 오버로딩은 왜 필요할까?

메서드 오버로딩은 비슷한 기능을 같은 이름으로 사용하게 해 코드의 가독성을 높히기 위해 사용

```java
// 단순히 숫자를 더하는 기능이 필요하면 타입이나 매개변수 개수마다 다른 메서드 이름을 설정해야 하지만
// 메서드 오버로딩으로 인해 같은 기능의 메서드를 매개변수만 다르게 하여 여러 메서드를 만들수있다
public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### void 와 return

void : 메서드가 값은 반환하지 않는다는 것을 나타내기 위한 반환 타입
return : 메서드의 실행을 끝내고 , 값을 호출한 곳으로 돌려주는 키워드 동시에 메서드를 종료시킴

```java

// 이 메서드는 실행만 될뿐 값을 반환하지 않음
public static void hello() {
    System.out.println("안녕");
}

// return 문으로 인해 결과를 호출한 곳에 반환
public static int add(int a, int b) {
    return a + b;
}

```

return 문은 왜 사용할까?

-> 메서드가 계산하거나 만든 결과를 다른 곳에서 다시 사용할 수 있기 때문

```java

public static int add(int a, int b) {
    return a + b;
}

public static void main(String[] args) {
	int result = add(3, 5);
	System.out.println(result);
}
// 위와 같이 메서드를 활용할 수 있음

```
