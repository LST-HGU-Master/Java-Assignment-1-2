# 課題 1-2: 定数の利用

### 課題の説明
教科書p.55のコード1-5を打ち込みプログラムを完成させなさい。
ただし、コード1-5にはそのままではエラーが発生し実行することができないため、期待される実行結果を得るように修正を加えること。
ただし、`final double PI = 3.14;` と `System.out.println(...)`の文は変更してはいけない。

### 修正前のプログラム
```java
public class Prog12 {

	public static void main(String[] args) {
		final double PI = 3.14; //変更しない
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);

		System.out.println("パイの半径を倍にします");
		PI = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
	}

}
```

### 期待される実行結果
```java
半径5cmのパイの面積は、
78.5
パイの半径を倍にします
半径10cmのパイの面積は、
314.0
```
