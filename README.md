# mobile-device-programming

* *layout_constraintBottorn_toBottornOf* - нижняя граница позиционируется относительно нижней границы другого элемента;</br> 
* *layout _ constraintBaseline _ toBaselineOf* - базовая линия позиционируется относительно базовой линии другого элемента;</br> 
* *layout_constraintTop_toBottornOf* - верхняя граница позиционируется относительно нижней границы другого элемента;</br> 
* *layout _ constraintBot torn _ toTopOf* - нижняя граница позиционируется относительно верхней границы другого элемента;</br> 
* *layout _ constraintStart _ toEndOf* - аналог *layout_constraintLeft_toRightof;* </br> 
* *layout _ constraintStart _ toStartOf* - аналог *layout_constraintLeft_toLeftOf;* </br> 
* *layout _ constraintEnd_ toStartOf* - аналог *layout_constraintRight_toLeftOf;* </br> 
* *layout _ constraintEnd _ toEndOf* - аналог *layout_constraintRight_toRightOf.* </br>
</br>
Позиционирование может производиться относительно границ самого контейнера 
contentLayout (в этом случае ограничение имеет значение "parent ") либо же относительно любого другого элемента внутри constraintLayout, тогда в качестве значения ограничения указывается id этого элемента.</br>
</br>
Чтобы указать отступы от элемента, относительно которого производится позиционирование, применяются следующие атрибуты:

* *android: layout _ rnarginLeft* - отступ от левой границы;</br> 
* *android: layout_rnarginRight* -oтcтyп от правой границы;</br> 
* *android: layout _ rnarginTop* - отступ от верхней границы;</br> 
* *android: layout _ rnarginBottorn* - отступ от нижней границы;</br> 
* *android: layout _ rnarginStart* - отступ от левой границы;</br> 
* *android: layout _ rnarginEnd* - отступ от правой границы.</br> 
В качестве примера рассмотрим листинг 4.6.
> Листинг 4.6 Пример разметки *ConstraintLayout*
```
<?xrnl version="l.0" encoding="utf-8"?> 
<android.support.constraint.ConstraintLayout 
  xmlns:android="http://schernas.android.com/apk/res/android"
  xmlns:app="http://schernas.android.com/apk/res-auto" 
  android:id="@+id/activity_rnain"
  android:layout_width="rnatch_parent" 
  android: layout _ height="rnatch _parentJ'> 
<TextView
    android:layout_width="wrap_content" 
    android:layout_height="wrap_content" 
    android:text="Hello, world"
    app:layout_constraintTop_toTopOf="parent" 
    android:layout_marginTop="З0dp" 
    android:layout_marginLeft="B0dp"
app:layout_constraintLeft_toLeftOf="parent" /> 
</android.support.constraint.ConstraintLayout>
```

Здесь устанавливаются два ограничения относительно родительского контейнера 
*ConstraintLayout*, поэтому ограничения имеют значение *"parent"*. Соответственно, 
все отступы; которые определены у элемента *TextView*, устанавливаются относительно верхнего и левого краев контейнера (рис. 4.11 ).
![image](https://user-images.githubusercontent.com/79591809/217909573-3a3591e7-ce4a-424f-b94c-6d64a0488625.png)
(рис. 4.11) Разметка *ConstraintLayout*

Причем сами по себе отступы ничего не дадут - нам обязательно надо установить 
ограничение, которое и будет указывать, относительно какого элемента идет отступ. 
Рассмотрим более сложный пример (листинг 4.7), его разметка показана на рис. 4.12.

> ПРИМЕЧАНИЕ </br> Текст в листинге 4.7 сгенерирован с помощью генератора так называемого «рыба текста)) (lorem ipsum) и не несет никакой смысловой нагрузки

![image](https://user-images.githubusercontent.com/79591809/217910613-63fc9207-e848-49e3-9e25-3e470190a198.png)
(рис. 4.12) Разметка из листинга 4.7

> Листинг 4.7 Сложный пример *ConstraintLayout*
```
<?xml version="l.0" encoding="utf-8"?> 
<android.support.constraint.ConstraintLayout 
  xmlns:android="http://schemas.android.com/apk/res/android" 
  xmlns:app="http://schemas.android.com/apk/res-auto" 
  xmlns:tools="http://schemas.android.com/tools" 
  android:id="@+id/activity_main" 
  android:layout_width="match_parent" 
  android:layout_height="match_parent">
  
  <ImageView 
    android:text="TextView" 
    android:background="#ЗF51B5" 
    android:layout_width="50dp" 
    android:layout_height="50dp" 
    android:id="@+id/imageView" 
    app:layout_constraintLeft_toLeftOf="parent" 
    android:layout_marginLeft="lбdp" 
    app:layout_constraintTop_toTopOf="parent" 
    android:layout_marginTop="lбdp" />
    
  <TextView 
    android:layout_width="0dp"
    android:layout_height="0dp" 
    android:textSize="20sp" 
    android:id="@+id/textView" 
    android:text="Toчнo так же консультации с широким активом требуют 
      определения и уточнения дальнейших направлений развития. При этом 
      рамки и места обучения кадров в значительной степени обуславливают 
      создание новых предложений. Значимость этих проблем настолько 
      очевидна, что рамки и места обучения кадров позволяют оценить 
      значение позиций, занимаемых участниками в отношении поставленных 
      задач." 
    app:layout_constraintLeft_toRightOf="@+id/imageView" 
    android:layout_marginLeft="lбdp" 
    app:layout_constraintTop_toBottornOf="@+id/imageView" 
    android:layout_marginTop="lбdp" 
    app:layout_constraintRight_toRightOf="parent" 
    android:layout_marginRight="lбdp" 
    app:layout_constraintBottorn_toTopOf="@+id/button2" 
    android:layout_marginBottorn="lбdp" />
    
  <Button 
    android:text="Oтмeнa" 
    android:layout_width="93dp" 
    android:layout_height="SЗdp" 
    android:id="@+id/buttonl" 
    app:layout_constraintRight_toRightOf="parent" 
    android:layout_marginRight="lбdp" 
    app:layout_constraintBottorn_toBottornOf="parent" 
    android:layout_marginBottorn="lбdp" />
    
  <Button 
    android:text="OK" 
    android:layout_width="93dp" 
    android:layout_height="SЗdp" 
    android:id="@+id/button2" 
    app:layout_constraintRight_toLeftOf="@+id/buttonl" 
    android:layout_marginRight="lбdp" 
    app:layout_constraintBaseline_toBaselineOf="@+id/buttonl" />
    
</android.support.constraint.ConstraintLayout> 
```
Обратите в этом листинге внимание на некоторые моменты.</br> 
* Во-первых, здесь элемент позиционируется относительно контейнера *ConstraintLayout*: от верхней и 
левой границ контейнера до соответствующих границ *ImageView* задано по 16 dp.</br> 
* Во-вторых, относительно контейнера позиционируется и кнопка с *id=buttonl*: от 
правой и нижней границ контейнера до соответствующих границ *Button* также 
по 16 dp.</br> 
* В-третьих, вторая кнопка с *id=button2* позиционируется относительно первой 
кнопки: от правой границы второй кнопки до левой границы первой кнопки 
(*арр: layout_constraintRight_toLeftOf="@+id/buttonl"*) также 16 dp. И чтобы обе 
кнопки находились на одном уровне, им задано выравнивание по базовой линии: 
*app:layout_constraintBaseline_toBaselineOf="@+id/buttonl"*.</br> 
</br>
Элемент *TextView* с фрагментом текста позиционируется сразу относительно контейнера, элемента *ImageView* и второй кнопки. 
Преимущество такой разметки в том, что она будет действительна и при альбомной 
ориентации (рис. 4.13).
</br>
![image](https://user-images.githubusercontent.com/79591809/217912923-f9b66c69-fbd4-4cfe-8a2f-47c619f23dd2.png)

Рис. 4.13. Разметка из листинга 4.7: альбомная ориентация

# 4.2. Основные виджеты графического интерфейса
</br>
Виджеты, как нам уже известно, - это элементы графического интерфейса. Ранее 
мы уже познакомились с двумя виджетами: текстовым полем и кнопкой. Сейчас мы 
продолжим наше знакомство с виджетами.</br>
Создайте новый проект с именем см, деятельность этого проекта будет называться 
MainActivity, а пакет - corn.example.<имя>.ch4 - так вам будет понятнее, откуда 
взялись некоторые идентификаторы.

## 4.2.1. Текстовые поля
В Android вы можете использовать два основных текстовых поля: *Textview* и 
*EditText* ( оба находятся на вкладке *Text Fields* редактора разметки). Первое служит 
для отображения текста без возможности его редактирования, а второе - это классическое текстовое поле с возможностью ввода и редактирования текста. Есть 
множество и других полей, основанных на этих, - например, *Password* (используется для ввода пароля, при этом вводимые пользователем символы не отображаются), *Password* (*Numeric*) - для ввода числового пароля, *Date* - для ввода даты, 
*Time* - для ввода времени, *E-mail* - для ввода адреса электронной почты и т. п. 
Несмотря на свою простоту, виджет *TextView* весьма часто задействуется в Android npoгpaммax для вывода инструкций по использованию программы и другого 
текста.

Несмотря на свою простоту, виджет *TextView* весьма часто задействуется в Android npoгpaммax для вывода инструкций по использованию программы и другого 
текста. 
В файле разметки значение *TextView* можно установить так: 
*android:text="Text";* 
В Jаvа-коде значение виджета устанавливается так: 
> TextView text = (TextView)findViewByld(R.id.textl); </br> text.setText("Hello");
</br>
Совсем другое дело, если вы планируете создать приложение с многоязыковой 
поддержкой пользовательского интерфейса. Тогда непосредственно в файле разметки значение (текстовую строку) указывать не нужно. Вместо этого создается 
ссылка на текстовый XML-pecypc: 
android:text="@string/str_value" 
Здесь str _ value - это имя строкового ресурса, описанного в файле strings.xml. 
В Jаvа-коде установить имя ресурса можно тем же методом setтext () : 
> TextView text = (TextView)findViewByld(R.id.textl); </br> text.setText(R.string.str_value); 
У элемента TextView есть много методов и свойств. Мы рассмотрим только основные свойства, относящиеся к отображению текста. 
</br>

* Размер шрифта можно задать свойством *android:textSize*. Размер задается 
в пикселах (рх), независимых от плотности пикселах (ctp), независимых от масштабирования пикселах (sp), пунктах (pt), дюймах (in) и миллиметрах (mrn): 
android:textSize="l4pt"; 

* Стиль текста задается свойством *android: textStyle* 
   - normal - обычное начертание символов; 
   - bold - полужирное начертание символов; 
   - italic - курсив.
  
 </br>
  Пример *android:textStyle="italic"* </br>
 
 + Цвет шрифта задается свойством android:textColor. Цвет указывается в шестнадцатеричной кодировке в формате #RGB или #ARGB. Во втором случае значение А- это прозрачность . Если А= О, то прозрачносп, 100% (элемент практически не будет виден). 
</br> 
Теперь немного практики. Создайте новый проект. По умолчанию будет создан 
проект, выводящий строку "Hello World!" с помощью TextView- как раз то, что 
нам и нужно.</br> 
Перейдите к файлу разметки проекта res\layout\main.xml. Попробуем изменить свойства TextView . Если вы забыли, как называется то или иное свойство, - Android 
Studio это вам подскажет: наберите android: и немного подождите- откроется 
выпадающий список, из которого вам нужно будет выбрать нужное свойство 
(рис. 4.14).

![image](https://user-images.githubusercontent.com/79591809/217916774-b92229db-f477-4f1e-8c3b-50eaa018878c.png)

Рис. 4.14. Подсказка Android Studio
</br>
Установим свойства textSize и textStyle, как показано в листинге 4.8. Кроме этого 
мы также присвоили имя нашему текстовому полю (txtl}, чтобы к нему можно 
было обратиться из Jаvа-кода .
