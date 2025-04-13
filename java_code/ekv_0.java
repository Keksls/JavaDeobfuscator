/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eKV
 */
public class ekv_0
extends aqd_1 {
    private final tg_0 a;
    private final ArrayList<int[]> b = new ArrayList();
    private final ArrayList<int[]> c = new ArrayList();

    public ekv_0(tg_0 tg_02) {
        this.a = tg_02;
        int n = this.a.B();
        int n2 = this.a.z();
        int n3 = n2 + n;
        int n4 = this.a.A();
        int n5 = n4 + this.a.C();
        for (int k = n2; k < n3; ++k) {
            for (int i2 = n4; i2 < n5; ++i2) {
                if (!tg_02.a(k, i2)) continue;
                this.b.add(apz_2.a(k - n2, i2 - n4));
                this.c.add(new int[]{k, i2});
            }
        }
    }

    @Override
    public void a(int[] nArray) {
        throw new UnsupportedOperationException("Un BattlegroundBorderAreaOfEffect ne peut \u00eatre initialis\u00e9 avec un tableau d'entiers venant d'une base de donn\u00e9es, par exemple. Il est cr\u00e9\u00e9 dynamiquement par un combat");
    }

    @Override
    public aqr_2 c_() {
        return null;
    }

    @Override
    public boolean a(int n, int n2, short s2, int n3, int n4, short s3, aej_2 aej_22, int n5, int n6, short s4) {
        return this.a.a(n5, n6);
    }

    @Override
    protected boolean c() {
        return false;
    }

    @Override
    public aqe_1 d() {
        return null;
    }

    @Override
    public List<int[]> e() {
        return this.b;
    }

    public Iterable<int[]> j() {
        return Collections.unmodifiableList(this.c);
    }

    @Override
    public String f() {
        return null;
    }

    @Override
    public String g() {
        return null;
    }

    @Override
    public ArrayList<aqd_1> h() {
        return null;
    }

    @Override
    public aqs_1 i() {
        return aqs_1.a;
    }
}

