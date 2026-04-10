# Java OOP Practice: Animal Example

Javaの基礎文法とオブジェクト指向（OOP）理解を深めるために作成した練習コードです。  
特に **継承 / オーバーライド / 多態性 / インターフェース / カプセル化** を意識して実装しています。

---

## 目的
- JavaのOOPの基本要素（継承・多態性・抽象・インターフェース）を理解する
- 親クラスで子クラスを扱う「ポリモーフィズム」を体感する
- 実務を意識した設計（責務分離・カプセル化・テスト）に触れる

---

## 技術スタック
- Java 21
- Maven
- JUnit 5
- VSCode

---

## ディレクトリ構成
```
.
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       ├── level1
│   │       │   ├── animal
│   │       │   │   ├── Animal.java
│   │       │   │   ├── Dog.java
│   │       │   │   ├── Cat.java
│   │       │   │   ├── Bird.java
│   │       │   │   ├── Flyable.java
│   │       │   │   └── FinalAnimal.java
│   │       │   └── sample
│   │       │       └── AbstractAnimal.java
│   │       └── level2
│   │           ├── AnimalRunner.java
│   │           ├── RunnerAnimal.java
│   │           └── RunnerAnimalCreate.java
│   └── test
│       └── java
│           ├── level1
│           │   └── animal
│           │       ├── DogTest.java
│           │       └── BirdTest.java
│           └── level2
│               └── RunnerAnimalCreateTest.java
```

---

## クラス構造（概要）
```
Animal（基底クラス）
  ↑
  ├ Dog
  ├ Cat
  └ Bird → implements Flyable
```

---

## 設計ポイント

### 1. ポリモーフィズム
```java
Animal[] animals = {
    new Dog("Pochi"),
    new Cat("Mimi"),
    new Bird("Pipi")
};
```
→ 親型で子クラスを扱う

---

### 2. カプセル化
```java
private final String name;

protected String getName() {
    return name;
}
```
→ フィールドを直接触らせない

---

### 3. 責務分離
- create：生成
- process：処理

---

### 4. instanceof排除（改善済）
```java
animal.getTypeLabel();
```
→ ポリモーフィズムで分岐を排除

---

## テスト（JUnit）

### 実施内容
- Dog / Bird の戻り値確認
- Bird が Flyable を実装しているか
- Animal配列でのポリモーフィズム動作確認

### 実行方法
```
mvn test
```

---

## ビルド

```
mvn clean install
```

---

## 環境構築

### 1. Javaインストール
```
java -version
```

### 2. Mavenインストール
```
mvn -version
```

### 3. VSCode拡張
- Extension Pack for Java

---

## 今後の改善（ToDo）
- speak() をテスト可能な設計に変更（return化）
- buildLabel() のような純粋関数の導入
- Abstractクラスと通常クラスの役割整理
- テストケースの追加（境界値・異常系）

---

## ハマったポイント / 困ったこと

### 1. JUnitが動かない問題
- Mavenを使わないと `org.junit` が解決できずエラーになる
- 手動でJARを入れる方法もあるが、依存関係管理が非常に面倒
-  Mavenで `pom.xml` に依存関係を追加することで解決

---

### 2. VSCodeでテストのRunボタンが出ない
- Mavenでは `mvn test` で実行できるが、VSCode上で実行ボタンが出ないことがある
- 原因はJava Test Runnerの再読込や認識遅延
- `Java: Clean Java Language Server Workspace` で解決

---

### 3. packageとimportの理解不足
- 別パッケージのクラスが使えずエラーになる
- `import level1.animal.*;` が必要

---

### 4. voidメソッドはテストしにくい
- `System.out.println` だけではJUnitで検証できない
- return値を持つメソッドに変更する必要がある

---

### 5. Mavenプロジェクトの理解不足
- `pom.xml` がないと `mvn` コマンドが動かない
-  プロジェクト直下に配置する必要あり

---

### 6. Gitでブランチ削除の不安
- `git branch -d main` を削除してしまったが問題なし
-  ローカルのみ削除されるため、`origin/main` から復元可能

---

## 学びポイント
- 「テストしやすい設計」が重要
- 「出力」ではなく「戻り値」で設計する
- Mavenによる依存管理の重要性
- パッケージとimportの理解

---

## まとめ
このプロジェクトは単なるOOP学習ではなく、

👉 **設計・テスト・ビルドまで含めた実務ベースの練習**

を目的としています。
