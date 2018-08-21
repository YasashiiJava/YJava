# Lesson 1

- javaファイルをコンパイルする
- javaを実際に動かしてみる

## javaファイルのコンパイル
Shell上でjavaファイルあるディレクトリまで移動した後，`javac <ファイル名>`を実行する．
Sample1.javaをコンパイルするならば次のようになる．

```
C:\Users\cl525> cd .\Desktop\YJava\lesson1\                   # Sample1.javaがあるディレクトリへ移動する
C:\Users\cl525\Desktop\YJava\lesson1> javac Sample1.java      # このコマンドによりコンパイルを実行する
```

コンパイルが成功すると，「〇〇.class」といったファイルが新たに生成される．
上の例の場合，「Sample1.class」が生成される．


## javaを実際に動かしてみる
コンパイルして得られたファイルに対して，コンパイル時と同様に`java <ファイル名>`をShellで実行すれば，Javaが実行される．ただし，ファイル名は拡張子なしで記す必要がある．
以下はSample1.classに対して実行してみたときの例．

```
C:\Users\cl525\Desktop\YJava\lesson1> java Sample1
Hello World!                                               #これが実行結果
```

特に言及していなかったが，Sample1.javaは「Hello World!」と表示させるだけのプログラムである．


