/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aph
 */
public class aph_2
implements apk_2 {
    @Override
    public aot_2 a(String string) {
        String[] stringArray;
        ArrayList<aox_1> arrayList = new ArrayList<aox_1>();
        String string2 = string.substring(1, string.length() - 1);
        for (String string3 : stringArray = Cz.a(string2, ',')) {
            arrayList.add(new aox_1(Integer.parseInt(string3)));
        }
        return new aoy_2(arrayList);
    }
}

