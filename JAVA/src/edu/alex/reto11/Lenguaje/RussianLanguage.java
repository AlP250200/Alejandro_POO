package edu.alex.reto11.Lenguaje;

public class RussianLanguage implements Language{
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "Добро пожаловать в Арифметический калькулятор";
            case "select_option":
                return "Выберите вариант:";
            case "invalid_option":
                return "Неверный вариант. Пожалуйста, попробуйте еще раз.";
            case "continue":
                return "Вы хотите продолжить (s/о)?: ";
            case "exit":
                return "Выход...";
            case "enter_first_number":
                return "Введите первое число:";
            case "enter_second_number":
                return "Введите второе число:";
            case "enter_raiz":
                return "Введите базовый номер корня: ";
            case "enter_base":
                return "Дайте мне номер, к которому мы приживемся: ";
            case "enter_base_power":
                return "Введите энергетическую базу";
            case "enter_exponent":
                return "Введите показатель: ";
            case "enter_dividend":
                return "Введите дивиденд: ";
            case "enter_divisor":
                return "Введите делитель:";
            case "enter_modulo_number":
                return "Введите число для расчета модуля: ";
            case "enter_modulo_divisor":
                return "Введите делитель для расчета модуля: ";
            case "enter_logarithm_number":
                return "Введите число логарифма:";
            case "enter_logarithm_base":
                return "Введите основание логарифма: ";
            case "result":
                return "Результат";
            case "menu":
                return "Меню:\n1. Сумма\n2. Вычитание\n3. Умножение\n4. Мощность\n5. Дивизия\n6. Модуль\n7. Логарифм\n8. Квадратный корень\n0.Выберите вариант:\n ";
            case "operation_description":
                return "Операция: ";
            case  "is":
                return  "является";
            case "Adding":
                return "Добавление";
            case "Subtracting":
                return "Вычитание";
            case  "Multiplying":
                return "Умножение";
            case "Dividing":
                return "Разделение";
            case "Calculating the modulus of":
                return "Расчет модуля упругости: ";
            case "Calculating the logarithm of: ":
                return  "Вычисление логарифма от:";
            case "Raising":
                return "Райзинг:";
            case "Calculating the square root of: ":
                return "Вычисление квадратного корня из:";

            default:
                return "Сообщение не найдено";
        }
    }
    }

