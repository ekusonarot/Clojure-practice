# Clojure-practice

Clojureの日本語ガイドで学習したことをまとめていく．

https://ayato-p.github.io/clojure-beginner/


## 使用ライブラリ一覧

* Compojure: ルーティング機能

* Ring: WebサーバとWebアプリケーションやフレームワーク間のインターフェースを定めたもの

* environ: 環境変数を取得する


## ソースコード

ここでは，サンプルコードで見つけた疑問点をまとめる．

* todo-clj/src/todo_clj/core.clj

26行目の@:

```
(when-not @server
```

