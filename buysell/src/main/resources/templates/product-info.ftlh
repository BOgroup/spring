<!DOCTYPE html>
<html>
<head>
    <title>BUYSELL</title>
</head>
<body>
<h1>Mini Tech</h1>
<h4>Подробная информация о товаре</h4>
<b>Название товара: </b> ${product.title}<br>
<b>Описание товара: </b> ${product.description}<br>
<b>Цена: </b> ${product.price}<br>
<b>Город: </b> ${product.city}<br>

<hr>
<form action="/product/delete/${product.id}" method="post">

    <input type="submit" value="Удалить товар">

</form>
</body>
</html>