package ru.lcard.ltr.ltr22;

import lombok.AllArgsConstructor;

/**
 * Флаги обработки данных
 * Флаги, управляющие работой функции LTR22_ProcessDataEx()
 */
@AllArgsConstructor
public enum LTR22_PROC_FLAGS {
    /**
     * Признак, что нужно выполнить калибровку, применив к данным калибровочные
     * коэффициенты, как описано в разделе @ref sect_gen_cbr.
     */
    LTR22_PROC_FLAG_CALIBR(0x00000001),

    /**
     * Признак, что нужно перевести коды АЦП в Вольты.
     */
    LTR22_PROC_FLAG_VOLT(0x00000002),

    /**
     * Признак, что данные должны сохраняться в порядке, соответствующем
     * функци LTR22_ProcessData() --- сперва все отсчеты первого разрешенного
     * канала, затем второго и т.д.
     * Если флаг не указан, то по умолчанию функция сохраняет данные в порядке,
     * аналогичном функциям ProcessData() дрегих модулей --- сперва первый отсчет
     * каждого разрешенного канала, затем второй и т.д.
     */
    LTR22_PROC_FLAG_PER_CH_ORDER(0x01000000),
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
