/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bPU
implements ajh_1 {
    private final int g;
    private final List<bPV> h;
    private final List<bPV> i;
    private final int j;
    private boolean k;
    private final int l;
    public static final String a = "staticRewards";
    public static final String b = "dynamicRewards";
    public static final String d = "requiredWeight";
    public static final String e = "enabled";
    public static final String f = "hasEnoughRewardSelected";

    public bPU(int n, boolean bl, int n2, List<bPV> list, List<bPV> list2, int n3) {
        this.g = n;
        this.j = n2;
        this.h = list;
        this.i = list2;
        this.k = bl;
        this.l = n3;
    }

    @Override
    public String[] d() {
        return new String[]{b, a, d};
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "dynamicRewards": {
                return this.i;
            }
            case "staticRewards": {
                return this.h;
            }
            case "requiredWeight": {
                return this.j;
            }
            case "enabled": {
                return this.k;
            }
            case "hasEnoughRewardSelected": {
                return this.c();
            }
        }
        return null;
    }

    public int a() {
        return this.j;
    }

    public List<Integer> b() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (bPV bPV2 : this.i) {
            if (!bPV2.b()) continue;
            arrayList.add(bPV2.a());
        }
        return arrayList;
    }

    public boolean c() {
        return this.b().size() >= this.l;
    }

    public boolean a(bPV bPV2) {
        return this.i.contains(bPV2);
    }

    public int e() {
        return this.g;
    }

    public void a(int n) {
        for (bPV bPV2 : this.i) {
            if (bPV2.a() != n) continue;
            bPV2.c();
            fis_1.a().a((ajf_1)this, b, f);
            return;
        }
    }

    public void a(boolean bl) {
        if (this.k == bl) {
            return;
        }
        this.k = bl;
        if (this.k) {
            for (bPV bPV2 : this.h) {
                bPV2.a(true);
            }
            for (bPV bPV2 : this.i) {
                bPV2.a(false);
                bPV2.b(true);
            }
        } else {
            for (bPV bPV3 : this.h) {
                bPV3.a(false);
            }
            for (bPV bPV3 : this.i) {
                bPV3.a(false);
                bPV3.b(false);
            }
        }
        fis_1.a().a((ajf_1)this, e, f);
    }
}

