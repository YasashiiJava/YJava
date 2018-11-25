# Lesson 10
Lesson 8, 9でクラスを設計する方法を学んだ．

本章では，実際に設計した（or 他人が設計した）クラスをどのように使うのかを見ていく．

といっても，実はこれまでに書いてきたコードのほとんどが他人が設計したクラスを使用するものだったので，「それってそういう意味だったのか！」的な感じの要素が多いと思われる．

## TODO & Points

### 10.1
特記事項なし


### 10.2
今回用いる他人が設計したクラス代表はStringクラスである．

これまで何気なく文字列型として使ってきたが，実はStringクラスには様々なメソッドが用意されている（表10-1参照）．

本節のSampleはこれらのメソッドを実際に使ってみようというもの．

Sample4ではStringクラスではなくStringBufferクラスというものを使っているが，なぜこれを使うのかなどはしっかり本を読んで理解すること．

- P306 Sample1
- P308 Sample2
- P310 Sample3
- P312 Sample4


### 10.3
本節ではIntegerクラスやMathクラスについて触れている．

Mathクラスについてはモンテカルロの問題で乱数を生成するメソッドを使っている．

その辺りのことを頭に置いた上で読むことでより理解が深まるだろう．

「他人が設計したクラスを使う」という基本的な部分は10.2と変わらない．

- P316 Sample5


### 10.4
ここからはLesson 8, 9で設計したCarクラスを題材にして話を展開していく．

- P319 Sample6, P321 Sample7：自分が設計したCarクラスの変数に対しても，intやStringと同様に代入演算をすることができる．しかし，この代入は配列のときの参照型の場合に相当する．
- P326 Sample8：このサンプルは言いたいことがとてもわかりづらいので，やらなくてもよい．通話の際に解説する．


### 10.5
今まではintの配列やdoubleの配列を扱ってきたが，自分で設計したCarなどに対しても配列を扱うことができる．

- P331 Sample9


### 10.6

- いつものように練習問題を解く

注意：練習4はif文を使わずに実装すること
