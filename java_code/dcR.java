/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class dcR
implements ajh_1 {
    public static final String a = "description";
    public static final String b = "firstRankReward";
    public static final String d = "secondRankReward";
    public static final String e = "thirdRankReward";
    public static final String f = "fourthRankReward";
    private final ArrayList<dcs_0> g = new ArrayList();
    private final String h;

    public dcR(String string) {
        this.h = string;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.h;
        }
        if (string.equals(b)) {
            if (this.g.size() >= 1) {
                return this.g.get(0);
            }
        } else if (string.equals(d)) {
            if (this.g.size() >= 2) {
                return this.g.get(1);
            }
        } else if (string.equals(e)) {
            if (this.g.size() >= 3) {
                return this.g.get(2);
            }
        } else if (string.equals(f) && this.g.size() >= 4) {
            return this.g.get(3);
        }
        return null;
    }

    public void a(dcs_0 dcs_02) {
        this.g.add(dcs_02);
        fis_1.a().a((ajf_1)this, b, d, e, f);
    }
}

