package ru.lcard.ltr.ltr25;

/**
 * Режим питания датчиков
 * <p>
 * Режим питания всех датчиков для всех восьми каналов. Устанавливается функцией
 * LTR25_SetSensorsPowerMode().
 **/
public enum LTR25_SENSORS_POWER_MODE {
    /**
     * < Питание датчиков включено. Штатный режим работы,
     * в котором могут проводится измерения. Соответствуют аналоговому режиму
     * работы TEDS датчиков, совместимому с рабочим режимом  ICP-датчиков.
     */
    LTR25_SENSORS_POWER_MODE_ICP,
    /**
     * < В данном режиме питание датчиков отключено.
     */
    LTR25_SENSORS_POWER_MODE_OFF,
    /**
     * < Подано питание обратной полярности. Это специальный
     * цифровой режим работы для датчиков с поддержкой TEDS, который может
     * использоваться в частности для чтения данных TEDS с информацией
     * о датчике и его характеристиках
     */
    LTR25_SENSORS_POWER_MODE_TEDS,
}
