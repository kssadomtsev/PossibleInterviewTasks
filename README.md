# Список потенциальных задач на собеседованиях
## Java
### 1. Часы и минуты
Напишите, пожалуйста, на Java метод, который будет вычислять угол между часовой и минутной стрелками часов. На вход функции подается время в виде двух переменных: "hours" и "minutes"

[Code](https://github.com/kssadomtsev/PossibleInterviewTasks/tree/master/src/task1)

### 2. Часы и минуты
Через стримы подсчитать количество повторений в тексте
 
[Code](https://github.com/kssadomtsev/PossibleInterviewTasks/tree/master/src/task2)

### 3. Подсчет букв в строке A-Z
/**
* Дана строка, состоящая из букв A-Z:
* "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"
* Нужно написать функцию RLE, которая на выходе даст строку вида:
* "A4B3C2XYZD4E3F3A6B28"
* И сгенерирует любую ошибку, если на вход пришла невалидная строка.
*
* Пояснения:
* 1. Если символ встречается 1 раз, он остается без изменений
* 2. Если символ повторяется более 1 раза, к нему добавляется количество повторений
*/\

[Code](https://github.com/kssadomtsev/PossibleInterviewTasks/tree/master/src/task3)

### 4. Синхронизация методов
Синхронизуйте два следующих метода в классе, чтобы каждый поток, входящий в метод "BlockUntilDone()", был заблокирован, пока метод "doOnce()" не будет вызван каким-либо другим потоком. Если был вызван метод "doOnce()", любой поток входящий в метод "BlockUntilDone()", может продолжить свою работу.
 
[Code](https://github.com/kssadomtsev/PossibleInterviewTasks/tree/master/src/task4)