/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

/*
 * Renamed from aoo
 */
public class aoo_1
extends aol_1 {
    public aoo_1(Class<? extends apy_1> clazz, boolean bl, String ... stringArray) {
        super(clazz, bl, stringArray);
    }

    public aoo_1(Class<? extends apy_1> clazz, String ... stringArray) {
        super(clazz, stringArray);
    }

    @Override
    public boolean a(String string) {
        if (string != null) {
            return Pattern.matches("([0-9]+)", string);
        }
        return false;
    }
}

