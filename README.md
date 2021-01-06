# Clojure-practice

Clojureの日本語ガイドで学習したことをまとめていく．

https://ayato-p.github.io/clojure-beginner/


## 使用ライブラリ一覧

* Compojure: ルーティング機能

* Ring: WebサーバとWebアプリケーションやフレームワーク間のインターフェースを定めたもの

* environ: 環境変数を取得する


## ソースコード

* todo-clj/src/todo_clj/core.clj

```
(ns todo-clj.core
  (:require ...
            [ring.adapter.jetty :as server]
            ...))

(defonce server (atom nil))

(defn start-server []
  (when-not @server
    (reset! server (server/run-jetty #'app {:port 3000 :join? false}))))
```
