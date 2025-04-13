/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Renamed from cDv
 */
class cdv_0 {
    private final Map<String, List<akr_0>> a = new HashMap<String, List<akr_0>>();

    cdv_0() {
    }

    public void a(akr_0 akr_02, String string2) {
        List list = this.a.computeIfAbsent(string2, string -> new ArrayList());
        list.add(akr_02);
    }

    public akr_0 a(String string) {
        List<akr_0> list = this.a.get(string);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(new Random().nextInt(list.size()));
    }
}

