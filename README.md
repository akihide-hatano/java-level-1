# Java OOP Practice: Animal Example

Javaの基礎文法とオブジェクト指向（OOP）理解を深めるために作成した練習コードです。  
特に **継承 / オーバーライド / 抽象クラス / インターフェース / final** を意識して実装しています。

---

## 目的（Why）
- JavaのOOPの基本要素（継承・多態性・抽象・インターフェース）を、最小構成のコードで手を動かして確認する
- 「親型で扱って子クラスの振る舞いが呼ばれる（polymorphism）」を体感する
- 抽象クラス・インターフェース・final の役割の違いを整理する

---

## 構成（Directory）
.
├── level1
│   ├── Main.java
│   └── animal
│       ├── AbstractAnimal.java
│       ├── Animal.java
│       ├── Bird.java
│       ├── Cat.java
│       ├── Dog.java
│       ├── FinalAnimal.java
│       └── Flyable.java
└── level2
├── AnimalRunner.java
├── RunnerAnimal.java
└── RunnerAnimalCreate.java

---

## クラス関係（ざっくり図）
      +------------------+
      |     Animal       |
      |  (base class)    |
      +------------------+
         ^       ^     ^
         |       |     |
       Dog     Cat   Bird  ---- implements ----> Flyable
                              (fly capability)

---

## 各クラスの意図
### level1/animal
- `Animal`  
  基底クラス。`name` を持ち、`speak()` を持つ（子クラスでオーバーライドして鳴き声を変える想定）。
- `Dog`, `Cat`, `Bird`  
  `Animal` を継承し `speak()` をオーバーライドして振る舞いを変える。
- `Flyable`  
  「飛べる」という能力をインターフェースとして切り出し、`Bird` のみに実装させる。
- `FinalAnimal`  
  `final class` の挙動確認（継承できないクラスの例）。
- `AbstractAnimal`  
  抽象クラスの例（`abstract` と `abstract method` の確認用）。  
  ※現状は比較用に配置しており、今後 `Animal` を抽象化して統合する案も検討中。

---

## 実行例（level2）
### `RunnerAnimal`
各クラスを個別生成して `speak()` を呼ぶ基本形。

### `AnimalRunner`
`Animal[]` に格納し、親型で `speak()` を呼ぶことで多態性（polymorphism）を確認。

### `RunnerAnimalCreate`
生成（create）と処理（process）を分割し、責務を意識した形。  
`instanceof` を使った型判定の例も含む（改善案として、型分岐を避ける設計にも置き換え可能）。

---

## 今後の改善案（ToDo）
- `instanceof` による型分岐を、ポリモーフィズムで置き換える（例：`getTypeName()` を追加する）
- `AbstractAnimal` と `Animal` の役割整理（どちらかに統合する）
- `name` を `private final` + getter にしてカプセル化を強める

---

## 環境
- Java: (例) 17
- 実行: `javac` / `java` で動作確認


