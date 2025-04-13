/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from api
 */
public class api_2
implements apk_2 {
    public aoz_1 b(String string) {
        String[] stringArray;
        HashMap<aox_1, aox_1> hashMap = new HashMap<aox_1, aox_1>();
        String string2 = string.substring(1, string.length() - 1);
        for (String string3 : stringArray = Cz.a(string2, ',')) {
            String[] stringArray2 = Cz.a(string3, ':');
            hashMap.put(new aox_1(Integer.parseInt(stringArray2[0])), new aox_1(Integer.parseInt(stringArray2[1])));
        }
        return new aoz_1(hashMap);
    }

    @Override
    public /* synthetic */ aot_2 a(String string) {
        return this.b(string);
    }
}

