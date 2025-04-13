/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bOh
 */
public class boh_0
implements ajh_1 {
    public static final String a = "rewards";
    public static final String b = "categories";
    public static final String d = "types";
    public static final String e = "currentCategory";
    public static final String f = "currentType";
    private final ArrayList<boi_0> g = new ArrayList();
    private final ArrayList<boj_0> h = new ArrayList();
    private boi_0 i;
    private boj_0 j;

    @Override
    public String[] d() {
        return null;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            BG bG = azu_0.j().n().c();
            if (bG == null) {
                return null;
            }
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12 == null) {
                return null;
            }
            boolean bl = bmr_12.bM() != 0;
            ArrayList<bvk_1> arrayList = new ArrayList<bvk_1>(5);
            for (bl_0 bl_02 : bG.b()) {
                Object object;
                if (this.i.a() != null && this.i.a().a() != bl_02.e().c().getNumber()) continue;
                if (this.j.a() == null || this.j.a() == bog_0.a) {
                    for (bc_0 bc_02 : bl_02.g()) {
                        object = bc_02.e();
                        int n = (int)object.g();
                        arrayList.add(new bvk_1(new brk_1(n, (ezr_0)eyo_1.g().d(bc_02.c()), bl_02, (AY)object)));
                    }
                }
                for (AY aY : bl_02.l()) {
                    object = aY.e();
                    bog_0 bog_02 = bog_0.a(((bq_0)((Object)object)).getNumber());
                    if (bog_02 == null || !bog_02.c() || this.j.a() != null && this.j.a() != bog_02 || !bl && (bog_02 == bog_0.d || bog_02 == bog_0.c)) continue;
                    arrayList.add(new bvk_1(new brk_1(1, (ezr_0)eyo_1.g().d(bog_02.b()), bl_02, aY)));
                }
            }
            for (int k = arrayList.size(); k < 5; ++k) {
                arrayList.add(null);
            }
            return arrayList;
        }
        if (string.equals(b)) {
            return this.g;
        }
        if (string.equals(d)) {
            return this.h;
        }
        if (string.equals(e)) {
            return this.i;
        }
        if (string.equals(f)) {
            return this.j;
        }
        return null;
    }

    public void a(boi_0 boi_02) {
        this.i = boi_02;
        fis_1.a().a((ajf_1)this, e, a);
    }

    public void a(boj_0 boj_02) {
        this.j = boj_02;
        fis_1.a().a((ajf_1)this, f, a);
    }

    public boi_0 a() {
        return this.i;
    }

    public boj_0 b() {
        return this.j;
    }

    public void c() {
        boj_0 boj_02 = new boj_0();
        this.h.add(boj_02);
        this.j = boj_02;
        for (bog_0 bog_02 : bog_0.values()) {
            if (!bog_02.c()) continue;
            this.h.add(new boj_0(bog_02));
        }
        boi_0 boi_02 = new boi_0();
        this.g.add(boi_02);
        this.i = boi_02;
        for (bof_0 bof_02 : bof_0.values()) {
            this.g.add(new boi_0(bof_02));
        }
    }
}

