/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHN
 */
public abstract class ahn_2 {
    public static Enum a(Class<? extends Enum> clazz, Enum enum_) {
        if (!clazz.isEnum()) {
            return enum_;
        }
        Enum[] enumArray = clazz.getEnumConstants();
        int n = enum_.ordinal();
        return enumArray[(n + 1) % enumArray.length];
    }

    public static Enum b(Class<? extends Enum> clazz, Enum enum_) {
        if (!clazz.isEnum()) {
            return enum_;
        }
        Enum[] enumArray = clazz.getEnumConstants();
        int n = enum_.ordinal();
        return enumArray[(n - 1 + enumArray.length) % enumArray.length];
    }
}

