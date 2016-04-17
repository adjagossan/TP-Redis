# TP-Redis

##### Types de données stockés dans Redis
`String`

`List`

`Sets`

`Sorted sets`

`Hashes`

##### Types de requêtes
`SET and GET` commands set and retrieve a String value.

> set mykey somevalue

OK

> get mykey

"somevalue"

`LPUSH and RPUSH` commands add a new element into a list, respectively on the left and on the right.

> rpush mylist A

(integer) 1

> rpush mylist B

(integer) 2

> lpush mylist debut

(integer) 3

`LRANGE` command extracts ranges of elements from lists

> lrange mylist 0 -1

1) "debut"

2) "A"

3) "B"
